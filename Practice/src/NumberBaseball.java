import java.util.*;

public class NumberBaseball {

	static int strike = 0; // 정답 변수 선언
	static int ball = 0; // 정답 변수 선언

	public static void main(String[] args) {
		int a[] = new int[3]; // 컴퓨터가 랜덤으로 값을 저장할 배열 선언
		int b[] = new int[3]; // 유저에게 입력받는 값을 저장할 배열 선언

		Random ra = new Random();
		while (a[0] == 0) {
			a[0] = ra.nextInt(10);
		}
		while (a[0] == a[1] || a[1] == 0) {
			a[1] = ra.nextInt(10);
		}
		while (a[0] == a[2] || a[1] == a[2] || a[2] == 0) {
			a[2] = ra.nextInt(10);
		}
		// 1~9까지의 랜덤 값을 a배열에 대입

		// System.out.println(a[0] + ", " + a[1] + ", " + a[2] + "\n");
		// 컴퓨터가 정한 값 출력

		Scanner s = new Scanner(System.in);

		while (strike < 3) { // 정답을 맞출때까지 계속 반복

			for (int i = 0; i < b.length; i++) { // 반복적으로 유저에게 값 입력 받기
				System.out.print(i + 1 + "번째 수(1~9) : ");
				b[i] = s.nextInt();
				while (b[i] >= 10 || b[i] == 0) { // 입력된 값의 오류 체크
					System.out.println("[오류] 1~9 사이의 한자리수 입력!");
					System.out.print(i + 1 + "번째 수(1~9) : ");
					b[i] = s.nextInt();
				}
				// System.out.println("입력한 수는 " + b[i] + "입니다.");
			}

			for (int i = 0; i < 3; i++) { // strike, ball 여부 체크
				for (int j = 0; j < 3; j++) {
					if (a[i] == b[j]) {
						if (i == j) {
							strike += 1;
						} else {
							ball += 1;
						} // strike, ball 값 갱신
					}
				}
			}

			if (strike == 0 && ball == 0) { // 모두 틀릴 경우
				System.out.println("\n아웃!\n");
			} else if (strike == 3) { // 정답일 경우
				System.out.print("\n정답입니다!");
				System.exit(0);
			} else { // 부분 정답일 경우
				System.out.println("\n" + strike + " Strike" + ", " + ball + " Ball\n");
				strike = 0;
				ball = 0;
			}
		}
	}
}
