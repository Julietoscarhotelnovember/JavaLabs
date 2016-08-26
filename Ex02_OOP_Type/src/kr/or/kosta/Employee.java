package kr.or.kosta;
public class Employee {
	private int empno;
	private String ename;
	private String job;
	private static int totalemp;
	
	public Employee() {
		empno=9999;
		ename="임시사원";
		job="임시직";
	}
	public Employee(int num, String name, String j) {
		empno=num;
		ename=name;
		job=j;
		totalemp++;
	}
	public void employeeInfo() {
		System.out.printf("사번: %d\t이름: %s\t직종: %s\n", empno, ename, job);
	}
	public void employeeInfo(String str) {
		//System.out.printf("사번: %d\t이름: %s\t직종: %s\n", empno, ename, job);
		System.out.println("조회자: "+str+"\t전체 사원: "+totalemp);
	}
}