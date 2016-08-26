/*������ �ý���
3. ������ ����� ������ ����
- �µ� �ø���, ������
- ���� : ȸ��, ����
- �ٶ��� ���� : �� , ��, ��
7. �Ϲ� ����ڴ� �������� ����� ����� �� �ְ� ������ ���� ������ ������ ���� �ʴ�.*/
package Airconditioner;

import java.util.Scanner;

public class Remote_User {
	void printMenu() {
		System.out.println("---������ ���� �ý���---");
		System.out.println("   1. ������");
		System.out.println("   2. �Ϲݻ����");
		System.out.println("   3. ����");
		System.out.println("-----------------");
		System.out.print("   ����: ");
		selectUser();
	}
	void selectUser() {
		Scanner sc=new Scanner(System.in);
		int select=Integer.parseInt(sc.nextLine());
		switch (select) {
			case 1: break; //���� ȣ��
			case 2: printRoom(); break;
			case 3: System.out.println("�ý����� �����մϴ�"); break;
			default : System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
					  printMenu();
		}
	}
	void printRoom() {
		System.out.println("-----ȣ�� ����-----");
		System.out.println("   1. 201ȣ");
		System.out.println("   2. 303ȣ");
		System.out.println("   3. 504ȣ");
		System.out.println("   4. 703ȣ");
		System.out.println("   5. 902ȣ");
		System.out.println("-----------------");
		System.out.print("   ����: ");
		selectRoom();
	}
	void selectRoom() {
		Scanner sc=new Scanner(System.in);
		int select=Integer.parseInt(sc.nextLine());
		switch (select) {
			case 1: System.out.println("201ȣ �Դϴ�.");
			        printMsg_User(); break;
			case 2: System.out.println("303ȣ �Դϴ�.");
	        	    printMsg_User(); break;
			case 3: System.out.println("504ȣ �Դϴ�.");
    	            printMsg_User(); break;
			case 4: System.out.println("703ȣ �Դϴ�.");
    	    	    printMsg_User(); break;
			case 5: System.out.println("902ȣ �Դϴ�.");
    	    		printMsg_User(); break;
			default : System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
					  printRoom();
		}
	}
	void printMsg_User() {
		System.out.println("---������ ���� �ý���(�Ϲ� �����)---");
		System.out.printf("   ���� ����: %d��, %s, %s\n", temp, turn, wind);
		System.out.println("   1. �µ� �ø���");
		System.out.println("   2. �µ� ������");
		System.out.println("   3. ȸ��");
		System.out.println("   4. ����");
		System.out.println("   5. �ٶ�����: ��");
		System.out.println("   6. �ٶ�����: ��");
		System.out.println("   7. �ٶ�����: ��");
		System.out.println("   8. ���ư���");
		System.out.println("----------------------------");
		System.out.print("   ����: ");
		selectFunc();
	}
	void selectFunc() {
		Scanner sc=new Scanner(System.in);
		int select=Integer.parseInt(sc.nextLine());
		switch (select) {
			case 1: tempUp(); printMsg_User(); break;
			case 2: tempDown(); printMsg_User(); break;
			case 3: turnOn(); printMsg_User(); break;
			case 4: turnOff(); printMsg_User(); break;
			case 5: windH(); printMsg_User(); break;
			case 6: windM(); printMsg_User(); break;
			case 7: windL(); printMsg_User(); break;
			case 8: printMenu(); break;
		}
	}
	//�µ�����
	int temp=20;
	void tempUp() {
		temp++;
		System.out.println("���� �µ��� 1�� �ø��ϴ�.");
	}
	void tempDown() {
		temp--;
		System.out.println("���� �µ��� 1�� �����ϴ�.");
	}
	//ȸ������
	String turn="����";
	void turnOn() {
		turn="ȸ��";
		System.out.println("ȸ���մϴ�.");
	}
	void turnOff() {
		turn="����";
		System.out.println("�����մϴ�.");
	}
	//�ٶ�����
	String wind="��";
	void windH() {
		wind="��";
		System.out.println("�ٶ� ���⸦ ������ �����մϴ�.");
	}
	void windM() {
		wind="��";
		System.out.println("�ٶ� ���⸦ ������ �����մϴ�.");
	}
	void windL() {
		wind="��";
		System.out.println("�ٶ� ���⸦ �Ϸ� �����մϴ�.");
	}
}

