
public class Ex02_Exception {

	public static void main(String[] args) {
		int num=100;
		int result=0;
		try {
			for (int i=0; i<10; i++) {
				result=num/(int)(Math.random()*10); //0�ϰ�� ���� �߻�, �ذ��Ϸ��� +1�� �ϴ� ���� exception ���� ����
				System.out.println("���: "+result);
			}
		} catch (ArithmeticException ex) { //�̰� ���� ���� ������ ������
		} catch (IndexOutOfBoundsException ex) {
		} catch (Exception e) {
			System.out.println("���ܹ߻�");	
		}
		//���� ���ܴ� �׻� ���� ���ܺ��� �Ʒ��� �־�� �Ѵ�.
		System.out.println("Main END");
	}
}
