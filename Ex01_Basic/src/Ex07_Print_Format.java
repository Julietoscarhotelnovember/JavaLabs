import java.util.Scanner; //.*는 되도록 쓰지 말자. 성능 때문이 아니라 가독성 때문에
//C#에서는 using

public class Ex07_Print_Format {

	public static void main(String[] args) {
		//C#
		//println(); > Console.WriteLine();
		//print(); > Console.Write();
		//Console.ReadLine();
		System.out.println("하나");
		System.out.println("둘");
		System.out.print("셋"); //캐리지 리턴 라잇 피드??
		System.out.print("넷");
		System.out.println();
		System.out.print("다섯");
		System.out.println();
		
		//System.out.printf(format, args);
		//format (형식문자)
		//%d (10진수 정수)
		//%f (10진수 실수)
		//%s (문자열)
		//%c (한문자)
		//편의성의 문제이며, 어떻게 짜던 상관없다.
		int num=100;
		int num2=200;
		System.out.printf("현재 num 값은 %d 이다.", num);
		System.out.println();
		System.out.println("현재 num 값은 "+num+" 이다.");
		System.out.printf("현재 num 값은 %d 이고, num2 값은 %d 이다.", num, num2);
		
		int age=10;
		String name="홍길동";
		System.out.printf("\n%s의 나이는 %d살\t입니다.", name, age); //탭, 줄바꿈
		System.out.println();
		
		float f=3f;
		System.out.println(f); //의미의 차이가????
		System.out.printf("f값: %f\n",f);
		
		//입력받기
		Scanner sc=new Scanner(System.in); //객체변수 sc, scanner는 오버로딩
		System.out.print("숫자를 입력하세요: ");
		//int result=sc.nextInt(); 이클립스의 버그 때문에 별루다
		
		//문자를 숫자로 변환하기
		int result=Integer.parseInt(sc.nextLine()); //integer는 wrapper클래스
		//실수문자를 숫자로
		//Double.parseDouble(s)
		//Float.parseFloat(s)
		System.out.println("입력값: "+result);
		
		System.out.println("이름: ");
		String ename=sc.nextLine();
		System.out.println(ename);
		
		String str2="10000"; //문자형 숫자
		int value=Integer.parseInt(str2);
		System.out.println(value);
		
		//숫자를 문자로
		int value2=1000;
		String str=String.valueOf(value2);
		System.out.println(value2);
		
		
	}

}
