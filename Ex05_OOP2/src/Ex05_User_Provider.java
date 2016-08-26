//클래스 간의 관계1
//서로 간의 연관성을 기준으로
//상속(is~a)
//포함(has~a)-생명주기가 같다(객체가 만들어질 때 같이 생성되어야 한다)/다르다

//클래스 간의 관계2
//주종관계, 사용자와 제공자를 기준으로
//class a{}
//class b{}
//a가 b를 사용하면, a가 사용자, b가 제공자
//a가 b를 사용하는 방법1: a클래스 안에서 객체 생성
//a가 b를 사용하는 방법2: a가 b를 상속
//a가 b를 사용하는 방법3: 함수의 파라미터로 사용
//등등

//a와 b가 직접적인 관계
//현대 프로그래밍에서는 직접적인 관례를 가지는 것을 좋아하지 않는다.
class A {
	void amethod(B b) {
		b.bmethod();
	}
}

class B {
	void bmethod() {
		System.out.println("B클래스 메서드");
	}
}

//B객체가 안만들어져도 문제가 없고,
//B객체의 변화에 대해 민감하게 반응하지 않고
//간접적인 방법
//A는 B의 존재를 몰라도 사용 가능해야 한다 -> 인터페이스
interface IP {
	void m();
}
class C {
	void method(IP c) {
		c.m();
	}
}
class D implements IP {

	@Override
	public void m() {
		System.out.println("나 D야");
		
	}
	
}
class F implements IP {

	@Override
	public void m() {
		System.out.println("나 F야");
		
	}
	
}
public class Ex05_User_Provider {
	public static void main(String[] args) {
		//직접
		A a=new A();
		B b=new B();
		a.amethod(b);
		
		//인터페이스를 통한 간접
		C c=new C();
		D d=new D();
		F f =new F();
		c.method(d);
		c.method(f);
	}
}