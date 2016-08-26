import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//������Ʈ��(����ó��)
//�ܵ���� ����(�����ڸ� ���ؼ� �ݵ�� Stream��ü�� �޵��� ����)
//�� ��Ʈ��(InputStream, OutputStream)�� �����ϴ� Ŭ����
//����: ���� io�� ���� ���� �� �ִ�. (���� ������ ������ ó�� ����)
//�� �ǹ������� ���°� �����ϴ�
//BufferedInputStream
//BufferedInputStream

public class Ex04_Stream_Buffer_File {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("data.txt");
			// ��θ� ������� ������ ����Ʈ�� ������Ʈ ������ ���� ����

			bos = new BufferedOutputStream(fos);
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i); // buffer�� ���ؼ� �ѹ��� data.txt�� write
			}

			// buffer�� ũ��� 8kbyte
			// ������ ������ ä������ ������ �������� �ʴ´� -> �׷��� ���� �������⸦ �ؾ� �����
			// bos.flush();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bos.close(); // .flush()����
				fos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
