import java.io.FileInputStream;
import java.io.FileNotFoundException;

import kr.or.kosta.Person;

//�޼ҵ� ���� ������
class Test {
	void call()  throws ArithmeticException, IndexOutOfBoundsException {
		//���赵 �󿡼��� �̷��� ó�� �ϴ� ���� ����
		//call �Լ��� ����ϸ� ArithmeticException ���ܸ� ó���ϵ��� �ǰ��Ѵ�
		System.out.println("Call �Լ� Start");
		//��� try catch �ϴ� ��ſ� 
		int i=1/0;
		System.out.println("Call �Լ�  End");
	}
}
public class Ex04_Method_Throws {

	public static void main(String[] args) {
		Test t=new Test();
		try {
			t.call(); //�̰� ����ϴ� ����ڰ� ���ܰ� �߻� ���� ���� �� �� ����. -> throws ���
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main ����");
		
		//�ڹ� api ����
		//�޼ҵ� ���� ������ -> �̸� �߻��� ���ܸ� ó���ϵ���(try catch) �����Ѵ�
		//FileInputStream f=new FileInputStream("c:\\temp\\a.txt");
		try {
			Person p=new Person(100);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
