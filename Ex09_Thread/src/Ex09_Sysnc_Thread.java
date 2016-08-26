//동기화: 멀티스레드 작업 시에 lock을 거는 것
//여러 스레드가 공유자원에 대해 동시 작업을 할 때 발생하는 문제를 해결하기 위해
//ex)화장실 > 잠금장치

//락 장치: synchronized(객체), 
class Wroom {
	public synchronized void OpenDoor(String name) {
		System.out.println(name+"님이 화장실에 입장 하셨습니다.");
		for (int i=0;i<10000;i++) {
			if(i==1000) {
				System.out.println(name+"님이 싸는 중입니다.");
			}
		}
		System.out.println(name+"님이 시원하게 싸고 나오셨습니다.");
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
		Users kim=new Users("김씨", w);
		Users park=new Users("박씨", w);
		Users lee=new Users("이씨", w);
		kim.start();
		park.start();
		lee.start();
	}
}
