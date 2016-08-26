/*
 추상클래스와 인터페이스 비교
 [공통점]
 1. 재정의를 통한 강제 구현이 목적
 2. 스스로 객체 생성이 불가능하다 (직접적으로 new 할수 없음)
 3. 상속관계에서만 사용 가능
 [차이점]
 1. 추상클래스는 단일상속, 인터페이스는 다중 상속 가능
 2. 추상클래스(완성된 코드+미완성 코드) 인터페이스는 (미완성 코드) 단,static 상수 제외

 예외 )
 [인터페이스] 끼리 상속이 가능하다 (extends 사용)
 interface IA extends IB , IC , ID {}
 class Test implements IA , IB , IC , ID
 
**JAVA API (수많은 인터페이스를 제공)**

class T implements Comparable{

   @Override
   public int compareTo(Object o) {
      //사용하는 사람이 구현
      return 0;
   }
   
}*/
//인터페이스 : 다형성 : 인터페이스도 타입이다
//서로 연관이 없는 클래스에 대해서 하나로 묶을 수 있는 기반을 제공

//게임
//수리할 수 있는
//유닛 : 지상유닛 , 공중유닛 
interface Irepairable {

}

// 공통점 (유닛)
class Unit2 {
	int hitpoint;
	final int MAX_HP;

	Unit2(int hp) {
		this.MAX_HP = hp;
	}
}

// 유닛 (지상유닛)
class GroundUnit extends Unit2 {
	public GroundUnit(int hp) {
		super(hp);
	}
	// 추가 ...구체화 특수화
}

// 유닛 (공중유닛)
class AirUnit extends Unit2 {
	public AirUnit(int hp) {
		super(hp);
	}
	// 추가 ...구체화 특수화
}

class Tank2 extends GroundUnit implements Irepairable { // Tank 2 t = new
														// Tank();
	public Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}
}

class Marine2 extends GroundUnit {
	public Marine2() {
		super(30);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine2";
	}
}

class CommandCenter implements Irepairable {
}

class Scv extends GroundUnit implements Irepairable {
	public Scv() {
		super(60);
		this.hitpoint = this.MAX_HP;
	}
	// scv만이 가지는 특수화(구체화)
	// 수리기능
	// 다형성(Tank2, Marine2 > GroundUnit (부모타입)
	/*
	 * void Repair(GroundUnit unit){ //충전(this.hitpoint 를 MAX_HP만큼 충전) //문제점 :
	 * Marine도 들어와버림
	 * 
	 * }
	 */
	// 해결방안 : 인터페이스사용 (같은 타입(조상)으로 묶음)
	// 유지보수 (캐스팅)
	// Irepairable 자기 자원이 없음
	// repairunit 주소로 접근해서 수리할 방법이 없음
	// 문재 해결 방법 : down casting 사용

	void Repair(Irepairable repairunit) {
		/*
		 * Tank2 t = (Tank2)repairunit; t.hitpoint = t.MAX_HP;
		 * 
		 * Scv s = (Scv)repairunit; s.hitpoint = s.MAX_HP;
		 */

		// 그런데 어떤 유닛이 올지 알수 없는 상황에서 위..문제
		// 결국 어떤 코드
		// 공통점 : Unit

		if (repairunit instanceof Unit2) {
			Unit2 unit = (Unit2) repairunit;
			if (unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint++;
			}
		} else {
			System.out.println("Unit2가 아닙니다");
		}

	}
}

public class Ex04_Abstract_Interface {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 maine = new Marine2();
		Scv scv = new Scv();

		// 전투
		tank.hitpoint -= 2;
		System.out.println("탱크전투 : " + tank.hitpoint);
		scv.Repair(tank);
		System.out.println("탱크충전 : " + tank.hitpoint);
		scv.Repair(tank);
		System.out.println("탱크충전 : " + tank.hitpoint);

		// 컴파일 에러 (마린없음) scv.Repair(maine);
		CommandCenter center = new CommandCenter();
		scv.Repair(center); // hp정보가 없으므로 unit2가 아닙니다 출력
	}

}