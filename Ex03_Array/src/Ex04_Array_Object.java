//객체배열
//배열도 타입이다
class Person {
	String name;
	int age;
}
public class Ex04_Array_Object {
	public static void main(String[] args) {
		//8가지 기본타입
		int[] intarry=new int[10];
		
		//배열 이전 -> int i, j, k
		/*Person p=new Person();
		Person p2=new Person();
		Person p3=new Person();*/
		
		//배열 이후
		Person[] objArray=new Person[3];
		System.out.println("Before");
		System.out.println(objArray[0]);
		System.out.println(objArray[1]);
		System.out.println(objArray[2]);
		//힙 공간에 객체를 올릴 수 있는 공간만 있고, 객체는 없다
		//초기화를 해 주어야 한다
		objArray[0]=new Person();
		objArray[1]=new Person();
		objArray[2]=new Person();
		System.out.println("After");
		System.out.println(objArray[0]);
		System.out.println(objArray[1]);
		System.out.println(objArray[2]);
		
		objArray[0].name="홍길동";
		objArray[0].age=100;
		System.out.println(objArray[0].name);
		System.out.println(objArray[0].age);
		
		//for문을 사용해서 objArray의 각 방에 있는 객체에 name, age값을 출력
		for (int i=0; i<objArray.length; i++) {
			System.out.print(i+" 번의 이름: "+objArray[i].name);
			System.out.print(" "+i+" 번의 나이: "+objArray[i].age);
			System.out.println();
		}
		
		//객체배열 생성하기=배열생성과 같다
		Person[] array=new Person[]{new Person(), new Person(), new Person()};
		Person[] array2={new Person(), new Person()};
		
		//배열과 같다
		Person[] parray=new Person[10];
		for (int i=0; i<parray.length; i++) {
			parray[i]=new Person();
			System.out.println(parray[i].age+" "+parray[i].name);
		}
	}
}
