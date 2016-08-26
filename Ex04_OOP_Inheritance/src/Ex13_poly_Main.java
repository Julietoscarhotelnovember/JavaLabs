//시나리오
//저희는 가전제품 매장 솔루션 개발 사업팀입니다
//A라고 하는 가전제품 매장이 오픈 되면
//요구사항
//가전제품의 공통사항은 : 제품의 가격정보 , 제품의 포인트 정보
//각 가전 제품은 제품별 특징르 가지고 있다 (상품이름 : Tv , Audio , Computer)
//각 제품마다 가격은 다르다  , 포인트 10% 
//Tv 100만원 (포인트는 10만점)

//구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다
//구매자는 구매 행위를 할수 있다 (가전제품)
//        행위를 하게되면 구매자가 가지는 금액정보 감소하고 포인트 올라간다
//구매자는 기본적인 금액을 가지고 있다

class Product {
	int price;
	int bonuspoint;

	// public Product(){}
	public Product(int price) {
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}
}

class KtTv extends Product {
	// KtTv t = new KtTv();
	// KtTv 가격은 500 > price
	public KtTv() {
		super(500);
	}

	// public String ProductName(){
	// return "KtTv";
	// }
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product {
	// KtTv t = new KtTv();
	// KtTv 가격은 500 > price
	public Audio() {
		super(300);
	}

	// public String ProductName(){
	// return "KtTv";
	// }
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product {
	// KtTv t = new KtTv();
	// KtTv 가격은 500 > price
	public NoteBook() {
		super(100);
	}

	// public String ProductName(){
	// return "KtTv";
	// }
	@Override
	public String toString() {
		return "NoteBook";
	}
}

class Buyer { // 구매자
	int money = 1000;
	int bonuspoint = 0;

	// 구매행위
	// 구매행위(물건의 정보 : 잔액 , 포인트 갱신)
	// 구매행위 물건의 정보 (물건객체 parameter 받기)

	// 1차 코드
	// 문제점: 매장 물건 100 개 추가 (문제없어요 : POS 등록 자동)
	// 매장 대규모 세일 : 제품마다 판매 행위를 각각 따로 갖고 있다
	// 제품이 추가 될때마다 구매함수를 같이 추가하여야 한다
	// 이 코드를 개선하세요

	/*
	 * void KtTvBuy(KtTv n){ if(this.money < n.price){
	 * System.out.println("고객님 잔액이 부족합니다"); return; //함수의 종료 } //실구매 this.money
	 * -= n.price; this.bonuspoint += n.bonuspoint;
	 * System.out.println("구매한 물건 : " + n.toString()); } void AudioBuy(Audio n){
	 * if(this.money < n.price){ System.out.println("고객님 잔액이 부족합니다"); return;
	 * //함수의 종료 } //실구매 this.money -= n.price; this.bonuspoint += n.bonuspoint;
	 * System.out.println("구매한 물건 : " + n.toString()); } void
	 * NoteBookBuy(NoteBook n){ if(this.money < n.price){
	 * System.out.println("고객님 잔액이 부족합니다"); return; //함수의 종료 } //실구매 this.money
	 * -= n.price; this.bonuspoint += n.bonuspoint;
	 * System.out.println("구매한 물건 : " + n.toString()); }
	 */

	// 2차코드
	// tip ) 구매함수의 이름을 동일하게 (Buy) 하는 행위하나로 모든 물건 ...
	// 함수 이름 동일하게 (Buy) > Audio , NoteBook , KtTv 만 살수 있게
	// overloading 기법 사용해서 코드 개선
	/*void buy(KtTv n) {
		if (this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다");
			return; // 함수의 종료
		}
		// 실구매
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건 : " + n.toString());
	}

	void buy(Audio n) {
		if (this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다");
			return; // 함수의 종료
		}
		// 실구매
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건 : " + n.toString());
	}

	void buy(NoteBook n) {
		if (this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다");
			return; // 함수의 종료
		}
		// 실구매
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건 : " + n.toString());
	}*/

	// 3차 코드
	void buy(Product n) {
		if (this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다");
			return; // 함수의 종료
		}
		// 실구매
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건 : " + n.toString());
	}

}

public class Ex13_poly_Main {

	public static void main(String[] args) {
		KtTv kttv = new KtTv();
		System.out.println("제품의 이름 : " + kttv.toString());
		System.out.println(kttv.price);
		System.out.println(kttv.bonuspoint);

		Audio audio = new Audio();
		System.out.println("제품의 이름 : " + audio.toString());
		System.out.println(audio.price);
		System.out.println(audio.bonuspoint);

		NoteBook notebook = new NoteBook();
		System.out.println("제품의 이름 : " + notebook.toString());
		System.out.println(notebook.price);
		System.out.println(notebook.bonuspoint);

		Buyer buyer = new Buyer();
		// 1차 코드 TEST
		// buyer.KtTvBuy(kttv);
		// buyer.NoteBookBuy(notebook);
		// buyer.KtTvBuy(kttv);

		// 2차 코드 TEST
		/*buyer.buy(kttv);
		buyer.buy(notebook);
		buyer.buy(kttv);*/

		// 3차 코드(다형성 적용)
		buyer.buy(kttv);
		buyer.buy(notebook);
		buyer.buy(kttv);

	}

}
