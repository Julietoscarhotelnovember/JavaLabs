//다형석
//하나의 참조변수가 여러 개의 객체를 참조할 수 있다.
//단, 상속관계에서
//소방차 구현 > 공통기능 자동차
class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive car");
	}

	void stop() {
		System.out.println("stop car");
	}
}

class FireCar extends Car {
	void water() {
		System.out.println("water car");
	}
}

public class Ex12_Inheritance_Polymophysm {

	public static void main(String[] args) {
		FireCar f=new FireCar();
		f.drive();
		f.stop();
		f.water();
		
		Car c=null;
		c=f; //부모c 자식f 자식은 부모에게 조건없이 줄 수 있다
		//c=(Car)f; 업캐스팅(부모 쪽으로 캐스팅)
		FireCar f2=(FireCar)c; //자식 쪽으로 다운캐스팅, 8가지 기본타입에서의 명시적, 암시적 캐스팅과 반대
		
	}

}
