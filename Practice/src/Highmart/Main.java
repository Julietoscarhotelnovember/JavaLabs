package Highmart;

public class Main {

	public static void main(String[] args) {
		//���� 3�� ��ǰ �԰�
		KtTv tv = new KtTv();
		NoteBook note = new NoteBook();
		Audio audio = new Audio();
		
		//������ ����
		Buyer buyer = new Buyer(5000,0);
		
		//�Ǳ��� ���� -> Buy(ǰ��) -> ��� īƮ�� �ִ´�
		buyer.Buy(tv); //500
		buyer.Buy(note); //100
		buyer.Buy(audio);//300 
		buyer.Buy(tv);
		
		//���� ���
		buyer.Summary();
	}
}