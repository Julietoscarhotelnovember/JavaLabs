package Library;
import java.util.Scanner;

public class Management {
	//å���� �ޱ�
	Book[] book;
	Management(Book[] b){
		book=b;
	}
	
	//��ĳ�� ����
	Scanner sc=new Scanner(System.in);
	
	//�˻� Ű���� ����
	String bookname;
	String authorname;
	
	//�ʱ�޴�
	void displayMenu() {
		System.out.println("=========");
		System.out.println("������ �ý���");
		System.out.println("1.����");
		System.out.println("2.�ݳ�");
		System.out.println("3.�˻�");
		System.out.println("4.��ȸ");
		System.out.println("5.����");
		System.out.println("=========");
		System.out.print("�۾� ����: ");
		selectMenu();
	}
	
	//��ɺ� �б�
	void selectMenu() {
		int i=Integer.parseInt(sc.nextLine());
		switch (i) {
			case 1: insertInfo(); break;
			case 2: insertInfo2(); break;
			case 3: insertInfo3(); break;
			case 4: inqueryBook(); break;
			case 5: break;
			default : displayMenu(); break;
		}
	}
	
	//��������ȭ��
	void insertInfo() {
		System.out.println("=======��������==========");
		System.out.print("������ å�� ������ �Է��ϼ���: ");
		bookname=sc.nextLine();
		System.out.print("������ å�� ���ڸ� �Է��ϼ���: ");
		authorname=sc.nextLine();
		System.out.println("======================");
		lendBook();
	}
	
	//�����ݳ�ȭ��
	void insertInfo2() {
		System.out.println("=======�����ݳ�==========");
		System.out.print("�ݳ��� å�� ������ �Է��ϼ���: ");
		bookname=sc.nextLine();
		System.out.print("�ݳ��� å�� ���ڸ� �Է��ϼ���: ");
		authorname=sc.nextLine();
		System.out.println("======================");
		returnBook();
	}
	
	//�����˻�ȭ��
	void insertInfo3() {
		System.out.println("=======�����˻�==========");
		System.out.print("�˻��� å�� ������ �Է��ϼ���: ");
		bookname=sc.nextLine();
		System.out.print("�˻��� å�� ���ڸ� �Է��ϼ���: ");
		authorname=sc.nextLine();
		System.out.println("======================");
		searchBook();
	}
	
	//���� �Լ�
	void lendBook() {
		int i=0;
		while (i<book.length) {
			if (book[i].bname.equals(bookname)||book[i].author.equals(authorname)) {
				System.out.println(book[i].bname+"�� "+book[i].amount+"�� �ֽ��ϴ�.");
				System.out.println("�����մϴ�.");
				book[i].amount--;
				System.out.println(book[i].bname+"�� "+book[i].amount+"�� �ֽ��ϴ�.");
				displayMenu();
				break;
			} else {
				i++;
			}	
		}
		System.out.println("�ش� ������ �����ϴ�.");
		displayMenu();
	}
	
	//�ݳ� �Լ�
	void returnBook() {
		int i=0;
		while (i<book.length) {
			if (book[i].bname.equals(bookname)||book[i].author.equals(authorname)) {
				System.out.println(book[i].bname+"�� "+book[i].amount+"�� �ֽ��ϴ�.");
				System.out.println("�ݳ��մϴ�.");
				book[i].amount++;
				System.out.println(book[i].bname+"�� "+book[i].amount+"�� �ֽ��ϴ�.");
				displayMenu();
				break;
			} else {
				i++;
			}	
		}
		System.out.println("�ش� ������ �����ϴ�.");
		displayMenu();
	}
	
	//�˻��Լ�
	void searchBook() {
		int i=0;
		while (i<book.length) {
			if (book[i].bname.equals(bookname)||book[i].author.equals(authorname)) {
				System.out.println("�ش� ������ ã�ҽ��ϴ�.");
				System.out.println(book[i].bname+" "+book[i].author+" "+book[i].amount);
				displayMenu();
				break;
			} else {
				i++;
			}	
		}
		System.out.println("�ش� ������ �����ϴ�.");
		displayMenu();
	}
	
	//��ȸ�Լ�
	void inqueryBook() {
		System.out.println("=======������ȸ==========");
		for (int i=0; i<book.length; i++) {
			System.out.println(book[i].bname+" "+book[i].author+" "+book[i].amount);
		}
		System.out.println("=======================");
		displayMenu();
	}
}