public class Program {

	public static void main(String[] args) {
		//���赵(Employee)�� ������ ��üȭ�� �깰(��ü)�� ����
		//����Ʈ ���赵�� ������ �� ���� ����Ʈ�� ���´�
		//ctrl+space ���ɺ��� ����
		Employee kglim = new Employee();
		//kglim.empno = 1000; �ȵ� private�̶�
		kglim.InsertEmpno(1000);
		kglim.job = "����";
		kglim.InsertEname("�Ӱ��");
		kglim.sal = 10000000;
		kglim.empPrint();
		//ctrl+F11 ���� ����
		
		Employee hong = new Employee();
		//hong.empno = 1000; �ȵ�
		hong.InsertEmpno(2000);
		hong.job = "����";
		hong.InsertEname("ȫ���");
		hong.sal = 6000000;
		hong.empPrint();
	}

}
