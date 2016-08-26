package Project_My2;

import java.io.IOException;
import java.util.Scanner;

public class Login {

   Scanner sc = new Scanner(System.in);

   // 로그인하기
   public void login() throws IOException {

      System.out.println("아이디와 비밀번호를 입력하세요");
      System.out.print("아이디: ");
      String id = sc.next();
      System.out.print("비밀번호: ");
      String pw = sc.next();

      if (id.equals("admin") && pw.equals("9999")) {
         adminlogin();
         return;
      }
      for (int i = 0; i < Data.personlist.size(); i++) {

         String plistid = Data.personlist.get(i).getId();
         String plistpw = Data.personlist.get(i).getPw();

      if (plistid.equals(id) && plistpw.equals(pw)) {
         System.out.println("로그인 성공");
         AfterLogin alogin = new AfterLogin();
         alogin.afterlogin(Data.personlist.get(i));
         return;
         }

      }
      System.out.println("아이디와 비밀번호를 다시 확인해주세요");
   }
   
   
   public void adminlogin(){
      Function.goAdmin();
   }
   
   
   
   
   
   
   
   
   

   // 회원가입하기
   public void addMember() {
      // 아이디, 비밀번호 입력
      System.out.println("회원가입하기");
      System.out.print("사용하실 아이디를 입력해주세요 : ");
      String id = sc.next();
      boolean result = checkId(id);
      if (result == false) {
         System.out.println("사용하실수 없는 아이디 입니다.");
         addMember();
      }
      System.out.print("사용하실 비밀번호를 입력해주세요 : ");
      String pw = sc.next();

      // 성별 입력
      boolean gender = chooseGender();
      System.out.println("성별 : " + gender);

      // 지역 입력
      String live = Chooselive();
      System.out.println("사는지역 : " + live);

      // 나이 입력
      System.out.println("나이를 입력해주세요");
      int age = sc.nextInt();

      // 등록된 정보 personlist에 담기
      Person p = new Person(id, pw, gender, live, age);
      Data.personlist.add(p);

      if (gender == true) {
         Man m = new Man(id, pw, gender, live, age);
         Data.manlist.add(m);
      } else {
         Woman w = new Woman(id, pw, gender, live, age);
         Data.womanlist.add(w);
      }

   }

   
   // 아이디 중복검사
   public boolean checkId(String id) {

      boolean result = true;

      for (int i = 0; i < Data.personlist.size(); i++) {
         String plistid = Data.personlist.get(i).getId();

         if (plistid.equals(id)) {
            result = false;
         }
      }
      return result;
   }

   // 성별 체크
   public boolean chooseGender() {
      boolean gender = false;

      while (true) {

         System.out.println("성별을 선택해주세요. 남자는 1번 여자는 2번");
         int num = sc.nextInt();

         switch (num) {
         case 1:
            gender = true;
            return gender;
         case 2:
            gender = false;
            return gender;
         default:
            System.out.println("다시 입력해주세요");
            break;
         }
      }
   }

   // 사는 지역 선택
   public String Chooselive() {

      String live = "";

      System.out.println("사는 지역을 입력해주세요 - 1. 서울/ 2. 경기 / 3. 충청도/ 4. 경상도/ 5. 전라도");
      int num = sc.nextInt();
      switch (num) {
      case 1:
         live = "서울";
         break;
      case 2:
         live = "경기";
         break;
      case 3:
         live = "충청도";
         break;
      case 4:
         live = "경상도";
         break;
      case 5:
         live = "전라도";
         break;
      default:
         System.out.println("메뉴를 다시 선택해주세요");
         Chooselive();
         break;

      }
      return live;
   }

}

class AfterLogin {
	Scanner sc = new Scanner(System.in);

	// 로그인 후 메뉴
	public void afterlogin(Person p) throws IOException {
		while (true) {

			System.out.println("====================================================");
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 매칭하기  / 2. 나에게 온 쪽지 확인 / 3. 로그아웃 ");
			System.out.println("====================================================");
			System.out.print("선택: ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("<< 매칭 시작하기 >>");
				Function.matching(p);
				break;
			case 2:
				System.out.println("쪽지 확인하기");
				Function.displayInfo(p);
				break;
			case 3:
				System.out.println("로그아웃 성공");
				return;
			default:
				break;
			}
		}
	}
}