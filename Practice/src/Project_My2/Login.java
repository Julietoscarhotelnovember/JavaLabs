package Project_My2;

import java.io.IOException;
import java.util.Scanner;

public class Login {

   Scanner sc = new Scanner(System.in);

   // �α����ϱ�
   public void login() throws IOException {

      System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
      System.out.print("���̵�: ");
      String id = sc.next();
      System.out.print("��й�ȣ: ");
      String pw = sc.next();

      if (id.equals("admin") && pw.equals("9999")) {
         adminlogin();
         return;
      }
      for (int i = 0; i < Data.personlist.size(); i++) {

         String plistid = Data.personlist.get(i).getId();
         String plistpw = Data.personlist.get(i).getPw();

      if (plistid.equals(id) && plistpw.equals(pw)) {
         System.out.println("�α��� ����");
         AfterLogin alogin = new AfterLogin();
         alogin.afterlogin(Data.personlist.get(i));
         return;
         }

      }
      System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���");
   }
   
   
   public void adminlogin(){
      Function.goAdmin();
   }
   
   
   
   
   
   
   
   
   

   // ȸ�������ϱ�
   public void addMember() {
      // ���̵�, ��й�ȣ �Է�
      System.out.println("ȸ�������ϱ�");
      System.out.print("����Ͻ� ���̵� �Է����ּ��� : ");
      String id = sc.next();
      boolean result = checkId(id);
      if (result == false) {
         System.out.println("����ϽǼ� ���� ���̵� �Դϴ�.");
         addMember();
      }
      System.out.print("����Ͻ� ��й�ȣ�� �Է����ּ��� : ");
      String pw = sc.next();

      // ���� �Է�
      boolean gender = chooseGender();
      System.out.println("���� : " + gender);

      // ���� �Է�
      String live = Chooselive();
      System.out.println("������� : " + live);

      // ���� �Է�
      System.out.println("���̸� �Է����ּ���");
      int age = sc.nextInt();

      // ��ϵ� ���� personlist�� ���
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

   
   // ���̵� �ߺ��˻�
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

   // ���� üũ
   public boolean chooseGender() {
      boolean gender = false;

      while (true) {

         System.out.println("������ �������ּ���. ���ڴ� 1�� ���ڴ� 2��");
         int num = sc.nextInt();

         switch (num) {
         case 1:
            gender = true;
            return gender;
         case 2:
            gender = false;
            return gender;
         default:
            System.out.println("�ٽ� �Է����ּ���");
            break;
         }
      }
   }

   // ��� ���� ����
   public String Chooselive() {

      String live = "";

      System.out.println("��� ������ �Է����ּ��� - 1. ����/ 2. ��� / 3. ��û��/ 4. ���/ 5. ����");
      int num = sc.nextInt();
      switch (num) {
      case 1:
         live = "����";
         break;
      case 2:
         live = "���";
         break;
      case 3:
         live = "��û��";
         break;
      case 4:
         live = "���";
         break;
      case 5:
         live = "����";
         break;
      default:
         System.out.println("�޴��� �ٽ� �������ּ���");
         Chooselive();
         break;

      }
      return live;
   }

}

class AfterLogin {
	Scanner sc = new Scanner(System.in);

	// �α��� �� �޴�
	public void afterlogin(Person p) throws IOException {
		while (true) {

			System.out.println("====================================================");
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1. ��Ī�ϱ�  / 2. ������ �� ���� Ȯ�� / 3. �α׾ƿ� ");
			System.out.println("====================================================");
			System.out.print("����: ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("<< ��Ī �����ϱ� >>");
				Function.matching(p);
				break;
			case 2:
				System.out.println("���� Ȯ���ϱ�");
				Function.displayInfo(p);
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