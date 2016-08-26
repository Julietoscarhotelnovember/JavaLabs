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
		
		//�ߺ��� �����ϴ� �� ������ [�Է¼����� ����]������ ���ڴ� ->LinkedHashSet
		Set<String> hs2=new LinkedHashSet<String>();
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("B");
		
		System.out.println(hs2.toString());
		
		//TreeSet�� �ڷ� �������� ���� ���̸�, �߾��� ����
		//2��Ʈ���� �����, ������ ����, ū�� ������ -> �ڷ� �˻�, ���Ŀ� ���� ����
		//�⺻������ ���� �ȴ�, ���� ���� �����͸� �����ϴµ� ȿ����
		//�˻��ӵ��� ������
		//�ߺ������� ����+����+�˻��ӵ�
		
		Set<String> hs3=new HashSet<String>();
		hs3.add("B");
		hs3.add("A");
		hs3.add("F");
		hs3.add("K");
		hs3.add("G");
		hs3.add("B");
		
		System.out.println(hs3.toString());
		
		//Ʈ�������� �ζǸ����(�ߺ�����, ����)
		Set<Integer> lotto=new TreeSet<Integer>();
		for (int i=0; lotto.size()<6; i++) {
			int num=(int)(Math.random()*45)+1;
			lotto.add(num);
		}
		System.out.println(lotto.toString());
	}
}
