import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex04_TCP_Echo_Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(9999); // ���� ���� ����
		String str = "��? Ʈ���̼� �װ� ���� ���� �ƴϳ�?";
		System.out.println("���� ����: " + serversocket.getInetAddress());
		System.out.println("Ŭ���̾�Ʈ ���� �����.....");

		Socket socket = serversocket.accept(); // ���� ���, ���� ���� ����

		//Ŭ���̾�Ʈ �޼��� ���� �غ�
		InputStream is=socket.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		
		//Ŭ���̾�Ʈ���� �޼��� ���� �غ�
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
