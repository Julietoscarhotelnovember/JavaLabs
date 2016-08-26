import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//tcp 클라
//소켓 필요
//기본으로 서버ip, 포트 알아야 한다
//192.168.0.129:9999

public class Ex03_TCP_Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("192.168.0.159", 9999);
		System.out.println("서버와 연결 되었습니다.");
		
		//서버에서 보낸 메세지 받기
		InputStream is=socket.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		String servermsg=dis.readUTF();
		System.out.println("서버로부터 받은 메시지: "+servermsg);
		
		dis.close();
		is.close();
		socket.close();

	}
}
