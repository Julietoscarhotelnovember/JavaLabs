//클래스를 어디에 만드느야에 따라서..
//원칙은 목적에 맞는(의미가 같은) 클래스를 패키지로 모아서 관리
//import로 경로 명시하고 사용

//하나의 자바파일 안에 여러 클래스를 만들어 쓰기
//단, 이 경우 대표성을 지니는 한 클래스만 접근자가 public

//1.기본적 접근자, 수정자가 없으면 내부적으로 default 접근자가 붙음
//default는 "같은 폴더" 안에서만 사용 가능
//다른 폴더에서는 사용 불가능
class Test{
	int num;
}
/*
 * default class Test {
 * 	default int num;
 * }
 */

//2.public은 공유, 다른 폴더/패키지에서 가져다 쓸 수 있다
//경로를 명시하여(import ~)
public class Ex01_main {

	public static void main(String[] args) {
		Test t=new Test();
		t.num=100;
		System.out.println(t.num);
	}

}
