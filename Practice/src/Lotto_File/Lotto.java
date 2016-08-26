package Lotto_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lotto {
	int[] lotto = new int[6];
	int temp = 0;

	// 번호 생성 및 체크
	int[] selectNum() {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) ((Math.random() * 45) + 1);
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		return lotto;
	}

	// 합계 체크
	int[] sumCheck(int[] selectednum) {
		int sum = 0;
		for (int i = 0; i < selectednum.length; i++) {
			sum += selectednum[i];
		}
		while (sum < 50 || sum > 200) {
			selectNum();
		}
		return lotto;
	}

	// 오름차순 정렬
	void sortNum(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
	}

	// 보너스 번호
	int bonus;

	int bonusNum() {
		for (int i = 0; i < lotto.length; i++) {
			bonus = (int) ((Math.random() * 45) + 1);
		}
		return bonus;
	}

	// 보너스번호와 배열 중복체크
	int bounusCheck(int[] lotto, int bonus) {
		boolean sw = true;
		while (sw) {
			for (int i = 0; i < lotto.length; i++) {
				if (bonus == lotto[i]) {
					sw = true;
					bonus = (int) ((Math.random() * 45) + 1);
					System.out.println("-----보너스번호 중복 발생-------");
					break;
				} else {
					sw = false;
				}
			}
		}
		return bonus;
	}

	// 출력
	void printNum(int[] lottonum, int bonus) {
		System.out.print("이번주 로또 번호: ");
		for (int a : lottonum) {
			System.out.print(a + " ");
		}
		System.out.println("이번주 보너스 번호: " + bonus);
	}

	// 파일저장
	void Writer() {
		BufferedWriter bw=null;
		try {
			bw=new BufferedWriter(new FileWriter("c:\\Temp\\lotto.txt", true));
			String data = null;
			 for(int i = 0; i < lotto.length ; i++){
				 data = lotto[i]+" ";
				 bw.write(data);
			 }if(bonus!=46){
				 data = "보너스 번호 : " + bonus;
				 bw.write(data);
				 bw.newLine();
			 }
			/*while ((data = fr.read()) != 1) {
				fw.write(data);
				//퀴즈
				//엔터, 공백, 탭 이런 것들은 write하지 않기
				if(data!='\t'&&data!='\n'&&data!=' '&&data!='\r') {
					fw.write(data);
				}
			}*/
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
