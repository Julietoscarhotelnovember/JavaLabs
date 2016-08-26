import kr.or.kosta.Book;
import kr.or.kosta.Book2;
//생성자(Constructor)
//특수한 목적의 함수이다
//무조껀 public, 모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다
//함수의 이름=클래스 이름
//생성시점의 문제 때문에 return 타입을 가지지 못하며, void도 아니다.
//생성과 동시에 호출되기 때문에 주소값을 받아줄 것이 없다 ->잘 모르겠음..
//몇가지 규칙을 제외하면 함수와 동일
//생성시점: new를 통해 객체가 생성될 때 호출
//목적: 초기화 (멤버필드의 초기화, 인스턴스 변수의 초기화)
/*
class Car {
	public Car() { //이것이 생성자
	}
}
*/
class Car2 {
	int door; //여기에 100 하는것과 뭔 차이냐? -> 오버로딩 가능
	//디폴트 생성자
	public Car2() {
		System.out.println("난 default 생성자야(파라미터를 받지 않아)");
		door=100;
	}
	//오버로딩 생성자
	public Car2(int c) {
		door=c;
	}
}
public class Ex14_Constructor {

	public static void main(String[] args) {
		//인스턴스 초기화 비교1
		Book b1 = new Book();
		b1.bname = "홍길동전"; // 초기화
		b1.writeAmount(10); // 초기화
		
		//인스턴스 초기화 비교2(생성자를 이용)
		Book2 b2=new Book2("김유신전", 100);
		Book2 b3=new Book2("유관순전", 300);
		
		//객체를 만들고 나면 객체마다 값이 다르기 때문에 어짜피 초기화를 한번은 한다
		//생성자를 통해 이것을 좀 편하게 하자는 의미
		
		Car2 c1=new Car2();
		System.out.println(c1.door);
		Car2 c2=new Car2(200); //이렇게 하면 객체 생성시에 초기화도 할 수 있다 
		System.out.println(c2.door);
	}
}
