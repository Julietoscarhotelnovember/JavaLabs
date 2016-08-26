import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		ArrayList arraylist=new ArrayList();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		System.out.println(arraylist.size());
		for (Object i: arraylist) {
			System.out.println(i);
		}
		arraylist.add(0, 111); //동적배열은 하나씩 뒤로 밀고 맨 앞에 111
		//정적배열은 덮어쓰기
		System.out.println(arraylist.toString());
		//동적배열에서는 이렇게 작동하기 때문 중간에 데이터의 추가/삭제는 성능을 고려해야 한다
		//순차는 빠르고 비순차는 느리다
		
		//처음 할때는 자료구조 보다는 함수의 사용이 중요
		System.out.println("200 있니? "+arraylist.contains(200));
		System.out.println(arraylist.contains(220));
		System.out.println("너 비어있니? "+arraylist.isEmpty());
		arraylist.clear(); //데이터를 날린다
		System.out.println("너 비어있니? "+arraylist.isEmpty());
		System.out.println("그럼 사이즈는? "+arraylist.size());
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.toString());
		//arraylist.remove(0); //값으로 지우는 것은 중복값 때문에 위험할 수 있다
		//제일 처음 만나는 값을 지운다고 한다
		//리턴 타입이 있어서 잠깐 담아둘 수 있다
		Object objvalue=arraylist.remove(0);
		System.out.println("지울값: "+objvalue);
		System.out.println(arraylist.toString());
		
		//ArrayList implements List
		//List list=new ArrayList();
		List list=arraylist.subList(0, 2); //값을 뽑아서 새로운 배열에 넣기
		//list.add(e) //arraylist의 add를 사용한다
		//List 인터페이스의 자원 사용가능, 직관적, 업캐스팅
		System.out.println(list.toString());
		list.add(333);
		list.add(444);
		System.out.println(list.toString());
		//인터페이스의 명시적 접근
		//다형성: List 인터페이스를 Arraylist, Vector가 구현하고 있다
		//자바 api는 다형성을 선호한다
		
		//부모->자식 다운캐스팅, 명시적 접근
		//ArrayList list3=(ArrayList)arraylist.subList(0, 2);
		
		ArrayList alist=new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(10);
		alist.add(8);
		alist.add(45);
		System.out.println("오름차순 전: "+alist.toString());
		Collections.sort(alist); //내림차순 하는 것은 없다
		System.out.println("오름차순 후: "+alist.toString());
		Collections.reverse(alist); //오름차순 후 뒤집기
		System.out.println("내림차순: "+alist.toString());
		
		
	
	}
}
