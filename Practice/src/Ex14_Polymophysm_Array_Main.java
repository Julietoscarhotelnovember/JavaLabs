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
	// KtTv ������ 500 > price
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

	// īƮ�� ���
	void Buy(Product2[] product) {
		System.out.println("������ ����");
		for (int i = 0; i < product.length; i++) {
			if (this.money < product[i].price) {
				System.out.println("���� �ܾ��� �����մϴ�");
				return; // �Լ��� ����
			}
			// �Ǳ���
			this.money -= product[i].price;
			this.bonuspoint += product[i].bonuspoint;
			//System.out.println(product[i].toString());
		}
	}

	// ���뿡�� ���
	// ������ �Ѿ�
	// ������ ��� ���

	int Summary(Product2[] product) {
		int sum = 0;
		for (int i = 0; i < product.length; i++) {
			sum += product[i].price;
			System.out.println(product[i].toString());
		}
		return sum;
	}

}

// �䱸����
// ��ٱ���, īƮ ���
// ��ٱ���: ������ǰ�� ��� ���� �� �ִ�
// 10 ���� ���� �� �ִ�: �迭
// ��ٱ����� ũ��� ����: �����迭(�ݷ���)

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
		System.out.println("�ݾ� �հ�: " + sum);
		System.out.println("����Ʈ �հ�: " + sum * 0.1);
	}

}
