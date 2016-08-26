import java.util.ArrayList;

public class Ex03_ArrayList_Function {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList();
		list1.add(1); list1.add(2); list1.add(3); list1.add(4);
		list2.add(3); list2.add(4); list2.add(5); list2.add(6);
		System.out.println("list1: "+list1.toString());
		System.out.println("list2: "+list2.toString());
		
		//������
		ArrayList kyo=new ArrayList();
		kyo.addAll(list1); //list1���� �迭���� kyo�� ���� �־��
		kyo.retainAll(list2); //kyo�� list2�� �������� ���ܶ�
		System.out.println("������: "+kyo.toString());
		
		//������
		ArrayList cha=new ArrayList();
		cha.addAll(list1);
		cha.removeAll(list2);
		System.out.println("������: "+cha.toString());
		
		//������
		ArrayList hap=new ArrayList();
		hap.addAll(list1);
		hap.removeAll(kyo); //���� ����, ������ ������ ���ϴ� �Ͱ� �ٸ���
		hap.addAll(list2);
		System.out.println("������: "+hap.toString());
		
	}
}
