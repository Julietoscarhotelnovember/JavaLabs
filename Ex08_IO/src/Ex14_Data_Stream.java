import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//������Ʈ��
//�ڹ��� �⺻ 8���� Ÿ���� read, write �� �� �ִ� �Լ� ����
//DataInputStream, DataOutputStream
//����: 2���� �ѽ����� �������� �Ѵ�
public class Ex14_Data_Stream {

	public static void main(String[] args) throws IOException {
		int[] score={100,90, 80, 10, 60};
		FileOutputStream fos=new FileOutputStream("score.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		for (int i=0; i<score.length; i++) {
			dos.writeInt(score[i]);
		}
		
		dos.close();
		fos.close();

	}

}
