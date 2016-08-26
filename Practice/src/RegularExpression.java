import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class JuminChecker {
	// 정규표현식 입력
	String jumin = "^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-8][0-9]{6}$";

	// 중간 변수
	String input;
	ArrayList<String> array = new ArrayList<String>();
	ArrayList<Integer> array2 = new ArrayList<Integer>();
	int parity;

	void insertNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요: ");
		input = sc.nextLine();
		System.out.println("입력한 주민번호는 ");
		for (int i = 0; i < input.length(); i++) {
			array.add(input.substring(i, i + 1));
			System.out.print(array.get(i) + " "); // 출력테스트
		}
		System.out.print("입니다. \n");
	}

	void makeParity() {
		// - 제거
		String input2 = input.replace("-", "");

		// 정수배열에 옮기기
		for (int i = 0; i < input2.length(); i++) {
			array2.add(Integer.parseInt(input2.substring(i, i + 1)));
		}

		// parity 계산
		parity = (11 - (array2.get(0) * 2 + array2.get(1) * 3 + array2.get(2) * 4 + array2.get(3) * 5
				+ array2.get(4) * 6 + array2.get(5) * 7 + array2.get(6) * 8 + array2.get(7) * 9 + array2.get(8) * 2
				+ array2.get(9) * 3 + array2.get(10) * 4 + array2.get(11) * 5) % 11) % 10;
	}

	void Check() {
		Pattern p = Pattern.compile(jumin);
		Matcher m = p.matcher(input);
		boolean b = m.matches();

		if (b == true) {
			if (parity == array2.get(12)) {
				System.out.println("맞는 주민번호 입니다.");
			} else {
				System.out.println("틀린 주민번호 입니다.");
			}
		} else {
			System.out.println("틀린 주민번호 입니다.");
		}
	}
}

public class RegularExpression {
	public static void main(String[] args) {
		JuminChecker j = new JuminChecker();
		j.insertNum();
		j.makeParity();
		j.Check();
	}
}
