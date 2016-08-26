import java.io.File;

public class Ex09_File {
	public static void main(String[] args) {
		/*
		 * System.out.println(args[0]+" / "+args[1]);
		 * System.out.println("Main");
		 */
		if (args.length != 1) {
			System.out.println("java Ex09_File [���丮��]");
			System.exit(0);
		}

		// ��ȿ�� ���� ã��
		File f = new File(args[0]);
		if (!f.exists() | !f.isDirectory()) {
			System.out.println("���丮�� �ƴյ��.");
			System.exit(0);
		}

		// ��ȿ�� ���� �������� �ؼ� ���� �� ������ file �迭�ȿ� �ֱ�
		File[] files = f.listFiles();
		for (int i = 0; i < files.length; i++) {
			String name = files[i].getName();
			System.out.println(files[i].isDirectory() ? name + " <DIR>" : name);
		}
	}
}
