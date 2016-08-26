import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//보조스트림(파일처리)
//단독사용 금지(생성자를 통해서 반드시 Stream객체를 받도록 설계)
//주 스트림(InputStream, OutputStream)을 구현하는 클래스
//장점: 파일 io의 양을 줄일 수 있다. (라인 단위의 데이터 처리 가능)
//걍 의무적으로 쓰는게 속편하다
//BufferedInputStream
//BufferedInputStream

public class Ex04_Stream_Buffer_File {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("data.txt");
			// 경로를 명시하지 않으면 디폴트로 프로젝트 폴더에 파일 생성

			bos = new BufferedOutputStream(fos);
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i); // buffer를 통해서 한번에 data.txt에 write
			}

			// buffer의 크기는 8kbyte
			// 버퍼의 내용이 채워지지 않으면 내보내지 않는다 -> 그래서 강제 내보내기를 해야 저장됨
			// bos.flush();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bos.close(); // .flush()포함
				fos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
