//awt, swing, android에서 주로 사용
//안드로이드 이벤트 제어 쪽에서 많이 사용
//클래스 안에 클래스가 들어가는 형태
//inner class, outer class
/*class OuterClass {
	class InnerClass {	
	}
}*/
class OuterClass {
	public int pdata=100;
	private int data=30;
	//장점: outerclass의 자원을 사용할 수 있다
	class InnerClass {
		void msg() {
			System.out.println("outer private data: "+data);
		}
	}
}
/////////////////////////////////////////////////////////////
abstract class Person2 {
	abstract void eat();
}
class Man extends Person2 {

	@Override
	void eat() {
		System.out.println("Person2의 eat함수 재정의");
	}
}
/////////////////////////////////////////////////////////////
interface Eatable {
	void eat();
}
class InnerTest {
	public void method(Eatable e) {
		e.eat();
	}
}

public class Ex14_InnerClass {
	public static void main(String[] args) {
		OuterClass outobj=new OuterClass();
		System.out.println("pulic 자원: "+outobj.pdata);
		OuterClass.InnerClass innerobj=outobj.new InnerClass(); //독특한 문법
		innerobj.msg();
		
		/*Person2 p2=new Man();
		p2.eat();*/
		
		//Person2를 상속하는 Man 없이도(객체 재사용이 필요 없다면)
		//객체를 만들어서 사용 가능하도록 만들어 놓음
		//익명타입
		Person2 p3=new Person2() { 	
			@Override
			void eat() {
				System.out.println("구현코드");
			}
		};
		p3.eat();
		
		
		InnerTest inner=new InnerTest();
		inner.method(new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("일회성 자원");
			}
		});
	}
}
