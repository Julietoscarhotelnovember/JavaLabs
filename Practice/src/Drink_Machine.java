import java.util.Scanner;

public class Drink_Machine {
	public static void main(String[] args) {
		Scanner credit = new Scanner(System.in); // Scanner �� �޸𸮿� ����
		int coin;
		int sum;
		System.out.print("������ �־� �ּ���: ");
		coin = Integer.parseInt(credit.nextLine());
		System.out.printf("�ܾ��� %d�� �Դϴ�.\n", coin);
		sum=coin;
		while (sum < 500) {
			System.out.print("�ݾ��� �����մϴ�. ������ �� ��������: ");
			coin = Integer.parseInt(credit.nextLine());
			sum=sum+coin;
			System.out.printf("���� �ܾ��� %d�� �Դϴ�.\n", sum);
		}

		int drink = 0;
		int a = 1000;
		int b = 700;
		int c = 500;

		while (499 < sum) { // ����� �޴�
			System.out.println("\n*********[����� ����]*********");
			System.out.println("1.A����� (��1000)");
			System.out.println("2.B����� (��700)");
			System.out.println("3.C����� (��500)");
			System.out.println("4.������ȯ");
			drink = Integer.parseInt(credit.nextLine()); // ���������

			if (drink == 1) { // 1������� ���ý�
				if (coin >= a) {
					coin -= a;
					System.out.println("A����� ����/" + " ��������:" + coin + "��");
				} else {
					System.out.println("���ܾ׺���->���С�" + " ��������:" + coin + "��");
				}
			} else if (drink == 2) { // 2������� ���ý�
				if (coin >= b) { // ��������>=
					coin -= b;
					System.out.println("B����� ����/" + " ��������:" + coin + "��");
				} else {
					System.out.println("���ܾ׺���->���С�" + " ��������:" + coin + "��");
				}
			} else if (drink == 3) { // 3������� ���ý�
				if (coin >= c) { // ��������>=
					coin -= c;
					System.out.println("C����� ����/" + " ��������:" + coin + "��");
				} else {
					System.out.println("���ܾ׺���->���С�" + " ��������:" + coin + "��");
				}
			} else if (drink == 4) { // 4�� ����
				System.out.println(coin + "�� " + "������ȯ->����");
				return; // ����
			} else
				System.out.println("�ٽ� �������ּ���");

		}
	}
}