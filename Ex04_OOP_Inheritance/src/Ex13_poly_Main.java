//�ó�����
//����� ������ǰ ���� �ַ�� ���� ������Դϴ�
//A��� �ϴ� ������ǰ ������ ���� �Ǹ�
//�䱸����
//������ǰ�� ��������� : ��ǰ�� �������� , ��ǰ�� ����Ʈ ����
//�� ���� ��ǰ�� ��ǰ�� Ư¡�� ������ �ִ� (��ǰ�̸� : Tv , Audio , Computer)
//�� ��ǰ���� ������ �ٸ���  , ����Ʈ 10% 
//Tv 100���� (����Ʈ�� 10����)

//������ : ��ǰ�� �����ϱ� ���� �ݾ����� , ����Ʈ ������ ������ �ִ�
//�����ڴ� ���� ������ �Ҽ� �ִ� (������ǰ)
//        ������ �ϰԵǸ� �����ڰ� ������ �ݾ����� �����ϰ� ����Ʈ �ö󰣴�
//�����ڴ� �⺻���� �ݾ��� ������ �ִ�

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
	// KtTv ������ 500 > price
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
	// KtTv ������ 500 > price
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
	// KtTv ������ 500 > price
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

class Buyer { // ������
	int money = 1000;
	int bonuspoint = 0;

	// ��������
	// ��������(������ ���� : �ܾ� , ����Ʈ ����)
	// �������� ������ ���� (���ǰ�ü parameter �ޱ�)

	// 1�� �ڵ�
	// ������: ���� ���� 100 �� �߰� (��������� : POS ��� �ڵ�)
	// ���� ��Ը� ���� : ��ǰ���� �Ǹ� ������ ���� ���� ���� �ִ�
	// ��ǰ�� �߰� �ɶ����� �����Լ��� ���� �߰��Ͽ��� �Ѵ�
	// �� �ڵ带 �����ϼ���

	/*
	 * void KtTvBuy(KtTv n){ if(this.money < n.price){
	 * System.out.println("���� �ܾ��� �����մϴ�"); return; //�Լ��� ���� } //�Ǳ��� this.money
	 * -= n.price; this.bonuspoint += n.bonuspoint;
	 * System.out.println("������ ���� : " + n.toString()); } void AudioBuy(Audio n){
	 * if(this.money < n.price){ System.out.println("���� �ܾ��� �����մϴ�"); return;
	 * //�Լ��� ���� } //�Ǳ��� this.money -= n.price; this.bonuspoint += n.bonuspoint;
	 * System.out.println("������ ���� : " + n.toString()); } void
	 * NoteBookBuy(NoteBook n){ if(this.money < n.price){
	 * System.out.println("���� �ܾ��� �����մϴ�"); return; //�Լ��� ���� } //�Ǳ��� this.money
	 * -= n.price; this.bonuspoint += n.bonuspoint;
	 * System.out.println("������ ���� : " + n.toString()); }
	 */

	// 2���ڵ�
	// tip ) �����Լ��� �̸��� �����ϰ� (Buy) �ϴ� �����ϳ��� ��� ���� ...
	// �Լ� �̸� �����ϰ� (Buy) > Audio , NoteBook , KtTv �� ��� �ְ�
	// overloading ��� ����ؼ� �ڵ� ����
	/*void buy(KtTv n) {
		if (this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�");
			return; // �Լ��� ����
		}
		// �Ǳ���
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ���� : " + n.toString());
	}

	void buy(Audio n) {
		if (this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�");
			return; // �Լ��� ����
		}
		// �Ǳ���
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ���� : " + n.toString());
	}

	void buy(NoteBook n) {
		if (this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�");
			return; // �Լ��� ����
		}
		// �Ǳ���
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ���� : " + n.toString());
	}*/

	// 3�� �ڵ�
	void buy(Product n) {
		if (this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�");
			return; // �Լ��� ����
		}
		// �Ǳ���
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ���� : " + n.toString());
	}

}

public class Ex13_poly_Main {

	public static void main(String[] args) {
		KtTv kttv = new KtTv();
		System.out.println("��ǰ�� �̸� : " + kttv.toString());
		System.out.println(kttv.price);
		System.out.println(kttv.bonuspoint);

		Audio audio = new Audio();
		System.out.println("��ǰ�� �̸� : " + audio.toString());
		System.out.println(audio.price);
		System.out.println(audio.bonuspoint);

		NoteBook notebook = new NoteBook();
		System.out.println("��ǰ�� �̸� : " + notebook.toString());
		System.out.println(notebook.price);
		System.out.println(notebook.bonuspoint);

		Buyer buyer = new Buyer();
		// 1�� �ڵ� TEST
		// buyer.KtTvBuy(kttv);
		// buyer.NoteBookBuy(notebook);
		// buyer.KtTvBuy(kttv);

		// 2�� �ڵ� TEST
		/*buyer.buy(kttv);
		buyer.buy(notebook);
		buyer.buy(kttv);*/

		// 3�� �ڵ�(������ ����)
		buyer.buy(kttv);
		buyer.buy(notebook);
		buyer.buy(kttv);

	}

}
