class Parent {
	int x=100;
	void pMethod() {
		System.out.println("parent method");
	}
}
class Child2 extends Parent {
	int x=200; //MS용어: 부모 변수 무시하기
	@Override
	void pMethod(){
		System.out.println("clild method");
	}
	void parentMethod() {
		super.pMethod();
		
	}
	void parentX() {
		System.out.println(super.x);
	}
}
public class Ex15_Polymophysm_Override {

	public static void main(String[] args) {
		Child2 c=new Child2();
		System.out.println("x는 누구 것? "+c.x);
		c.pMethod();
		
		Parent p=c;
		System.out.println("x는 누구 것? "+p.x);
		p.pMethod();
		
		//부모가 가진 pMethod 호출
		c.parentMethod();
		c.parentX();
		if(p instanceof Child2) {
			System.out.println("true");
		}

	}

}
