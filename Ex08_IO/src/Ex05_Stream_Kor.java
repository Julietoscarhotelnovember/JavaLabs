import java.io.FileInputStream;
import java.io.IOException;

//2바이트 문자 처리
//stream을 구성하는 모든 빨대들은 1바이트 단위로 입출력한다
public class Ex05_Stream_Kor {
	public static void main(String[] args) {
		FileInputStream input = null;
		try {
			input = new FileInputStream("kor.txt"); // 인풋은 파일이 만들어져 있어야 한다
			// 2바이트 데이터 처리를 stream으로 시도해보자
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
		//불가능
	}
}
