package Project_My2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Function {
   static Scanner sc = new Scanner(System.in);
   static Calendar date = Calendar.getInstance();

   public static void matching(Person p) {
      List<Person> woman = new ArrayList<>();
      List<Man> man = new ArrayList<>();
      String name = "";
      Timer();
      if (p.getGender()) { // ����(true)
         woman.clear();
         System.out.println("********** ���ǿ� �´� ���� **********");
         System.out.println("�̸�\t����\t����\t������");
         for (Woman w : Data.womanlist) {
            if (w.getLive().equals(p.getLive()) & w.getAge() >= (p.getAge() - 3) & w.getAge() <= (p.getAge() + 3)) {
               System.out.println(w.toString());
               woman.add(w);
               p.likeperson.add((w.getId()));
            }
         }
         if (woman.isEmpty()) {
            System.out.println("\t\t(���ǿ� �´� ������ �����ϴ�.)");
            return;
         }
         messageTo(p);
      } else { // ����(flase)
         man.clear();
         System.out.println("********** ���ǿ� �´� ���� **********");
         System.out.println("�̸�\t����\t����\t������");
         for (Man m : Data.manlist) {
            if (m.getLive().equals(p.getLive()) & m.getAge() >= (p.getAge() - 3) & m.getAge() <= (p.getAge() + 3)) {
               System.out.println(m.toString());
               man.add(m);
               p.likeperson.add((m.getId()));
            }
         }
         if (man.isEmpty()) {
            System.out.println("\t\t(���ǿ� �´� ������ �����ϴ�.)");
            return;
         }
         messageTo(p);
      }
   }

   static void goAdmin() {
      System.out.println("���� ȭ���Դϴ� ��������");
      Admin.adminmenu();

   }

   static void viewList() {
      for (Person p : Data.personlist) {
         System.out.println("�� ����Ʈ : " + p);
      }

   }

   static void viewMsg() { // ������ �������� �޼��� ��
      for (Person p : Data.personlist) {
         for (int i = 0; i < p.msg.size(); i++) {
            System.out.println(p.msg.get(i));
            System.out.println();
         }
      }
   }

   static void messageTo(Person from) {
      // �� > ��
      System.out.println("�� �� �� ���� ������ �� �� ��");
      System.out.print("��  ���� ��� : ");
      Scanner sc = new Scanner(System.in);
      String to = sc.nextLine();
      if (messagetocheck(from, to)) {
         for (int i = 0; i < Data.personlist.size(); i++) {
            if (to.equals(Data.personlist.get(i).getId())) { // ����
               System.out.println("������ �޼����� �Է��� �ּ���");
               String msg = sc.nextLine();
               Data.personlist.get(i).msg.add(from.getId() + " �����κ��� " + to + " �Կ��� "
                     + Company_Data.DateString(date) + "�� ������ ���� �޼����� �Խ��ϴ�.\n" + ">> " + msg + "\n");
               System.out.println(" '" + from.getId() + "' ���� '" + to + "' �Բ� �޼����� ���½��ϴ�.");
            }
         }
      } else {
         System.out.println("�ش� ������ �������� �ʽ��ϴ�");
          messageTo(from);
      }
   }

   public static boolean messagetocheck(Person p, String toname) {
      boolean result = false;
      for (String name : p.likeperson) {
         if (name.equals(toname)) {
            result = true;
         }
      }
      return result;
   }

   static void displayInfo(Person p) {
      System.out.println(" ���� ���� : ");
      if (p.msg.isEmpty()) {
         System.out.println("���� ������ �����ϴ�...�̤�");
      } else {
         for (int i = 0; i < p.msg.size(); i++) {
            System.out.println(p.msg.get(i));
         }
         msgsplit(null, p);
         ReturnMenu(p);
      }
   }

   // split �ɰ���
   static boolean msgsplit(String re, Person p) {
      boolean result = false;
      for (int i = 0; i < p.msg.size(); i++) {
         String[] source = { p.msg.get(i) }; // ��

         for (String element : source) { // �� �� ����
            String[] results = element.split("\\s"); //// ����
            for (String results_elment : results) {
               if (results_elment.equals(re)) {
                  result = true;
               }
            }
         }
      }
      return result;
   }

   public static void SaveAll() throws IOException {

      // ����
      FileOutputStream fos = new FileOutputStream("all_log.dat");
      BufferedOutputStream bos = new BufferedOutputStream(fos);
      ObjectOutputStream out = new ObjectOutputStream(bos);

      // ArrayList ����
      out.writeObject(Data.personlist);

      // �ݱ�
      out.close();
      bos.close();
      fos.close();
   }

   // ��ü �ҷ�����
   public static void LoadAll() throws ClassNotFoundException, IOException {

      // ����
      FileInputStream fis = new FileInputStream("all_log.dat");
      BufferedInputStream bis = new BufferedInputStream(fis);
      ObjectInputStream ois = new ObjectInputStream(bis);

      // ArrayList �ҷ�����
      try {
         Data.personlist = (ArrayList<Person>) ois.readObject();
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }

      // �ݱ�
      ois.close();
      bis.close();
      fis.close();
   }

   static void Timer() {
      System.out.println("�˻���");
      for (int i = 1; i < 10; i++) {
         System.out.print(".");
         if (i % 3 == 0) {
            System.out.println();
         }
         try {
            Thread.sleep(400); // 1�ʾ����
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }

   static void ReturnMsg(Person p) {
      System.out.println("������ ������ ���� �������ּ��� : ");
      String re = sc.nextLine();
      if (msgsplit(re, p) && !re.equals(p.getId())) { // true,false => �̸��մ���
                                          // �˻�
         for (int i = 0; i < Data.personlist.size(); i++) {
            if (re.equals(Data.personlist.get(i).getId())) { // �Է��� ���̵� �޽���
               // p.msg.get(i)
               // ��������ϴ¾��̵�
               System.out.println("�޼����� �Է��� �ּ��� : ");
               String msg = sc.nextLine();
               Data.personlist.get(i).msg.add(p.getId() + " �����κ��� " + re + " �Կ��� " + Company_Data.DateString(date)
                     + " �� ������ ���� �޼����� �Խ��ϴ�.\n" + ">> " + msg + "\n");
               System.out.println("������ ���½��ϴ�.");
               return;
            }
         }
      } else {
         System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
         ReturnMsg(p);

      }
   }

   static void ReturnMenu(Person p) {
      Scanner sc = new Scanner(System.in);
      System.out.println("====================================================");
      System.out.println("�޴��� �����ϼ��� - 1. ���庸����  / 2. ���ư��� ");
      System.out.println("====================================================");
      int num = Integer.parseInt(sc.nextLine());

      switch (num) {
      case 1:
         ReturnMsg(p);
         return;
      case 2:
         return;
      }

   }

}