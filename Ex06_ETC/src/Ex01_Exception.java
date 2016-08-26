//프로그램 오류에는
//1.에러(error): 네트워크 장애, 메모리, 하드웨어
//2.예외(Exception): 개발자가 코드 개빌시에 예측 처리 가능
//try{} catch(Exception e){} finally{}
//예외처리는 프로그램의 비정상적인 종료를 막기 위해 사용한다

//Exception 클래스는 예외를 담당하는 상위 클래스
//java.lang.ArithmeticException: / by zero

//1.Exception 객체 e를 생성하지 않았는데 자원을 사용하고 있다. 어떻게?
//예외가 발생하면 JVM이 그 예외에 맞는 클래스를 찾아서 new를 통해 메모리에 올린다.
//2.Exception으로 처리하려고 하는데, 어떻게 다른 클래스끼리 호환되었는지?
//ArithmeticException이 Exception를 상속하고 있다. (다형성)
//Exception은 예외를 담당하는 최상위 클래스이다.
public class Ex01_Exception {

	public static void main(String[] args) {
		/*//System.out.Println(); 컴파일 오류
		System.out.println("Main 함수 시작");
		System.out.println("코드 처리 중....");
		System.out.println(0/0); //이 시점부터 프로그램은 비정상 종료
		System.out.println("Main 함수 종료");*/
		
		//예외처리
		try {
			System.out.println("Main 함수 시작");
			System.out.println("코드 처리 중....");
			System.out.println(0/0);
		} catch(Exception e) {
			//System.out.println("문제 확인: "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main 함수 종료");
	}
}
