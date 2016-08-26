import java.util.ArrayList;

import kr.or.kosta.Emp;

public class Ex04_ArrayList_Object_KeyPoint {

	public static void main(String[] args) {
		Emp emp=new Emp(100, "홍길동", "IT");
		System.out.println(emp.toString());
		
		//정적배열을 이용해서 사원 3명 만들기
		Emp[] emparray={new Emp(100, "길동이", "영업"),
				         		 new Emp(200, "순신이", "회계"),
				                 new Emp(300, "유신이", "기술")};

		//출력 for, adv for
		for (int i=0; i<emparray.length; i++) {
			System.out.println(emparray[i].toString());
		}
		System.out.println();
		for (Emp e: emparray) {
			System.out.println(e.toString());
		}
		
		//collection 사용: 단점은 object라서 받는 건 쉬운데 꺼내는게 어렵다
		ArrayList emplist=new ArrayList();
		emplist.add(new Emp(500, "조모씨", "학생"));
		emplist.add(new Emp(600, "홍모씨", "학생"));
		emplist.add(new Emp(500, "길모씨", "학생"));
		System.out.println();

		//이건 개불편
		Emp p=(Emp)emplist.get(0);
		System.out.println(p.toString());
		for (int i=0; i<emplist.size(); i++) {
			System.out.println(((Emp)emplist.get(i)).getEmpno()+"/" 
					               +((Emp)emplist.get(i)).getEname()+"/"
					               +((Emp)emplist.get(i)).getJob());
		}
		
		//이것도 불편
		System.out.println();
		for (Object obj: emplist) {
			Emp e=(Emp)obj;
			System.out.println(e.getEmpno()+"/"+e.getEname()+"/"+e.getJob());
		}
		
		//그래서 이걸 해소하려고 generic이 나옴
		ArrayList<Emp> emplist2=new ArrayList<Emp>(); //타입을 고정한다(캐스팅이 필요없다)
		emplist2.add(new Emp(1, "A", "BBB"));
		emplist2.add(new Emp(2, "C", "DDD"));
		for (Emp m: emplist2) {
			System.out.println(m.getEmpno()+"/"+m.getEname()+"/"+m.getJob());
		}
	}
}
