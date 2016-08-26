//this 용법
//앞으로 생성될 객체의 주소를 담을 곳을 가정해서 접근하는 키워드
//1.객체 자신을 가리키는 this -> 코드의 가독성이 높아진다(멤버필드를 예측할 수 있다)
//2.생성자를 호출하는 this -> 코드의 재사용성이 높아진다

class Test5 {
	int i;
	int j;
	Test5() {}
	/*Test5(int num, int num2) {
		i=num;
		j=num2;
	}*/
	Test5(int i, int j) {
		this.i=i; //객체 자신을 가리키는 this
		this.j=j;
	}
}
class Scar {
	String color;
	String gearType;
	int door;
	Scar() {
		//생성자를 호출하는 this()
		this("red", 4, "Auto"); //다시 생성자를 선택->3개짤 찍고 다시 여기로 돌아온다
		System.out.println("default 생성자 호출");
		/*this.color="red";
		this.door=4;
		this.gearType="Auto";*/
	}
	Scar(String color, int door) {
		this.color=color;
		this.door=door;
		//기어타입은 null
	}
	Scar(String color, int door, String gearType) {
		this.color=color;
		this.door=door;
		this.gearType=gearType;
		System.out.println("파라미터 3개짤 생성자 호출");
	}
	void display() {
		System.out.println(this.color+" : "+this.door+" : "+this.gearType);
	}
}

class Scar2 {
	String color;
	String gearType;
	int door;
	Scar2() { //할당은 젤 마지막 생성자에서만 일어난다
			  //의도: 기본 빨강 문4 오토, 색과 문은 옵션에 오토 강제, 나중에 수동도 할 수 있다
		this("red", 4);
		System.out.println("default constructor"); //3번찍힘
	}
	Scar2(String color, int door) {
		this(color, door, "Auto");
		System.out.println("parameter 2개"); //2번찍힘
	}
	Scar2(String color, int door, String gearType) {
		this.color=color;
		this.door=door;
		this.gearType=gearType;
		System.out.println("parameter 3개"); //1번 찍힘
	}
	void display() {
		System.out.println(this.color+" : "+this.door+" : "+this.gearType);
	}
}
public class Ex18_this {
	public static void main(String[] args) {
		Test5 t=new Test5(10, 20);
		Test5 t2=new Test5(11, 12);
		
		//원칙: 객체 생성시 생성자는 1개만 호출이 가능하다
		Scar sc1=new Scar();
		sc1.display();
		Scar sc2=new Scar("blue", 5);
		sc2.display();
		Scar sc3=new Scar("yellow", 5, "Manual");
		sc3.display();
		
		//this로 다른 생성자 호출->호출 순서에 주의
		Scar sc4=new Scar();
		sc4.display();
		
		Scar2 sc5=new Scar2();
		sc4.display();
		Scar2 sc6=new Scar2("yellow", 2);
		sc6.display();
		Scar2 sc7=new Scar2("gold", 1, "manual");
		sc7.display();
	}
}
