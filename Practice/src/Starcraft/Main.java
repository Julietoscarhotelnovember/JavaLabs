package Starcraft;

public class Main {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		Scv scv = new Scv();
		tank.hitpoint -= 2;
		System.out.println("��ũ �� ����: " + tank.hitpoint);
		scv.Repair(tank);
		System.out.println("��ũ �� ����: " + tank.hitpoint);
		scv.Repair(tank);
		System.out.println("��ũ �� ����: " + tank.hitpoint);

		// scv.Repair(marine); �̰� �ȵ�
		CommandCenter center = new CommandCenter();
		scv.Repair(center);
	}
}
