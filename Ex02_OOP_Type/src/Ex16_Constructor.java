import kr.or.kosta.Employee;

public class Ex16_Constructor {

	public static void main(String[] args) {
		Employee ep1=new Employee(1000, "홍길동", "노동부");
		ep1.employeeInfo();
		
		Employee ep2=new Employee(2000, "김유신", "자원부");
		ep2.employeeInfo();
		ep2.employeeInfo("관리자");
		
		Employee ep3=new Employee();
		ep3.employeeInfo();
		ep3.employeeInfo("관리자");
	}

}
