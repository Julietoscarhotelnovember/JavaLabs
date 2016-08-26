import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//파일에 객체 쓰기: 직렬화
//파일 읽어들이기: 역직렬화

public class Ex16_ObjectStream {
	public static void main(String[] args) {
		String filename="Userdata.sal";
		try {
			//일반 작업
			FileOutputStream fos=new FileOutputStream(filename);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			//객체에 대한 작업
			ObjectOutputStream out=new ObjectOutputStream(bos);
			UserInfo u1=new UserInfo("superman","super",1000);
			UserInfo u2=new UserInfo("scott","tiger",50);
			
			//객체 쓰기(직렬화)
			out.writeObject(u1); 
			out.writeObject(u2);
			
			out.close();
			bos.close();
			fos.close();
			System.out.println("파일생성 > 직렬화 > 객체 > 파일쓰기");
			
		} catch(Exception e) {
			
		}
		
		
		

	}
}
