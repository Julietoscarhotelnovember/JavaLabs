package Starcraft;

class Scv extends GroundUnit implements Irepairable {

	Scv() {
		super(60);
		this.hitpoint = this.MAX_HP;
	}
	// 추가

	// 과정2
	// 다형성(Tank2, Marine2 -> GroundUnit)
	// void Repair(GroundUnit unit) {
	// 충전 (this.hitpint를 MAX_HP 만큼 충전)
	// }
	// 문제점 발생: Marine2는 들어올 수 없다.

	// 과정3
	// 해결: interface로 Tank2와 Scv는 같은 조상을 갖도록 만들었다.
	// 또 문제: 유지보수에서 캐스팅의 문제 발생
	// Irepairable은 자기 자원이 없다
	// repariunit으로 접근할 수가 없다(자식의 자원에 접근할 수 없다.)
	// 해결: 다운캐스팅 to Unit
	void Repair(Irepairable repairunit) {

		// 과정1
		/*
		 * Tank2 t=(Tank2)repairunit; //GroundUnit 다운캐스팅 t.hitpoint=t.MAX_HP;
		 * //충전 Scv s=(Scv)repairunit; s.hitpoint=s.MAX_HP; //충전 //그런데 어떤 unit이
		 * 올지 알 수 없다.
		 */

		// 과정4
		// Tanks2 > GroundUnit > Unit
		// Scv > GroundUnit > Unit
		// 공통: Unit
		// instanceof
		if (repairunit instanceof Unit) {
			Unit unit = (Unit) repairunit; // 요것이 포인트
			if (unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint++;
			}
		} else {
			System.out.println("유닛이 아님");
		}
	}
}
