import java.util.Scanner;

public class Ex11_do_while_Quiz {
	static Scanner sc=new Scanner(System.in);
	static void inputRecord() {
		System.out.println("성적 데이터 입력");
	}
	static void deleteRecord() {
		System.out.println("성적 데이터 삭제");
	}
	static void sortRecord() {
		System.out.println("성적 데이터 정력");
	}
	static int displayMenu() {
		System.out.println("*************");
		System.out.println("****성적관리****");
		System.out.println("*************");
		System.out.println("1.학생성적 입력");
		System.out.println("2.학생성적 삭제");
		System.out.println("3.학생성적 정렬");
		System.out.println("4.프로그램 종료");
		
		int menu=0;
		do {
			try {
				menu=Integer.parseInt(sc.nextLine());
				if(menu>=1 && menu <=4) {
					break;
				} else {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("잘못했네 다시해");
			}
		} while (true);
		return menu;
	}
	public static void main(String[] args) {
		while(true){
			switch (displayMenu()) {
			case 1:
				inputRecord();
				break;
			case 2:
				deleteRecord();
				break;
			case 3:
				sortRecord();
				break;
			case 4:
				System.out.println("종료합니다");
				System.exit(0);			
			}
		}

	}
}
