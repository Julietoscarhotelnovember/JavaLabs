package kr.or.kosta;

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
		boolean sw=true;
		while (sw) {
			for (int i = 0; i < lotto.length; i++) {
				if (bonus == lotto[i]) {
					sw = true;
					bonus = (int) ((Math.random() * 45) + 1);
					System.out.println("-----보너스번호 중복 발생-------");
					break;
				} else {
					sw=false;
				}
			}
		}
		return bonus;
	}

	//출력
	void printNum(int[] lottonum, int bonus) {
		System.out.print("이번주 로또 번호: ");
		for (int a : lottonum) {
			System.out.print(a + " ");
		}
			System.out.println("이번주 보너스 번호: " + bonus);
	}
}

/*package Lotto;

public class Main {

	public static void main(String[] args) {
		int j=0;
		int sum=0;
		for (j=0; j<50; j++) {
		int[] lotto={8,13,28,30,45,15};
		int bonus=(int)(Math.random()*45)+1;
		boolean sw=true;
		
		while (sw) {
			for (int i=0; i<lotto.length; i++) {
				if (lotto[i]==bonus) {
					bonus=(int)(Math.random()*45)+1;
					sw=true;
					System.out.println((j+1)+"회에서 보너스번호의 중복이 발생하여 재추첨------------");
					sum++;
					break;
				} else {
					sw=false;
				}
			}
		}
		System.out.print("제 "+(j+1)+"회 로또번호: ");
		for (int i : lotto) {
			System.out.print(i+" ");
		}
		System.out.println("보너스번호: "+bonus);
		

	}
		System.out.println(j+"회의 추첨 중에서 "+sum+"번의 보너스번호가 중복되어 재추첨 하였습니다.");
	}

}*/
