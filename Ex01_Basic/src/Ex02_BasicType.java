/*
 * 타입: 자료형
 * 8가지 기본타입
 * 숫자 -> 정수 -> byte(네트워크 통신단위로 사용)
 * 			    char(한문자:2byte) : '가', 'a'
 * 				short(c언어 호환)
 * 				int(4byte:정수의 기본타입,자바에서 연산의 기본자)(-21억~21억)
 * 				long(8byte:int보다 큰값을 담을 때)
 *    -> 실수 -> float(4byte)
 *    			double(8byte,기본타입)
 * 논리 -> boolean(true, false) -> 프로그램의 흐름제어
 * 
 */
public class Ex02_BasicType {

	public static void main(String[] args) {
		int i, j, k;
		i = 100;
		j = 200;
		k = 300;
		System.out.println(i + " : " + j + " : " + k);
		i = 1000000000;
		//int vs long
		//int num = 10000000000;
		//long num2 = 10000000000; //자바 정수 기본타입인 int로 인식함
		long num2 = 10000000000L; //접미사L를 통해 long 타입임을 명시해야 함
		System.out.println("long num2 : " + num2);
		
		//String은 사실 String 클래스 타입이다.
		//그냥 int 같은 문자열 담는 타입으로 생각
		//문자열 입력은 ""
		String name = "개졸림";
		System.out.println(name);
		
		//char 타입 입력은 ''
		//unicode체제를 따라가기 때문에 무조껀 2byte 사용
		//char는 정수타입이라 int와 호환 가능하다
		char single = '가';
		char c = 'a';
		//특수문자 사용하기는 \로
		//ex) c:\Temp
		char sing = '\'';
		System.out.println(sing);
		
		String str = "홍\"길\"동";
		System.out.println(str);
		
		String str2 = "1000";
		String str3 = "100";
		System.out.println(str2+str3);
		
		//퀴이이즈
		//스트링 타입으로 바꾼다
		System.out.println("100"+100); //100100
		System.out.println(100+"100"); //100100
		System.out.println(100+100+"100"); //200100
		System.out.println(100+"100"+100); //100100100
		
		//퀴이이즈
		//c:\\utils
		//c:\\Temp
		//String 타입을 사용해서 위 문자열을 출력해보세요.
		String path1 = "c:\\\\utils";
		String path2 = "c:\\\\Temp";
		System.out.println(path1+" "+path2);
		
		//논리타입
		//흐름제어
		boolean power = true;
		System.out.println(power);
		power = !power; //부정연산자 !
		System.out.println(power);
		
		//char는 유니코드 2byte -> 한 문자를 표현할 수 있다(영문,한글 관계없음)
		//원칙 : 한글 2byte, 영문,숫자,공백 1byte
		//표현은 ''을 사용
		//주의! 문자열은 "", 한문자는 ''
		
		//char는 내부적으로 정수값을 가지고 있다 -> 정수 타입과 호환 가능
		//정수값 -> 한문자 or 한문자 -> 정수값 변환 가능 (아스키코드표 10진수를 이용하여)
		
		char ch = 'a';
		System.out.println(ch);
		char ch2 = '가';
		char ch3 = '1';
		int cint = 65;
		char ch4 = (char)cint; //명시적 형변환, int를 char로 바꾸겠다
		System.out.println(ch4);
		
		int cint2 = ch4; //int가 char보다 크기 때문에 명시적 형변환 없이
		//사실 내부적 형변환이 일어난다 (int)ch4 암시적 형변환 char -> int
		//비커를 예로 들면
		//100/100 -> 100/500 암시적 형변환이 발생
		//100/500 -> 100/100 명시적 형변환을 해야 함
		//들어갈 수 있을지 없을지는 값이 아니라 타입을 봐라...
		//char는 문자를 담지만 숫자타입이다.
		System.out.println("cint2 : " + cint2);
		
		//실수
		//float(4): 소수 7자리 정밀도
		//double(8): 기본타입(default): 소수 16자리 정밀도
		
		//3.14 > default double
		float f = 3.14F; //접미사 붙이기
		double d = 3.14;
		
		//유효범위가 넘어가면 반올림한다
		float f2 = 1.123456789f;
		System.out.println(f2);
		
		double d2 = 1.123456789123456789;
		System.out.println(d2);
		
		double d3 = (double)100; //기본형 int, double > int라 에러 안남, 암시적 형변환
		System.out.println(d3);
		int i4 = 100;
		//Quizzzz
		//int result = i4 + d3;
		//int + double은 큰것을 따라간다 int->double로
		double result1 = (double)i4 + d3; //이것이 더 좋은 방법
		int result2 = i4 + (int)d3; //데이터 손실의 문제가 있다
		
		//오늘의 포토제닉
		//작은타입+큰타입 = 큰타입
		//속지말자 이거 안됨, 데이터 타입과 형변환의 문제
		//int i5 = 100;
		//byte b2 = i5; //byte는 -128~127까지 정수, 2의 7승
		
		//이건된다
		byte b3 = 20;
		int i6 = b3; //암시적 형변환 int i6 = (int)b3
		
		
		
	}

}
