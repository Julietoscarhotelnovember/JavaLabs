//Ŭ���� ���� ����1
//���� ���� �������� ��������
//���(is~a)
//����(has~a)-�����ֱⰡ ����(��ü�� ������� �� ���� �����Ǿ�� �Ѵ�)/�ٸ���

//Ŭ���� ���� ����2
//��������, ����ڿ� �����ڸ� ��������
//class a{}
//class b{}
//a�� b�� ����ϸ�, a�� �����, b�� ������
//a�� b�� ����ϴ� ���1: aŬ���� �ȿ��� ��ü ����
//a�� b�� ����ϴ� ���2: a�� b�� ���
//a�� b�� ����ϴ� ���3: �Լ��� �Ķ���ͷ� ���
//���

//a�� b�� �������� ����
//���� ���α׷��ֿ����� �������� ���ʸ� ������ ���� �������� �ʴ´�.
class A {
	void amethod(B b) {
		b.bmethod();
	}
}

class B {
	void bmethod() {
		System.out.println("BŬ���� �޼���");
	}
}

//B��ü�� �ȸ�������� ������ ����,
//B��ü�� ��ȭ�� ���� �ΰ��ϰ� �������� �ʰ�
//�������� ���
//A�� B�� ���縦 ���� ��� �����ؾ� �Ѵ� -> �������̽�
interface IP {
	void m();
}
class C {
	void method(IP c) {
		c.m();
	}
}
class D implements IP {

	@Override
	public void m() {
		System.out.println("�� D��");
		
	}
	
}
class F implements IP {

	@Override
	public void m() {
		System.out.println("�� F��");
		
	}
	
}
public class Ex05_User_Provider {
	public static void main(String[] args) {
		//����
		A a=new A();
		B b=new B();
		a.amethod(b);
		
		//�������̽��� ���� ����
		C c=new C();
		D d=new D();
		F f =new F();
		c.method(d);
		c.method(f);
	}
}