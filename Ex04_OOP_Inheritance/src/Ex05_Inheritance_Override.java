class Test2 {
	void print() {
		System.out.println("�θ��Լ�");
	}
}

class Test3 extends Test2 {
	// �θ� Ŭ������ Test2�� ���� �ִ� print()�� ������ �Ͻÿ�
	@Override
	void print() {
		System.out.println("�������̵� �� �ڽ��Լ�");
	}
}

class Test4 {

	//Object�Լ��� �������Ͽ� �� �� �ִ�

	@Override
	public String toString() {  //toString�� �����ڵ��� ���� ���� ������ �ؼ� ����Ѵ�
		return "Object�� toString() ������";  //super.toString();
	}
	
}

class Test5 {
	
}

public class Ex05_Inheritance_Override {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.print(); // �����ǵ� print�� ȣ���� �� �ִ�.
		
		Object o=new Object();
		Test4 t2=new Test4();
		Test5 t3=new Test5();
		System.out.println(t2.toString()); //�����ǵ� toString ȣ��
		System.out.println(t3.toString()); //Object�� toString ȣ��
		
		//��Ģ�� �����ǵ� �Լ��� ȣ���Ѵ�
		//���� �θ��� �Լ��� �׸��ﶧ super.�� ���
	}
}
