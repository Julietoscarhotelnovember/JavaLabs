import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//HashMap: Map�������̽��� �����ϴ� Ŭ����
//Ű+�� ���� �̷���� �ֹ迭
//ex)������ȣ
//Ű(�ߺ�X) ��(�ߺ�O)

//HashTable(������): ����ȭO
//HashMap(�Ź���): ����ȭX -> ���� ���
//Generic ����

//ArrayList, HashSet, TreeSet, HashMap
public class Ex14_HashMap {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		
		//�Լ� ����
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		System.out.println(map.containsKey("Tiger")); //��ҹ��� �����Ѵ�
		System.out.println(map.containsKey("Scott")); //��ҹ��� �����Ѵ�
		System.out.println(map.containsValue("1004"));
		
		//key-value pair�� �� ����
		System.out.println(map.get("Tiger"));
		System.out.println(map.get("Scott")); //������ null ����
		
		map.put("Tiger", "1007");
		System.out.println(map.get("Tiger")); //�ߺ����X, ������ value�� �����
		System.out.println(map.size());
		
		System.out.println(map.remove("scott")); //key, value ����, �����Ǵ� value���� ����
		System.out.println(map.size()); //������ null ����
		
		map.put("king", "1007");
		System.out.println(map.toString()); //�α��� ����ó���� ����
		
		HashMap map2=new HashMap();
		map2.put("A", "1111");
		System.out.println(map2.toString());
		map2.put("A", "2222");
		System.out.println(map2.toString());
		
		//.keySet()�� ����Ÿ���� Set�̴�
		//�׷��� iterator �������̽� ����� �����ϴ�
		//key���� �ߺ������� set�� ��︰��
		Set keyset=map2.keySet(); //map�ڿ�(key)�� �̾Ƽ� new HashSet() > add(); > ������ Set
		Iterator it=keyset.iterator(); 
		while (it.hasNext()) {
			System.out.println(it.next()); 
		}
		
		//.value()�� ���� �ߺ��� �־� ����Ÿ���� Collection�̴�
		map2.put("B", "1004");
		Collection vlist=map2.values();
		System.out.println(vlist.toString());
		
		//keypoint
		Set set=map.entrySet(); //�ϳ��� ��� ���� "key=value"
		//key+"="+value
		Iterator it2=set.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}
}
