package Highmart;

public class Main {

	public static void main(String[] args) {
		//매장 3개 제품 입고
		KtTv tv = new KtTv();
		NoteBook note = new NoteBook();
		Audio audio = new Audio();
		
		//구매자 입장
		Buyer buyer = new Buyer(5000,0);
		
		//실구매 행위 -> Buy(품목) -> 사면 카트에 넣는다
		buyer.Buy(tv); //500
		buyer.Buy(note); //100
		buyer.Buy(audio);//300 
		buyer.Buy(tv);
		
		//최종 계산
		buyer.Summary();
	}
}