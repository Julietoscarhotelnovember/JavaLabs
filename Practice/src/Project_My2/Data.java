package Project_My2;

import java.util.ArrayList;
import java.util.List;

public class Data {

	public static List<Person> personlist = new ArrayList<Person>();
	public static List<Woman> womanlist = new ArrayList<Woman>();
	public static List<Man> manlist = new ArrayList<Man>();

	public Data() {
		/*personlist.add(new Person("조장현", "1234", true, "경기", 25));
		personlist.add(new Person("성홍모", "1234", true, "서울", 26));
		personlist.add(new Person("이상원", "1234", true, "경기", 31));
		personlist.add(new Person("길한종", "1234", true, "경기", 32));
		personlist.add(new Person("임경균", "1234", true, "서울", 30));
		personlist.add(new Person("김지현", "1234", false, "경기", 25));
		personlist.add(new Person("박지은", "1234", false, "경기", 29));
		personlist.add(new Person("백승아", "1234", false, "경기", 24));
		personlist.add(new Person("박신혜", "1234", false, "서울", 27));
		personlist.add(new Person("김태희", "1234", false, "서울", 50));*/

		for (int i = 0; i < personlist.size(); i++) {
			if (personlist.get(i).gender == true) {
				Man man = new Man(personlist.get(i).getId(), personlist.get(i).getPw(), personlist.get(i).gender,
						personlist.get(i).getLive(), personlist.get(i).getAge());
				manlist.add(man);
			} else {
				Woman wo = new Woman(personlist.get(i).getId(), personlist.get(i).getPw(), personlist.get(i).gender,
						personlist.get(i).getLive(), personlist.get(i).getAge());
				womanlist.add(wo);

			}
		}
	}
}