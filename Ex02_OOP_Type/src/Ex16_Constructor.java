import kr.or.kosta.Employee;

public class Ex16_Constructor {

	public static void main(String[] args) {
		Employee ep1=new Employee(1000, "ȫ�浿", "�뵿��");
		ep1.employeeInfo();
		
		Employee ep2=new Employee(2000, "������", "�ڿ���");
		ep2.employeeInfo();
		ep2.employeeInfo("������");
		
		Employee ep3=new Employee();
		ep3.employeeInfo();
		ep3.employeeInfo("������");
	}

}
