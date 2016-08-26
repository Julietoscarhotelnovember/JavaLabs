package MyDos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
 
public class dos {
    static String[] ar1 = new String[2];
 
    List<File> array = new ArrayList<File>();
    static Scanner sc = new Scanner(System.in);
    static String path1 = "C:\\Temp\\"; // path 기본
    static String path2 = "C:\\Temp\\"; // path 보조
    String input1;
    static String input2;
    static String[] split1; // 확장자 분리 이용 메인 배열
    static String[] split2; // 확장자 분리 이용 보조 배열
    String[] cd1;
    String[] cd2;
    static String Menu; // 메뉴선택 변수
    int i;
 
    public dos() {
        ar1[0] = "C:\\"; // 기본 메뉴
        ar1[1] = null;
    }
 
    public static void menuSelect(String[] args) throws IOException {
        switch (args[0]) {
        case "cd":
            cd(args[1]);
            break;
        case "cd..":
            cdpre();
            break;
        case "dir":
            dir(args);
            break;
        case "rm":
            rename(args);
            return;
        case "mkdir":
            mkDir(args[1]);
            break;
        case "rmdir":
            rmDir(args[1]);
            break;
        case "read":
            Read(args);
            break;
        case "exit":
            System.out.println("Dos를 종료합니다");
            System.exit(0);
        case "help":
            System.out.println("*********************5조 Java Dos 사용법*********************");
            System.out.println("폴더 내 다른 폴더 이동 : cd [폴더명] / 이전 폴더 이동 cd..");
            System.out.println("폴더 내 폴더 및 파일 검색 : 검색하고자 하는 폴더 내에서 dir 입력");
            System.out.println("실행: mkdir [폴더명] 또는 rmdir [폴더명]");
            System.out.println("파일 이름 바꾸기 : rm 입력 후 변경하고자 하는 파일명 입력 후 변경하고자 하는 이름 입력");
            System.out.println("텍스트 읽기 : read 입력 후 읽고자 하는 텍스트 파일 이름 입력");
            break;
        default:
            System.out.println("********************아래와 같이 이용해 보세요********************");
            System.out.println("폴더 내 다른 폴더 이동 : cd [폴더명] / 이전 폴더 이동 cd..");
            System.out.println("폴더 내 폴더 및 파일 검색 : 검색하고자 하는 폴더 내에서 dir 입력");
            System.out.println("실행: mkdir [폴더명] 또는 rmdir [폴더명]");
            System.out.println("파일 이름 바꾸기 : rm 입력 후 변경하고자 하는 파일명 입력 후 변경하고자 하는 이름 입력");
            System.out.println("텍스트 읽기 : read 입력 후 읽고자 하는 텍스트 파일 이름 입력");
        }
    }
 
    // 파일 이름 변경
    /////////////////////////////////////////////////////////////////////////////
    private static void rename(String[] args) {
        System.out.println("이름을 변경하시고자 하는 파일명을 확장자까지 입력하세요");
        String input1 = sc.nextLine();
        split1 = input1.split("\\.");
        path1 = path1 + "\\" + input1;
        File files1 = new File(path1);
        System.out.println("변경하시고자 하는 파일 이름을 확장자까지 입력해 주세요");
        String input2 = sc.nextLine();
        split2 = input2.split("\\.");
        path2 = path2 + "\\" + input2;
        File files2 = new File(path2);
 
        if (!split1[1].equals(split2[1])) {
            System.out.println("확장자가 다를시 변경하실 수 없습니다. 다시 확인해 주세요");
        } else {
            files1.renameTo(files2);
            System.out.println("이름 변경 완료. 변경된 이름은 : " + input2);
        }
    }
 
    // cd 기능...*****************************************
    ////////////////////////////////////////////////////////////
    static void cdpre() throws IOException {
        File dir = new File(path2);//
        path2 = dir.getParent() + "\\";
        // System.out.println(path2);
        // C:// 뒤로가기 최소
        if (path2.equals("null\\")) {
            path2 = "C:\\";
        }
    }
 
    // cd 기능 *****************************************
    //////////////////////////////////////////////////////////
    static void cd(String str) throws IOException {
        String temp = path2;
        path2 += str + "\\";
        File dir = new File(path2);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("지정된 경로를 찾을 수 없습니다.");
            path2 = temp;
 
        }
        // System.out.println(dir.getPath());
    }
 
    // DOS 시작 함수
    ////////////////////////////////////////////////////////
    public void first(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        System.out.print(path2 + ">");
        // File f = new File(path2);
        String cc = sc.nextLine();
        args = cc.split(" ");
        menuSelect(args);
    }
 
    // 디렉터리 생성
    /////////////////////////////////////////////////////////////////////////////
    static void mkDir(String str) throws IOException {
        File dir = new File(path2 + str);
        if (!dir.exists()) {
            dir.mkdirs();
            System.out.println(str + " 디렉토리를 생성했습니다.");
        } else {
            System.out.println("같은 이름의 디렉토리가 존재합니다.");
        }
    }
 
    // 디렉토리 삭제 함수
    static void rmDir(String str) throws IOException {
        File dir = new File(path2 + str);
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
 
    // 파일 내용 읽기
    /////////////////////////////////////////////////////////////////////////////
    public static void Read(String[] args) {
        System.out.println("불러올 텍스트 ex)" + "kor.txt");
        System.out.print("폴더명" + "\\" + "\\" + "파일명.확장명 : ");
        String name = sc.nextLine();
        File dir = new File(path2 + name);
        if (!dir.exists() || !dir.isFile()) {
            System.out.println("유효하지 않은 파일입니다 ㅋ");
            // System.exit(0);
        } else {
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(dir);
                br = new BufferedReader(fr);
                String line = "";
                for (int i = 0; (line = br.readLine()) != null; i++) {
                    System.out.println(line);
                }
 
            } catch (Exception e) {
                System.out.println(e.getMessage());
 
            } finally {
                try {
                    br.close();
                    fr.close();
 
                } catch (IOException e) {
 
                    e.printStackTrace();
                }
 
            }
 
        }
    }
 
    // dir 기능
    //////////////////////////////////////////////////////////////////////////
    static public void dir(String[] args) {
        File f = new File(path2);
        System.out.println(path2);
        if (!f.exists() || !f.isDirectory()) {
            System.out.println("유효하지 않은 디렉토리 입니다");
            // System.exit(0);
        }
 
        File[] files = f.listFiles();
 
        for (int i = 0; i < files.length; i++) {
            // System.out.println(files[i]);
            File file = files[i];
            String name = file.getName();
            // System.out.println(file.getName());
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mma");
            String attribute = "";
            String Size = "";
 
            // file[] > file, Directory
            if (file.isDirectory()) {
                attribute = "<DIR>";
            } else {
                Size = "\t" + file.length() + "Byte";
                // attribute = file.canRead() ? "R" : "";
                // attribute = file.canWrite() ? "W" : "";
                // attribute = file.isHidden() ? "H" : "";
            }
            System.out.printf("%s  %3s %10s %s \n", df.format(new Date(file.lastModified())), attribute, Size, name);
        }
 
    }
}

