//���赵 (�Ӽ�+����)
public class Employee {
	
	//���������� ���� �� �ִ� ����(����)
	//������+Ÿ��(�ڷ���)+������
	private int empno;
	private String ename;
	public String job;
	public int sal;
	
	//��������(�Լ�, method)
	public void empPrint(){
		System.out.println("empno: " + this.empno);
		System.out.println("ename: " + this.ename);
		System.out.println("job: " + this.job);
		System.out.println("sal: " + this.sal);
	}
	
	//private ������ �̿��ϱ� ���� �븮 �Լ��� ����
	//���� Ŭ���� �ȿ����� private ��� ����
	public void InsertEmpno(int no){
		empno = no;
	}
	public void InsertEname(String name){
		ename = name;
	}
	
}
