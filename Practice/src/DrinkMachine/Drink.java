package DrinkMachine;
import java.util.Scanner;

public class Drink {
	int drink;
	public int selectDrink(int totalcoin) {
		Scanner credit = new Scanner(System.in);
		while (499 < totalcoin) { // ����� �޴�
			System.out.println("\n*********[����� ����]*********");
			System.out.println("1.A����� (��1000)");
			System.out.println("2.B����� (��700)");
			System.out.println("3.C����� (��500)");
			System.out.println("4.������ȯ");
			drink = Integer.parseInt(credit.nextLine()); // ���������
		}
		return drink;
	}
}
