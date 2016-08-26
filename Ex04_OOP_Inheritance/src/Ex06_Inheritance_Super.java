//this: 객체 자신을 가리키는 this, 생성자를 호출하는  this
//super: 용법이 유사, 상속관계에서만 존재한다
//상속관계에서 부모자원에 접근할 수 있는 키워드(부모의 주소를 가지고 있음)

//super는 this와 같은 문법
//1.부모의 생성자 호출 가능
//2.부모의 주소값을 가리킴

//C#: base()
//Java: super()

class Base {
	String basename;

	Base() {
		System.out.println("Base의 기본 생성자");
	}

	Base(String basename) {
		this.basename = basename;
		System.out.println("basename: " + this.basename);
	}

	void baseMethod() {
		System.out.println("Base Method");
	}
}

class Derived extends Base {
	String dname;

	Derived() {
		System.out.println("Dervied 기본 생성자");
	}

	Derived(String dname) {
		//부모의 생성자를 호출하는 super
		super(dname);
		this.dname = dname;
		System.out.println("dname: " + this.dname);
	}

	void derivedMethod() {
		System.out.println("Derived Method");
	}
	
	//재정의
	@Override
	void baseMethod() {
		System.out.println("부모의 baseMethod() 재정의");
	}
	
	//재정의된 자식함수 대신 상속한 부모의 함수를 쓰고 싶을 때
	void parentMethod() {
		super.baseMethod(); //재정의 된 경우에만 써라
	}
}

public class Ex06_Inheritance_Super {

	public static void main(String[] args) {
		Derived d=new Derived(); //주의! 이렇게 하면 디폴트 생성자 둘다 호출(부모먼저, 다음자식)
		Derived d2=new Derived("얕얕"); //주의! 부모쪽 오버로드 생성자는 호출되지 않는다
		     						   //파라미터를 넘겨주지 않아서
		Derived d3=new Derived("홍길동");
		d3.baseMethod();
		
		//문제
		//자식클래스에서 부모의 원래 baseMethod()를 호출하는 방법
		Derived d4=new Derived();
		d4.parentMethod();
		
	}
}
