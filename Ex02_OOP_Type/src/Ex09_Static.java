public class Ex09_Static {
	public void callMethod() {
		System.out.println("�� �Ϲ� �Լ�");
	}

	public static void scallMethod() {
		System.out.println("�� ����ƽ �Լ�");
	}

	public static void main(String[] args) {
		scallMethod(); // ���� Ŭ���������� ���� ����
		Ex09_Static ex09 = new Ex09_Static();
		ex09.callMethod();
	}
}