class Note {
	//�����ڸ� ������ ���� ���� ���
	//��ü�� ������ �� �ڵ�����, ����Ʈ�� �����ڰ� ���������.
	//public Note(){}
}
class Note2 {
	public Note2() { //�����ڸ� ������ٸ� �ǵ���: ���𰡸� �ʱ�ȭ �ϰڴ�
		System.out.println("�� default �����ھ�");
	}
}

//�����ڵ� �Լ��̱� ������ overloading�� �����ϴ�
class Note3 {
	public Note3(int num) {
		System.out.println("�� overloadig�̾� ���� ����:"+num );		
	}
	//�̷��� �� ������ "��ü�� ������ �� ������ ���� �ϳ��� �ްڴ�"�� �ǵ�
}

class Note4 {
	public Note4() {
		System.out.println("�� ������");
	}
	public Note4(int num) {
		System.out.println("�� �����ε�");
	}
}

class Note5 {
	public Note5(int i) {}
	public Note5(int i, int j) {}
	public Note5(int i, int j, int k) {}
	//��Ģ�� ������ �߿��� ��ü �����ÿ� �ϳ��� ȣ���� �� �ִ�
	//���߿� this�� ���� ���� ���� ������ ȣ���� �����ϴ�
}
public class Ex15_Constructor {

	public static void main(String[] args) {
		Note n1=new Note();
		Note2 n2=new Note2();
		Note3 n3=new Note3(100);
		//Note3 n4=new Note3(); //�̰� �� �ȵǳ�?
		//overloading�� �����ڰ� �ϳ��� �ִٸ�
		//�⺻�����ڴ� �������� ������ ����� �� ����
		//�̷��� �� ������ "��ü�� ������ �� ������ ���� �ϳ��� �ްڴ�"�� �ǵ�
		Note4 n4=new Note4();
		Note4 n5=new Note4(10);
		
		Note5 n6=new Note5(1);
	}
}

