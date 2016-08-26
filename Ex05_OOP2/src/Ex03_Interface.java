//인터페이스의 정의
//약속, 표준, 규칙, 규약 등을 만드는 행위
//ex) A회사가 신발을 3mm 기준으로 만들었는데 안팔린다
//먹고 살기 위해 신발협회 국제표준을 보고 5mm로 다시 만들었다
//나사 만들기
//ISO 표준(문서 관련 표준)
//A회사는 내부규정으로, B회사는 무시, C회사는 지킴, D회사는 지킴

//인터페이스가 어려운 이유는 소프트웨어 설계의 최상단에 위치하기 때문
//인터페이스는 구현하는 것이 아니라 표준과 약속을 정의 하는 것이다
//->상속하지 않으면 사용할 수 없다
//인터페이스는 표준화된 설계를 보장한다
//표준화를 통해 공통설계가 가능하다
//자바api도 인터페이스 기반 설계
//인터페이스는 상속 대신 구현해야 하는것을 표시

//자바에서 인터페이스를 만드는 방법
//interface IA{}
//인터페이스는 약속, 표준, 규칙이기 때문에 구현부{}를 가지지 않는다
//인터페이스는 추상자원만 가진다
//인터페이스는 상수를 제외하고는 변수를 가질 수 없다.(상태정보를 가질 수 없다)
//->100% 완벽하게 미완성(추상화)된 코드를 가지고 있다.(상수 제외)
//그래서 주석이 중요하다
//스스로 객체 생성이 불가능하여 구현(implement)을 통해서만 사용할 수 있다
//인터페이스가 가지는 추상자원의 강제적 구현이 목적

//인터페이스 생성시 이름은 관용적 표현으로 뒤에 ~able를 붙여서 명명
//C#: IClone
//자바: Cloneable

//상속: extends (class A extends B)
//인터페이스: implements(class A implements B)
//인터페이스는 여러 개로 쪼개서 만든다
//다중구현이 가능하다(다중상속)
//class A implement able, bable, cable
//인터페이스를 사용하는 입장에서는 다형성을 이용하여 다른 여러 개의 타입을 하나로 묶어서 사용
//인터페이스도 클래스처럼 타입으로 보는 것이 좋다
//interface my{}
//class a implements my{}
//class b implements my{}

interface IA{
	//상수+추상자원
	//상수는 클래스 없이 사용할 수 있어야 하므로
	//public, static, final이어야 하며, 이것이 default값
	public static final int AGE=100;
	String GENDER="남";
	
	//반드시 구현해야 하는 추상자원이므로 모든 자원에서 접근할 수 있어야 해서
	//public, abstract이어야 하며, 이것이 default값
	public abstract String print();
	String message(String str);
}
interface IB {
	int AGE=100;
	void print();
	String message(String str);
}
class Test implements IA {
	@Override
	public String print() {
		return null;
	}

	@Override
	public String message(String str) {
		return null;
	}	
}
//상속, 구현 다 할래
class Test2 extends Object implements IA {

	@Override
	public String print() {
		return null;
	}

	@Override
	public String message(String str) {
		return null;
	}	
}
interface IC {
	void run();
}
//다중구현
class Test3 extends Object implements IA, IC {

	@Override
	public void run() {
			
	}

	@Override
	public String print() {
		return null;
	}

	@Override
	public String message(String str) {
		return null;
	}	
}


//인터페이스도 클래스처럼 타입으로 보자(다형성)
//->자식의 주소를 부모가 참조할 수 있다
public class Ex03_Interface {
	public static void main(String[] args) {
		Test t=new Test();
	}
}