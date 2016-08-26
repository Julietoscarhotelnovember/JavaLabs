/*에어컨 시스템
3. 리모콘 기능은 다음과 같다
- 온도 올리기, 내리기
- 방향 : 회전, 정지
- 바람의 세기 : 상 , 중, 하
7. 일반 사용자는 리모콘의 기능을 사용할 수 있고 전원에 대한 권한은 가지고 있지 않다.*/
package Airconditioner;

import java.util.Scanner;

public class Remote_User {
	void printMenu() {
		System.out.println("---에어컨 관리 시스템---");
		System.out.println("   1. 관리자");
		System.out.println("   2. 일반사용자");
		System.out.println("   3. 종료");
		System.out.println("-----------------");
		System.out.print("   선택: ");
		selectUser();
	}
	void selectUser() {
		Scanner sc=new Scanner(System.in);
		int select=Integer.parseInt(sc.nextLine());
		switch (select) {
			case 1: break; //뭔가 호출
			case 2: printRoom(); break;
			case 3: System.out.println("시스템을 종료합니다"); break;
			default : System.out.println("잘못 입력했습니다. 다시 입력하세요.");
					  printMenu();
		}
	}
	void printRoom() {
		System.out.println("-----호실 선택-----");
		System.out.println("   1. 201호");
		System.out.println("   2. 303호");
		System.out.println("   3. 504호");
		System.out.println("   4. 703호");
		System.out.println("   5. 902호");
		System.out.println("-----------------");
		System.out.print("   선택: ");
		selectRoom();
	}
	void selectRoom() {
		Scanner sc=new Scanner(System.in);
		int select=Integer.parseInt(sc.nextLine());
		switch (select) {
			case 1: System.out.println("201호 입니다.");
			        printMsg_User(); break;
			case 2: System.out.println("303호 입니다.");
	        	    printMsg_User(); break;
			case 3: System.out.println("504호 입니다.");
    	            printMsg_User(); break;
			case 4: System.out.println("703호 입니다.");
    	    	    printMsg_User(); break;
			case 5: System.out.println("902호 입니다.");
    	    		printMsg_User(); break;
			default : System.out.println("잘못 입력했습니다. 다시 입력하세요.");
					  printRoom();
		}
	}
	void printMsg_User() {
		System.out.println("---에어컨 관리 시스템(일반 사용자)---");
		System.out.printf("   현재 상태: %d도, %s, %s\n", temp, turn, wind);
		System.out.println("   1. 온도 올리기");
		System.out.println("   2. 온도 내리기");
		System.out.println("   3. 회전");
		System.out.println("   4. 정지");
		System.out.println("   5. 바람세기: 상");
		System.out.println("   6. 바람세기: 중");
		System.out.println("   7. 바람세기: 하");
		System.out.println("   8. 돌아가기");
		System.out.println("----------------------------");
		System.out.print("   선택: ");
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
	//온도설정
	int temp=20;
	void tempUp() {
		temp++;
		System.out.println("현재 온도를 1도 올립니다.");
	}
	void tempDown() {
		temp--;
		System.out.println("현재 온도를 1도 내립니다.");
	}
	//회전설정
	String turn="정지";
	void turnOn() {
		turn="회전";
		System.out.println("회전합니다.");
	}
	void turnOff() {
		turn="정지";
		System.out.println("정지합니다.");
	}
	//바람설정
	String wind="중";
	void windH() {
		wind="상";
		System.out.println("바람 세기를 상으로 설정합니다.");
	}
	void windM() {
		wind="중";
		System.out.println("바람 세기를 중으로 설정합니다.");
	}
	void windL() {
		wind="하";
		System.out.println("바람 세기를 하로 설정합니다.");
	}
}

