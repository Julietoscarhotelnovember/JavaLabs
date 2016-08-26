import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex05_TCP_Echo_Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("192.168.0.129", 9999);
		System.out.println("서버와 연결 되었습니다.");
		
		//서버에서 보낸 메시지 read
		DataInputStream dis=new DataInputStream(socket.getInputStream());
		
		//서버에 보낼 메세지 writhe
		DataOutputStream dos=new DataOutputStream(socket.getOutputStream());

		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.print("서버에 전송할 메시지 입력: ");
			String msg=sc.nextLine();
			
			//msg 서버 전송
			dos.writeUTF(msg);
			dos.flush();
			
			if(msg.equals("exit")) break;
			
			//서버에서 전송된 메세지 읽기
			String servermsg=dis.readUTF();
			System.out.println("Echo msg: "+servermsg);
		}
		
		System.out.println("클라이언트 종료");
		dis.close();
		dos.close();
		socket.close();
		
	}
}
