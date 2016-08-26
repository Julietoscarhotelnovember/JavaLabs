import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//���Ͽ� ��ü ����: ����ȭ
//���� �о���̱�: ������ȭ

public class Ex16_ObjectStream {
	public static void main(String[] args) {
		String filename="Userdata.sal";
		try {
			//�Ϲ� �۾�
			FileOutputStream fos=new FileOutputStream(filename);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			//��ü�� ���� �۾�
			ObjectOutputStream out=new ObjectOutputStream(bos);
			UserInfo u1=new UserInfo("superman","super",1000);
			UserInfo u2=new UserInfo("scott","tiger",50);
			
			//��ü ����(����ȭ)
			out.writeObject(u1); 
			out.writeObject(u2);
			
			out.close();
			bos.close();
			fos.close();
			System.out.println("���ϻ��� > ����ȭ > ��ü > ���Ͼ���");
			
		} catch(Exception e) {
			
		}
		
		
		

	}
}
