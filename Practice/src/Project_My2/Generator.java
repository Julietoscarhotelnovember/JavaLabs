//����->���
//all_log.dat ���� ����
//���� all_log.dat ���� ����, DataMain�� ������ ���� �� ������

package Project_My2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Generator {

	public static void main(String[] args) throws IOException {
		Data.personlist.add(new Person("������", "1234", true, "����", 25));
		Data.personlist.add(new Person("��ȫ��", "1234", true, "����", 26));
		Data.personlist.add(new Person("�̻��", "1234", true, "���", 31));
		Data.personlist.add(new Person("������", "1234", true, "���", 32));
		Data.personlist.add(new Person("�Ӱ��", "1234", true, "����", 30));
		Data.personlist.add(new Person("������", "1234", false, "���", 25));
		Data.personlist.add(new Person("������", "1234", false, "���", 29));
		Data.personlist.add(new Person("��¾�", "1234", false, "���", 24));
		Data.personlist.add(new Person("�ڽ���", "1234", false, "����", 27));
		Data.personlist.add(new Person("������", "1234", false, "����", 50));
		Data.personlist.add(new Person("������", "1234", false, "���", 19));
		Data.personlist.add(new Person("����", "1234", true, "���", 19));
		SaveAll();
		System.out.println("all_log.dat ������ ���� �Ǿ����ϴ�.");
	}
	
	public static void SaveAll() throws IOException {

	      FileOutputStream fos = new FileOutputStream("all_log.dat");
	      BufferedOutputStream bos = new BufferedOutputStream(fos);
	      ObjectOutputStream out = new ObjectOutputStream(bos);

	      out.writeObject(Data.personlist);

	      out.close();
	      bos.close();
	      fos.close();
	   }
}
