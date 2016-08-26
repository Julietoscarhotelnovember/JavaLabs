package Project_My2;

import java.util.ArrayList;
import java.util.List;

public class Data {

	public static List<Person> personlist = new ArrayList<Person>();
	public static List<Woman> womanlist = new ArrayList<Woman>();
	public static List<Man> manlist = new ArrayList<Man>();

	public Data() {
		/*personlist.add(new Person("������", "1234", true, "���", 25));
		personlist.add(new Person("��ȫ��", "1234", true, "����", 26));
		personlist.add(new Person("�̻��", "1234", true, "���", 31));
		personlist.add(new Person("������", "1234", true, "���", 32));
		personlist.add(new Person("�Ӱ��", "1234", true, "����", 30));
		personlist.add(new Person("������", "1234", false, "���", 25));
		personlist.add(new Person("������", "1234", false, "���", 29));
		personlist.add(new Person("��¾�", "1234", false, "���", 24));
		personlist.add(new Person("�ڽ���", "1234", false, "����", 27));
		personlist.add(new Person("������", "1234", false, "����", 50));*/

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