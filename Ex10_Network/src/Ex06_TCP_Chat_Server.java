import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//서버-클라간 1:1 통신
//ex1~ex5까지는 순차처리방식이었음
//채팅프로그램은 read write가 동시에 이루어져야함 > 쓰레드
public class Ex06_TCP_Chat_Server {
	public static void main(String[] args) {
		ServerSocket serversocket = null;
		try {
			serversocket = new ServerSocket(9999);
			System.out.println("클라 접속 대기 중");
			Socket socket = serversocket.accept();
			System.out.println("클라 접속");

			ServerSend ss = new ServerSend(socket);
			ServerReceive sr = new ServerReceive(socket);
			// 스레드 실행
			ss.start();
			sr.start();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}

class ServerSend extends Thread {
	Socket socket;

	public ServerSend(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			// 콘솔 입력값 read
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 스캐너
																						// 대신
			// 출력 처리
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			while (true) {
				System.out.print("나: ");
				String data = br.readLine();
				if (data.equals("exit"))
					break;
				pw.println(data); // 접속한 클라에 write
			}
			System.out.println("서버에서 보내기 작업 종료");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class ServerReceive extends Thread {
	Socket socket;

	public ServerReceive(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println("클라로부터 받은 메세지: " + data);
				//여기에 무언가가
			}
			System.out.println("클라이언트에서 받기 작업 종료");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}