import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//���: file
//file�� ������� read, write
//FileInputStream
//FileOutputStream
//c:\Temp ������ ������� �۾�

public class Ex03_Stream_File {

	public static void main(String[] args) {
	/*	1�ܰ� �ڵ�
	   try {
			FileInputStream fs=new FileInputStream("c:\\Temp\\file.txt"); //���� ������ �߻�
			//���� �ǳ��� 
			int data=0;
			while ((data=fs.read())!=-1) {
				char c=(char)data; //string->int->string ��ȯ
				System.out.println(data+" = "+c);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}*/
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		String path="c:\\Temp\\file.txt";
		
		try {
			fis=new FileInputStream(path);
			//fos=new FileOutputStream("c:\\Temp\\new.txt"); //new.txt �� ������ ���� �� ����
			fos=new FileOutputStream("c:\\Temp\\new.txt", true); //�⺻ false �����, true �̾��
			int data=0;
			while ((data=fis.read())!=-1) {
				fos.write(data); //�ƽ�Ű�ڵ�� ���� ��ȯ ���ص� �ȴ�
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//IO �ڿ��� GC�� ���� ����� �ƴϴ� -> ��������� �ڿ������� �� �ִ� ���� ����
			//IO���� ������ ���� �߻��ؼ� ��κ� ����ó���� �ؾ� �Ѵ�.
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} 
		}
	}
}
