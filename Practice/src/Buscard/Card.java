package Buscard;
import java.util.Scanner;

public class Card {
	Scanner sc = new Scanner(System.in);
	
	// ī�� �ʱ� �ݾ�, 0~10000��
	int init = ((int) (Math.random() * 10 + 1)) * 1000;
	void printCard() {
		System.out.println("ī�� �ʱ� �ݾ��� "+init+"�� �Դϴ�.");
	}

	// �Ǵ��ϱ�
	void judgeMoney() {
		if (init>=50000) {
			int i=init-50000;
			System.out.println("5������ �Ѿ� ���� �ݾ��� ��ȯ�˴ϴ�: "+i);
			System.out.println("���� �ܾ��� 50000�� �Դϴ�.");
		} else {
			System.out.println("���� �ܾ��� "+init+"�� �Դϴ�.");
			System.out.print("�� ���� �Ͻðڽ��ϱ�? (y/n) ");
			String input=sc.nextLine();
			if (input.equals("y")) {
				insertMoney();
			} else {
				System.out.println("������ �����մϴ�.");
				System.out.println("���� �ܾ��� "+init+"�� �Դϴ�.");
			}
		}
	}
	//�� �ֱ�
	int money;
	void insertMoney() {
		System.out.print("���� ��������: ");
		money=Integer.parseInt(sc.nextLine());
		init+=money;
		judgeMoney();
	}
}