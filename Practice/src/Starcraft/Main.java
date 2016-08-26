package Starcraft;

public class Main {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		Scv scv = new Scv();
		tank.hitpoint -= 2;
		System.out.println("ÅÊÅ© ÇÇ °¨¼Ò: " + tank.hitpoint);
		scv.Repair(tank);
		System.out.println("ÅÊÅ© ÇÇ ÃæÀü: " + tank.hitpoint);
		scv.Repair(tank);
		System.out.println("ÅÊÅ© ÇÇ ÃæÀü: " + tank.hitpoint);

		// scv.Repair(marine); ÀÌ°Ç ¾ÈµÊ
		CommandCenter center = new CommandCenter();
		scv.Repair(center);
	}
}
