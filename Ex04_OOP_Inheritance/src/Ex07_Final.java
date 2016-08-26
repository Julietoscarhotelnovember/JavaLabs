import java.util.concurrent.SynchronousQueue;

//변수<->상수
//상수: 한번 값이 정해지면 변경이 불가능
//관용적으로 대문자 표기한다
//java: final int num=100;
//C#: const int num=100;

//클래스 앞에: final class TT{} 상속할 수 없는 클래스를 만들 때
//함수 앞에: final method() 오버라이드 할 수 없는 함수를 만들 때
//주로 변수에서 사용한다
class Vcard {
	final String KIND="heart";
	final int NUM=100;
	void method() {
		System.out.println(Math.PI); //시스템 상수
	}
}
class Vcard2 {
	final String KIND; //상수는 초기화를 해야 되는데
	final int NUM;
/*	Vcard2(){ //디폴트 생성자를 해 놓으면 초기화가 되므로 에러가 안나낟
			  //상수가 객체가 될 때 값을 가지는 보장성 코드, 잘 안쓴다
		this.KIND="";
		this.NUM=10;
	}*/
	Vcard2(String kind, int num) {
		this.KIND=kind;
		this.NUM=num;
	}
	//이렇게 생성자를 이용해서 강제한다(디폴트 생성자 없이)
	//이렇게 설계를 한 이유는
	//객체마다 다른 상수값을 가지도록 하기 위해서
}

public class Ex07_Final {
	public static void main(String[] args) {
		Vcard v=new Vcard();
		//v.KIND="spade";
		System.out.println(v.KIND+" : "+v.NUM);
		v.method();
		
		Vcard2 v2=new Vcard2("A", 10);
		Vcard2 v3=new Vcard2("B", 20);
		Vcard2 v4=new Vcard2("C", 30);
		
	}

}
