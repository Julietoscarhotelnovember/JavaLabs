/*
 �߻�Ŭ������ �������̽� ��
 [������]
 1. �����Ǹ� ���� ���� ������ ����
 2. ������ ��ü ������ �Ұ����ϴ� (���������� new �Ҽ� ����)
 3. ��Ӱ��迡���� ��� ����
 [������]
 1. �߻�Ŭ������ ���ϻ��, �������̽��� ���� ��� ����
 2. �߻�Ŭ����(�ϼ��� �ڵ�+�̿ϼ� �ڵ�) �������̽��� (�̿ϼ� �ڵ�) ��,static ��� ����

 ���� )
 [�������̽�] ���� ����� �����ϴ� (extends ���)
 interface IA extends IB , IC , ID {}
 class Test implements IA , IB , IC , ID
 
**JAVA API (������ �������̽��� ����)**

class T implements Comparable{

   @Override
   public int compareTo(Object o) {
      //����ϴ� ����� ����
      return 0;
   }
   
}*/
//�������̽� : ������ : �������̽��� Ÿ���̴�
//���� ������ ���� Ŭ������ ���ؼ� �ϳ��� ���� �� �ִ� ����� ����

//����
//������ �� �ִ�
//���� : �������� , �������� 
interface Irepairable {

}

// ������ (����)
class Unit2 {
	int hitpoint;
	final int MAX_HP;

	Unit2(int hp) {
		this.MAX_HP = hp;
	}
}

// ���� (��������)
class GroundUnit extends Unit2 {
	public GroundUnit(int hp) {
		super(hp);
	}
	// �߰� ...��üȭ Ư��ȭ
}

// ���� (��������)
class AirUnit extends Unit2 {
	public AirUnit(int hp) {
		super(hp);
	}
	// �߰� ...��üȭ Ư��ȭ
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
	// scv���� ������ Ư��ȭ(��üȭ)
	// �������
	// ������(Tank2, Marine2 > GroundUnit (�θ�Ÿ��)
	/*
	 * void Repair(GroundUnit unit){ //����(this.hitpoint �� MAX_HP��ŭ ����) //������ :
	 * Marine�� ���͹���
	 * 
	 * }
	 */
	// �ذ��� : �������̽���� (���� Ÿ��(����)���� ����)
	// �������� (ĳ����)
	// Irepairable �ڱ� �ڿ��� ����
	// repairunit �ּҷ� �����ؼ� ������ ����� ����
	// ���� �ذ� ��� : down casting ���

	void Repair(Irepairable repairunit) {
		/*
		 * Tank2 t = (Tank2)repairunit; t.hitpoint = t.MAX_HP;
		 * 
		 * Scv s = (Scv)repairunit; s.hitpoint = s.MAX_HP;
		 */

		// �׷��� � ������ ���� �˼� ���� ��Ȳ���� ��..����
		// �ᱹ � �ڵ�
		// ������ : Unit

		if (repairunit instanceof Unit2) {
			Unit2 unit = (Unit2) repairunit;
			if (unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint++;
			}
		} else {
			System.out.println("Unit2�� �ƴմϴ�");
		}

	}
}

public class Ex04_Abstract_Interface {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 maine = new Marine2();
		Scv scv = new Scv();

		// ����
		tank.hitpoint -= 2;
		System.out.println("��ũ���� : " + tank.hitpoint);
		scv.Repair(tank);
		System.out.println("��ũ���� : " + tank.hitpoint);
		scv.Repair(tank);
		System.out.println("��ũ���� : " + tank.hitpoint);

		// ������ ���� (��������) scv.Repair(maine);
		CommandCenter center = new CommandCenter();
		scv.Repair(center); // hp������ �����Ƿ� unit2�� �ƴմϴ� ���
	}

}