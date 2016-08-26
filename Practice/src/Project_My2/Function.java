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
      if (p.getGender()) { // 남자(true)
         woman.clear();
         System.out.println("********** 조건에 맞는 여자 **********");
         System.out.println("이름\t성별\t나이\t거주지");
         for (Woman w : Data.womanlist) {
            if (w.getLive().equals(p.getLive()) & w.getAge() >= (p.getAge() - 3) & w.getAge() <= (p.getAge() + 3)) {
               System.out.println(w.toString());
               woman.add(w);
               p.likeperson.add((w.getId()));
            }
         }
         if (woman.isEmpty()) {
            System.out.println("\t\t(조건에 맞는 여성이 없습니다.)");
            return;
         }
         messageTo(p);
      } else { // 여자(flase)
         man.clear();
         System.out.println("********** 조건에 맞는 남자 **********");
         System.out.println("이름\t성별\t나이\t거주지");
         for (Man m : Data.manlist) {
            if (m.getLive().equals(p.getLive()) & m.getAge() >= (p.getAge() - 3) & m.getAge() <= (p.getAge() + 3)) {
               System.out.println(m.toString());
               man.add(m);
               p.likeperson.add((m.getId()));
            }
         }
         if (man.isEmpty()) {
            System.out.println("\t\t(조건에 맞는 남성이 없습니다.)");
            return;
         }
         messageTo(p);
      }
   }

   static void goAdmin() {
      System.out.println("어드민 화면입니다 ㅋㅋㅋㅋ");
      Admin.adminmenu();

   }

   static void viewList() {
      for (Person p : Data.personlist) {
         System.out.println("고객 리스트 : " + p);
      }

   }

   static void viewMsg() { // 어드민이 가져오는 메세지 값
      for (Person p : Data.personlist) {
         for (int i = 0; i < p.msg.size(); i++) {
            System.out.println(p.msg.get(i));
            System.out.println();
         }
      }
   }

   static void messageTo(Person from) {
      // 여 > 남
      System.out.println("♥ ♥ ♥ 쪽지 보내기 ♥ ♥ ♥");
      System.out.print("☞  보낼 사람 : ");
      Scanner sc = new Scanner(System.in);
      String to = sc.nextLine();
      if (messagetocheck(from, to)) {
         for (int i = 0; i < Data.personlist.size(); i++) {
            if (to.equals(Data.personlist.get(i).getId())) { // 조건
               System.out.println("보내실 메세지를 입력해 주세요");
               String msg = sc.nextLine();
               Data.personlist.get(i).msg.add(from.getId() + " 님으로부터 " + to + " 님에게 "
                     + Company_Data.DateString(date) + "에 다음과 같은 메세지가 왔습니다.\n" + ">> " + msg + "\n");
               System.out.println(" '" + from.getId() + "' 님이 '" + to + "' 님께 메세지를 보냈습니다.");
            }
         }
      } else {
         System.out.println("해당 유저가 존재하지 않습니다");
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
      System.out.println(" 받은 쪽지 : ");
      if (p.msg.isEmpty()) {
         System.out.println("받은 쪽지가 없습니다...ㅜㅜ");
      } else {
         for (int i = 0; i < p.msg.size(); i++) {
            System.out.println(p.msg.get(i));
         }
         msgsplit(null, p);
         ReturnMenu(p);
      }
   }

   // split 쪼개기
   static boolean msgsplit(String re, Person p) {
      boolean result = false;
      for (int i = 0; i < p.msg.size(); i++) {
         String[] source = { p.msg.get(i) }; // 행

         for (String element : source) { // 한 행 돌기
            String[] results = element.split("\\s"); //// 분해
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

      // 세팅
      FileOutputStream fos = new FileOutputStream("all_log.dat");
      BufferedOutputStream bos = new BufferedOutputStream(fos);
      ObjectOutputStream out = new ObjectOutputStream(bos);

      // ArrayList 저장
      out.writeObject(Data.personlist);

      // 닫기
      out.close();
      bos.close();
      fos.close();
   }

   // 전체 불러오기
   public static void LoadAll() throws ClassNotFoundException, IOException {

      // 세팅
      FileInputStream fis = new FileInputStream("all_log.dat");
      BufferedInputStream bis = new BufferedInputStream(fis);
      ObjectInputStream ois = new ObjectInputStream(bis);

      // ArrayList 불러오기
      try {
         Data.personlist = (ArrayList<Person>) ois.readObject();
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }

      // 닫기
      ois.close();
      bis.close();
      fis.close();
   }

   static void Timer() {
      System.out.println("검색중");
      for (int i = 1; i < 10; i++) {
         System.out.print(".");
         if (i % 3 == 0) {
            System.out.println();
         }
         try {
            Thread.sleep(400); // 1초씩재워
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }

   static void ReturnMsg(Person p) {
      System.out.println("답장을 보내실 분을 선택해주세요 : ");
      String re = sc.nextLine();
      if (msgsplit(re, p) && !re.equals(p.getId())) { // true,false => 이름잇는지
                                          // 검사
         for (int i = 0; i < Data.personlist.size(); i++) {
            if (re.equals(Data.personlist.get(i).getId())) { // 입력한 아이디가 메시지
               // p.msg.get(i)
               // 어디에존재하는아이디
               System.out.println("메세지를 입력해 주세요 : ");
               String msg = sc.nextLine();
               Data.personlist.get(i).msg.add(p.getId() + " 님으로부터 " + re + " 님에게 " + Company_Data.DateString(date)
                     + " 에 다음과 같은 메세지가 왔습니다.\n" + ">> " + msg + "\n");
               System.out.println("답장을 보냈습니다.");
               return;
            }
         }
      } else {
         System.out.println("해당 유저가 존재하지 않습니다.");
         ReturnMsg(p);

      }
   }

   static void ReturnMenu(Person p) {
      Scanner sc = new Scanner(System.in);
      System.out.println("====================================================");
      System.out.println("메뉴를 선택하세요 - 1. 답장보내기  / 2. 돌아가기 ");
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