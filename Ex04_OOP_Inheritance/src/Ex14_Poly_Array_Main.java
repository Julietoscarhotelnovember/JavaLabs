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
//������
class  Buyer2{
	int money;
	int bonuspoint;
	
	//��ٱ��� ��⼭ ����////////////->�����ڰ� ������ ��ٱ��ϰ� �����ȴ�
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
	
	//�䱸���� 
	//��ٱ��� ���(Cart)
	//��ٱ��� (���忡 �ִ� ������ǰ�� ��θ� ���� �� �ִ�) : POINT
	//�� : ������ , �迭
	//��ٱ����� ũ��� �����Ǿ� �ִ� (������ , ����) 10�� 
	
	
	
	
	
	
	void Buy(Product2 product){
		//īƮ�� ��� �� (���� �ڵ� ����)
		if(this.money < product.price){
			System.out.println(" [ ���� �ܾ��� �����մϴ� ]");
			return; //�Լ��� ����
		}
		
		//��ٱ��� ���
		//����ó�� : if ���ؼ� �迭 ���� üũ
		Cart[index++] = product; //++index ������ (1����)
		
		this.money -= product.price;
		this.bonuspoint += product.bonuspoint;
		System.out.println("[������ ���� :" + product.toString() + "]");
		System.out.println("[���� �ܾ� :" + this.money + "]");
		System.out.println("[���� ����Ʈ :" + this.bonuspoint + "]");
		
	}
	//���� (��ٱ���)
	//��ٱ��Ͽ� ��� ������ ���
	//������ �Ѿ�
	//������ ���  ���
	//10:30 Ȯ��
	void Summary(){
		//ȭ�����
				//������ ��ǰ�� �ѱݾ� 
				//�� ����Ʈ
				//������ ������ ���
				int totalprice = 0;
				int totalbonuspoint = 0;
				String productList = "";
				for(int i=0 ; i < Cart.length ;i++){
					if(Cart[i] == null) break; //īƮ�� ������ ���� ��ŭ�� for��
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

public class Ex14_Poly_Array_Main {

	public static void main(String[] args) {
		//���� 3�� ��ǰ �԰�
		KtTv2 tv = new KtTv2();
		NoteBook2 note = new NoteBook2();
		Audio2 audio = new Audio2();
		
		//������ ����
		Buyer2 buyer = new Buyer2(5000,0);
		
		//�Ǳ��� ���� -> Buy(ǰ��) -> ��� īƮ�� �ִ´�
		buyer.Buy(tv); //500
		buyer.Buy(note); //100
		buyer.Buy(audio);//300 
		buyer.Buy(tv);
		
		//���� ���
		buyer.Summary();

	}

}