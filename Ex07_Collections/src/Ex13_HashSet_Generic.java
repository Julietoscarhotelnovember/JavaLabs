import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Ex13_HashSet_Generic {
	public static void main(String[] args) {
		Set<String> hs=new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("B");
		
		System.out.println(hs.toString());
		
		//중복값 배제하는 건 좋은데 [입력순서는 유지]했으면 좋겠다 ->LinkedHashSet
		Set<String> hs2=new LinkedHashSet<String>();
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("B");
		
		System.out.println(hs2.toString());
		
		//TreeSet는 자료 구조에서 많이 쓰이며, 잘쓰면 좋다
		//2진트리를 만든다, 작은건 왼쪽, 큰건 오른쪽 -> 자료 검색, 정렬에 아주 좋다
		//기본적으로 정렬 된다, 많은 양의 데이터를 저장하는데 효율적
		//검색속도가 빠르다
		//중복데이터 제거+정렬+검색속도
		
		Set<String> hs3=new HashSet<String>();
		hs3.add("B");
		hs3.add("A");
		hs3.add("F");
		hs3.add("K");
		hs3.add("G");
		hs3.add("B");
		
		System.out.println(hs3.toString());
		
		//트리셋으로 로또만들기(중복제거, 정렬)
		Set<Integer> lotto=new TreeSet<Integer>();
		for (int i=0; lotto.size()<6; i++) {
			int num=(int)(Math.random()*45)+1;
			lotto.add(num);
		}
		System.out.println(lotto.toString());
	}
}
