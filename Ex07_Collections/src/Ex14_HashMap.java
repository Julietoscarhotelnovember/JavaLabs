import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//HashMap: Map인터페이스를 구현하는 클래스
//키+값 으로 이루어진 쌍배열
//ex)지역번호
//키(중복X) 값(중복O)

//HashTable(구버전): 동기화O
//HashMap(신버전): 동기화X -> 성능 고려
//Generic 지원

//ArrayList, HashSet, TreeSet, HashMap
public class Ex14_HashMap {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		
		//함수 사용법
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		System.out.println(map.containsKey("Tiger")); //대소문자 구별한다
		System.out.println(map.containsKey("Scott")); //대소문자 구별한다
		System.out.println(map.containsValue("1004"));
		
		//key-value pair로 값 리턴
		System.out.println(map.get("Tiger"));
		System.out.println(map.get("Scott")); //없으면 null 리턴
		
		map.put("Tiger", "1007");
		System.out.println(map.get("Tiger")); //중복허용X, 있으면 value를 덮어쓴다
		System.out.println(map.size());
		
		System.out.println(map.remove("scott")); //key, value 삭제, 삭제되는 value값을 리턴
		System.out.println(map.size()); //없으면 null 리턴
		
		map.put("king", "1007");
		System.out.println(map.toString()); //로그인 인증처리에 좋다
		
		HashMap map2=new HashMap();
		map2.put("A", "1111");
		System.out.println(map2.toString());
		map2.put("A", "2222");
		System.out.println(map2.toString());
		
		//.keySet()의 리턴타입이 Set이다
		//그러면 iterator 인터페이스 사용이 가능하다
		//key값은 중복ㄴㄴ라서 set과 어울린다
		Set keyset=map2.keySet(); //map자원(key)를 뽑아서 new HashSet() > add(); > 다형성 Set
		Iterator it=keyset.iterator(); 
		while (it.hasNext()) {
			System.out.println(it.next()); 
		}
		
		//.value()의 값은 중복이 있어 리턴타입이 Collection이다
		map2.put("B", "1004");
		Collection vlist=map2.values();
		System.out.println(vlist.toString());
		
		//keypoint
		Set set=map.entrySet(); //하나로 묶어서 리턴 "key=value"
		//key+"="+value
		Iterator it2=set.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}
}
