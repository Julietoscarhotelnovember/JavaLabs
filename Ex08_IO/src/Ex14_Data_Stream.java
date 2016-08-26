import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//보조스트림
//자바의 기본 8가지 타입을 read, write 할 수 있는 함수 제공
//DataInputStream, DataOutputStream
//조건: 2개가 한쌍으로 움직여야 한다
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
