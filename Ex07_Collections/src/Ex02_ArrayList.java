import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		ArrayList arraylist=new ArrayList();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		System.out.println(arraylist.size());
		for (Object i: arraylist) {
			System.out.println(i);
		}
		arraylist.add(0, 111); //�����迭�� �ϳ��� �ڷ� �а� �� �տ� 111
		//�����迭�� �����
		System.out.println(arraylist.toString());
		//�����迭������ �̷��� �۵��ϱ� ���� �߰��� �������� �߰�/������ ������ ����ؾ� �Ѵ�
		//������ ������ ������� ������
		
		//ó�� �Ҷ��� �ڷᱸ�� ���ٴ� �Լ��� ����� �߿�
		System.out.println("200 �ִ�? "+arraylist.contains(200));
		System.out.println(arraylist.contains(220));
		System.out.println("�� ����ִ�? "+arraylist.isEmpty());
		arraylist.clear(); //�����͸� ������
		System.out.println("�� ����ִ�? "+arraylist.isEmpty());
		System.out.println("�׷� �������? "+arraylist.size());
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.toString());
		//arraylist.remove(0); //������ ����� ���� �ߺ��� ������ ������ �� �ִ�
		//���� ó�� ������ ���� ����ٰ� �Ѵ�
		//���� Ÿ���� �־ ��� ��Ƶ� �� �ִ�
		Object objvalue=arraylist.remove(0);
		System.out.println("���ﰪ: "+objvalue);
		System.out.println(arraylist.toString());
		
		//ArrayList implements List
		//List list=new ArrayList();
		List list=arraylist.subList(0, 2); //���� �̾Ƽ� ���ο� �迭�� �ֱ�
		//list.add(e) //arraylist�� add�� ����Ѵ�
		//List �������̽��� �ڿ� ��밡��, ������, ��ĳ����
		System.out.println(list.toString());
		list.add(333);
		list.add(444);
		System.out.println(list.toString());
		//�������̽��� ����� ����
		//������: List �������̽��� Arraylist, Vector�� �����ϰ� �ִ�
		//�ڹ� api�� �������� ��ȣ�Ѵ�
		
		//�θ�->�ڽ� �ٿ�ĳ����, ����� ����
		//ArrayList list3=(ArrayList)arraylist.subList(0, 2);
		
		ArrayList alist=new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(10);
		alist.add(8);
		alist.add(45);
		System.out.println("�������� ��: "+alist.toString());
		Collections.sort(alist); //�������� �ϴ� ���� ����
		System.out.println("�������� ��: "+alist.toString());
		Collections.reverse(alist); //�������� �� ������
		System.out.println("��������: "+alist.toString());
		
		
	
	}
}
