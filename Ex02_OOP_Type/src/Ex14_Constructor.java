import kr.or.kosta.Book;
import kr.or.kosta.Book2;
//������(Constructor)
//Ư���� ������ �Լ��̴�
//������ public, ��� Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� �־�� �Ѵ�
//�Լ��� �̸�=Ŭ���� �̸�
//���������� ���� ������ return Ÿ���� ������ ���ϸ�, void�� �ƴϴ�.
//������ ���ÿ� ȣ��Ǳ� ������ �ּҰ��� �޾��� ���� ���� ->�� �𸣰���..
//��� ��Ģ�� �����ϸ� �Լ��� ����
//��������: new�� ���� ��ü�� ������ �� ȣ��
//����: �ʱ�ȭ (����ʵ��� �ʱ�ȭ, �ν��Ͻ� ������ �ʱ�ȭ)
/*
class Car {
	public Car() { //�̰��� ������
	}
}
*/
class Car2 {
	int door; //���⿡ 100 �ϴ°Ͱ� �� ���̳�? -> �����ε� ����
	//����Ʈ ������
	public Car2() {
		System.out.println("�� default �����ھ�(�Ķ���͸� ���� �ʾ�)");
		door=100;
	}
	//�����ε� ������
	public Car2(int c) {
		door=c;
	}
}
public class Ex14_Constructor {

	public static void main(String[] args) {
		//�ν��Ͻ� �ʱ�ȭ ��1
		Book b1 = new Book();
		b1.bname = "ȫ�浿��"; // �ʱ�ȭ
		b1.writeAmount(10); // �ʱ�ȭ
		
		//�ν��Ͻ� �ʱ�ȭ ��2(�����ڸ� �̿�)
		Book2 b2=new Book2("��������", 100);
		Book2 b3=new Book2("��������", 300);
		
		//��ü�� ����� ���� ��ü���� ���� �ٸ��� ������ ��¥�� �ʱ�ȭ�� �ѹ��� �Ѵ�
		//�����ڸ� ���� �̰��� �� ���ϰ� ���ڴ� �ǹ�
		
		Car2 c1=new Car2();
		System.out.println(c1.door);
		Car2 c2=new Car2(200); //�̷��� �ϸ� ��ü �����ÿ� �ʱ�ȭ�� �� �� �ִ� 
		System.out.println(c2.door);
	}
}
