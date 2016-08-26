package Starcraft;

class Tank extends GroundUnit implements Irepairable {
	Tank() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank";
	}
	// Ãß°¡
}
