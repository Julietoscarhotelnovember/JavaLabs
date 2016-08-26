import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;

//Set 인터페이스를 구현하는 클래스
//순서x, 중복x

public class Ex12_HashSet {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(300);
		hs.add(100);
		hs.add(200);
		System.out.println(hs.toString());
		System.out.println(hs.add(100)); //불리언 값 리턴, 아예 중복값이 들어가지 않는다
		hs.add("b");
		hs.add("A");
		hs.add("F");
		System.out.println(hs.toString()); //순서x
		
		Object[] obj={"A", "B", "A", "C", "D", "B"};
		HashSet hs2=new HashSet();
		for (int i=0; i<obj.length; i++) {
			hs2.add(obj[i]);
		}
		System.out.println(hs2.toString()); //중복값 배제

		//다형성
		Set set=new HashSet();
		System.out.println(set.size());
		
		//퀴즈
		//HashSet을 이용한 중복없는 1~45까지의 난수 6개 담기
		for (int i=0; set.size()<6; i++) {  //기막힌 코드랩니다
			int num=(int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set.toString());
		//나온 값을 오름차순 정렬 -> arrylist의 힘을 빌려하 한다
		List list=new ArrayList(set);
		
		Collections.sort(list); //헬퍼클래스
		System.out.println("정렬 후: "+list.toString());

	}
}
