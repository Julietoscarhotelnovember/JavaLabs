import java.io.File;
import java.io.IOException;

public class MyDos {
	// ����Ʈ ��ġ ����(�⺻���� c:\Temp\ ���� �۾�)
	static String path = "c:\\Temp\\";

	// ���� �Լ�(java MyDos mkdir|rmdir [������] ������ ����)
	// args[0]�� ��ɾ�, args[1]�� �������� �Է¹���
	public static void main(String[] args) throws IOException {
		dosShell(args);
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
		default:
			System.out.println("����: mkdir [������] �Ǵ� rmdir [������]");
			System.exit(0);
		}
	}

	// ���丮 ���� �Լ�
	static void mkDir(String str) throws IOException {
		File dir = new File(path + str);
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println(str + " ���丮�� �����߽��ϴ�.");
		} else {
			System.out.println("���� �̸��� ���丮�� �����մϴ�.");
		}
	}

	// ���丮 ���� �Լ�
	static void rmDir(String str) throws IOException {
		File dir = new File(path + str);
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
