package Study;

import java.util.Scanner;

public class Order {
	Scanner sc=new Scanner(System.in);
	Item[] itemarray=new Item[3];
	
	void insertItem() {
		for (int i=0; i <3; i++) {
			itemarray[i].id=id++;
			System.out.println("상품명: ");
			itemarray[i].name=sc.nextLine();
			System.out.println("제조사: ");
			itemarray[i].maker=sc.nextLine();
		}
		System.out.println("입력 완료");
	}
	
	void displayItem() {
		System.out.println("배열에 저장된 상품");
		for (int i=0; i <3; i++) {
			System.out.println("ID: "+itemarray[i].id+"name: "+itemarray[i].name+"maker: "+itemarray[i].maker);
		}
	}
}
