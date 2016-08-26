import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex04_TCP_Echo_Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(9999); // 서버 소켓 생성
		String str = "엥? 트레이서 그거 완전 에코 아니냐?";
		System.out.println("서버 정보: " + serversocket.getInetAddress());
		System.out.println("클라이언트 접속 대기중.....");

		Socket socket = serversocket.accept(); // 응답 대기, 연결 소켓 생성

		//클라이언트 메세지 읽을 준비
		InputStream is=socket.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		
		//클라이언트에게 메세지 보낼 준비
		OutputStream os=socket.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		
		while (true) {
			String clientmsg=dis.readUTF();
			System.out.println("Client Msg: "+clientmsg);
			
			if(clientmsg.equals("exit")) break;
			dos.writeUTF(clientmsg);
			dos.flush();
		}
		dis.close();
		dos.close();
		socket.close();

	}
}
