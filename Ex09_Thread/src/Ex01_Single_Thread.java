//�̱����μ���+�̱۽�����
//�̱۽�����-JVM�� �����ϴ� stack �޸𸮸� �ϳ��� ����
//�Լ��� ȣ���� ���� ���������� �����ϴ� �̱۽����� �۾�
public class Ex01_Single_Thread {
	public static void main(String[] args) {
		System.out.println("Main Thread ����");
		worker1();
		worker2();
		System.out.println("Main Thread ����");
	}
	static void worker1() {
		System.out.println("�� 1�� �ϲ�");
	}
	static void worker2() {
		System.out.println("�� 2�� �ϲ�");
	}
}
