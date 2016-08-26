package kr.or.kosta;

public class Lotto {
	int[] lotto = new int[6];
	int temp = 0;

	// ��ȣ ���� �� üũ
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

	// �հ� üũ
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

	// �������� ����
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

	// ���ʽ� ��ȣ
	int bonus;

	int bonusNum() {
		for (int i = 0; i < lotto.length; i++) {
			bonus = (int) ((Math.random() * 45) + 1);
		}
		return bonus;
	}

	// ���ʽ���ȣ�� �迭 �ߺ�üũ
	int bounusCheck(int[] lotto, int bonus) {
		boolean sw=true;
		while (sw) {
			for (int i = 0; i < lotto.length; i++) {
				if (bonus == lotto[i]) {
					sw = true;
					bonus = (int) ((Math.random() * 45) + 1);
					System.out.println("-----���ʽ���ȣ �ߺ� �߻�-------");
					break;
				} else {
					sw=false;
				}
			}
		}
		return bonus;
	}

	//���
	void printNum(int[] lottonum, int bonus) {
		System.out.print("�̹��� �ζ� ��ȣ: ");
		for (int a : lottonum) {
			System.out.print(a + " ");
		}
			System.out.println("�̹��� ���ʽ� ��ȣ: " + bonus);
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
					System.out.println((j+1)+"ȸ���� ���ʽ���ȣ�� �ߺ��� �߻��Ͽ� ����÷------------");
					sum++;
					break;
				} else {
					sw=false;
				}
			}
		}
		System.out.print("�� "+(j+1)+"ȸ �ζǹ�ȣ: ");
		for (int i : lotto) {
			System.out.print(i+" ");
		}
		System.out.println("���ʽ���ȣ: "+bonus);
		

	}
		System.out.println(j+"ȸ�� ��÷ �߿��� "+sum+"���� ���ʽ���ȣ�� �ߺ��Ǿ� ����÷ �Ͽ����ϴ�.");
	}

}*/
