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
   		Login lo = new Login(); //��ġ����
   		Data d = new Data(); //��ġ����

      while (true) {
         System.out.println("=========================");
         System.out.println("�Ұ��� ���α׷� ����");
         System.out.println("1. �α���   / 2. ȸ������  / 3. ����");
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
            System.out.println("���α׷� ����");
            f.SaveAll();

            return;
         default:
            break;
         }
      }
   }
}