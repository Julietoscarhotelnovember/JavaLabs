import java.io.FileInputStream;
import java.io.IOException;

//2����Ʈ ���� ó��
//stream�� �����ϴ� ��� ������� 1����Ʈ ������ ������Ѵ�
public class Ex05_Stream_Kor {
	public static void main(String[] args) {
		FileInputStream input = null;
		try {
			input = new FileInputStream("kor.txt"); // ��ǲ�� ������ ������� �־�� �Ѵ�
			// 2����Ʈ ������ ó���� stream���� �õ��غ���
			int data = 0;
			while ((data = input.read()) != -1) {
				System.out.println(data + " : " + (char) data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		//�Ұ���
	}
}
