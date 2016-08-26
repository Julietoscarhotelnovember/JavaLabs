package kr.or.kosta;

public class Emp2 {
	private int empno;
	private String ename;
	private int sal;
	String[] history;
	public int getEmpno() {
		return empno;
	}
	//자동생성 코드
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename+"님";
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		if(sal>0){
			this.sal = sal;
		} else {
			this.sal = 0;
		}
		
	}
	public String[] getHistory() {
		return history;
	}
	public void setHistory(String[] history) {
		this.history = history;
	}
	
}
