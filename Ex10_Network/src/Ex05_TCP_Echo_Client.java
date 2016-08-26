import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex05_TCP_Echo_Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("192.168.0.129", 9999);
		System.out.println("������ ���� �Ǿ����ϴ�.");
		
		//�������� ���� �޽��� read
		DataInputStream dis=new DataInputStream(socket.getInputStream());
		
		//������ ���� �޼��� writhe
		DataOutputStream dos=new DataOutputStream(socket.getOutputStream());

		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.print("������ ������ �޽��� �Է�: ");
			String msg=sc.nextLine();
			
			//msg ���� ����
			dos.writeUTF(msg);
			dos.flush();
			
			if(msg.equals("exit")) break;
			
			//�������� ���۵� �޼��� �б�
			String servermsg=dis.readUTF();
			System.out.println("Echo msg: "+servermsg);
		}
		
		System.out.println("Ŭ���̾�Ʈ ����");
		dis.close();
		dos.close();
		socket.close();
		
	}
}
