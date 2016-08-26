class Test2 {
	void print() {
		System.out.println("부모함수");
	}
}

class Test3 extends Test2 {
	// 부모 클래스인 Test2가 갖고 있는 print()를 재정의 하시오
	@Override
	void print() {
		System.out.println("오버라이드 된 자식함수");
	}
}

class Test4 {

	//Object함수를 재정의하여 쓸 수 있다

	@Override
	public String toString() {  //toString은 개발자들이 가장 많이 재정의 해서 사용한다
		return "Object의 toString() 재정의";  //super.toString();
	}
	
}

class Test5 {
	
}

public class Ex05_Inheritance_Override {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.print(); // 재정의된 print만 호출할 수 있다.
		
		Object o=new Object();
		Test4 t2=new Test4();
		Test5 t3=new Test5();
		System.out.println(t2.toString()); //재정의된 toString 호출
		System.out.println(t3.toString()); //Object의 toString 호출
		
		//원칙은 재정의된 함수만 호출한다
		//가끔 부모쪽 함수가 그리울때 super.을 사용
	}
}
