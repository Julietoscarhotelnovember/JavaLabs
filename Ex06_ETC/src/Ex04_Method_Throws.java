import java.io.FileInputStream;
import java.io.FileNotFoundException;

import kr.or.kosta.Person;

//메소드 예외 던지기
class Test {
	void call()  throws ArithmeticException, IndexOutOfBoundsException {
		//설계도 상에서는 이렇게 처리 하는 것이 좋다
		//call 함수를 사용하면 ArithmeticException 예외를 처리하도록 권고한다
		System.out.println("Call 함수 Start");
		//요걸 try catch 하는 대신에 
		int i=1/0;
		System.out.println("Call 함수  End");
	}
}
public class Ex04_Method_Throws {

	public static void main(String[] args) {
		Test t=new Test();
		try {
			t.call(); //이걸 사용하는 사용자가 예외가 발생 할지 말지 알 수 없다. -> throws 사용
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main 종료");
		
		//자바 api 설계
		//메소드 예외 던지기 -> 미리 발생할 예외를 처리하도록(try catch) 강제한다
		//FileInputStream f=new FileInputStream("c:\\temp\\a.txt");
		try {
			Person p=new Person(100);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
