import java.util.Scanner;

public class Team_Assign_3 {

	public static void main(String[] args) {
		
		//가위바위보 입력받기
		Scanner sc=new Scanner(System.in);
		System.out.print("입력: ");
		String inputdata=sc.nextLine();
		System.out.printf("당신은 %s 를 냈습니다\n", inputdata);
		
		//가위-1 바위-2 보-3 으로 변환
		int num=0;
		if (inputdata.equals("가위")) {
			num=1;
		} else if (inputdata.equals("바위")) {
			num=2;
		} else if (inputdata.equals("보")) {
			num=3;
		}

		//1~3 선택
		int com;
		while (true) {
			com=(int)(Math.random()*10+1);
			if (com<=3 && com>=1)
				break;
		}
		
		//컴퓨터 결과
		if (com==1) {
			inputdata="가위";
		} else if (com==2) {
			inputdata="바위";
		} else if (com==3) {
			inputdata="보";
		}
		System.out.printf("컴퓨터는 %s 를 냈습니다\n", inputdata);
		
		//판단
		if (num==com) {
			System.out.println("비겼습니다");
		} else if (num==1 & com==2) {
			System.out.println("컴퓨터가 이겼습니다");
		} else if (num==1 & com==3) {
			System.out.println("당신이 이겼습니다");
		} else if (num==2 & com==1) {
			System.out.println("당신이 이겼습니다");
		} else if (num==2 & com==3) {
			System.out.println("컴퓨터가 이겼습니다");
		} else if (num==3 & com==1) {
			System.out.println("컴퓨터가 이겼습니다");
		}  else {
			System.out.println("당신이 이겼습니다");
		}
	}
}
