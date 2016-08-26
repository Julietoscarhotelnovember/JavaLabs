//Thread간 객체 공유
class RunnableImpl implements Runnable {
	int iv=0;
	@Override
	public void run() {
		int lv=0;
		String name=Thread.currentThread().getName();
		while (lv<3){
			System.out.println(name+" local variable: "+ ++lv);
			System.out.println(name+" instance var: "+ ++iv);
			System.out.println();
		}
	}
}
public class Ex10_Sync_Thread {

	public static void main(String[] args) {
		//각각의 메모리를 사용해서 아무 문제 없는 코드
		/*RunnableImpl r=new RunnableImpl();
		RunnableImpl r2=new RunnableImpl();
		Thread th=new Thread(r);
		Thread th2=new Thread(r2);
		th.start();
		th2.start();*/
		
		//local variable은 상관 없으나 instance variable에서 겹친다
		RunnableImpl r=new RunnableImpl();
		Thread th=new Thread(r);
		Thread th2=new Thread(r);
		th.start();
		th2.start();
		
	}
}
