import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex06_ArrayList_LinkedList {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new LinkedList<Integer>();
		
		//성능 테스트
		long startTime=0L;
		long endTime=0L;
		startTime=System.nanoTime();
		for (int i=0; i<10000; i++) {
			list1.add(0, i); //계속 뒤로 밀어내기, 계속 제일 앞에만 값 넣기
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList 걸린 시간: "+(endTime-startTime)+"ns");
		
		long startTime2=0L;
		long endTime2=0L;
		startTime2=System.nanoTime();
		for (int i=0; i<10000; i++) {
			list2.add(0, i); //계속 뒤로 밀어내기, 계속 제일 앞에만 값 넣기
		}
		endTime2=System.nanoTime();
		System.out.println("LinkedList 걸린 시간: "+(endTime2-startTime2)+"ns");
		//임의 추가는 역시 링크드리스트가 빠르다
	}
}
