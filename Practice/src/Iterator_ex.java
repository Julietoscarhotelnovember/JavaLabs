import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Iterator_ex {

	public static void main(String[] args) {
		
		//HashSet 내용 뽑기
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(4);
		hs.add(5);
		hs.add(11);
		hs.add(3);
		Iterator it=hs.iterator();
		int[] array=new int[5];
		while (it.hasNext()) {
			for (int i=0; i<hs.size(); i++) {
			array[i]=(int) it.next();
			System.out.print(array[i]+" ");
			}
		}
		System.out.println();
		//ArrayList 내용 뽑기
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(4);
		al.add(5);
		al.add(11);
		al.add(3);
		Iterator it2=hs.iterator();
		while (it2.hasNext()) {
			System.out.print(it2.next()+" ");
		}
		System.out.println();
		
		//HashMap 내용 뽑기
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("그대신", 122);
		hm.put("귀여운", 22);
		hm.put("다람쥐", 500);
		hm.put("를드리", 10);
		hm.put("겠습니", 1100);
		hm.put("다", 1100);
		Set<Map.Entry<String, Integer>> setmap=hm.entrySet(); //HashMap을 Set에 Map.Entry<> 타입으로 담기
		Iterator<Map.Entry<String, Integer>> it3=setmap.iterator();
		while (it3.hasNext()) {
			Map.Entry<String, Integer> entry=it3.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		//여기에 객체 넣오보기

	}
}
