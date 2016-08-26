import kr.or.kosta.Emp2;
import kr.or.kosta.Hp;

public class Ex17_getter_setter {

	public static void main(String[] args) {
		Hp h=new Hp();
		//h.number 접근불가(캡슐화 때문에)
		//그래서 public write 함수, read 함수를 만든다
		h.writeNumber(1111);
		int result=h.readNumber();
		System.out.println(result);
		Emp2 e2=new Emp2();
		e2.setEmpno(8888);
		System.out.println(e2.getEmpno());
		//캡슐화된 멤버 필드에 대해서 read, write하는 전용 함수
		//이클립스의 힘
		e2.setEname("홍길동");
		System.out.println(e2.getEname());
		e2.setSal(-1000);
		System.out.println(e2.getSal());
	}
}
