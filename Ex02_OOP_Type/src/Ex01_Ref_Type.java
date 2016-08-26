//kr.or.kosta package 안에 Person 설계도를
//가지고 구체화된 산물(객체, 인스턴스)를 생성
import kr.or.kosta.Person;
import kr.or.kosta.Tv;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		Person p; //선언: Person-타입, p-참조변수, 객체변수
		p=new Person(); //p는 지역변수 이므로 반드시 초기화
		System.out.println(p); //자바 내부적으로 변환한 값
		
		Person p2=new Person(); //선언과 할당을 동시에
		System.out.println(p2);
		
		p.age=100;
		p.name="홍길동";
		System.out.printf("p의 이름은 %s 이고, 나이는 %d 입니다.\n",p.name,p.age);
		System.out.println(p==p2);
		
		p2=p; //문제의 그것
		System.out.println(p==p2);
		System.out.printf("p2의 이름은 %s 이고, 나이는 %d 입니다.\n",p2.name,p2.age);
		
		Tv t=new Tv();
		t.brandname="사랑해용 hellG";
		System.out.printf("채널: %d, 브랜드: %s\n", t.ch, t.brandname);
		t.ch_Up();
		t.ch_Up();
		System.out.printf("채널: %d, 브랜드: %s\n", t.ch, t.brandname);
		
		System.out.println("t hashcode(): "+t.hashCode()); //검색 알고리즘 중 가장 빠름, 주소값으로 봐도 무방
		
		//두 주소가 같음을 보는 다른 방법: hashcode
		//자바 내부적으로 만드는 매칭 테이블
		Tv t2=new Tv();
		System.out.println("주소값 할당 전 t2 hashCode(): "+t2.hashCode()); //두 값이 다르면 다른 객체, 주소값 비교
		t2=t;
		System.out.println("주소값 할당 후 t2 hashCode(): "+t2.hashCode());
		
		//오늘부터 할 일은 설계도를 만들고 설계도를 기반으로 집을 짓는 행위
		//=> 클래스를 만들고 메모리에 올려서 객체로 만드는 행위
	}
}
