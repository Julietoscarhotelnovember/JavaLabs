import javax.swing.JOptionPane;

class WordTimer extends Thread {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("남은시간: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("펑!");
	}
}

class Word extends Thread {
	boolean sw = true;
	String inputdata;

	@Override
	public void run() {

		while (sw) {
			inputdata = JOptionPane.showInputDialog("폭탄 해제를 위한 암호 입력: ");
			if (inputdata.equals("aaa")) {
				System.out.println("폭탄이 해제되었습니다.");
				sw=false;
			} else {
				System.out.println("다시 입력");
			}
		}
		System.exit(0);
	}
}

public class Ex04_Mulit_Word_Game {

	public static void main(String[] args) throws InterruptedException {
		WordTimer timer = new WordTimer();
		timer.start();
		
		Word word = new Word();
		word.start();
		
		if (word.isInterrupted()) {
			timer.interrupt();
		} else {

		}
	}
}
