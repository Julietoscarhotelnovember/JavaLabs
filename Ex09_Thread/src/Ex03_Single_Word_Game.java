import javax.swing.JOptionPane;

//�ܾ���߱� ����
//�ܾ� ���ߴ� â(�Է�â): ������ �ð� �ο�, �ð��� ������ ���� ����

public class Ex03_Single_Word_Game {

	public static void main(String[] args) {
		// UI��Ҵ� AWT, SWING ���
		// ���� �Ⱦ��� -> �ڹ�FX��
		String inputdata = JOptionPane.showInputDialog("���� �Է�: ");
		System.out.println("����� �Է��� ���� " + inputdata);
		Timer();
	}

	static void Timer() {
		for (int i = 10; i > 0; i--) {
			System.out.println("�����ð�: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("����!");
	}

}
