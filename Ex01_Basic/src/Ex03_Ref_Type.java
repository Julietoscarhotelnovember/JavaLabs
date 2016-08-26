/*
 * 클래스 == 설계도 == 타입(내가 만들어서 쓰는 사용자 정의 타입)
 * 클래스는 타입이다.
 * int age > int(타입, 자료형) > 값을 담는다
 * 
 * 일반적인 Queue 방식: First In First Out, 선입선출
 * 
 * Java의 메모리 구조
 * method area: 메타데이터, static, 올라가지만 실행되기 위해서는 call stack으로 들어가야 한다.
 * call stack: "함수"가 올라가는 영역, 기본 타입의 변수 및 값도 들어감,
 * 가장 위의 함수가 현재 실행되고 있는 함수다
 * heap, 관리 영역: 객체가 생성되는 영역, GC가 관리하는 영역
 *  
 * 참조 타입은 크기가 4byte 고정, stack 영역는 참조할 "주소 값"이 들어가고,
 * heap 영역에 객체 생성 및 실제 값이 들어간다.
 * 
 * Apt 쌍용 = new 쌍용();
 * Apt 현대 = 쌍용;
 * 하면 문제가 발생한다.
 * 쌍용.door = 1000; 으로 변경하면
 * System.out.println(삼성.door); 의 결과도 1000으로 나온다.
 * 
 * 타입의 종류 1. 값 타입(8가지 기본 타입)
 *         2. 참조 타입(사용자 정의 타입): 주소값을 가진다
 * 
 * 참조타입은 의미있는 단위의 집합(class)이다.
 *         
 * 한 자바파일에는 1개의 퍼블릭 클래스(=파일명과 동일한)만 있어야 한다.
 * 하지만 이렇게는 안함
*/
class Apt {
	int door=10;
	int window=2;
}
public class Ex03_Ref_Type {
	public static void main(String[] args) {
		
		Apt ssang = new Apt();	//Apt 타입 ssang 변수(객체)
		System.out.println(ssang);	//변형된 주소값(참조값) 출력
		
		int num=100;	//int 타입 num 변수
		System.out.println(num);
		
	}
}
