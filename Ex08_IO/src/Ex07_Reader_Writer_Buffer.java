import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//���ڿ��� �ٷ� ���� buffer��  io���� ��
//buffer�� ����: �ٴ��� ó�� ����
public class Ex07_Reader_Writer_Buffer {
	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader("Ex01_Stream.java");
			br=new BufferedReader(fr);
			String line="";
			for (int i=0; (line=br.readLine())!=null; i++) { //.readLine()�� ������ ������ null ����
				//System.out.println(line);
				//����
				//�����ݷ��� �ִ� ���常 ����غ���
				if (line.indexOf(";")!=-1) {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
