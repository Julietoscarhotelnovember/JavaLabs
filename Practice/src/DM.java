import java.util.Scanner;
 public class DM {
  public static void main(String[] args) {
   Scanner credit = new Scanner(System.in); // Scanner �� �޸𸮿� ����
     int coin1=0;
      System.out.println("�󸶸� �����ðڽ��ϱ�? ");
      int coin = Integer.parseInt(credit.nextLine());
      while(coin<500){
       System.out.println("�ݾ��� �����մϴ�. ó������ �ٽ� �Է��ϼ���");
       System.out.println("�󸶸� �����ðڽ��ϱ�? ");
       coin1 = Integer.parseInt(credit.nextLine());
       coin=coin+coin1; 
      } 
  
   int drink = 0;
   int a = 1000;
   int b = 700;
   int c = 500;

   while (499<coin) { // ����� �޴�
    System.out.println("\n*********[����� ����]*********");
    System.out.println("1.A����� (��1000)");
    System.out.println("2.B����� (��700)");
    System.out.println("3.C����� (��500)");
    System.out.println("4.������ȯ");
    drink = Integer.parseInt(credit.nextLine()); // ���������
    
   
    if (drink == 1) { // 1������� ���ý�
     if (coin >= a) {
      coin -= a;
      System.out.println("A����� ����/" + " ��������:" + coin + "��");
     } else {
      System.out.println("���ܾ׺���->���С�" + " ��������:" + coin + "��");
     }
    } else if (drink == 2) { // 2������� ���ý�
     if (coin >= b) { // ��������>=
      coin -= b;
      System.out.println("B����� ����/" + " ��������:" + coin + "��");
     } else {
      System.out.println("���ܾ׺���->���С�" + " ��������:" + coin + "��");
     }
    } else if (drink == 3) { // 3������� ���ý�
     if (coin >= c) { // ��������>=
      coin -= c;
      System.out.println("C����� ����/" + " ��������:" + coin + "��");
     } else {
      System.out.println("���ܾ׺���->���С�" + " ��������:" + coin + "��");
     }
    } else if (drink == 4) { // 4�� ����
     System.out.println(coin + "�� " + "������ȯ->����");
     return; // ����
    } else
     System.out.println("�ٽ� �������ּ���");
     
   }
      System.out.println("�ܾ�" + coin + "�� ��ȯ�Ǿ����ϴ�");
  }
 }