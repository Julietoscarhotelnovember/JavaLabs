class StaticM {
	int iv;
	static int cv;
	//�Լ�
	void m() {
		//static �ڿ��� ��ü ���� ������ �޸𸮿� �ö󰣴�
		//�Ϲ��Լ��� static �ڿ��� ������ �� �ִ�
		cv=1000;
		System.out.println(cv);
	}
	static void sm() {
		//����� ���� ���ÿ��� �����
		//����ƽ �Լ��� �Ϲ��ڿ��� ������ �� ����(���� �����Ǳ� ������)
		//iv=100; �Ϲ��ڿ� �Ұ�
		System.out.println(cv);
		
		//static�� static���� ���� ������ ����
	}
}
public class Ex08_Static_Method {

	public static void main(String[] args) {
		StaticM sm=new StaticM();
		sm.m();
		sm.sm();
		
		//����ƽ �ڿ��� ��ü���� ���� ��밡��
		//Ŭ���� �̸����� ����
		StaticM.cv=5555;
		StaticM smm=new StaticM();
		smm.sm(); //�����ڿ�->��ü�� ���߿� �����ص� ��������
		smm.m();
		System.out.println(StaticM.cv);
		

	}

}
