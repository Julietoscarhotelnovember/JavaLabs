import kr.or.kosta.Emp2;
import kr.or.kosta.Hp;

public class Ex17_getter_setter {

	public static void main(String[] args) {
		Hp h=new Hp();
		//h.number ���ٺҰ�(ĸ��ȭ ������)
		//�׷��� public write �Լ�, read �Լ��� �����
		h.writeNumber(1111);
		int result=h.readNumber();
		System.out.println(result);
		Emp2 e2=new Emp2();
		e2.setEmpno(8888);
		System.out.println(e2.getEmpno());
		//ĸ��ȭ�� ��� �ʵ忡 ���ؼ� read, write�ϴ� ���� �Լ�
		//��Ŭ������ ��
		e2.setEname("ȫ�浿");
		System.out.println(e2.getEname());
		e2.setSal(-1000);
		System.out.println(e2.getSal());
	}
}
