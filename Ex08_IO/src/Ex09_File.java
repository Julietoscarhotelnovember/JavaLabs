import java.io.File;

public class Ex09_File {
	public static void main(String[] args) {
		/*
		 * System.out.println(args[0]+" / "+args[1]);
		 * System.out.println("Main");
		 */
		if (args.length != 1) {
			System.out.println("java Ex09_File [디렉토리명]");
			System.exit(0);
		}

		// 유효한 폴더 찾기
		File f = new File(args[0]);
		if (!f.exists() | !f.isDirectory()) {
			System.out.println("디렉토리가 아닙디다.");
			System.exit(0);
		}

		// 유효한 폴더 뒤적뒤적 해서 폴더 및 파일을 file 배열안에 넣기
		File[] files = f.listFiles();
		for (int i = 0; i < files.length; i++) {
			String name = files[i].getName();
			System.out.println(files[i].isDirectory() ? name + " <DIR>" : name);
		}
	}
}
