package kr.or.kosta;

public class Emp {
	private int empno;
	private String  ename;
	
	public Emp(int no, String name) {
		empno=no;
		ename=name;
	}
	public void empList() {
		System.out.println("���: "+empno+" �̸�: "+ename);
	}
	//�߰�
	public void updateEmp(int no, String name) {
		empno=no;
		ename=name;
	}
}
