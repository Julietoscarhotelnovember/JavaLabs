import javax.swing.JOptionPane;

class WordTimer extends Thread {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("�����ð�: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("��!");
	}
}

class Word extends Thread {
	boolean sw = true;
	String inputdata;

	@Override
	public void run() {

		while (sw) {
			inputdata = JOptionPane.showInputDialog("��ź ������ ���� ��ȣ �Է�: ");
			if (inputdata.equals("aaa")) {
				System.out.println("��ź�� �����Ǿ����ϴ�.");
				sw=false;
			} else {
				System.out.println("�ٽ� �Է�");
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
