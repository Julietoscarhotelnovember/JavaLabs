import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//tcp Ŭ��
//���� �ʿ�
//�⺻���� ����ip, ��Ʈ �˾ƾ� �Ѵ�
//192.168.0.129:9999

public class Ex03_TCP_Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("192.168.0.159", 9999);
		System.out.println("������ ���� �Ǿ����ϴ�.");
		
		//�������� ���� �޼��� �ޱ�
		InputStream is=socket.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		String servermsg=dis.readUTF();
		System.out.println("�����κ��� ���� �޽���: "+servermsg);
		
		dis.close();
		is.close();
		socket.close();

	}
}
