class Data {
	int i;
}
public class Ex10_Method_Call {

	public static void main(String[] args) {
		Data data=new Data();
		data.i=100;
		Call(data); //�ּҸ� ����
		System.out.println(data.i);
		
		Vcall(data.i); //���� ����
		System.out.println(data.i);
	}
	static void Call(Data d) { //�ּҰ��� ����
		System.out.println(d.i);
		d.i=5555;
	}
	static void Vcall(int x) { //���� ����
		x=8888;
		System.out.println(x);
	}
}

//���赵 �ȿ� ���� static �޼ҵ带 ����� �־��ٸ� �� �ǵ���?
//���� ���� �ڿ��̶� ���ϰ� ������ ����ڴ�
//ex) System.out.println(); -> out�� ����ƽ �ڿ�