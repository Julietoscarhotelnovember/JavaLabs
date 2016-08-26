import java.io.File;
import java.io.IOException;

public class MyDos {
	// 디폴트 위치 세팅(기본으로 c:\Temp\ 에서 작업)
	static String path = "c:\\Temp\\";

	// 메인 함수(java MyDos mkdir|rmdir [폴더명] 식으로 실행)
	// args[0]에 명령어, args[1]에 폴더명을 입력받음
	public static void main(String[] args) throws IOException {
		dosShell(args);
	}

	// mkdir rmdir 명령어 분기
	static void dosShell(String[] args) throws IOException {
		switch (args[0]) {
		case "mkdir":
			mkDir(args[1]);
			break;
		case "rmdir":
			rmDir(args[1]);
			break;
		default:
			System.out.println("실행: mkdir [폴더명] 또는 rmdir [폴더명]");
			System.exit(0);
		}
	}

	// 디렉토리 생성 함수
	static void mkDir(String str) throws IOException {
		File dir = new File(path + str);
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println(str + " 디렉토리를 생성했습니다.");
		} else {
			System.out.println("같은 이름의 디렉토리가 존재합니다.");
		}
	}

	// 디렉토리 삭제 함수
	static void rmDir(String str) throws IOException {
		File dir = new File(path + str);
		if (dir.exists()) {
			if (dir.list().length == 0) {
				dir.delete();
				System.out.println(str + " 디렉토리를 삭제했습니다.");
			} else {
				System.out.println(str + " 디렉토리 안에 파일이 존재합니다.");
			}
		} else {
			System.out.println("해당 이름의 디렉토리가 존재하지 않습니다.");
		}
	}
}
