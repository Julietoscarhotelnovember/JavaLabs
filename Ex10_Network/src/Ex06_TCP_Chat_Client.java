import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex06_TCP_Chat_Client {
	Socket socket = null;

	public Ex06_TCP_Chat_Client() {
		try {
			socket = new Socket("192.168.0.129", 9999);
			System.out.println("서버와 연결 되었습니다.");

			new ClientSend().start();
			new ClientReceive().start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// InnerClass로 바꾸기
	class ClientSend extends Thread {
		@Override
		public void run() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				while (true) {
					String data = br.readLine();
					if (data.equals("exit"))
						break;
					pw.println(data); // 접속한 서버에 write
				}
				System.out.println("서버에 보내기 작업 종료");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	//InnerClass로 바꾸기
	class ClientReceive extends Thread {
		@Override
		public void run() {
			BufferedReader br;
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String data = null;
				while ((data = br.readLine()) != null) {
					System.out.println("서버로부터 받은 메세지: " + data);
					//여기에 무언가가
				}
				System.out.println("서버에서 받기 작업 종료");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		Ex06_TCP_Chat_Client client=new Ex06_TCP_Chat_Client();

	}

}
