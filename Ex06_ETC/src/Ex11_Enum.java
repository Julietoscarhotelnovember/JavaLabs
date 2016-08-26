//열거형(enum) 타입
/*class Calendar { 이러한 상수를 대체하는 자원
	public static final int NUM=0;
}*/

//사용자가 정의한 멤버가 순차적인 "상수"값을 가지게 하는 자료형
//static final
//enum 변수이름 {상수 멤버 리스트}
//ex) 쓸때는 Spring이긴 하지만, 내부적으로는 0
//public enum Season {SPRING, SUMMER, FALL, WINTER}
//열거형 상수는 내부적으로 0부터 1씩 증가하면서 값을 가진다
//개발자가 코드의 가독성을 높이기 위해 사용한다
//위치는 클래스, 클래스 내부 모두 가능
enum Season {SPRING, SUMMER, AUTUMN, WINTER}

public class Ex11_Enum {
	public static void main(String[] args) {
		Season s=Season.SPRING;
		System.out.println(s);
		for (Season s2:Season.values()) {
			System.out.println(s2.name()+" / "+s2.ordinal());
		}
	}
}
