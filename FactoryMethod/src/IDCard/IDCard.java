package IDCard;

import Framework.*;

public class IDCard extends Product {
	IDCard() {
		System.out.println("카드 생산");
	}

	@Override
	public void use() {
		System.out.println("카드 사용");
	}
}
