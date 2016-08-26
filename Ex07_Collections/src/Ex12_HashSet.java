import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;

//Set �������̽��� �����ϴ� Ŭ����
//����x, �ߺ�x

public class Ex12_HashSet {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(300);
		hs.add(100);
		hs.add(200);
		System.out.println(hs.toString());
		System.out.println(hs.add(100)); //�Ҹ��� �� ����, �ƿ� �ߺ����� ���� �ʴ´�
		hs.add("b");
		hs.add("A");
		hs.add("F");
		System.out.println(hs.toString()); //����x
		
		Object[] obj={"A", "B", "A", "C", "D", "B"};
		HashSet hs2=new HashSet();
		for (int i=0; i<obj.length; i++) {
			hs2.add(obj[i]);
		}
		System.out.println(hs2.toString()); //�ߺ��� ����

		//������
		Set set=new HashSet();
		System.out.println(set.size());
		
		//����
		//HashSet�� �̿��� �ߺ����� 1~45������ ���� 6�� ���
		for (int i=0; set.size()<6; i++) {  //�⸷�� �ڵ左�ϴ�
			int num=(int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set.toString());
		//���� ���� �������� ���� -> arrylist�� ���� ������ �Ѵ�
		List list=new ArrayList(set);
		
		Collections.sort(list); //����Ŭ����
		System.out.println("���� ��: "+list.toString());

	}
}
