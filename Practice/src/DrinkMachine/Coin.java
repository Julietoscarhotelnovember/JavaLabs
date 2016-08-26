package DrinkMachine;
import java.util.Scanner;

class Coin {
	Scanner credit = new Scanner(System.in);
	public int coin;
	int sum;
	
	public int insertCoin(){
		System.out.print("동전을 넣어 주세요: ");
		coin = Integer.parseInt(credit.nextLine());
		System.out.printf("잔액은 %d원 입니다.\n", coin);
		sum=coin;
		while (sum < 500) {
			System.out.print("금액이 부족합니다. 동전을 더 넣으세요: ");
			coin = Integer.parseInt(credit.nextLine());
			sum=sum+coin;
			System.out.printf("현재 잔액은 %d원 입니다.\n", sum);
		}
		return sum;
	}
}