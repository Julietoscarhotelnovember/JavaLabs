//kr.or.kosta package �ȿ� Person ���赵��
//������ ��üȭ�� �깰(��ü, �ν��Ͻ�)�� ����
import kr.or.kosta.Person;
import kr.or.kosta.Tv;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		Person p; //����: Person-Ÿ��, p-��������, ��ü����
		p=new Person(); //p�� �������� �̹Ƿ� �ݵ�� �ʱ�ȭ
		System.out.println(p); //�ڹ� ���������� ��ȯ�� ��
		
		Person p2=new Person(); //����� �Ҵ��� ���ÿ�
		System.out.println(p2);
		
		p.age=100;
		p.name="ȫ�浿";
		System.out.printf("p�� �̸��� %s �̰�, ���̴� %d �Դϴ�.\n",p.name,p.age);
		System.out.println(p==p2);
		
		p2=p; //������ �װ�
		System.out.println(p==p2);
		System.out.printf("p2�� �̸��� %s �̰�, ���̴� %d �Դϴ�.\n",p2.name,p2.age);
		
		Tv t=new Tv();
		t.brandname="����ؿ� hellG";
		System.out.printf("ä��: %d, �귣��: %s\n", t.ch, t.brandname);
		t.ch_Up();
		t.ch_Up();
		System.out.printf("ä��: %d, �귣��: %s\n", t.ch, t.brandname);
		
		System.out.println("t hashcode(): "+t.hashCode()); //�˻� �˰��� �� ���� ����, �ּҰ����� ���� ����
		
		//�� �ּҰ� ������ ���� �ٸ� ���: hashcode
		//�ڹ� ���������� ����� ��Ī ���̺�
		Tv t2=new Tv();
		System.out.println("�ּҰ� �Ҵ� �� t2 hashCode(): "+t2.hashCode()); //�� ���� �ٸ��� �ٸ� ��ü, �ּҰ� ��
		t2=t;
		System.out.println("�ּҰ� �Ҵ� �� t2 hashCode(): "+t2.hashCode());
		
		//���ú��� �� ���� ���赵�� ����� ���赵�� ������� ���� ���� ����
		//=> Ŭ������ ����� �޸𸮿� �÷��� ��ü�� ����� ����
	}
}
