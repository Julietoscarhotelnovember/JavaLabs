//데몬스레드: 메인 스레드가 죽으면 같이 죽는다
public class Ex07_Daemon_Thread implements Runnable {
	static boolean autosave=false;
	public static void main(String[] args) {
		Thread th=new Thread(new Ex07_Daemon_Thread());
		th.setDaemon(true); //start 전에 데몬 설정을 해 주어야 한다 (main의 보조)
		th.start();
		
		for(int i=0;i<30;i++){
			try{
				Thread.sleep(1000);
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
			System.out.println("Main Thread: "+i);
			if (i==5) {
				autosave=true;
			}
		}
	}
	@Override
	public void run(){
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			if (autosave){
				Autosave();
			}
		}
	}
	public void Autosave(){
		System.out.println("문서가 자동 저장 되었습니다.");
	}
}
