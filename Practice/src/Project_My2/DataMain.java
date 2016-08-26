package Project_My2;

import java.io.IOException;
import java.util.Scanner;

public class DataMain {
   public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in); 
      Function f = new Function();
  /* try {
         f.LoadAll();
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }*/
   		Login lo = new Login(); //위치변경
   		Data d = new Data(); //위치변경

      while (true) {
         System.out.println("=========================");
         System.out.println("소개팅 프로그램 시작");
         System.out.println("1. 로그인   / 2. 회원가입  / 3. 종료");
         System.out.println("=========================");

         int num = sc.nextInt();

         switch (num) {
         case 1:
            lo.login();
            break;
         case 2:
            lo.addMember();
            break;
         case 3:
            System.out.println("프로그램 종료");
            f.SaveAll();

            return;
         default:
            break;
         }
      }
   }
}