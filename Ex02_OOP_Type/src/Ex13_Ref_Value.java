import kr.or.kosta.Person;

public class Ex13_Ref_Value {

	public static void main(String[] args) {
		Person p1=new Person();
		System.out.println(p1.hashCode());
		
		Person p2=p1;
		Person p3=p2;
		
		Person p4=new Person();
		p4=p3;		
		
	}
}
