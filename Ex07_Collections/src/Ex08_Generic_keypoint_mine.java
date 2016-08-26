import java.util.ArrayList;

//jdk 1.5부터 시작
//c#, java 필수

//왜 쓰나?
//1.사용시 타입의 안정성을 확보하는 방법의 일환으로(타입 강제) > Object 타입 탈피
//2.형변환시 각 타입에 맞는 형변환을 해야 하는 불합리성을 해결하기 위해
class Person {
	int age = 100;
}

public class Ex08_Generic_keypoint_mine {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(500);
		list.add(new Person());
		list.add("홍길동");

		// 불편불편 -> 추가한 데이터에서 정해진 한 종류의 타입만 강제할 수 있는 방법은?
		/*
		 * for (Object obj: list) { if(obj instanceof Person) { Person p=
		 * (Person)obj; System.out.println(p.age); } else {
		 * System.out.println(obj); } }
		 */

		// 제너릭을 이용한 편리한 방법
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(100);
		ArrayList<String> stringlist = new ArrayList<String>();
		stringlist.add("A");
		stringlist.add("B");
		for (String s : stringlist) {
			System.out.println(s);
		}
		ArrayList<Person> personlist = new ArrayList<Person>();
		personlist.add(new Person());
		personlist.add(new Person());

	}
}
