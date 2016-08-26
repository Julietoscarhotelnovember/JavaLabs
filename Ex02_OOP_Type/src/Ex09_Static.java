public class Ex09_Static {
	public void callMethod() {
		System.out.println("나 일반 함수");
	}

	public static void scallMethod() {
		System.out.println("나 스태틱 함수");
	}

	public static void main(String[] args) {
		scallMethod(); // 같은 클래스에서는 생략 가능
		Ex09_Static ex09 = new Ex09_Static();
		ex09.callMethod();
	}
}