public class Program {

	public static void main(String[] args) {
		//설계도(Employee)를 가지고 구체화된 산물(객체)을 생산
		//아파트 설계도를 가지고 땅 위에 아파트를 짓는다
		//ctrl+space 가능변수 보기
		Employee kglim = new Employee();
		//kglim.empno = 1000; 안됨 private이라서
		kglim.InsertEmpno(1000);
		kglim.job = "영업";
		kglim.InsertEname("임경균");
		kglim.sal = 10000000;
		kglim.empPrint();
		//ctrl+F11 빌드 실행
		
		Employee hong = new Employee();
		//hong.empno = 1000; 안됨
		hong.InsertEmpno(2000);
		hong.job = "개발";
		hong.InsertEname("홍사원");
		hong.sal = 6000000;
		hong.empPrint();
	}

}
