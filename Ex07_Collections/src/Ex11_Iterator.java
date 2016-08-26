import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Collection Framework에서 순차적인 데이터를 읽고 삭제할 수 있는
//표준 인터페이스를 제공하는 것이 Iterator
//Enumeration(구버전)
//Iterator(신버전): 순방향 (hasNext(), Next(), Remove())
//ListIterator(신버전): 순방향+역방향

//ArrayList는 Iterator를 구현하고 있다
//Iterator<T> iterator()를 ArrayList가 가지고 있다
public class Ex11_Iterator {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();  //ctrl+shift+o 사용되는 자원에 대해 전부 자동으로 import
		list.add(100);
		list.add(200);
		list.add(300);
		//기존에 썼던 방식
		for (Object obj: list) {
			System.out.println("for문 접근: "+obj);
		}
		
		//이것이 표준화된 인터페이스를 통한 명시적 접근법
		Iterator it=list.iterator();
		while (it.hasNext()) {
			System.out.println("명시적 접근: "+it.next());
		}
		
		ArrayList<Integer> intlist=new ArrayList<Integer>();
		intlist.add(400);
		intlist.add(500);
		intlist.add(600);
		Iterator<Integer> ilist2=intlist.iterator();
		while (ilist2.hasNext()) {
			System.out.println("제너릭, 명시적접근: "+ilist2.next());
		}
		
		//for 문을 이용한 역방향 출력
		for (int i=intlist.size()-1; i>=0; i--) {
			System.out.println(intlist.get(i));
		}
		
		//ListIterator를 이용한 역방향 출력
		ListIterator<Integer> init3=intlist.listIterator();
		while (init3.hasNext()) {
			System.out.println(init3.next()); //끝까지 커서를 옮겨 놓아야
		}
		while (init3.hasPrevious()) {
			System.out.println("ListIterator로 출력: "+init3.previous()); //이게 가능하다
		}
		
	}
}
