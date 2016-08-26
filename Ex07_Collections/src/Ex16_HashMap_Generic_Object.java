import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//활용하기
//HashMap<String, Person> value 값으로 객체 사용
class Student {
	String name;
	Student(String name) {
		this.name=name;
	}
}

public class Ex16_HashMap_Generic_Object {
	public static void main(String[] args) {
		HashMap<String, Student> students=new HashMap<>();
		students.put("1000", new Student("이모씨"));
		students.put("2000", new Student("홍모씨"));
		
		Student std=students.get("1000");
		/*System.out.println(std.name);
		Set set=students.entrySet(); //이건 안됨
		Iterator it2=set.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}*/

		//분리가 가능하도록 Map.Entry 타입으로 받으면 key와 value를 분리할 수 있다
		for (Map.Entry m: students.entrySet()) {
			System.out.println(m.getKey()+" / "+((Student)m.getValue()).name);
		}
	}
}
