class Human {
	int age;
	String name;
}
//���� ���� �ȿ� ���� �̸��� Ŭ������ ���� �� ����
class Test {
	//����Ÿ���� ���� �ް�����
	Human add(Human h) {
		h.age=100;
		h.name="�浿";
		return h;
	}
	Human add(Human h, Human h2) {
		h2.age=h.age;
		h2.name=h.name;
		return h2;
	}
}
public class Ex12_Method_Overloading {
	public static void main(String[] args) {
		Test t=new Test();
		Human man=new Human();
		Human woman=t.add(man);
		System.out.println(woman.age+" : "+woman.name);
		
		
		//������
		Human m=new Human();
		m.age=11;
		m.name="Kim";
		Human w=new Human();
		w.age=10;
		w.name="Lee";
		
		Human k=t.add(m, w);
		System.out.println(k.age+" : "+k.name);
		
	}
}