//�������� �켱������ �����ϴ� priority ���� (1~10)
//�⺻�� 5
class Pth extends Thread {
	@Override
	public void run(){
		for (int i=0;i<10000;i++){
			System.out.println("---");
		}
	}
}

class Pth2 extends Thread {
	@Override
	public void run(){
		for (int i=0;i<10000;i++){
			System.out.println("|||");
		}
	}
}
public class Ex06_Priority {
	public static void main(String[] args) {
		Pth pth=new Pth();
		Pth2 pth2=new Pth2();
		
		pth.setPriority(2);
		pth2.setPriority(10);
		
		System.out.println(pth.getPriority());
		System.out.println(pth2.getPriority());

		pth.start();
		pth2.start();
		System.out.println("Main end");
	}
}
