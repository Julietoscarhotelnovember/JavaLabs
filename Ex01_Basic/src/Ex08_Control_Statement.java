import java.util.Scanner;

public class Ex08_Control_Statement {

	public static void main(String[] args) {
		// 문제
		// 간단한 사칙연산기 만들기(+, -, *, /)
		// 입력값 3개(숫자, 연산기호, 숫자)
		// 연산 결과는 System.out.printf()를 사용해서 출력
		// 힌트: 조건 if, 입력값 Scanner, 기본 nextLine()변환
		// 힌트 문자열 비교는 ==가 안됨 > String str="A" > str.equals("A")
		Scanner sc=new Scanner(System.in);
		System.out.print("처음 숫자를 입력하세요: ");
		int num1=Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 입력하세요: ");
		String cal=sc.nextLine();
		System.out.print("다음 숫자를 입력하세요: ");
		int num2=Integer.parseInt(sc.nextLine());
		int sum=0;
		System.out.printf("%d %s %d 를 계산 합니다.\n", num1, cal, num2);
		
		/*if (cal.equals("+")){  //문자열 비교
			sum=num1+num2;
		} else if (cal.equals("-")) {
			sum=num1-num2;
		} else if (cal.equals("*")) {
			sum=num1*num2;
		} else if (cal.equals("/")) {
			sum=num1/num2;
		} else {
			System.out.println("잘못 입력함");
			return;  //이렇게 하면 프로그램이 종료된다. return은 함수 단위 제어이기 때문에
		}*/
			
		switch (cal) {
			case "+":
				sum=num1+num2;
				break;
			case "-":
				sum=num1-num2;
				break;
			case "*":
				sum=num1*num2;
				break;
			case "/":
				sum=num1/num2;
				break;
			default:
				System.out.println("잘못 입력함");
				return;
		}
		System.out.println("결과: "+sum);
	}

}
