import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Ȱ���ϱ�
//HashMap<String, Person> value ������ ��ü ���
class Student {
	String name;
	Student(String name) {
		this.name=name;
	}
}

public class Ex16_HashMap_Generic_Object {
	public static void main(String[] args) {
		HashMap<String, Student> students=new HashMap<>();
		students.put("1000", new Student("�̸�"));
		students.put("2000", new Student("ȫ��"));
		
		Student std=students.get("1000");
		/*System.out.println(std.name);
		Set set=students.entrySet(); //�̰� �ȵ�
		Iterator it2=set.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}*/

		//�и��� �����ϵ��� Map.Entry Ÿ������ ������ key�� value�� �и��� �� �ִ�
		for (Map.Entry m: students.entrySet()) {
			System.out.println(m.getKey()+" / "+((Student)m.getValue()).name);
		}
	}
}
