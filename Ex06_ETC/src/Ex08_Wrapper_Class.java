//�⺻Ÿ��: 8�� > �ڹ�api�� Ŭ������ �� ���� �� ���Ҵ�(wrapper class)
//�⺻Ÿ�� �ڷ����� Ŭ������ ���� ��ü ������ ó�� �����ϰ� �Ͽ��� 

//���� ������?
//1.Ÿ�԰� ����ȯ(����->����: Integer.parseInt)
//2.�Ķ���ͷ� ���(void m(int i) -> void m(Integer i))
//3.Ŭ������ �����ؼ� ���� ����� ���
public class Ex08_Wrapper_Class {
	public static void main(String[] args) {
		Integer n=new Integer(100);
		//���������δ� private int value; public Integer(int value){}
		//�ּҰ��� �ƴ϶� ���� ������ �ִ�.
		System.out.println(n);
		System.out.println(n.hashCode());
		System.out.println(n.MIN_VALUE+" / "+n.MAX_VALUE);
		
		IntegerMethod(n); //�ּҰ��� �������� ���� ǥ��
		intMethod(n); //�ּҰ����� ���� ã�� intMethod(100);ó��
		
		Integer i2=new Integer(100);
		Integer i3=new Integer(100);
		System.out.println(i2==i3); //�ٸ� �ּҰ��� �����Ƿ� false
		System.out.println(i2.equals(i3)); //equals override�� ���� ���ؼ� true
	}
	static void IntegerMethod(Integer i) { //Stringó�� int�� ���� �۵��Ѵ�
		System.out.println("param: "+i);
	}
	static void intMethod(int i) {
		System.out.println("int param: "+i);
	}
}
