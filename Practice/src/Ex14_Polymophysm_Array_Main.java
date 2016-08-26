class Product2 {
	int price;
	int bonuspoint;

	public Product2(int price) {
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}
}

class KtTv2 extends Product2 {
	public KtTv2() {
		super(500);
	}

	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio2 extends Product2 {
	public Audio2() {
		super(300);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook2 extends Product2 {
	// KtTv t = new KtTv();
	// KtTv 가격은 500 > price
	public NoteBook2() {
		super(100);
	}

	@Override
	public String toString() {
		return "Notebook";
	}
}

class Buyer2 {
	int money;
	int bonuspoint;

	public Buyer2() {
		this(5000, 0);
	}

	public Buyer2(int money, int bounuspoint) {
		this.money = money;
		this.bonuspoint = bonuspoint;
	}

	// 카트에 담기
	void Buy(Product2[] product) {
		System.out.println("구매한 물건");
		for (int i = 0; i < product.length; i++) {
			if (this.money < product[i].price) {
				System.out.println("고객님 잔액이 부족합니다");
				return; // 함수의 종료
			}
			// 실구매
			this.money -= product[i].price;
			this.bonuspoint += product[i].bonuspoint;
			//System.out.println(product[i].toString());
		}
	}

	// 계산대에서 계산
	// 물건의 총액
	// 물건의 목록 출력

	int Summary(Product2[] product) {
		int sum = 0;
		for (int i = 0; i < product.length; i++) {
			sum += product[i].price;
			System.out.println(product[i].toString());
		}
		return sum;
	}

}

// 요구사항
// 장바구니, 카트 기능
// 장바구니: 전자제품을 모두 담을 수 있다
// 10 개를 담을 수 있다: 배열
// 장바구니의 크기는 고정: 정적배열(콜렉션)

public class Ex14_Polymophysm_Array_Main {

	public static void main(String[] args) {
		Product2[] p = new Product2[10];
		p[0] = new KtTv2();
		p[1] = new KtTv2();
		p[2] = new NoteBook2();
		p[3] = new Audio2();
		p[4] = new NoteBook2();
		p[5] = new NoteBook2();
		p[6] = new NoteBook2();
		p[7] = new Audio2();
		p[8] = new Audio2();
		p[9] = new Audio2();
		Buyer2 b = new Buyer2();
		b.Buy(p);
		int sum = b.Summary(p);
		System.out.println("금액 합계: " + sum);
		System.out.println("포인트 합계: " + sum * 0.1);
	}

}
