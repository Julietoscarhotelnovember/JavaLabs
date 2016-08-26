
public class Ex09_Control_Statement {

	public static void main(String[] args) {
		//제어문
		//1~100까지의 합 구하기
		int sum=0;
		for (int i=1; i<=100; i++) {
			//System.out.println(i);
			sum+=i;
		}
		System.out.println("1~100까지의 합: "+sum);
		//월욜날 이프 스위치 시험본다고?
		
		int sum2=0;
		for(int i=1; i<=100; i+=2) { //증가감식은 마음대로 할 수 있다
			sum2+=i; //홀수의 합
		}
		System.out.println("1~100까지 홀수의 합: "+sum2);
		
		//for, if를 활용한 짝수의 합
		int sum3=0;
		for (int i=1; i<=100; i++) {
			if (i%2==0) {
				sum3+=i;
			}
		}
		System.out.println("1~100까지 짝수의 합: "+sum3);
		
		//중첩 for문이 중요
		//구구단 2단~9단까지 출력
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}
		
		//for의 절친 continue, break
		//continue는 이하 구문 skip
		System.out.println();
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				if (i==j) continue;
				System.out.printf("%d * %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}
		//break는 블럭 탈출
		System.out.println();
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				if (i==j) break;
				System.out.printf("%d * %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}
		
		//까페 별찍기 과제하기
		System.out.println();
		for(int i=2; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				if(i==j) break;
				System.out.print("*");
			}
			System.out.println();
		}
		
		//자료구조에서 많이 쓰이는 공식
		for (int i=2; i<=9; i++) {
			for (int j=1; j<i; j++) { //조건식으로 하기
				System.out.print("*");
			}
			System.out.println();
		}
		
		//피보나치 수열
		int p1=1;
		int p2=1;
		int p3=0;
		for (int i=1; i<=100; i++) {
			p1=p2;
			p2=p3;
			p3=p1+p2;
			System.out.println(p3);
		}
	}

}
