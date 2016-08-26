//설계도 (속성+행위)
public class Employee {
	
	//상태정보를 담을 수 있는 공간(변수)
	//접근자+타입(자료형)+변수명
	private int empno;
	private String ename;
	public String job;
	public int sal;
	
	//행위정보(함수, method)
	public void empPrint(){
		System.out.println("empno: " + this.empno);
		System.out.println("ename: " + this.ename);
		System.out.println("job: " + this.job);
		System.out.println("sal: " + this.sal);
	}
	
	//private 변수를 이용하기 위해 대리 함수를 만듬
	//같은 클래스 안에서는 private 사용 가능
	public void InsertEmpno(int no){
		empno = no;
	}
	public void InsertEname(String name){
		ename = name;
	}
	
}
