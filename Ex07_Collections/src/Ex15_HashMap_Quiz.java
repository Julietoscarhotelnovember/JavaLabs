import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex15_HashMap_Quiz {

	public static void main(String[] args) {
		//ȸ���α��� ó��
		
		HashMap loginmap=new HashMap();
		
		//���Ե� ȸ��ID, pass
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		
		//�������� ó��
		//ID, pass �Է¹ޱ�
		Scanner sc=new Scanner(System.in);
		System.out.print("ID �Է�: ");
		String id=sc.nextLine();
		
		//���� ȸ������ �������� �Ǵ�
		while (true) {
			if (loginmap.containsKey(id)) {
				// passwd
				System.out.print("pass �Է�: ");
				String pass = sc.nextLine();
				if (loginmap.containsValue(pass)) {
					System.out.println("�α��ε�");
					break;
				} else {
					System.out.println("����");
				}
			}
		}
			
	}
}
