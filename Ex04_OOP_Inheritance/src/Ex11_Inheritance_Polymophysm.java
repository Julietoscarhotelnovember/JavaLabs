//������: �������� ����, ���¸� ���� �� ����
//����: �����ε�/�������̵�

//�������� ��� ���迡�� ����
//�ϳ��� ���������� ���� ���� Ÿ���� ���� �� �ִ�
//����Ŭ���� Ÿ���� ���������� �ڽ� Ŭ������ ��ü�� ������ �� �ִ�

//�ڽ��� �θ𿡰� ���Ǿ��� �ش�
class Tv2 {
	boolean power;
	int ch;

	void Power() {
		this.power = !this.power;
	}

	void Chup() {
		this.ch++;
	}

	void Chdown() {
		this.ch--;
	}
}
class CapTv extends Tv2 {
	String text;
	String Caption(){
		return this.text="�ڸ�ó��";
	}
}

public class Ex11_Inheritance_Polymophysm {

	public static void main(String[] args) {
		CapTv ctv=new CapTv();
		ctv.Power();
		System.out.println(ctv.power);
		
		ctv.Chup();
		System.out.println(ctv.ch);
		System.out.println(ctv.Caption());
		//��������
		
		
		Tv2 t2=ctv; //Ÿ���� �ٸ��� �Ѱ����� -> t2�� Tv2 �ۿ� �� ����
		            //ctv�� Tv2+CapTv�� ��� �� �� �ִ� (��Ӱ��迡��)
					//����
		t2.Chdown();
		/*System.out.println(ctv.toString()); //toStirng�� �ּҰ� ����ϴ� �޼ҵ�
		System.out.println(t2.toString()); //������(���)
		//�ϳ��� ���������� ���� ���� ��ü�� ������ �� �ִ�.
*/		System.out.println("�ڽ�: "+ctv.ch);
		System.out.println("�θ�: "+t2.ch);
		//�޸� ����
		
		//�θ�� �ڽĿ��� ������, ����� casting, ������ �� ���� �ȵǱ� �ϴµ� �ڹٿ����� �̷��ٴ���
		CapTv cc=(CapTv)t2;
		//�ڽ��� �θ𿡰� ���Ǿ��� ����
		
		

	}

}
