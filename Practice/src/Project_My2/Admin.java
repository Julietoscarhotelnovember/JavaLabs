package Project_My2;

import java.util.Scanner;

public class Admin {

   public static void adminmenu() {
      Scanner sc = new Scanner(System.in);
      while (true) {

         System.out.println("====================================================");
         System.out.println("메뉴를 선택하세요 -1. 회원리스트 조회  / 2. 전체 쪽지 조회 / 3. 로그아웃 ");
         System.out.println("====================================================");

         int num = sc.nextInt();

         switch (num) {
         case 1:
            System.out.println("<< 회원 리스트 조회 >>");
            Function.viewList();
            break;
         case 2:
            System.out.println("<< 전체 쪽지 조회 >>");
            Function.viewMsg();
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
