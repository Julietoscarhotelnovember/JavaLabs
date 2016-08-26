import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex07_TCP_Chat_Client_DataStream {
	Socket socket = null;

	public Ex07_TCP_Chat_Client_DataStream() {
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
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				
				Scanner sc=new Scanner(System.in);
				while (true) {
					String msg = sc.nextLine();
					if (msg.equals("exit"))
						break;
					dos.writeUTF(msg);
					dos.flush();
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
			DataInputStream dis;
			try {
				dis = new DataInputStream(socket.getInputStream());
				String msg = null;
				while (true) {
					msg=dis.readUTF();
					System.out.println("서버로부터 받은 메세지: " + msg);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		Ex07_TCP_Chat_Client_DataStream client=new Ex07_TCP_Chat_Client_DataStream();

	}

}
