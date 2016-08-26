import kr.or.kosta.Emp;

public class Ex05_Array_Object {

	public static void main(String[] args) {
		// 사원 3명을 배열을 통하여 만들기
		Emp[] emp=new Emp[3];
		emp[0]=new Emp(1000, "홍길동");
		emp[1]=new Emp(2000, "김유신");
		emp[2]=new Emp(3000, "유관순");
		for (int i=0; i<emp.length; i++) {
			emp[i].empList();
		}
		
		//방법2
		Emp[] emp2=new Emp[] {new Emp(10, "홍모씨"),
							  new Emp(20, "김모씨"),
							  new Emp(20, "유모씨")};
		for (int i=0; i<emp2.length; i++) {
			emp2[i].empList();
		}
		
		//방법3
		Emp[] emp3={new Emp(100, "홍박"),
				    new Emp(200, "김박"),
				    new Emp(200, "유박")};
		for (int i=0; i<emp3.length; i++) {
			emp3[i].empList();
		}
		
		//emp3[0]의 ename을 바꿀 수 있나? 없다. ename이 private 이므로
		//다음과 같이 변경
		emp3[0].updateEmp(3, "모름");
		for (int i=0; i<emp3.length; i++) {
			emp3[i].empList();
		}
	}
}
