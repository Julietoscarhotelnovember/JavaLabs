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
			System.out.println("Ŭ�� ���� ��� ��");
			Socket socket = serversocket.accept();
			System.out.println("Ŭ�� ����");

			ServerSend2 ss = new ServerSend2(socket);
			ServerReceive2 sr = new ServerReceive2(socket);
			// ������ ����
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
			// �ܼ� �Է°� read
			DataInputStream dis = new DataInputStream(socket.getInputStream());

			// ��� ó��
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			Scanner sc=new Scanner(System.in);
			while (true) {
				System.out.print("��: ");
				String msg = dis.readUTF();
				if (msg.equals("exit"))
					break;
				dos.writeUTF(msg); // ������ Ŭ�� write
				dos.flush();
			}
			System.out.println("�������� ������ �۾� ����");
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
				System.out.println("Ŭ��κ��� ���� �޼���: " + clientmsg);
				// ���⿡ ���𰡰�
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}