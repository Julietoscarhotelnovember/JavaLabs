//싱글프로세스+싱글스레드
//싱글스레드-JVM이 제공하는 stack 메모리를 하나만 쓴다
//함수를 호출을 통해 순차적으로 실행하는 싱글스레드 작업
public class Ex01_Single_Thread {
	public static void main(String[] args) {
		System.out.println("Main Thread 시작");
		worker1();
		worker2();
		System.out.println("Main Thread 종료");
	}
	static void worker1() {
		System.out.println("나 1번 일꾼");
	}
	static void worker2() {
		System.out.println("나 2번 일꾼");
	}
}
