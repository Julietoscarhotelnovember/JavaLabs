import java.util.ArrayList;

import kr.or.kosta.Emp;

public class Ex04_ArrayList_Object_KeyPoint {

	public static void main(String[] args) {
		Emp emp=new Emp(100, "ȫ�浿", "IT");
		System.out.println(emp.toString());
		
		//�����迭�� �̿��ؼ� ��� 3�� �����
		Emp[] emparray={new Emp(100, "�浿��", "����"),
				         		 new Emp(200, "������", "ȸ��"),
				                 new Emp(300, "������", "���")};

		//��� for, adv for
		for (int i=0; i<emparray.length; i++) {
			System.out.println(emparray[i].toString());
		}
		System.out.println();
		for (Emp e: emparray) {
			System.out.println(e.toString());
		}
		
		//collection ���: ������ object�� �޴� �� ��� �����°� ��ƴ�
		ArrayList emplist=new ArrayList();
		emplist.add(new Emp(500, "����", "�л�"));
		emplist.add(new Emp(600, "ȫ��", "�л�"));
		emplist.add(new Emp(500, "���", "�л�"));
		System.out.println();

		//�̰� ������
		Emp p=(Emp)emplist.get(0);
		System.out.println(p.toString());
		for (int i=0; i<emplist.size(); i++) {
			System.out.println(((Emp)emplist.get(i)).getEmpno()+"/" 
					               +((Emp)emplist.get(i)).getEname()+"/"
					               +((Emp)emplist.get(i)).getJob());
		}
		
		//�̰͵� ����
		System.out.println();
		for (Object obj: emplist) {
			Emp e=(Emp)obj;
			System.out.println(e.getEmpno()+"/"+e.getEname()+"/"+e.getJob());
		}
		
		//�׷��� �̰� �ؼ��Ϸ��� generic�� ����
		ArrayList<Emp> emplist2=new ArrayList<Emp>(); //Ÿ���� �����Ѵ�(ĳ������ �ʿ����)
		emplist2.add(new Emp(1, "A", "BBB"));
		emplist2.add(new Emp(2, "C", "DDD"));
		for (Emp m: emplist2) {
			System.out.println(m.getEmpno()+"/"+m.getEname()+"/"+m.getJob());
		}
	}
}
