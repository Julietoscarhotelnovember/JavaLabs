class Bird {
	void fly() {
		System.out.println("���ٿ�");
	}

	protected void moveFast() {
		fly();
	}
}

class Ostrich extends Bird {
	void run() {
		System.out.println("�޸���");
	}

	@Override
	protected void moveFast() {
		run();
	}
}

class Sparrow extends Bird {

}

public class Ex09_Interitance_Protetedc {
	public static void main(String args[]) {
		Ostrich t = new Ostrich();
		t.moveFast();

		Sparrow s = new Sparrow();
		s.moveFast();
	}
}
