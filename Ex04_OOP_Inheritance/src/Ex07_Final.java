import java.util.concurrent.SynchronousQueue;

//����<->���
//���: �ѹ� ���� �������� ������ �Ұ���
//���������� �빮�� ǥ���Ѵ�
//java: final int num=100;
//C#: const int num=100;

//Ŭ���� �տ�: final class TT{} ����� �� ���� Ŭ������ ���� ��
//�Լ� �տ�: final method() �������̵� �� �� ���� �Լ��� ���� ��
//�ַ� �������� ����Ѵ�
class Vcard {
	final String KIND="heart";
	final int NUM=100;
	void method() {
		System.out.println(Math.PI); //�ý��� ���
	}
}
class Vcard2 {
	final String KIND; //����� �ʱ�ȭ�� �ؾ� �Ǵµ�
	final int NUM;
/*	Vcard2(){ //����Ʈ �����ڸ� �� ������ �ʱ�ȭ�� �ǹǷ� ������ �ȳ���
			  //����� ��ü�� �� �� ���� ������ ���强 �ڵ�, �� �Ⱦ���
		this.KIND="";
		this.NUM=10;
	}*/
	Vcard2(String kind, int num) {
		this.KIND=kind;
		this.NUM=num;
	}
	//�̷��� �����ڸ� �̿��ؼ� �����Ѵ�(����Ʈ ������ ����)
	//�̷��� ���踦 �� ������
	//��ü���� �ٸ� ������� �������� �ϱ� ���ؼ�
}

public class Ex07_Final {
	public static void main(String[] args) {
		Vcard v=new Vcard();
		//v.KIND="spade";
		System.out.println(v.KIND+" : "+v.NUM);
		v.method();
		
		Vcard2 v2=new Vcard2("A", 10);
		Vcard2 v3=new Vcard2("B", 20);
		Vcard2 v4=new Vcard2("C", 30);
		
	}

}
