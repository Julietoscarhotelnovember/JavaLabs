class Product2{
	int price;
	int bonuspoint;
	
	public Product2(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
}

class KtTv2 extends  Product2{
	public KtTv2(){
		super(500);
	}
	@Override
	public String toString(){
		return "KtTv2";
	}
}

class Audio2 extends  Product2{
	public Audio2(){
		super(300);
	}
	@Override
	public String toString(){
		return "Audio2";
	}
}

class NoteBook2 extends  Product2{
	public NoteBook2(){
		super(100);
	}
	@Override
	public String toString(){
		return "NoteBook2";
	}
}
//구매자
class  Buyer2{
	int money;
	int bonuspoint;
	
	//장바구니 요기서 생성////////////->구매자가 들어오면 장바구니가 생성된다
	Product2[] Cart = new Product2[10];
	int index=0;
	//////////////////////////////////
	
	public Buyer2(){
		//this.money = 1000;
		//this.bonuspoint = 0; 
		this(10000,0);
	}
	public Buyer2(int money , int bonuspoint){
		this.money = money;
		this.bonuspoint = bonuspoint;
	}
	
	//요구사항 
	//장바구니 기능(Cart)
	//장바구니 (매장에 있는 전자제품을 모두를 담을 수 있다) : POINT
	//위 : 다형성 , 배열
	//장바구니의 크기는 고정되어 있다 (여러개 , 고정) 10개 
	
	
	
	
	
	
	void Buy(Product2 product){
		//카트에 담는 것 (기존 코드 동일)
		if(this.money < product.price){
			System.out.println(" [ 고객님 잔액이 부족합니다 ]");
			return; //함수의 종료
		}
		
		//장바구니 담기
		//예외처리 : if 통해서 배열 길이 체크
		Cart[index++] = product; //++index 차이점 (1번쨰)
		
		this.money -= product.price;
		this.bonuspoint += product.bonuspoint;
		System.out.println("[구매한 물건 :" + product.toString() + "]");
		System.out.println("[현재 잔액 :" + this.money + "]");
		System.out.println("[현재 포인트 :" + this.bonuspoint + "]");
		
	}
	//계산대 (장바구니)
	//장바구니에 담긴 물건을 계산
	//물건의 총액
	//물건의 목록  출력
	//10:30 확인
	void Summary(){
		//화면출력
				//구매한 물품의 총금액 
				//총 포인트
				//구매한 물건의 목록
				int totalprice = 0;
				int totalbonuspoint = 0;
				String productList = "";
				for(int i=0 ; i < Cart.length ;i++){
					if(Cart[i] == null) break; //카트에 물건이 들어온 만큼만 for문
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

public class Ex14_Poly_Array_Main {

	public static void main(String[] args) {
		//매장 3개 제품 입고
		KtTv2 tv = new KtTv2();
		NoteBook2 note = new NoteBook2();
		Audio2 audio = new Audio2();
		
		//구매자 입장
		Buyer2 buyer = new Buyer2(5000,0);
		
		//실구매 행위 -> Buy(품목) -> 사면 카트에 넣는다
		buyer.Buy(tv); //500
		buyer.Buy(note); //100
		buyer.Buy(audio);//300 
		buyer.Buy(tv);
		
		//최종 계산
		buyer.Summary();

	}

}