import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

//���� > 1 : 1 ä��(���� : Ŭ���̾�Ʈ)
//���� ��� : ServerSocket , Socket , Stream(I/O)(read,write) , Thread
//���� : read , write  ���� 
//Ŭ���̾�Ʈ : read , write ����
//Thread ���(Read)
//Thread ���(Write)
//Socket �ڿ� (Inner Class)
/////////////////////////////////////////////////////////
//����ä��(���ڰ� ä��)

//����
//Ŭ_1
//Ŭ_2
//Ŭ_3

//���� read ,write �۾�

//���� : socket 3�� 
//������  [ ������ socket �� ���� ]



public class Ex08_TCP_Multi_Server {
	HashMap<String, DataOutputStream> ClientMap;
	ServerSocket serversocket = null;
	Socket socket = null;
	
	public Ex08_TCP_Multi_Server(){
		//�� Ŭ���̾�Ʈ(Socket �� ��°�ü�� ����)
		ClientMap = new HashMap<String,DataOutputStream>();
	}
	
	
	//1. �ʱ�ȭ(���� ����)
	public void init(){
		try{
			serversocket = new ServerSocket(9999);
			System.out.println("[������ ���� �Ǿ����ϴ�]");
			
			while(true){
				socket = serversocket.accept(); //������ �Ǹ�
				System.out.println(" [ " + socket.getInetAddress() + " / " +
				                  socket.getPort() + " ] ");
				//�ڵ� �۾�
				//Ŭ���̾�Ʈ ���ӽ� ���� ....
				Thread msr = new MultiServerRev(socket);
				msr.start();
			}
			
		}catch(Exception e){
			System.out.println("init() : " + e.getMessage());
		}
	}
	
	
	//2. ���ӵ� ��� Ŭ���̾�Ʈ���� (socket) �޽����� �����ϴ� ��� �Լ� ����
	//ClientMap<"ȫ�浿",������ socket ���� �� DataOutputStream ��ü>
	//ClientMap<"������",������ socket ���� �� DataOutputStream ��ü>
	//10�� (socket) �̶�� 
	public void SendAllMsg(String msg){
	 	Iterator<String> ClientKeySet = ClientMap.keySet().iterator();
	 	while(ClientKeySet.hasNext()){
	 		try{
	 			DataOutputStream clientout= ClientMap.get(ClientKeySet.next());
	 			//������ ����ڿ� (Client) �޽��� ���
	 			clientout.writeUTF(msg);
	 		}catch(Exception e){
	 			System.out.println("SendAll_msg : " + e.getMessage());
	 		}
	 	}
	}
	
	//3. ���ӵ� ���� ����Ʈ �����ϱ�
	public String showUserList(String name){
		StringBuilder output = new StringBuilder("<<������ ��� >>\r\n");
		Iterator<String> users = ClientMap.keySet().iterator();
		while(users.hasNext()){
			try{
				 String key = users.next(); //ȫ�浿 , ������
				 if(key.equals(name)){
					 key +="(*)";
				 }
				 output.append(key+"\r\n");
				 
			}catch(Exception e){
				System.out.println("showUserList ����:" + e.getMessage());
			}
		}
		output.append("<<" + ClientMap.size() + ">>" + "�� ������...\r\n");
		return output.toString();
	}
	
	
	//4.���Ӹ� ���
	public void SendToMsg(String fromname , String toname , String toMsg){
		try{
			 //DataOutputStream out =  ClientMap.get(toname);
			 //out.writeUTF(str);
			ClientMap.get(toname).writeUTF("�ӼӸ� from (" + fromname + ")=>" + toMsg );
			ClientMap.get(fromname).writeUTF("�ӼӸ� to (" + toname +   ")=>" + toMsg );
		}catch(Exception e){
			System.out.println("SendToMsg : " + e.getMessage());
		}
	}
	
	
	//Thread ��� (���� Client read , write)
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
			//�⺻ Ŭ���̾�Ʈ : in.readUTF() , out.WriteUTF()
			String name=""; //Ŭ���̾�Ʈ���� �̸��� �޾Ƽ� ����
			try{
				//����� ������ ���ؼ� ������ Client ���� �޽��� ����
				out.writeUTF("�̸��� �Է��ϼ���");
				name = in.readUTF();
				out.writeUTF("���� ä�ù濡 ����");
				
				//������ ���ӵ� ��� �����(socket) ���� �Էµ� ���� ����
				SendAllMsg(name + "�� �����Ͽ����ϴ�");
				//////////////////////////////////////////////
				
				//key point (����� Map �� �ֱ�)
				ClientMap.put(name, out); //Map<�̸�,��°�ü>
				System.out.println("���� ����͸� :  ���������ڴ� " + ClientMap.size() + " ��");
				
				//�߰� ���(��ȭ���)
				while(in != null){
					String msg = in.readUTF();
					
					//ä��â�� >/������ 
					//������ ȸ�� ��� ���
					if(msg.startsWith("/")){
						if(msg.trim().equals("/������")){
							
							out.writeUTF(showUserList(name));
							
						}else if(msg.startsWith("/���Ӹ�")){
							String[] msgArr = msg.split(" ",3);
							if(msgArr == null || msgArr.length < 3){
								out.writeUTF("HELP : ���Ӹ� ���� :\r\n /���Ӹ� [�����̸�] [�����޽���]");
								// /���Ӹ� ȫ�浿 �氡�氡
								
							}else{
								String toName = msgArr[1]; //ȫ�浿
								String toMsg  = msgArr[2]; //�氡�氡
								if(ClientMap.containsKey(toName)){
									//�޽��� ������
									//Ư�����濡�Ը� ä�� ���� ����
									SendToMsg(name, toName, toMsg);
								}else{
									out.writeUTF("�Է��Ͻ� ����ڰ� �����ϴ�");
								}
								
							}
						}else{
							 out.writeUTF("�߸��� ��ɾ� �Դϴ�");
						}
					}else{
						SendAllMsg("[" + name + "]" + msg);
					}
				}//while end
	
			}catch(Exception e){
				System.out.println("Thread run ���ܹ߻� " + e.getMessage());
			}finally{
				//Client ����(����) , ���ܹ߻���
				ClientMap.remove(name);
				SendAllMsg(name + "�� �����ϼ̽��ϴ�");
				System.out.println("���� ����͸� :  ���������ڴ� " + ClientMap.size() + " ��");
			}
	
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Ex08_TCP_Multi_Server  chattServer = new Ex08_TCP_Multi_Server();
		chattServer.init();

	}

}
