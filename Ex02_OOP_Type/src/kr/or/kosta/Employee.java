package kr.or.kosta;
public class Employee {
	private int empno;
	private String ename;
	private String job;
	private static int totalemp;
	
	public Employee() {
		empno=9999;
		ename="�ӽû��";
		job="�ӽ���";
	}
	public Employee(int num, String name, String j) {
		empno=num;
		ename=name;
		job=j;
		totalemp++;
	}
	public void employeeInfo() {
		System.out.printf("���: %d\t�̸�: %s\t����: %s\n", empno, ename, job);
	}
	public void employeeInfo(String str) {
		//System.out.printf("���: %d\t�̸�: %s\t����: %s\n", empno, ename, job);
		System.out.println("��ȸ��: "+str+"\t��ü ���: "+totalemp);
	}
}