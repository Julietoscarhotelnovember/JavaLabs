package DrinkMachine;
import java.util.Scanner;

class Coin {
	Scanner credit = new Scanner(System.in);
	public int coin;
	int sum;
	
	public int insertCoin(){
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
		return sum;
	}
}