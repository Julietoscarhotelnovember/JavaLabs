import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Ex11_File_List {
	static int totalFiles = 0;
	static int totalDirs = 0;

	public static void main(String[] args) {
		// String[] args 활용
		// cmd 모드
		// java Ex11_File_List

		// 실행시 파라미터 강제
		if (args.length != 1) {
			System.out.println("실행: java Ex11_File_List [path]");
			System.exit(0);
		}

		// 경로 확인
		File f = new File(args[0]);
		if (!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 경로");
			System.exit(0);
		}
		printFileList(f);
		
	}
	static void printFileList(File dir) {
		System.out.println("[Full Path: "+dir.getAbsolutePath()+"]");
		//하위폴더
		ArrayList<Integer> subDir=new ArrayList<Integer>();

		//파일목록
		File[] files=dir.listFiles();
		
		for (int i=0; i<files.length; i++) {
			File file=files[i];
			String filename=file.getName();
			
			if (files[i].isDirectory()) {
				filename="<DIR>"+" ["+filename+"]";
				subDir.add(i);
			} else {
				filename=filename+" / "+files[i].length()+"Byte";
			}
			System.out.println(filename);
		}
		int DirNum=subDir.size();
		int FileNum=files.length-DirNum;
		
		totalDirs+=DirNum;
		totalFiles+=FileNum;
		
		System.out.println("현재 위치의 폴더 개수: "+DirNum);
		System.out.println("현재 위치의 파일 개수: "+FileNum);
		System.out.println("****************************************");
		
		//c:\Temp에 하위폴더를 생성하면 나오지 않는다
		for (int j=0; j<subDir.size(); j++) {
			int index=subDir.get(j);
			printFileList(files[index]); //재귀호출>하위폴더 확인
			System.out.println("총 파일 수: "+totalFiles);
			System.out.println("총 폴더 수: "+totalDirs);
		}

		//파일생성/삭제
		//f.createNewFile()
		//f.delete() 파일삭제(하위폴더 삭제 여부 확인)
	}
}
