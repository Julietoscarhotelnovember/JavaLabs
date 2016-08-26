import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class ScoreInfo implements Serializable {
	String name;
	String gender;
	int age;
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum;
	float avg;

	ScoreInfo(String name, String gender, int age, int kor, int eng, int math) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor + eng + math;
		this.avg = sum / 3;
	}
}

public class ScoreMachine {
	static ArrayList<ScoreInfo> list = new ArrayList<ScoreInfo>();
	Scanner sc = new Scanner(System.in);
	int input = 0;

	void displayMenu() {
		System.out.println("���������ý���");
		System.out.println("1.�л� ��� �Է�");
		System.out.println("2.�л� ��� ����");
		System.out.println("3.�л� ��� �����ϱ�");
		System.out.println("4.�л� ��� �ҷ�����");
		System.out.println("5.�����ϱ�");
		System.out.print("�Է��ϼ���: ");
		sc = new Scanner(System.in);
		input = Integer.parseInt(sc.nextLine());
		selectMenu();
	}

	void selectMenu() {
		// ����ġ
		switch (input) {
		case 1:
			insertInfo();
			break;
		case 2:
			displayScore();
			break;
		case 3:
			writeFile();
			break;
		case 4:
			readFile();
			break;
		case 5:
			System.exit(0);
		}
	}

	void insertInfo() {
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		System.out.print("����: ");
		String gender = sc.nextLine();
		System.out.print("����: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("����: ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("����: ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("����: ");
		int math = Integer.parseInt(sc.nextLine());
		list.add(new ScoreInfo(name, gender, age, kor, eng, math));
		displayMenu();
	}

	void displayScore() {
		System.out.println("�̸�\t����\t����\t����\t����\t����\t����\t���");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).name + "\t" + list.get(i).gender + "\t" + list.get(i).age + "\t"
					+ list.get(i).kor + "\t" + list.get(i).eng + "\t" + list.get(i).math + "\t" + list.get(i).sum + "\t"
					+ list.get(i).avg+"\n");
		}
		displayMenu();
	}

	void writeFile() {
		File file = new File("bmi.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("�����߻�!!!");
			e.printStackTrace();
		}
		System.out.println("����Ǿ����ϴ�.");
		displayMenu();
	}

	void readFile() {
		File file = new File("bmi.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<ScoreInfo> list2 = null;
			list2 = (ArrayList<ScoreInfo>) ois.readObject();
			for (ScoreInfo info : list2) {
				list.add(info);
			}
			ois.close();
			fis.close();
		} catch (Exception e) {
			System.out.println("�ҷ����µ� �����Ͽ����ϴ�.");
			e.printStackTrace();
		}
		System.out.println("�ҷ��Խ��ϴ�.");
		displayMenu();
	}

	public static void main(String[] args) {
		ScoreMachine sm = new ScoreMachine();
		sm.displayMenu();
	}
}
