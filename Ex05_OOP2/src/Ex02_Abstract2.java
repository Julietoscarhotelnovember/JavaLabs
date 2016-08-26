//스타 유닛을 예시로
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
	
	//탱크 특수 기능
	void ChangeMode() {
		System.out.println("변신!!!!!!!!");
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
		System.out.println("뽕맞기");
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
		System.out.println("유닛 태움");
	}
	void unload() {
		System.out.println("유닛 내리기");
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
		
		//탱크 3대, 같은 좌표로 이동
		Tank[] t=new Tank[3];
		for (int i=0; i<t.length; i++) {
			t[i]=new Tank();
		}
		for (Tank tank:t) { //개선된 포문이 좋다
			tank.move(100, 200);
		}
		System.out.println();
		
		//문제
		//다른 종류의 유닛이 같은 좌표점으로 이동하게 하기
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
