//Ŭ������ ��� ������߿� ����..
//��Ģ�� ������ �´�(�ǹ̰� ����) Ŭ������ ��Ű���� ��Ƽ� ����
//import�� ��� ����ϰ� ���

//�ϳ��� �ڹ����� �ȿ� ���� Ŭ������ ����� ����
//��, �� ��� ��ǥ���� ���ϴ� �� Ŭ������ �����ڰ� public

//1.�⺻�� ������, �����ڰ� ������ ���������� default �����ڰ� ����
//default�� "���� ����" �ȿ����� ��� ����
//�ٸ� ���������� ��� �Ұ���
class Test{
	int num;
}
/*
 * default class Test {
 * 	default int num;
 * }
 */

//2.public�� ����, �ٸ� ����/��Ű������ ������ �� �� �ִ�
//��θ� ����Ͽ�(import ~)
public class Ex01_main {

	public static void main(String[] args) {
		Test t=new Test();
		t.num=100;
		System.out.println(t.num);
	}

}
