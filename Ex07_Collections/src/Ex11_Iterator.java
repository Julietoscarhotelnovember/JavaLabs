import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Collection Framework���� �������� �����͸� �а� ������ �� �ִ�
//ǥ�� �������̽��� �����ϴ� ���� Iterator
//Enumeration(������)
//Iterator(�Ź���): ������ (hasNext(), Next(), Remove())
//ListIterator(�Ź���): ������+������

//ArrayList�� Iterator�� �����ϰ� �ִ�
//Iterator<T> iterator()�� ArrayList�� ������ �ִ�
public class Ex11_Iterator {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();  //ctrl+shift+o ���Ǵ� �ڿ��� ���� ���� �ڵ����� import
		list.add(100);
		list.add(200);
		list.add(300);
		//������ ��� ���
		for (Object obj: list) {
			System.out.println("for�� ����: "+obj);
		}
		
		//�̰��� ǥ��ȭ�� �������̽��� ���� ����� ���ٹ�
		Iterator it=list.iterator();
		while (it.hasNext()) {
			System.out.println("����� ����: "+it.next());
		}
		
		ArrayList<Integer> intlist=new ArrayList<Integer>();
		intlist.add(400);
		intlist.add(500);
		intlist.add(600);
		Iterator<Integer> ilist2=intlist.iterator();
		while (ilist2.hasNext()) {
			System.out.println("���ʸ�, ���������: "+ilist2.next());
		}
		
		//for ���� �̿��� ������ ���
		for (int i=intlist.size()-1; i>=0; i--) {
			System.out.println(intlist.get(i));
		}
		
		//ListIterator�� �̿��� ������ ���
		ListIterator<Integer> init3=intlist.listIterator();
		while (init3.hasNext()) {
			System.out.println(init3.next()); //������ Ŀ���� �Ű� ���ƾ�
		}
		while (init3.hasPrevious()) {
			System.out.println("ListIterator�� ���: "+init3.previous()); //�̰� �����ϴ�
		}
		
	}
}
