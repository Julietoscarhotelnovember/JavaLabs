package Study;

import java.util.Scanner;

public class Order {
	Scanner sc=new Scanner(System.in);
	Item[] itemarray=new Item[3];
	
	void insertItem() {
		for (int i=0; i <3; i++) {
			itemarray[i].id=id++;
			System.out.println("��ǰ��: ");
			itemarray[i].name=sc.nextLine();
			System.out.println("������: ");
			itemarray[i].maker=sc.nextLine();
		}
		System.out.println("�Է� �Ϸ�");
	}
	
	void displayItem() {
		System.out.println("�迭�� ����� ��ǰ");
		for (int i=0; i <3; i++) {
			System.out.println("ID: "+itemarray[i].id+"name: "+itemarray[i].name+"maker: "+itemarray[i].maker);
		}
	}
}
