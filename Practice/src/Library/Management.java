package Library;
import java.util.Scanner;

public class Management {
	//책정보 받기
	Book[] book;
	Management(Book[] b){
		book=b;
	}
	
	//스캐너 설정
	Scanner sc=new Scanner(System.in);
	
	//검색 키워드 설정
	String bookname;
	String authorname;
	
	//초기메뉴
	void displayMenu() {
		System.out.println("=========");
		System.out.println("도서관 시스템");
		System.out.println("1.대출");
		System.out.println("2.반납");
		System.out.println("3.검색");
		System.out.println("4.조회");
		System.out.println("5.종료");
		System.out.println("=========");
		System.out.print("작업 선택: ");
		selectMenu();
	}
	
	//기능별 분기
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
	
	//도서대출화면
	void insertInfo() {
		System.out.println("=======도서대출==========");
		System.out.print("대출할 책의 제목을 입력하세요: ");
		bookname=sc.nextLine();
		System.out.print("대출할 책의 저자를 입력하세요: ");
		authorname=sc.nextLine();
		System.out.println("======================");
		lendBook();
	}
	
	//도서반납화면
	void insertInfo2() {
		System.out.println("=======도서반납==========");
		System.out.print("반납할 책의 제목을 입력하세요: ");
		bookname=sc.nextLine();
		System.out.print("반납할 책의 저자를 입력하세요: ");
		authorname=sc.nextLine();
		System.out.println("======================");
		returnBook();
	}
	
	//도서검색화면
	void insertInfo3() {
		System.out.println("=======도서검색==========");
		System.out.print("검색할 책의 제목을 입력하세요: ");
		bookname=sc.nextLine();
		System.out.print("검색할 책의 저자를 입력하세요: ");
		authorname=sc.nextLine();
		System.out.println("======================");
		searchBook();
	}
	
	//대출 함수
	void lendBook() {
		int i=0;
		while (i<book.length) {
			if (book[i].bname.equals(bookname)||book[i].author.equals(authorname)) {
				System.out.println(book[i].bname+"이 "+book[i].amount+"권 있습니다.");
				System.out.println("대출합니다.");
				book[i].amount--;
				System.out.println(book[i].bname+"이 "+book[i].amount+"권 있습니다.");
				displayMenu();
				break;
			} else {
				i++;
			}	
		}
		System.out.println("해당 도서가 없습니다.");
		displayMenu();
	}
	
	//반납 함수
	void returnBook() {
		int i=0;
		while (i<book.length) {
			if (book[i].bname.equals(bookname)||book[i].author.equals(authorname)) {
				System.out.println(book[i].bname+"이 "+book[i].amount+"권 있습니다.");
				System.out.println("반납합니다.");
				book[i].amount++;
				System.out.println(book[i].bname+"이 "+book[i].amount+"권 있습니다.");
				displayMenu();
				break;
			} else {
				i++;
			}	
		}
		System.out.println("해당 도서가 없습니다.");
		displayMenu();
	}
	
	//검색함수
	void searchBook() {
		int i=0;
		while (i<book.length) {
			if (book[i].bname.equals(bookname)||book[i].author.equals(authorname)) {
				System.out.println("해당 도서를 찾았습니다.");
				System.out.println(book[i].bname+" "+book[i].author+" "+book[i].amount);
				displayMenu();
				break;
			} else {
				i++;
			}	
		}
		System.out.println("해당 도서가 없습니다.");
		displayMenu();
	}
	
	//조회함수
	void inqueryBook() {
		System.out.println("=======도서조회==========");
		for (int i=0; i<book.length; i++) {
			System.out.println(book[i].bname+" "+book[i].author+" "+book[i].amount);
		}
		System.out.println("=======================");
		displayMenu();
	}
}