/*
 * 1. 프로그램(실행가능) -> exe실행 -> 프로세스(실행중)
 * 2. 프로세스는 메소드 단위로 동작 -> 최소 하나 이상의 스레드를 가지고 있다
 * 3. 스레드: 프로세스에서 하나의 최소 실행단위 => 함수로 보자
 * 4. 스레드를 만드는 방법
 * 		- 스레드 클래스 상속(class Test extends Thread) 후 반드시 가지고 있는 run()을 재정의 해야 한다
 * 		- 스레드 인터페이스 구현(class Test impements Runnable) 후  반드시 가지고 있는 run()을 재정의 해야 한다
 * 5. why 2개냐? 다른 클래스를 상속할 수 있도록 하기 위해(확장성 고려)
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

class Thread_2 implements Runnable { // 사실 스레드는 아니고, 스레드를 위한 준비만 한것
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
		//Thread를 상속한 경우 더 편하다
		Thread_1 th=new Thread_1();
		th.start(); //새로운 스택을 만들고 run()을 올림
		
		//runnable 인터페이스를 구현한 경우
		//별도의 thread 생성 후 runnable을 구현한 객체 정보를 넘겨주어야 한다
		//이래서 Thread를 추상 클래스로 만들지 않았다
		Thread_2 thread=new Thread_2(); //객체 정보 만들고
		//Thread th2=new Thread(thread); //넘겨줘야 한다
		Thread th2=new Thread(new Thread_2());
		th2.start();
		
		for (int i=0; i<1000; i++) {
			System.out.println("Main Thread: "+i);
		}
		System.out.println("Main Thread End"); //스레드는 예상결과를 유추할 수 없다(JVM이 알아서 한다)
	}
}
