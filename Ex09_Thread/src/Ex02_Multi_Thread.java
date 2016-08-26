/*
 * 1. ���α׷�(���డ��) -> exe���� -> ���μ���(������)
 * 2. ���μ����� �޼ҵ� ������ ���� -> �ּ� �ϳ� �̻��� �����带 ������ �ִ�
 * 3. ������: ���μ������� �ϳ��� �ּ� ������� => �Լ��� ����
 * 4. �����带 ����� ���
 * 		- ������ Ŭ���� ���(class Test extends Thread) �� �ݵ�� ������ �ִ� run()�� ������ �ؾ� �Ѵ�
 * 		- ������ �������̽� ����(class Test impements Runnable) ��  �ݵ�� ������ �ִ� run()�� ������ �ؾ� �Ѵ�
 * 5. why 2����? �ٸ� Ŭ������ ����� �� �ֵ��� �ϱ� ����(Ȯ�强 ���)
 */

class Thread_1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread: " + i + this.getName());
		}
		System.out.println("Thread_1 run END");
	}
}

class Thread_2 implements Runnable { // ��� ������� �ƴϰ�, �����带 ���� �غ� �Ѱ�
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("runnable: " + i);
		}
		System.out.println("runnable run() END");
	}
}

public class Ex02_Multi_Thread {

	public static void main(String[] args) {
		//Thread�� ����� ��� �� ���ϴ�
		Thread_1 th=new Thread_1();
		th.start(); //���ο� ������ ����� run()�� �ø�
		
		//runnable �������̽��� ������ ���
		//������ thread ���� �� runnable�� ������ ��ü ������ �Ѱ��־�� �Ѵ�
		//�̷��� Thread�� �߻� Ŭ������ ������ �ʾҴ�
		Thread_2 thread=new Thread_2(); //��ü ���� �����
		//Thread th2=new Thread(thread); //�Ѱ���� �Ѵ�
		Thread th2=new Thread(new Thread_2());
		th2.start();
		
		for (int i=0; i<1000; i++) {
			System.out.println("Main Thread: "+i);
		}
		System.out.println("Main Thread End"); //������� �������� ������ �� ����(JVM�� �˾Ƽ� �Ѵ�)
	}
}
