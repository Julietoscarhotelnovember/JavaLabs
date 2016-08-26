//다형성: 여러가지 성실, 형태를 가질 수 있음
//범위: 오버로딩/오버라이딩

//다형성은 상속 관계에서 존재
//하나의 참조변수가 여러 개의 타입을 가질 수 있다
//조상클래스 타입의 참조변수로 자식 클래스의 객체를 참조할 수 있다

//자식은 부모에게 조건없이 준다
class Tv2 {
	boolean power;
	int ch;

	void Power() {
		this.power = !this.power;
	}

	void Chup() {
		this.ch++;
	}

	void Chdown() {
		this.ch--;
	}
}
class CapTv extends Tv2 {
	String text;
	String Caption(){
		return this.text="자막처리";
	}
}

public class Ex11_Inheritance_Polymophysm {

	public static void main(String[] args) {
		CapTv ctv=new CapTv();
		ctv.Power();
		System.out.println(ctv.power);
		
		ctv.Chup();
		System.out.println(ctv.ch);
		System.out.println(ctv.Caption());
		//기존내용
		
		
		Tv2 t2=ctv; //타입이 다른데 넘겼으나 -> t2는 Tv2 밖에 못 본다
		            //ctv는 Tv2+CapTv를 모두 볼 수 있다 (상속관계에서)
					//재사용
		t2.Chdown();
		/*System.out.println(ctv.toString()); //toStirng은 주소값 출력하는 메소드
		System.out.println(t2.toString()); //다형성(상속)
		//하나의 참조변수가 여러 개의 객체를 참조할 수 있다.
*/		System.out.println("자식: "+ctv.ch);
		System.out.println("부모: "+t2.ch);
		//메모리 절약
		
		//부모는 자식에게 조건적, 명시적 casting, 원래는 좀 말이 안되긴 하는데 자바에서는 이렇다더라
		CapTv cc=(CapTv)t2;
		//자식은 부모에게 조건없이 가능
		
		

	}

}
