package Project_My2;

import java.util.Scanner;

public class Admin {

   public static void adminmenu() {
      Scanner sc = new Scanner(System.in);
      while (true) {

         System.out.println("====================================================");
         System.out.println("�޴��� �����ϼ��� -1. ȸ������Ʈ ��ȸ  / 2. ��ü ���� ��ȸ / 3. �α׾ƿ� ");
         System.out.println("====================================================");

         int num = sc.nextInt();

         switch (num) {
         case 1:
            System.out.println("<< ȸ�� ����Ʈ ��ȸ >>");
            Function.viewList();
            break;
         case 2:
            System.out.println("<< ��ü ���� ��ȸ >>");
            Function.viewMsg();
            break;
         case 3:
            System.out.println("�α׾ƿ� ����");
            return;
         default:
            break;
         }
      }
   }

}
