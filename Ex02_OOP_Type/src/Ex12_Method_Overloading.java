class Human {
	int age;
	String name;
}
//같은 폴더 안에 같은 이름의 클래스가 있을 수 없다
class Test {
	//참조타입이 들어가면 햇갈린다
	Human add(Human h) {
		h.age=100;
		h.name="길동";
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
		
		
		//복잡함
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