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
		System.out.println("성적관리시스템");
		System.out.println("1.학생 기록 입력");
		System.out.println("2.학생 기록 보기");
		System.out.println("3.학생 기록 저장하기");
		System.out.println("4.학생 기록 불러오기");
		System.out.println("5.종료하기");
		System.out.print("입력하세요: ");
		sc = new Scanner(System.in);
		input = Integer.parseInt(sc.nextLine());
		selectMenu();
	}

	void selectMenu() {
		// 스위치
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
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("성별: ");
		String gender = sc.nextLine();
		System.out.print("나이: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("국어: ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어: ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학: ");
		int math = Integer.parseInt(sc.nextLine());
		list.add(new ScoreInfo(name, gender, age, kor, eng, math));
		displayMenu();
	}

	void displayScore() {
		System.out.println("이름\t성별\t나이\t국어\t영어\t수학\t총점\t평균");
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
			System.out.println("에러발생!!!");
			e.printStackTrace();
		}
		System.out.println("저장되었습니다.");
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
			System.out.println("불러오는데 실패하였습니다.");
			e.printStackTrace();
		}
		System.out.println("불러왔습니다.");
		displayMenu();
	}

	public static void main(String[] args) {
		ScoreMachine sm = new ScoreMachine();
		sm.displayMenu();
	}
}
