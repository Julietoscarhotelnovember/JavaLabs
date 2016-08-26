import java.util.Vector;

/*
Collection Framework
표준화된 인터페이스를 구현하고 있는 클래스의 집합
Collection Interface -> List Interface (ArrayList)
						   -> Set Interface (HashSet)
Map Interface -> HashMap

1. List Interface (줄을 서시오)
순서O 중복O -> 내부적으로 데이터관리를 배열로 사용
ex) 대기자 명단에 번호표
Vector(구) -> 멀티스레드 동기화(락) 기본 세팅
ArrayList(신) -> 멀티스레드 동기화 사용가능 -> 조금 빠르다, 활용도가 가장 좋다

정적배열(array)
1. 배열크기 고정
2. 접근방법: 인덱스를 가지고 특정 위치에 접근
3. 초기에 설정한 배열 크기를 변경할 수 없다
 vs 콜렉션(동적배열) 중 List 인터페이스
 1. 배열의 크기를 동적으로 확장(사실은 정적 배열의 재할당)
 2. 순서를 유지(내부적으로 index), 중복값 허용
 3. 데이터 저장공간이 object 배열 (private Object[] data;)
 4. Object[]의 극복을 위해 Generic을 사용
 5. 쉽다

2. Set Interface (원 안에 때려넣기)
3. Map Interface (전화번호)
*/
public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("A");
		v.add("B");
		v.add(100);
		System.out.println(v.toString()); //이미 재정의 되어있다
		for (int i=0; i<v.size(); i++) { //배열크기 .length->.size
			System.out.println(v.get(i)); //배열첨자 대신 get(index)
		}
		for (Object o:v) { //타입설정 때문에 비효율적
			System.out.println(o);
		}
		//그래서 Object사용에 대한 문제점을 해결하기 위해 generic 사용
		//객체를 만들 때 필요한 타입을 강제
		Vector<String> v2=new Vector<String>();
		v2.add("AAA");
		v2.add("AAA");
		v2.add("BBB");
		for (String s:v2) {
			System.out.println(s);
		}
		System.out.println(v2.toString());
		System.out.println("콜렉션 크기: "+v2.toString());
		System.out.println("콜렉션 수용능력: "+v2.capacity()); //요것이 중요
		//capacity-수용 능력 size-실제 데이터가 채워진 정도
		//.trimToSize() //메모리의 재할당이 이루어진다(그릇을 자르거나 늘리지는 못한다)
		//.ensureCapacity(int)
		//.setSize(int)//수용능력보다 작으면 자동으로 x2 크기
		//성능상으로는 별로, 기왕이면 최대 수용용량으로 잡아놓는 것이 좋다
		//.clear() size 값들을 null로 채움
		//컬렉션은 중간에 값이 빠지면 채우고 민다 (null이 연속으로 나오도록)
		
		Vector v3=new Vector();
		System.out.println(v3.capacity()); //default 10
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println(v3.size());
		System.out.println(v3.capacity());
		v3.add("A");
		System.out.println(v3.size());
		System.out.println(v3.capacity()); //???
		
		
		
		

	}

}
