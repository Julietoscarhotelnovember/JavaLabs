package Jumin;

import java.util.Scanner;

public class Jumin {
	//�Է�
	String input;
	void Input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�ֹι�ȣ �Է�: ");
		input=sc.nextLine();
		Check(input);
	}
	//���ڿ� ��
	void Comparing(String input) {
		String a=input.substring(7,8);
		if (a.equals("1") || a.equals("3")) {
			System.out.println("����� �����Դϴ�");
		} else if (a.equals("2") || a.equals("4")) {
			System.out.println("����� �����Դϴ�");
		} else {
			System.out.println("����� Ȥ�� �߼��Դϱ�");
		}
	}
	//��ȿ�� �˻�
	void Check(String input) {
		if (input.length()==14) {
			Comparing(input);
		} else {
			System.out.println("�ٽ� �Է� �ϼ���.");
			Input();
		}
	}
}