class Variables {
	int iv; //멤버 필드, 인스턴스 변수(클래스 범위 내에서 존재)
	//객체마다 다른 값을 갖게 하기 위해 사용
	//생성시점: 인스턴스 생성 후
	//초기화는 마음대로, 디폴트값이 있다
	
	static int cv; //class 변수(static, 공유자원)
	//객체간 공유자원
	//생성시점: (클래스 로더에 의해)실행될 때, 객체생성 이전에 method area에 올라간다
	//접근방법 2가지(개중요!!!!!!!!!)
	//객체이름.static변수
	//(객체를 만들지 않고 접근하기 위해)클래스이름.static
	//초기화는 마음대로, 디폴트값이 있다
	
	void callMethod() {
		int lv=0; //지역변수(초기화 필수)
		//메소드가 실행될 때 생성, 메소드가 끝날 때 소멸
	}
}
public class Ex05_Variable_Scope {

	public static void main(String[] args) {
		
	}

}
