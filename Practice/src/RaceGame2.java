import java.util.*;

// 쓰레드 클래스를 상속 받아서  run을 오버라이딩 할 것이다.
public class RaceGame2 extends Thread {

	String str = null;
	Random rand = new Random();
	
	public RaceGame2(String str) {
		this.str = str;
	}

	public void run() {
		System.out.println(str+"번말 ");
		for (int i = 0; i < 300; i++) {
			try {
				Thread.sleep(100);
				i += rand.nextInt(5);
				System.out.print("*****");
				if (i > 300) {
					i = 300;
				}
			} catch (Exception e) {

			}
		}
	}

	public static void main(String args[]) {
		

		RaceGame2 test1 = new RaceGame2("1번 말");
		RaceGame2 test2 = new RaceGame2("2번 말");
		RaceGame2 test3 = new RaceGame2("3번 말");

		test1.start();
		test2.start();
		test3.start();


	}
}