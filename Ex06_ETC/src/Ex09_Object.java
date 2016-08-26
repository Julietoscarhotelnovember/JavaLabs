class Person {
	int data;
	Person(int data) {
		this.data=data;
	}
}
public class Ex09_Object {

	public static void main(String[] args) {
		Person p=new Person(12345);
		Person p2=new Person(789);
		System.out.println("Object equals: "+p.equals(p2));
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		System.out.println("Object toString(): "+p.toString());
		System.out.println("Object toString(): "+p2.toString());
		
		Person p3=p2;
		System.out.println("Object equals: "+p2.equals(p3));
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println("Object toString(): "+p2.toString());
		System.out.println("Object toString(): "+p3.toString());
		//instanceof 이용하기 (스타크래프트-리페어 예제)
		if (p2 instanceof Person && p3 instanceof Person) {
			System.out.println("그러하다");
		} else {
			System.out.println("ㄴㄴ");
		}
	}

}
