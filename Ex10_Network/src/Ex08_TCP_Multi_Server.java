import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

//기존 > 1 : 1 채팅(서버 : 클라이언트)
//사용된 기술 : ServerSocket , Socket , Stream(I/O)(read,write) , Thread
//서버 : read , write  동시 
//클라이언트 : read , write 동시
//Thread 사용(Read)
//Thread 사용(Write)
//Socket 자원 (Inner Class)
/////////////////////////////////////////////////////////
//다중채팅(다자간 채팅)

//서버
//클_1
//클_2
//클_3

//각각 read ,write 작업

//서버 : socket 3개 
//서버가  [ 생성된 socket 를 관리 ]



public class Ex08_TCP_Multi_Server {
	HashMap<String, DataOutputStream> ClientMap;
	ServerSocket serversocket = null;
	Socket socket = null;
	
	public Ex08_TCP_Multi_Server(){
		//각 클라이언트(Socket 의 출력객체를 관리)
		ClientMap = new HashMap<String,DataOutputStream>();
	}
	
	
	//1. 초기화(서버 소켓)
	public void init(){
		try{
			serversocket = new ServerSocket(9999);
			System.out.println("[서버가 시작 되었습니다]");
			
			while(true){
				socket = serversocket.accept(); //접속이 되면
				System.out.println(" [ " + socket.getInetAddress() + " / " +
				                  socket.getPort() + " ] ");
				//코드 작업
				//클라이언트 접속시 마다 ....
				Thread msr = new MultiServerRev(socket);
				msr.start();
			}
			
		}catch(Exception e){
			System.out.println("init() : " + e.getMessage());
		}
	}
	
	
	//2. 접속된 모든 클라이언트에게 (socket) 메시지를 전달하는 기능 함수 구현
	//ClientMap<"홍길동",각각의 socket 에서 얻어낸 DataOutputStream 객체>
	//ClientMap<"김유신",각각의 socket 에서 얻어낸 DataOutputStream 객체>
	//10명 (socket) 이라면 
	public void SendAllMsg(String msg){
	 	Iterator<String> ClientKeySet = ClientMap.keySet().iterator();
	 	while(ClientKeySet.hasNext()){
	 		try{
	 			DataOutputStream clientout= ClientMap.get(ClientKeySet.next());
	 			//각각의 사용자에 (Client) 메시지 출력
	 			clientout.writeUTF(msg);
	 		}catch(Exception e){
	 			System.out.println("SendAll_msg : " + e.getMessage());
	 		}
	 	}
	}
	
	//3. 접속된 유저 리스트 관리하기
	public String showUserList(String name){
		StringBuilder output = new StringBuilder("<<접속자 목록 >>\r\n");
		Iterator<String> users = ClientMap.keySet().iterator();
		while(users.hasNext()){
			try{
				 String key = users.next(); //홍길동 , 김유신
				 if(key.equals(name)){
					 key +="(*)";
				 }
				 output.append(key+"\r\n");
				 
			}catch(Exception e){
				System.out.println("showUserList 예외:" + e.getMessage());
			}
		}
		output.append("<<" + ClientMap.size() + ">>" + "명 접속중...\r\n");
		return output.toString();
	}
	
	
	//4.궛속말 기능
	public void SendToMsg(String fromname , String toname , String toMsg){
		try{
			 //DataOutputStream out =  ClientMap.get(toname);
			 //out.writeUTF(str);
			ClientMap.get(toname).writeUTF("귓속말 from (" + fromname + ")=>" + toMsg );
			ClientMap.get(fromname).writeUTF("귓속말 to (" + toname +   ")=>" + toMsg );
		}catch(Exception e){
			System.out.println("SendToMsg : " + e.getMessage());
		}
	}
	
	
	//Thread 사용 (접속 Client read , write)
	class MultiServerRev extends Thread{
		Socket socket = null;
		DataInputStream in;
		DataOutputStream out;
		
		public MultiServerRev(Socket socket){
			this.socket = socket;
			try{
				in = new DataInputStream(this.socket.getInputStream());
				out = new DataOutputStream(this.socket.getOutputStream());
			}catch(Exception e){
				 System.out.println("MultiServerRev : " +  e.getMessage());
			}
		}
		
		@Override
		public void run(){
			//기본 클라이언트 : in.readUTF() , out.WriteUTF()
			String name=""; //클라이언트부터 이름을 받아서 저장
			try{
				//연결된 소켓을 통해서 접속한 Client 에게 메시지 전달
				out.writeUTF("이름을 입력하세요");
				name = in.readUTF();
				out.writeUTF("현재 채팅방에 입장");
				
				//서버에 접속된 모든 사용자(socket) 에게 입력된 내용 전달
				SendAllMsg(name + "님 입장하였습니다");
				//////////////////////////////////////////////
				
				//key point (사용자 Map 에 넣기)
				ClientMap.put(name, out); //Map<이름,출력객체>
				System.out.println("서버 모니터링 :  현재접속자는 " + ClientMap.size() + " 명");
				
				//추가 기능(대화기능)
				while(in != null){
					String msg = in.readUTF();
					
					//채팅창에 >/접속자 
					//접속한 회원 목록 출력
					if(msg.startsWith("/")){
						if(msg.trim().equals("/접속자")){
							
							out.writeUTF(showUserList(name));
							
						}else if(msg.startsWith("/궛속말")){
							String[] msgArr = msg.split(" ",3);
							if(msgArr == null || msgArr.length < 3){
								out.writeUTF("HELP : 궛속말 사용법 :\r\n /궛속말 [상대방이름] [보낼메시지]");
								// /궛속말 홍길동 방가방가
								
							}else{
								String toName = msgArr[1]; //홍길동
								String toMsg  = msgArr[2]; //방가방가
								if(ClientMap.containsKey(toName)){
									//메시지 보내기
									//특정상대방에게만 채팅 내용 전달
									SendToMsg(name, toName, toMsg);
								}else{
									out.writeUTF("입력하신 사용자가 없습니다");
								}
								
							}
						}else{
							 out.writeUTF("잘못된 명령어 입니다");
						}
					}else{
						SendAllMsg("[" + name + "]" + msg);
					}
				}//while end
	
			}catch(Exception e){
				System.out.println("Thread run 예외발생 " + e.getMessage());
			}finally{
				//Client 종료(퇴장) , 예외발생시
				ClientMap.remove(name);
				SendAllMsg(name + "님 퇴장하셨습니다");
				System.out.println("서버 모니터링 :  현재접속자는 " + ClientMap.size() + " 명");
			}
	
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Ex08_TCP_Multi_Server  chattServer = new Ex08_TCP_Multi_Server();
		chattServer.init();

	}

}
