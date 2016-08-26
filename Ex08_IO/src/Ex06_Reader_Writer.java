import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//문자 기반 (2바이트) 처리
//문자열은 내부적으로 char[]
//추상:Reader, Writer
//File: FileReader, FileWriter
//메모리: CharArrayReader, CharArryWriter

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
				//퀴즈
				//엔터, 공백, 탭 이런 것들은 write하지 않기
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
