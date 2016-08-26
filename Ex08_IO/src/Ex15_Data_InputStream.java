import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex15_Data_InputStream {

	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream("score.txt");
			dis = new DataInputStream(fis);

			while (true) {
				score = dis.readInt();
				System.out.println("score int타입: " + score);
				sum += score;
			}
		} catch (IOException e) {
			System.out.println("예외발생: " + e.getMessage());
			System.out.println("sum결과: " + sum);
		} finally {
			if (dis != null) {
				try {
					dis.close();
					fis.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
