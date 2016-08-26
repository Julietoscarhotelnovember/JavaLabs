import kr.test.Person2;

public class School {
	
	public static void main(String[] args) {
		Person2 p1=new Person2();
		Person2 p2=new Person2();
		p1.updateNum(100);
		p1.updateName("홍길동");
		p1.updateGender("남");
		p1.updatePhone("010-0000-0000");
		p2.updateNum(200);
		p2.updateName("유관순");
		p2.updateGender("여");
		p2.updatePhone("010-1111-1111");
	}

}
