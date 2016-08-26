package Starcraft;

class Scv extends GroundUnit implements Irepairable {

	Scv() {
		super(60);
		this.hitpoint = this.MAX_HP;
	}
	// �߰�

	// ����2
	// ������(Tank2, Marine2 -> GroundUnit)
	// void Repair(GroundUnit unit) {
	// ���� (this.hitpint�� MAX_HP ��ŭ ����)
	// }
	// ������ �߻�: Marine2�� ���� �� ����.

	// ����3
	// �ذ�: interface�� Tank2�� Scv�� ���� ������ ������ �������.
	// �� ����: ������������ ĳ������ ���� �߻�
	// Irepairable�� �ڱ� �ڿ��� ����
	// repariunit���� ������ ���� ����(�ڽ��� �ڿ��� ������ �� ����.)
	// �ذ�: �ٿ�ĳ���� to Unit
	void Repair(Irepairable repairunit) {

		// ����1
		/*
		 * Tank2 t=(Tank2)repairunit; //GroundUnit �ٿ�ĳ���� t.hitpoint=t.MAX_HP;
		 * //���� Scv s=(Scv)repairunit; s.hitpoint=s.MAX_HP; //���� //�׷��� � unit��
		 * ���� �� �� ����.
		 */

		// ����4
		// Tanks2 > GroundUnit > Unit
		// Scv > GroundUnit > Unit
		// ����: Unit
		// instanceof
		if (repairunit instanceof Unit) {
			Unit unit = (Unit) repairunit; // ����� ����Ʈ
			if (unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint++;
			}
		} else {
			System.out.println("������ �ƴ�");
		}
	}
}
