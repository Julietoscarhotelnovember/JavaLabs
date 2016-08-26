import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex06_ArrayList_LinkedList {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new LinkedList<Integer>();
		
		//���� �׽�Ʈ
		long startTime=0L;
		long endTime=0L;
		startTime=System.nanoTime();
		for (int i=0; i<10000; i++) {
			list1.add(0, i); //��� �ڷ� �о��, ��� ���� �տ��� �� �ֱ�
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList �ɸ� �ð�: "+(endTime-startTime)+"ns");
		
		long startTime2=0L;
		long endTime2=0L;
		startTime2=System.nanoTime();
		for (int i=0; i<10000; i++) {
			list2.add(0, i); //��� �ڷ� �о��, ��� ���� �տ��� �� �ֱ�
		}
		endTime2=System.nanoTime();
		System.out.println("LinkedList �ɸ� �ð�: "+(endTime2-startTime2)+"ns");
		//���� �߰��� ���� ��ũ�帮��Ʈ�� ������
	}
}
