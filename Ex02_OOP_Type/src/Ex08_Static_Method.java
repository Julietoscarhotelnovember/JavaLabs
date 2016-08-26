class StaticM {
	int iv;
	static int cv;
	//함수
	void m() {
		//static 자원은 객체 생성 이전에 메모리에 올라간다
		//일반함수는 static 자원에 접근할 수 있다
		cv=1000;
		System.out.println(cv);
	}
	static void sm() {
		//실행될 때는 스택에서 실행됨
		//스태틱 함수는 일반자원에 접근할 수 없다(먼저 생성되기 때문에)
		//iv=100; 일반자원 불가
		System.out.println(cv);
		
		//static은 static끼리 쓰면 에러가 없다
	}
}
public class Ex08_Static_Method {

	public static void main(String[] args) {
		StaticM sm=new StaticM();
		sm.m();
		sm.sm();
		
		//스태틱 자원은 객체생성 없이 사용가능
		//클래스 이름으로 접근
		StaticM.cv=5555;
		StaticM smm=new StaticM();
		smm.sm(); //공유자원->객체를 나중에 생성해도 마찬가지
		smm.m();
		System.out.println(StaticM.cv);
		

	}

}
