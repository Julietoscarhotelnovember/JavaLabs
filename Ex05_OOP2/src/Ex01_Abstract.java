//추상클래스
//미완성 설계도(완성된 코드+미완성된 코드)
//미완성코드=미완성 메소드(실행블럭{}이 없다)
//왜 쓰는지? 상속 관계에서 강제적 구현(override)을 강제
//void method(){} > void method();

//1.추상 클래스는 스스로 객체 생성을 할 수 없다.
//2.상속을 통해서만 사용할 수 있다. abstract class Emp {추상메소드}
//3.상속을 통해 미완성 메소드를 구현(오버라이드)해야 한다

abstract class Abclass {
	int pos;
	void run() {
		pos++;
	}
	
	//추상자원(추상메소드)
	abstract void stop();
}
class Child extends Abclass {
	@Override
	void stop() {
		System.out.println("stop");
	}
}

public class Ex01_Abstract {
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.pos);
		c.run();
		System.out.println(c.pos);
		c.stop();
		

	}
}
