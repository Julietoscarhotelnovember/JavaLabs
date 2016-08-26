import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyDos2 {
	// ����Ʈ ��ġ ����(�⺻���� c:\Temp\ ���� �۾�)
	//static String defaultpath = "c:\\Temp\\";

	// ���� �Լ�(java MyDos mkdir|rmdir [������] ������ ����)
	// args[0]�� ��ɾ�, args[1]�� �������� �Է¹���
	public static void main(String[] args) throws IOException {
		prompt();
	}
	static String fullpath="C:\\";
	static File dir = new File(fullpath);
	
	static String[] input;
	//������Ʈ
	static void prompt() throws IOException {
		System.out.print(dir.getPath()  +"> ");
		Scanner sc=new Scanner(System.in);
		input=sc.nextLine().split(" ");
		dosShell(input);
	}

	// mkdir rmdir ��ɾ� �б�
	static void dosShell(String[] args) throws IOException {
		switch (args[0]) {
		case "mkdir":
			mkDir(args[1]);
			break;
		case "rmdir":
			rmDir(args[1]);
			break;
		case "cd":
			changeDir(args[1]); 
			break;
		case "cd..":
			changeDir(".."); 
			break;
		default:
			System.out.println("����: mkdir [������] �Ǵ� rmdir [������]");
			prompt();
		}
	}

	//���丮 �̵� �Լ�
	static void changeDir(String str) throws IOException {
		File f =new File(fullpath+"\\"+str);
		if (f.exists()) {
			if (str.equals("..")) {
				//��� ����
				fullpath=fullpath.substring(0,fullpath.lastIndexOf("\\"));
				dir=new File(fullpath);
			} else {
				//��� �߰�
				fullpath=fullpath+"\\"+str;
				dir=new File(fullpath);
			} 
		} else {
			System.out.println("�׷� ���丮 �����ϴ�.");
		}
		prompt();
	}

	// ���丮 ���� �Լ�
	static void mkDir(String str) throws IOException {
		dir = new File(fullpath + str);
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println(str + " ���丮�� �����߽��ϴ�.");
		} else {
			System.out.println("���� �̸��� ���丮�� �����մϴ�.");
		}
	}

	// ���丮 ���� �Լ�
	static void rmDir(String str) throws IOException {
		dir = new File(fullpath + str);
		if (dir.exists()) {
			if (dir.list().length == 0) {
				dir.delete();
				System.out.println(str + " ���丮�� �����߽��ϴ�.");
			} else {
				System.out.println(str + " ���丮 �ȿ� ������ �����մϴ�.");
			}
		} else {
			System.out.println("�ش� �̸��� ���丮�� �������� �ʽ��ϴ�.");
		}
	}
}
