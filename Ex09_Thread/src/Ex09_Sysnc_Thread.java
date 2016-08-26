//����ȭ: ��Ƽ������ �۾� �ÿ� lock�� �Ŵ� ��
//���� �����尡 �����ڿ��� ���� ���� �۾��� �� �� �߻��ϴ� ������ �ذ��ϱ� ����
//ex)ȭ��� > �����ġ

//�� ��ġ: synchronized(��ü), 
class Wroom {
	public synchronized void OpenDoor(String name) {
		System.out.println(name+"���� ȭ��ǿ� ���� �ϼ̽��ϴ�.");
		for (int i=0;i<10000;i++) {
			if(i==1000) {
				System.out.println(name+"���� �δ� ���Դϴ�.");
			}
		}
		System.out.println(name+"���� �ÿ��ϰ� �ΰ� �����̽��ϴ�.");
	}
}
class Users extends Thread {
	private Wroom wr;
	private String who;
	public Users(String name, Wroom wr) {
		this.who=name;
		this.wr=wr;
	}
	@Override
	public void run() {
		wr.OpenDoor(this.who);
	}
}
public class Ex09_Sysnc_Thread {
	public static void main(String[] args) {
		Wroom w=new Wroom();
		Users kim=new Users("�达", w);
		Users park=new Users("�ھ�", w);
		Users lee=new Users("�̾�", w);
		kim.start();
		park.start();
		lee.start();
	}
}
