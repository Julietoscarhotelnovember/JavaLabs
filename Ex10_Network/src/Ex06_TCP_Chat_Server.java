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

//����-Ŭ�� 1:1 ���
//ex1~ex5������ ����ó������̾���
//ä�����α׷��� read write�� ���ÿ� �̷�������� > ������
public class Ex06_TCP_Chat_Server {
	public static void main(String[] args) {
		ServerSocket serversocket = null;
		try {
			serversocket = new ServerSocket(9999);
			System.out.println("Ŭ�� ���� ��� ��");
			Socket socket = serversocket.accept();
			System.out.println("Ŭ�� ����");

			ServerSend ss = new ServerSend(socket);
			ServerReceive sr = new ServerReceive(socket);
			// ������ ����
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
			// �ܼ� �Է°� read
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ��ĳ��
																						// ���
			// ��� ó��
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			while (true) {
				System.out.print("��: ");
				String data = br.readLine();
				if (data.equals("exit"))
					break;
				pw.println(data); // ������ Ŭ�� write
			}
			System.out.println("�������� ������ �۾� ����");
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
				System.out.println("Ŭ��κ��� ���� �޼���: " + data);
				//���⿡ ���𰡰�
			}
			System.out.println("Ŭ���̾�Ʈ���� �ޱ� �۾� ����");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}