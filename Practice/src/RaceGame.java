import java.awt.*;
import java.awt.event.*;
import java.util.*;

// ������ Ŭ������ ��� �޾Ƽ�  run�� �������̵� �� ���̴�.
public class RaceGame extends Thread {
	static Canvas canvas;
	int y = 0;
	String str = null;
	Random rand = new Random();

	public RaceGame(int y, String str) {
		this.y = y;
		this.str = str;
	}

	// run�� start�� ���ؼ� ���� �ȴ�. ���� run�� �������̵� �� ���´�.
	public void run() {
		Graphics g = canvas.getGraphics();
		g.drawString(str, 20, y);
		for (int i = 0; i < 300; i++) {
			try {
				Thread.sleep(100);
				i += rand.nextInt(5);
				// �� ������ 1�� �������� 0���� 5 ������ ������ ���ڷ� �޸��� �ȴ�.

				if (i > 300) {
					i = 300;
				}
				g.fillRect(50, y, i, 20);
			} catch (Exception e) {

			}
		}
	}

	public static void main(String args[]) {
		Frame frm = new Frame("�渶 ����");
		canvas = new Canvas();

		frm.setSize(400, 400);
		frm.add(canvas);
		frm.setVisible(true);

		RaceGame test1 = new RaceGame(30, "1�� ��");
		RaceGame test2 = new RaceGame(70, "2�� ��");
		RaceGame test3 = new RaceGame(110, "3�� ��");
		RaceGame test4 = new RaceGame(150, "4�� ��");
		RaceGame test5 = new RaceGame(190, "5�� ��");
		RaceGame test6 = new RaceGame(230, "6�� ��");
		RaceGame test7 = new RaceGame(270, "7�� ��");
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