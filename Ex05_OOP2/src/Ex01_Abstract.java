//�߻�Ŭ����
//�̿ϼ� ���赵(�ϼ��� �ڵ�+�̿ϼ��� �ڵ�)
//�̿ϼ��ڵ�=�̿ϼ� �޼ҵ�(�����{}�� ����)
//�� ������? ��� ���迡�� ������ ����(override)�� ����
//void method(){} > void method();

//1.�߻� Ŭ������ ������ ��ü ������ �� �� ����.
//2.����� ���ؼ��� ����� �� �ִ�. abstract class Emp {�߻�޼ҵ�}
//3.����� ���� �̿ϼ� �޼ҵ带 ����(�������̵�)�ؾ� �Ѵ�

abstract class Abclass {
	int pos;
	void run() {
		pos++;
	}
	
	//�߻��ڿ�(�߻�޼ҵ�)
	abstract void stop();
}
class Child extends Abclass {
	@Override
	void stop() {
		System.out.println("stop");
	}
}

public class Ex01_Abstract {
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.pos);
		c.run();
		System.out.println(c.pos);
		c.stop();
		

	}
}
