import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex06_TCP_Chat_Client {
	Socket socket = null;

	public Ex06_TCP_Chat_Client() {
		try {
			socket = new Socket("192.168.0.129", 9999);
			System.out.println("������ ���� �Ǿ����ϴ�.");

			new ClientSend().start();
			new ClientReceive().start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// InnerClass�� �ٲٱ�
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
					pw.println(data); // ������ ������ write
				}
				System.out.println("������ ������ �۾� ����");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	//InnerClass�� �ٲٱ�
	class ClientReceive extends Thread {
		@Override
		public void run() {
			BufferedReader br;
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String data = null;
				while ((data = br.readLine()) != null) {
					System.out.println("�����κ��� ���� �޼���: " + data);
					//���⿡ ���𰡰�
				}
				System.out.println("�������� �ޱ� �۾� ����");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		Ex06_TCP_Chat_Client client=new Ex06_TCP_Chat_Client();

	}

}
