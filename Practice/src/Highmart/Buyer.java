package Highmart;

//������
class Buyer {
	int money;
	int bonuspoint;

	// ��ٱ��� ��⼭ ����////////////->�����ڰ� ������ ��ٱ��ϰ� �����ȴ�
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

	// �䱸����
	// ��ٱ��� ���(Cart)
	// ��ٱ��� (���忡 �ִ� ������ǰ�� ��θ� ���� �� �ִ�) : POINT
	// �� : ������ , �迭
	// ��ٱ����� ũ��� �����Ǿ� �ִ� (������ , ����) 10��

	void Buy(Product product) {
		// īƮ�� ��� �� (���� �ڵ� ����)
		if (this.money < product.price) {
			System.out.println(" [ ���� �ܾ��� �����մϴ� ]");
			return; // �Լ��� ����
		}

		// ��ٱ��� ���
		// ����ó�� : if ���ؼ� �迭 ���� üũ
		Cart[index++] = product; // ++index ������ (1����)

		this.money -= product.price;
		this.bonuspoint += product.bonuspoint;
		System.out.println("[������ ���� :" + product.toString() + "]");
		System.out.println("[���� �ܾ� :" + this.money + "]");
		System.out.println("[���� ����Ʈ :" + this.bonuspoint + "]");

	}

	// ���� (��ٱ���)
	// ��ٱ��Ͽ� ��� ������ ���
	// ������ �Ѿ�
	// ������ ��� ���
	// 10:30 Ȯ��
	void Summary() {
		// ȭ�����
		// ������ ��ǰ�� �ѱݾ�
		// �� ����Ʈ
		// ������ ������ ���
		int totalprice = 0;
		int totalbonuspoint = 0;
		String productList = "";
		for (int i = 0; i < Cart.length; i++) {
			if (Cart[i] == null)
				break; // īƮ�� ������ ���� ��ŭ�� for��
			totalprice += Cart[i].price;
			totalbonuspoint += Cart[i].bonuspoint;
			productList += Cart[i].toString() + "  ";
		}
		System.out.println("**************************************");
		System.out.println("������ ���� �Ѿ� : " + totalprice);
		System.out.println("����Ʈ �Ѿ� : " + totalbonuspoint);
		System.out.println("������ ���� ��� : " + productList + "");
		System.out.println("*************************************");
	}
}
