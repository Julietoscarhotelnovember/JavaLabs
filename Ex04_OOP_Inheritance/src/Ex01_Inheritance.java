//OOP 언어의 특징: 상속, 캡슐화, 다형성(!!)
//자바: class me extends father
//C#: class my:father

//상속 규칙
//1.다중상속 불가능
//2.단일상속이 원칙이다(계층적 상속을 통하여 여러 클래스를 상속 받을 수 있다)
//3.접근자는 public/protected만 가능
//인터페이스는 다중상속 가능

//상속의 진정한 의미: 공통부분 재사용(편리하지는 않다)
//현재 단계에서는 다 만들고 공통부분을 빼는 것이 편리하다
class GrandFather {
	public int gmoney=5000;
	private int pmoney=6000;
	//접근자의 성질은 유지되어 상속관계에서 접근 불가하다
	//getter, setter로 이용할 수는 있으나,
	//나만 쓰겠다는 의미 (클래스 내부에서만)
	
	
	public GrandFather() {
		System.out.println("GrandFather");
	}


	public int getPmoney() {
		return pmoney;
	}
	
	public void Gmethod() {
		System.out.println("Gmethod");
	}
}
class Father extends GrandFather {
	public int fmoney=1000;
	public Father() {
		System.out.println("Father");
	}
	public void Fmethod() {
		System.out.println("Fmethod");
	}
}
class Child extends Father {
	public int cmoney=10;
	public Child() {
		System.out.println("Child");
	}
}
class my {} //object 상속
class you extends Object{} //이게 기본으로 붙는다

public class Ex01_Inheritance {
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println("할배: "+c.gmoney);
		System.out.println("아부지: "+c.fmoney);
		System.out.println("내돈: "+c.cmoney);

		//Child c=new Child();
		//메모리 구조-최초의 조상클래스부터 전부 heap에 만든다
		//증명은 생성자로
		
		my m=new my();
		//사용자가 생성하는 모든 클래스는 자바의 루트 클래스인 object를 디폴트로 상속한다
		
		Child c2=new Child();
		//최상위 GrandFather가 Object를 상속받는 구조
		System.out.println(c2.getPmoney());
		
		//메소드도 상속 가능한 자원이다
		c2.Gmethod();
		c2.Fmethod();
		
	}
}
