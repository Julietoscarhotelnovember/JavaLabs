//�������̽��� ����
//���, ǥ��, ��Ģ, �Ծ� ���� ����� ����
//ex) Aȸ�簡 �Ź��� 3mm �������� ������µ� ���ȸ���
//�԰� ��� ���� �Ź���ȸ ����ǥ���� ���� 5mm�� �ٽ� �������
//���� �����
//ISO ǥ��(���� ���� ǥ��)
//Aȸ��� ���α�������, Bȸ��� ����, Cȸ��� ��Ŵ, Dȸ��� ��Ŵ

//�������̽��� ����� ������ ����Ʈ���� ������ �ֻ�ܿ� ��ġ�ϱ� ����
//�������̽��� �����ϴ� ���� �ƴ϶� ǥ�ذ� ����� ���� �ϴ� ���̴�
//->������� ������ ����� �� ����
//�������̽��� ǥ��ȭ�� ���踦 �����Ѵ�
//ǥ��ȭ�� ���� ���뼳�谡 �����ϴ�
//�ڹ�api�� �������̽� ��� ����
//�������̽��� ��� ��� �����ؾ� �ϴ°��� ǥ��

//�ڹٿ��� �������̽��� ����� ���
//interface IA{}
//�������̽��� ���, ǥ��, ��Ģ�̱� ������ ������{}�� ������ �ʴ´�
//�������̽��� �߻��ڿ��� ������
//�������̽��� ����� �����ϰ�� ������ ���� �� ����.(���������� ���� �� ����)
//->100% �Ϻ��ϰ� �̿ϼ�(�߻�ȭ)�� �ڵ带 ������ �ִ�.(��� ����)
//�׷��� �ּ��� �߿��ϴ�
//������ ��ü ������ �Ұ����Ͽ� ����(implement)�� ���ؼ��� ����� �� �ִ�
//�������̽��� ������ �߻��ڿ��� ������ ������ ����

//�������̽� ������ �̸��� ������ ǥ������ �ڿ� ~able�� �ٿ��� ���
//C#: IClone
//�ڹ�: Cloneable

//���: extends (class A extends B)
//�������̽�: implements(class A implements B)
//�������̽��� ���� ���� �ɰ��� �����
//���߱����� �����ϴ�(���߻��)
//class A implement able, bable, cable
//�������̽��� ����ϴ� ���忡���� �������� �̿��Ͽ� �ٸ� ���� ���� Ÿ���� �ϳ��� ��� ���
//�������̽��� Ŭ����ó�� Ÿ������ ���� ���� ����
//interface my{}
//class a implements my{}
//class b implements my{}

interface IA{
	//���+�߻��ڿ�
	//����� Ŭ���� ���� ����� �� �־�� �ϹǷ�
	//public, static, final�̾�� �ϸ�, �̰��� default��
	public static final int AGE=100;
	String GENDER="��";
	
	//�ݵ�� �����ؾ� �ϴ� �߻��ڿ��̹Ƿ� ��� �ڿ����� ������ �� �־�� �ؼ�
	//public, abstract�̾�� �ϸ�, �̰��� default��
	public abstract String print();
	String message(String str);
}
interface IB {
	int AGE=100;
	void print();
	String message(String str);
}
class Test implements IA {
	@Override
	public String print() {
		return null;
	}

	@Override
	public String message(String str) {
		return null;
	}	
}
//���, ���� �� �ҷ�
class Test2 extends Object implements IA {

	@Override
	public String print() {
		return null;
	}

	@Override
	public String message(String str) {
		return null;
	}	
}
interface IC {
	void run();
}
//���߱���
class Test3 extends Object implements IA, IC {

	@Override
	public void run() {
			
	}

	@Override
	public String print() {
		return null;
	}

	@Override
	public String message(String str) {
		return null;
	}	
}


//�������̽��� Ŭ����ó�� Ÿ������ ����(������)
//->�ڽ��� �ּҸ� �θ� ������ �� �ִ�
public class Ex03_Interface {
	public static void main(String[] args) {
		Test t=new Test();
	}
}