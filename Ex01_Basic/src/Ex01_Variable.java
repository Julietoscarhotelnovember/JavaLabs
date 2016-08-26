
public class Ex01_Variable {
	// 시작 선언
	// java: main() c#: Main()
	public static void main(String[] args) {
		System.out.println("시작점");
	// 블럭주석 지정 ctrl+shift+/
	// 블럭주석 해제 ctrl+shift+\
		/*
		왠만하면
		단축키는 
		외우는게
		편하겠죠
		
		변수(variable, field) : 데이터를 담는 공간
		변수명은 소문자로 해라
		특수문자 붙는 변수명이 가능은 하다, 숫자는 불가능 : _name
		변수는 선언과 할당을 분리 할 수 있다
		*/
		int i; //변수 선언까지는 가능하나, 써먹을 때는 안된다.
		i = 2000; //초기화, 할당
		System.out.println(i);
		//설계도에 들어있는 변수(객체변수,인스턴스변수,전역변수,맴버변수,전국구)는 default 값을 가지고
		//있도록 설계되었다.
		//지역변수(함수 안에 들어있는 변수)는 반드시 초기값을 가져야 한다.
		//자바에서 패키지 kr.or.kosta 를 만드는 경우 .이 하위폴더를 만든다
		//일반적, 관용적 표현법은 큰 단위부터 쓴다
		//고유한 회사값을 위해 도메인으로 패키지명을 만드는 것이 좋다.
		//패키지가 폴더일수도 있지만, 전체이름일수도 있다.
		//namespace = package
		//char에서는 ''로, 무조껀 2바이트 차지
		//String에서는 ""
	}

}
