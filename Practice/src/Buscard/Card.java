package Buscard;
import java.util.Scanner;

public class Card {
	Scanner sc = new Scanner(System.in);
	
	// 카드 초기 금액, 0~10000원
	int init = ((int) (Math.random() * 10 + 1)) * 1000;
	void printCard() {
		System.out.println("카드 초기 금액은 "+init+"원 입니다.");
	}

	// 판단하기
	void judgeMoney() {
		if (init>=50000) {
			int i=init-50000;
			System.out.println("5만원이 넘어 다음 금액이 반환됩니다: "+i);
			System.out.println("현재 잔액은 50000원 입니다.");
		} else {
			System.out.println("현재 잔액은 "+init+"원 입니다.");
			System.out.print("더 충전 하시겠습니까? (y/n) ");
			String input=sc.nextLine();
			if (input.equals("y")) {
				insertMoney();
			} else {
				System.out.println("충전을 종료합니다.");
				System.out.println("현재 잔액은 "+init+"원 입니다.");
			}
		}
	}
	//돈 넣기
	int money;
	void insertMoney() {
		System.out.print("돈을 넣으세요: ");
		money=Integer.parseInt(sc.nextLine());
		init+=money;
		judgeMoney();
	}
}