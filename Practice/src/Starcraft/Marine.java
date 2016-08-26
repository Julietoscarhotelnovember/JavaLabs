package Starcraft;

class Marine extends GroundUnit {

	Marine() {
		super(30);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine";
	}
}
