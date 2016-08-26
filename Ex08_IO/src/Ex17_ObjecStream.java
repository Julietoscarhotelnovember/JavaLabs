import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//UserData.sal에는 직렬화된 객체가 써져있다
//역직렬화를 통해 복원하기
public class Ex17_ObjecStream {
	public static void main(String[] args) throws ClassNotFoundException {
		String filename="UserData.sal";
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream(filename);
			bis=new BufferedInputStream(fis);
			ois=new ObjectInputStream(bis);
			
			UserInfo r1=(UserInfo)ois.readObject();
			UserInfo r2=(UserInfo)ois.readObject();
			
			System.out.println("복원데이터");
			System.out.println(r1.toString());
			System.out.println(r2.toString());
		} catch (IOException e) {
			
		}

	}
}
