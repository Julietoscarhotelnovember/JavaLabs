import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Ex07_TCP_Chat_Server_DataStream {
	public static void main(String[] args) {
		ServerSocket serversocket = null;
		try {
			serversocket = new ServerSocket(9999);
			System.out.println("클라 접속 대기 중");
			Socket socket = serversocket.accept();
			System.out.println("클라 접속");

			ServerSend2 ss = new ServerSend2(socket);
			ServerReceive2 sr = new ServerReceive2(socket);
			// 스레드 실행
			ss.start();
			sr.start();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}

class ServerSend2 extends Thread {
	Socket socket;

	public ServerSend2(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			// 콘솔 입력값 read
			DataInputStream dis = new DataInputStream(socket.getInputStream());

			// 출력 처리
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			Scanner sc=new Scanner(System.in);
			while (true) {
				System.out.print("나: ");
				String msg = dis.readUTF();
				if (msg.equals("exit"))
					break;
				dos.writeUTF(msg); // 접속한 클라에 write
				dos.flush();
			}
			System.out.println("서버에서 보내기 작업 종료");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class ServerReceive2 extends Thread {
	Socket socket;

	public ServerReceive2(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		DataInputStream dis;
		try {
			dis = new DataInputStream(socket.getInputStream());
			String clientmsg= null;
			while (true) {
				clientmsg=dis.readUTF();
				System.out.println("클라로부터 받은 메세지: " + clientmsg);
				// 여기에 무언가가
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}