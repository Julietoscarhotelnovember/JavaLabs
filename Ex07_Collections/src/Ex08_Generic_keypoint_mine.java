import java.util.ArrayList;

//jdk 1.5���� ����
//c#, java �ʼ�

//�� ����?
//1.���� Ÿ���� �������� Ȯ���ϴ� ����� ��ȯ����(Ÿ�� ����) > Object Ÿ�� Ż��
//2.����ȯ�� �� Ÿ�Կ� �´� ����ȯ�� �ؾ� �ϴ� ���ո����� �ذ��ϱ� ����
class Person {
	int age = 100;
}

public class Ex08_Generic_keypoint_mine {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(500);
		list.add(new Person());
		list.add("ȫ�浿");

		// ������� -> �߰��� �����Ϳ��� ������ �� ������ Ÿ�Ը� ������ �� �ִ� �����?
		/*
		 * for (Object obj: list) { if(obj instanceof Person) { Person p=
		 * (Person)obj; System.out.println(p.age); } else {
		 * System.out.println(obj); } }
		 */

		// ���ʸ��� �̿��� ���� ���
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(100);
		ArrayList<String> stringlist = new ArrayList<String>();
		stringlist.add("A");
		stringlist.add("B");
		for (String s : stringlist) {
			System.out.println(s);
		}
		ArrayList<Person> personlist = new ArrayList<Person>();
		personlist.add(new Person());
		personlist.add(new Person());

	}
}
