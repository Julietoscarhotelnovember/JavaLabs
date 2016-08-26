package Highmart;

//구매자
class Buyer {
	int money;
	int bonuspoint;

	// 장바구니 요기서 생성////////////->구매자가 들어오면 장바구니가 생성된다
	Product[] Cart = new Product[10];
	int index = 0;
	//////////////////////////////////

	public Buyer() {
		// this.money = 1000;
		// this.bonuspoint = 0;
		this(10000, 0);
	}

	public Buyer(int money, int bonuspoint) {
		this.money = money;
		this.bonuspoint = bonuspoint;
	}

	// 요구사항
	// 장바구니 기능(Cart)
	// 장바구니 (매장에 있는 전자제품을 모두를 담을 수 있다) : POINT
	// 위 : 다형성 , 배열
	// 장바구니의 크기는 고정되어 있다 (여러개 , 고정) 10개

	void Buy(Product product) {
		// 카트에 담는 것 (기존 코드 동일)
		if (this.money < product.price) {
			System.out.println(" [ 고객님 잔액이 부족합니다 ]");
			return; // 함수의 종료
		}

		// 장바구니 담기
		// 예외처리 : if 통해서 배열 길이 체크
		Cart[index++] = product; // ++index 차이점 (1번쨰)

		this.money -= product.price;
		this.bonuspoint += product.bonuspoint;
		System.out.println("[구매한 물건 :" + product.toString() + "]");
		System.out.println("[현재 잔액 :" + this.money + "]");
		System.out.println("[현재 포인트 :" + this.bonuspoint + "]");

	}

	// 계산대 (장바구니)
	// 장바구니에 담긴 물건을 계산
	// 물건의 총액
	// 물건의 목록 출력
	// 10:30 확인
	void Summary() {
		// 화면출력
		// 구매한 물품의 총금액
		// 총 포인트
		// 구매한 물건의 목록
		int totalprice = 0;
		int totalbonuspoint = 0;
		String productList = "";
		for (int i = 0; i < Cart.length; i++) {
			if (Cart[i] == null)
				break; // 카트에 물건이 들어온 만큼만 for문
			totalprice += Cart[i].price;
			totalbonuspoint += Cart[i].bonuspoint;
			productList += Cart[i].toString() + "  ";
		}
		System.out.println("**************************************");
		System.out.println("구매한 물건 총액 : " + totalprice);
		System.out.println("포인트 총액 : " + totalbonuspoint);
		System.out.println("구매한 물건 목록 : " + productList + "");
		System.out.println("*************************************");
	}
}
