import java.util.Scanner;

public class Ex10_Control_statement {

	public static void main(String[] args) {
		// 반복문 while
		// while(), do while()
		int i=10;
		while (i>=10) {  //조건이 false가 될 때까지 실행
			System.out.println("i: "+i);
			i--;
		}
		//1~100까지의 합
		int sum=0;
		int j=0;
		while (j<=100) {  //조건이 false가 될 때까지 실행
			sum+=j;
			//System.out.println("j: "+j);
			j++; //순서에 따라 달라짐
		}
		System.out.println("1~100까지의 합: "+sum);
		
		//while문을 이용한 구구단 출력
		//변수의 활동범위에 대한 문제
		int k=2;
		int l=1;
		while (k<=9) {
			l=1; //중요!! 초기화 해야 한다, for문처럼 로컬변수로 사용할 수 없나???
			while (l<=9) {
				System.out.printf("%d * %d = %d\t", k, l, k*l);
				l++;
			}
			k++;
			System.out.println();
		}
		
		//do{실행문} while(조건식): 1회 강제적 실행
		//메뉴 구성 등에 쓰임
		//1. 인사 2. 급여 그외번호 입력시 메뉴초기화 -> 의도하는 숫자를 입력하도록 강제할 수 있다.
		
		Scanner sc=new Scanner(System.in);
		int inputdata=0;
		do {
			System.out.print("숫자입력: ");
			inputdata=Integer.parseInt(sc.nextLine());
		} while (inputdata>10);
			System.out.println("당신이 입력한 숫자는: "+inputdata);
		}
	}
