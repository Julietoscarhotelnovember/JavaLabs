package Jumin;

import java.util.Scanner;

public class Jumin {
	//입력
	String input;
	void Input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("주민번호 입력: ");
		input=sc.nextLine();
		Check(input);
	}
	//문자열 비교
	void Comparing(String input) {
		String a=input.substring(7,8);
		if (a.equals("1") || a.equals("3")) {
			System.out.println("당신은 남자입니다");
		} else if (a.equals("2") || a.equals("4")) {
			System.out.println("당신은 여자입니다");
		} else {
			System.out.println("당신은 혹시 중성입니까");
		}
	}
	//유효성 검사
	void Check(String input) {
		if (input.length()==14) {
			Comparing(input);
		} else {
			System.out.println("다시 입력 하세요.");
			Input();
		}
	}
}