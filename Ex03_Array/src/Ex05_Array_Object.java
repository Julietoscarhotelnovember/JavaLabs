import kr.or.kosta.Emp;

public class Ex05_Array_Object {

	public static void main(String[] args) {
		// ��� 3���� �迭�� ���Ͽ� �����
		Emp[] emp=new Emp[3];
		emp[0]=new Emp(1000, "ȫ�浿");
		emp[1]=new Emp(2000, "������");
		emp[2]=new Emp(3000, "������");
		for (int i=0; i<emp.length; i++) {
			emp[i].empList();
		}
		
		//���2
		Emp[] emp2=new Emp[] {new Emp(10, "ȫ��"),
							  new Emp(20, "���"),
							  new Emp(20, "����")};
		for (int i=0; i<emp2.length; i++) {
			emp2[i].empList();
		}
		
		//���3
		Emp[] emp3={new Emp(100, "ȫ��"),
				    new Emp(200, "���"),
				    new Emp(200, "����")};
		for (int i=0; i<emp3.length; i++) {
			emp3[i].empList();
		}
		
		//emp3[0]�� ename�� �ٲ� �� �ֳ�? ����. ename�� private �̹Ƿ�
		//������ ���� ����
		emp3[0].updateEmp(3, "��");
		for (int i=0; i<emp3.length; i++) {
			emp3[i].empList();
		}
	}
}
