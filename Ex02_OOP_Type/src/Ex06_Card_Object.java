import kr.or.kosta.Card;
import kr.or.kosta.SCard;

public class Ex06_Card_Object {

	public static void main(String[] args) {
		// �䱸����
		// ī�� 50�� �����
		// �� ī���� ����, ����� �ٸ���
		// h�� w�� ����� �� ����
		Card c1 = new Card();
		c1.numer = 1;
		c1.kind = "��Ʈ";
		c1.h=12;
		c1.card_Info();
		Card c2 = new Card();
		c2.numer = 2;
		c2.kind = "��Ʈ";
		c2.h=12;
		c2.card_Info();
		
		// �� 52�� �ݺ� ��
		// �� �䱸����: ī�� ���̸� 12�� �ٲ��ּ�
		// 52�� ���� ��� 1�� �������� �ݿ����� -> �����Ǵ� ����, �ʺ� -> ���赵 ���� �ʿ�
		
		SCard s1=new SCard();
		//52���� h 50, w 100���� �ٲ��ּ�
		s1.h=50;
		s1.w=100;
		
		s1.numer = 3;
		s1.kind = "�����̵�";
		s1.card_Info();
		SCard s2=new SCard();
		s2.numer = 4;
		s2.kind = "�����̵�";
		s2.card_Info();
		
		
	}
}
