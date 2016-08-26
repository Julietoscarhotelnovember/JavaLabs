//스레드의 상태 제어하기
//join()
//복잡한 계산을 여러 개의 스레드로 나누어 각각 계산 후,
//결과를 모두 참조해서 하나의 최종적인 결과를 얻으려고 할 때 사용

class Thread_Join extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3000; i++) {
			System.out.println("-----");
		}
	}
}

class Thread_Join2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3000; i++) {
			System.out.println("|||||");
		}
	}
}

public class Ex08_Thread_State_join {
	public static void main(String[] args) {
		Thread_Join th = new Thread_Join();
		Thread_Join2 th2 = new Thread_Join2();

		th.start();
		th2.start();

		long starttime = System.currentTimeMillis();
		try {
			// main thread가 join 요청 -> 메인이 th, th2의 작업이 끝날 때 까지 기다림
			th.join();
			th2.join();
			//RacingGame.java의 join함수 부분과 같이 볼것

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		for (int i = 0; i < 3000; i++) {
			System.out.println("^^^^^");
		}
		System.out.println("3개의 스레드가 걸린 총 시간: ");
		System.out.println(System.currentTimeMillis() - starttime);
		System.out.println("Main end");
	}
}
