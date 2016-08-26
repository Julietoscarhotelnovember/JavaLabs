import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//192.168.0.129:9999
//����� ���� �������� �����
public class Ex03_TCP_Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serversocket=new ServerSocket(9999); //���� ���� ����
		String str="192.168.0.129 ������ ���� ������, Byte ������ ���";
		System.out.println("���� ����: "+serversocket.getInetAddress());
		System.out.println("���� ���� �����.....");
		
		Socket socket=serversocket.accept(); //���� ���, ���� ���� ����

		//���� �� �������� Ŭ��� write (���ϳ��� ���)
		//���Ͽ� ��Ʈ���� ����ִ�
		OutputStream out=socket.getOutputStream();
		DataOutputStream dos=new DataOutputStream(out);
		dos.writeUTF(str); //2����Ʈ�� ��� ���� ���� ����
		
		//���� ����
		System.out.println("��������");
		dos.close();
		out.close();
		socket.close();
		serversocket.close();
		
	}
}