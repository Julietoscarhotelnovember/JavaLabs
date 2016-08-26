import java.awt.*;
import java.awt.event.*;
import java.util.*;

// 쓰레드 클래스를 상속 받아서  run을 오버라이딩 할 것이다.
public class RaceGame extends Thread {
	static Canvas canvas;
	int y = 0;
	String str = null;
	Random rand = new Random();

	public RaceGame(int y, String str) {
		this.y = y;
		this.str = str;
	}

	// run은 start를 통해서 실행 된다. 현재 run은 오버라이딩 한 상태다.
	public void run() {
		Graphics g = canvas.getGraphics();
		g.drawString(str, 20, y);
		for (int i = 0; i < 300; i++) {
			try {
				Thread.sleep(100);
				i += rand.nextInt(5);
				// 각 말들은 1초 간격으로 0부터 5 까지의 랜덤한 숫자로 달리게 된다.

				if (i > 300) {
					i = 300;
				}
				g.fillRect(50, y, i, 20);
			} catch (Exception e) {

			}
		}
	}

	public static void main(String args[]) {
		Frame frm = new Frame("경마 게임");
		canvas = new Canvas();

		frm.setSize(400, 400);
		frm.add(canvas);
		frm.setVisible(true);

		RaceGame test1 = new RaceGame(30, "1번 말");
		RaceGame test2 = new RaceGame(70, "2번 말");
		RaceGame test3 = new RaceGame(110, "3번 말");
		RaceGame test4 = new RaceGame(150, "4번 말");
		RaceGame test5 = new RaceGame(190, "5번 말");
		RaceGame test6 = new RaceGame(230, "6번 말");
		RaceGame test7 = new RaceGame(270, "7번 말");
		test1.start();
		test2.start();
		test3.start();
		test4.start();
		test5.start();
		test6.start();
		test7.start();

		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

	}
}