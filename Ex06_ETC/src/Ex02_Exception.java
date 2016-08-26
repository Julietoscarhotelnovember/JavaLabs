
public class Ex02_Exception {

	public static void main(String[] args) {
		int num=100;
		int result=0;
		try {
			for (int i=0; i<10; i++) {
				result=num/(int)(Math.random()*10); //0일경우 문제 발생, 해결하려면 +1을 하는 것이 exception 보다 좋다
				System.out.println("결과: "+result);
			}
		} catch (ArithmeticException ex) { //이걸 굳이 ㅆ는 이유는 가독성
		} catch (IndexOutOfBoundsException ex) {
		} catch (Exception e) {
			System.out.println("예외발생");	
		}
		//상위 예외는 항상 하위 예외보다 아래에 있어야 한다.
		System.out.println("Main END");
	}
}
