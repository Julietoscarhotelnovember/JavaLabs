//OOP ����� Ư¡: ���, ĸ��ȭ, ������(!!)
//�ڹ�: class me extends father
//C#: class my:father

//��� ��Ģ
//1.���߻�� �Ұ���
//2.���ϻ���� ��Ģ�̴�(������ ����� ���Ͽ� ���� Ŭ������ ��� ���� �� �ִ�)
//3.�����ڴ� public/protected�� ����
//�������̽��� ���߻�� ����

//����� ������ �ǹ�: ����κ� ����(�������� �ʴ�)
//���� �ܰ迡���� �� ����� ����κ��� ���� ���� ���ϴ�
class GrandFather {
	public int gmoney=5000;
	private int pmoney=6000;
	//�������� ������ �����Ǿ� ��Ӱ��迡�� ���� �Ұ��ϴ�
	//getter, setter�� �̿��� ���� ������,
	//���� ���ڴٴ� �ǹ� (Ŭ���� ���ο�����)
	
	
	public GrandFather() {
		System.out.println("GrandFather");
	}


	public int getPmoney() {
		return pmoney;
	}
	
	public void Gmethod() {
		System.out.println("Gmethod");
	}
}
class Father extends GrandFather {
	public int fmoney=1000;
	public Father() {
		System.out.println("Father");
	}
	public void Fmethod() {
		System.out.println("Fmethod");
	}
}
class Child extends Father {
	public int cmoney=10;
	public Child() {
		System.out.println("Child");
	}
}
class my {} //object ���
class you extends Object{} //�̰� �⺻���� �ٴ´�

public class Ex01_Inheritance {
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println("�ҹ�: "+c.gmoney);
		System.out.println("�ƺ���: "+c.fmoney);
		System.out.println("����: "+c.cmoney);

		//Child c=new Child();
		//�޸� ����-������ ����Ŭ�������� ���� heap�� �����
		//������ �����ڷ�
		
		my m=new my();
		//����ڰ� �����ϴ� ��� Ŭ������ �ڹ��� ��Ʈ Ŭ������ object�� ����Ʈ�� ����Ѵ�
		
		Child c2=new Child();
		//�ֻ��� GrandFather�� Object�� ��ӹ޴� ����
		System.out.println(c2.getPmoney());
		
		//�޼ҵ嵵 ��� ������ �ڿ��̴�
		c2.Gmethod();
		c2.Fmethod();
		
	}
}
