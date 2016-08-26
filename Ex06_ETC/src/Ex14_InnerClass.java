//awt, swing, android���� �ַ� ���
//�ȵ���̵� �̺�Ʈ ���� �ʿ��� ���� ���
//Ŭ���� �ȿ� Ŭ������ ���� ����
//inner class, outer class
/*class OuterClass {
	class InnerClass {	
	}
}*/
class OuterClass {
	public int pdata=100;
	private int data=30;
	//����: outerclass�� �ڿ��� ����� �� �ִ�
	class InnerClass {
		void msg() {
			System.out.println("outer private data: "+data);
		}
	}
}
/////////////////////////////////////////////////////////////
abstract class Person2 {
	abstract void eat();
}
class Man extends Person2 {

	@Override
	void eat() {
		System.out.println("Person2�� eat�Լ� ������");
	}
}
/////////////////////////////////////////////////////////////
interface Eatable {
	void eat();
}
class InnerTest {
	public void method(Eatable e) {
		e.eat();
	}
}

public class Ex14_InnerClass {
	public static void main(String[] args) {
		OuterClass outobj=new OuterClass();
		System.out.println("pulic �ڿ�: "+outobj.pdata);
		OuterClass.InnerClass innerobj=outobj.new InnerClass(); //��Ư�� ����
		innerobj.msg();
		
		/*Person2 p2=new Man();
		p2.eat();*/
		
		//Person2�� ����ϴ� Man ���̵�(��ü ������ �ʿ� ���ٸ�)
		//��ü�� ���� ��� �����ϵ��� ����� ����
		//�͸�Ÿ��
		Person2 p3=new Person2() { 	
			@Override
			void eat() {
				System.out.println("�����ڵ�");
			}
		};
		p3.eat();
		
		
		InnerTest inner=new InnerTest();
		inner.method(new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("��ȸ�� �ڿ�");
			}
		});
	}
}
