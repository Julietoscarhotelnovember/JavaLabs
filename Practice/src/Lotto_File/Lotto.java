package Lotto_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
		boolean sw = true;
		while (sw) {
			for (int i = 0; i < lotto.length; i++) {
				if (bonus == lotto[i]) {
					sw = true;
					bonus = (int) ((Math.random() * 45) + 1);
					System.out.println("-----���ʽ���ȣ �ߺ� �߻�-------");
					break;
				} else {
					sw = false;
				}
			}
		}
		return bonus;
	}

	// ���
	void printNum(int[] lottonum, int bonus) {
		System.out.print("�̹��� �ζ� ��ȣ: ");
		for (int a : lottonum) {
			System.out.print(a + " ");
		}
		System.out.println("�̹��� ���ʽ� ��ȣ: " + bonus);
	}

	// ��������
	void Writer() {
		BufferedWriter bw=null;
		try {
			bw=new BufferedWriter(new FileWriter("c:\\Temp\\lotto.txt", true));
			String data = null;
			 for(int i = 0; i < lotto.length ; i++){
				 data = lotto[i]+" ";
				 bw.write(data);
			 }if(bonus!=46){
				 data = "���ʽ� ��ȣ : " + bonus;
				 bw.write(data);
				 bw.newLine();
			 }
			/*while ((data = fr.read()) != 1) {
				fw.write(data);
				//����
				//����, ����, �� �̷� �͵��� write���� �ʱ�
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
