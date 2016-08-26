//��Ÿ ������ ���÷�
abstract class Unit {
	int x, y;
	void stop() {
		System.out.println("Stop");
	}
	abstract void move(int x, int y);
}
class Tank extends Unit {

	@Override
	void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Tank x: "+this.x+" y: "+this.y);
	}
	
	//��ũ Ư�� ���
	void ChangeMode() {
		System.out.println("����!!!!!!!!");
	}	
}
class Marine extends Unit {

	@Override
	void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Marine x: "+this.x+" y: "+this.y);
	}
	void stempack() {
		System.out.println("�͸±�");
	}
	
}
class DropShip extends Unit {

	@Override
	void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Dropship x: "+this.x+" y: "+this.y);
	}
	void load() {
		System.out.println("���� �¿�");
	}
	void unload() {
		System.out.println("���� ������");
	}
	
}
public class Ex02_Abstract2 {

	public static void main(String[] args) {
		/*Tank t=new Tank();
		t.move(100, 200);
		t.stop();
		t.ChangeMode();
		Marine m=new Marine();
		m.move(120, 220);
		m.stop();
		m.stempack();*/
		
		//��ũ 3��, ���� ��ǥ�� �̵�
		Tank[] t=new Tank[3];
		for (int i=0; i<t.length; i++) {
			t[i]=new Tank();
		}
		for (Tank tank:t) { //������ ������ ����
			tank.move(100, 200);
		}
		System.out.println();
		
		//����
		//�ٸ� ������ ������ ���� ��ǥ������ �̵��ϰ� �ϱ�
		/*Unit tk=new Tank();
		Unit mr=new Marine();
		Unit ds=new DropShip();
		tk.move(200, 300);
		mr.move(200, 300);
		ds.move(200, 300);*/
		Unit[] unitarray={new Tank(), new Marine(), new DropShip()};
		for (Unit unit:unitarray) {
			unit.move(200, 300);
		}
		
		
	}
}
