import kr.or.kosta.Card;
import kr.or.kosta.SCard;

public class Ex06_Card_Object {

	public static void main(String[] args) {
		// 요구사항
		// 카드 50장 만들기
		// 각 카드의 숫자, 모양은 다르게
		// h와 w는 변경될 수 있음
		Card c1 = new Card();
		c1.numer = 1;
		c1.kind = "하트";
		c1.h=12;
		c1.card_Info();
		Card c2 = new Card();
		c2.numer = 2;
		c2.kind = "하트";
		c2.h=12;
		c2.card_Info();
		
		// 를 52번 반복 후
		// 고객 요구사항: 카드 높이를 12로 바꿔주셈
		// 52번 수정 대신 1번 수정으로 반영하자 -> 공유되는 높이, 너비 -> 설계도 변경 필요
		
		SCard s1=new SCard();
		//52장을 h 50, w 100으로 바꿔주셈
		s1.h=50;
		s1.w=100;
		
		s1.numer = 3;
		s1.kind = "스페이드";
		s1.card_Info();
		SCard s2=new SCard();
		s2.numer = 4;
		s2.kind = "스페이드";
		s2.card_Info();
		
		
	}
}
