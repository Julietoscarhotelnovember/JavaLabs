//���α׷� ��������
//1.����(error): ��Ʈ��ũ ���, �޸�, �ϵ����
//2.����(Exception): �����ڰ� �ڵ� �����ÿ� ���� ó�� ����
//try{} catch(Exception e){} finally{}
//����ó���� ���α׷��� ���������� ���Ḧ ���� ���� ����Ѵ�

//Exception Ŭ������ ���ܸ� ����ϴ� ���� Ŭ����
//java.lang.ArithmeticException: / by zero

//1.Exception ��ü e�� �������� �ʾҴµ� �ڿ��� ����ϰ� �ִ�. ���?
//���ܰ� �߻��ϸ� JVM�� �� ���ܿ� �´� Ŭ������ ã�Ƽ� new�� ���� �޸𸮿� �ø���.
//2.Exception���� ó���Ϸ��� �ϴµ�, ��� �ٸ� Ŭ�������� ȣȯ�Ǿ�����?
//ArithmeticException�� Exception�� ����ϰ� �ִ�. (������)
//Exception�� ���ܸ� ����ϴ� �ֻ��� Ŭ�����̴�.
public class Ex01_Exception {

	public static void main(String[] args) {
		/*//System.out.Println(); ������ ����
		System.out.println("Main �Լ� ����");
		System.out.println("�ڵ� ó�� ��....");
		System.out.println(0/0); //�� �������� ���α׷��� ������ ����
		System.out.println("Main �Լ� ����");*/
		
		//����ó��
		try {
			System.out.println("Main �Լ� ����");
			System.out.println("�ڵ� ó�� ��....");
			System.out.println(0/0);
		} catch(Exception e) {
			//System.out.println("���� Ȯ��: "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main �Լ� ����");
	}
}
