import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//���� ��� (2����Ʈ) ó��
//���ڿ��� ���������� char[]
//�߻�:Reader, Writer
//File: FileReader, FileWriter
//�޸�: CharArrayReader, CharArryWriter

public class Ex06_Reader_Writer {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("Ex01_Stream.java");
			fw = new FileWriter("copy_Ex01_Stream.txt");
			int data = 0;
			while ((data = fr.read()) != 1) {
				fw.write(data);
				//����
				//����, ����, �� �̷� �͵��� write���� �ʱ�
				if(data!='\t'&&data!='\n'&&data!=' '&&data!='\r') {
					fw.write(data);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
