package Starcraft;

class Unit {
	int hitpoint;
	final int MAX_HP; // 생성자에서 넣어주면 에러 안남

	Unit(int hp) {
		this.MAX_HP = hp;
	}
}
