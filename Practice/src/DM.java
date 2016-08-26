import java.util.Scanner;
 public class DM {
  public static void main(String[] args) {
   Scanner credit = new Scanner(System.in); // Scanner 힙 메모리에 적재
     int coin1=0;
      System.out.println("얼마를 넣으시겠습니까? ");
      int coin = Integer.parseInt(credit.nextLine());
      while(coin<500){
       System.out.println("금액이 부족합니다. 처음부터 다시 입력하세요");
       System.out.println("얼마를 넣으시겠습니까? ");
       coin1 = Integer.parseInt(credit.nextLine());
       coin=coin+coin1; 
      } 
  
   int drink = 0;
   int a = 1000;
   int b = 700;
   int c = 500;

   while (499<coin) { // 음료수 메뉴
    System.out.println("\n*********[음료수 선택]*********");
    System.out.println("1.A음료수 (￦1000)");
    System.out.println("2.B음료수 (￦700)");
    System.out.println("3.C음료수 (￦500)");
    System.out.println("4.동전반환");
    drink = Integer.parseInt(credit.nextLine()); // 음료수선택
    
   
    if (drink == 1) { // 1번음료수 선택시
     if (coin >= a) {
      coin -= a;
      System.out.println("A음료수 나옴/" + " 남은동전:" + coin + "원");
     } else {
      System.out.println("※잔액부족->실패※" + " 남은동전:" + coin + "원");
     }
    } else if (drink == 2) { // 2번음료수 선택시
     if (coin >= b) { // 남은동전>=
      coin -= b;
      System.out.println("B음료수 나옴/" + " 남은동전:" + coin + "원");
     } else {
      System.out.println("※잔액부족->실패※" + " 남은동전:" + coin + "원");
     }
    } else if (drink == 3) { // 3번음료수 선택시
     if (coin >= c) { // 남은동전>=
      coin -= c;
      System.out.println("C음료수 나옴/" + " 남은동전:" + coin + "원");
     } else {
      System.out.println("※잔액부족->실패※" + " 남은동전:" + coin + "원");
     }
    } else if (drink == 4) { // 4번 종료
     System.out.println(coin + "원 " + "동전반환->종료");
     return; // 종료
    } else
     System.out.println("다시 선택해주세요");
     
   }
      System.out.println("잔액" + coin + "이 반환되었습니다");
  }
 }