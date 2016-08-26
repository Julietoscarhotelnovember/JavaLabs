import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//192.168.0.129:9999
//통신을 받을 서버부터 만든다
public class Ex03_TCP_Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serversocket=new ServerSocket(9999); //서버 소켓 생성
		String str="192.168.0.129 서버와 문자 데이터, Byte 데이터 통신";
		System.out.println("서버 정보: "+serversocket.getInetAddress());
		System.out.println("서버 접속 대기중.....");
		
		Socket socket=serversocket.accept(); //응답 대기, 연결 소켓 생성

		//연결 후 서버에서 클라로 write (소켓끼리 통신)
		//소켓에 스트림이 들어있다
		OutputStream out=socket.getOutputStream();
		DataOutputStream dos=new DataOutputStream(out);
		dos.writeUTF(str); //2바이트로 노는 것이 가장 좋다
		
		//서버 종료
		System.out.println("서버종료");
		dos.close();
		out.close();
		socket.close();
		serversocket.close();
		
	}
}
