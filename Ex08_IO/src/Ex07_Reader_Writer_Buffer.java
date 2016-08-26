import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//문자열을 다룰 때도 buffer로  io성능 업
//buffer의 장점: 줄단위 처리 가능
public class Ex07_Reader_Writer_Buffer {
	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader("Ex01_Stream.java");
			br=new BufferedReader(fr);
			String line="";
			for (int i=0; (line=br.readLine())!=null; i++) { //.readLine()은 읽을게 없으면 null 리턴
				//System.out.println(line);
				//퀴즈
				//세미콜론이 있는 문장만 출력해보기
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
