import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyDos2 {
	// 디폴트 위치 세팅(기본으로 c:\Temp\ 에서 작업)
	//static String defaultpath = "c:\\Temp\\";

	// 메인 함수(java MyDos mkdir|rmdir [폴더명] 식으로 실행)
	// args[0]에 명령어, args[1]에 폴더명을 입력받음
	public static void main(String[] args) throws IOException {
		prompt();
	}
	static String fullpath="C:\\";
	static File dir = new File(fullpath);
	
	static String[] input;
	//프롬포트
	static void prompt() throws IOException {
		System.out.print(dir.getPath()  +"> ");
		Scanner sc=new Scanner(System.in);
		input=sc.nextLine().split(" ");
		dosShell(input);
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
		case "cd":
			changeDir(args[1]); 
			break;
		case "cd..":
			changeDir(".."); 
			break;
		default:
			System.out.println("실행: mkdir [폴더명] 또는 rmdir [폴더명]");
			prompt();
		}
	}

	//디렉토리 이동 함수
	static void changeDir(String str) throws IOException {
		File f =new File(fullpath+"\\"+str);
		if (f.exists()) {
			if (str.equals("..")) {
				//경로 삭제
				fullpath=fullpath.substring(0,fullpath.lastIndexOf("\\"));
				dir=new File(fullpath);
			} else {
				//경로 추가
				fullpath=fullpath+"\\"+str;
				dir=new File(fullpath);
			} 
		} else {
			System.out.println("그런 디렉토리 없습니다.");
		}
		prompt();
	}

	// 디렉토리 생성 함수
	static void mkDir(String str) throws IOException {
		dir = new File(fullpath + str);
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println(str + " 디렉토리를 생성했습니다.");
		} else {
			System.out.println("같은 이름의 디렉토리가 존재합니다.");
		}
	}

	// 디렉토리 삭제 함수
	static void rmDir(String str) throws IOException {
		dir = new File(fullpath + str);
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
