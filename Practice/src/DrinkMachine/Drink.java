package DrinkMachine;
import java.util.Scanner;

public class Drink {
	int drink;
	public int selectDrink(int totalcoin) {
		Scanner credit = new Scanner(System.in);
		while (499 < totalcoin) { // 음료수 메뉴
			System.out.println("\n*********[음료수 선택]*********");
			System.out.println("1.A음료수 (￦1000)");
			System.out.println("2.B음료수 (￦700)");
			System.out.println("3.C음료수 (￦500)");
			System.out.println("4.동전반환");
			drink = Integer.parseInt(credit.nextLine()); // 음료수선택
		}
		return drink;
	}
}
