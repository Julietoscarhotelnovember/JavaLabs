import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Iterator_ex {

	public static void main(String[] args) {
		
		//HashSet ���� �̱�
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
		//ArrayList ���� �̱�
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
		
		//HashMap ���� �̱�
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("�״��", 122);
		hm.put("�Ϳ���", 22);
		hm.put("�ٶ���", 500);
		hm.put("���帮", 10);
		hm.put("�ڽ���", 1100);
		hm.put("��", 1100);
		Set<Map.Entry<String, Integer>> setmap=hm.entrySet(); //HashMap�� Set�� Map.Entry<> Ÿ������ ���
		Iterator<Map.Entry<String, Integer>> it3=setmap.iterator();
		while (it3.hasNext()) {
			Map.Entry<String, Integer> entry=it3.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		//���⿡ ��ü �ֿ�����

	}
}
