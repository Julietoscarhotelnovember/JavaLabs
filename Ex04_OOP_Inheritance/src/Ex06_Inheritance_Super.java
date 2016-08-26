//this: ��ü �ڽ��� ����Ű�� this, �����ڸ� ȣ���ϴ�  this
//super: ����� ����, ��Ӱ��迡���� �����Ѵ�
//��Ӱ��迡�� �θ��ڿ��� ������ �� �ִ� Ű����(�θ��� �ּҸ� ������ ����)

//super�� this�� ���� ����
//1.�θ��� ������ ȣ�� ����
//2.�θ��� �ּҰ��� ����Ŵ

//C#: base()
//Java: super()

class Base {
	String basename;

	Base() {
		System.out.println("Base�� �⺻ ������");
	}

	Base(String basename) {
		this.basename = basename;
		System.out.println("basename: " + this.basename);
	}

	void baseMethod() {
		System.out.println("Base Method");
	}
}

class Derived extends Base {
	String dname;

	Derived() {
		System.out.println("Dervied �⺻ ������");
	}

	Derived(String dname) {
		//�θ��� �����ڸ� ȣ���ϴ� super
		super(dname);
		this.dname = dname;
		System.out.println("dname: " + this.dname);
	}

	void derivedMethod() {
		System.out.println("Derived Method");
	}
	
	//������
	@Override
	void baseMethod() {
		System.out.println("�θ��� baseMethod() ������");
	}
	
	//�����ǵ� �ڽ��Լ� ��� ����� �θ��� �Լ��� ���� ���� ��
	void parentMethod() {
		super.baseMethod(); //������ �� ��쿡�� ���
	}
}

public class Ex06_Inheritance_Super {

	public static void main(String[] args) {
		Derived d=new Derived(); //����! �̷��� �ϸ� ����Ʈ ������ �Ѵ� ȣ��(�θ����, �����ڽ�)
		Derived d2=new Derived("���"); //����! �θ��� �����ε� �����ڴ� ȣ����� �ʴ´�
		     						   //�Ķ���͸� �Ѱ����� �ʾƼ�
		Derived d3=new Derived("ȫ�浿");
		d3.baseMethod();
		
		//����
		//�ڽ�Ŭ�������� �θ��� ���� baseMethod()�� ȣ���ϴ� ���
		Derived d4=new Derived();
		d4.parentMethod();
		
	}
}
