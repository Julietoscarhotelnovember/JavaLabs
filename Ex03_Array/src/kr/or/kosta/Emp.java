package kr.or.kosta;

public class Emp {
	private int empno;
	private String  ename;
	
	public Emp(int no, String name) {
		empno=no;
		ename=name;
	}
	public void empList() {
		System.out.println("사번: "+empno+" 이름: "+ename);
	}
	//추가
	public void updateEmp(int no, String name) {
		empno=no;
		ename=name;
	}
}
