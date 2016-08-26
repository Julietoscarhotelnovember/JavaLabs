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
    static String path1 = "C:\\Temp\\"; // path �⺻
    static String path2 = "C:\\Temp\\"; // path ����
    String input1;
    static String input2;
    static String[] split1; // Ȯ���� �и� �̿� ���� �迭
    static String[] split2; // Ȯ���� �и� �̿� ���� �迭
    String[] cd1;
    String[] cd2;
    static String Menu; // �޴����� ����
    int i;
 
    public dos() {
        ar1[0] = "C:\\"; // �⺻ �޴�
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
            System.out.println("Dos�� �����մϴ�");
            System.exit(0);
        case "help":
            System.out.println("*********************5�� Java Dos ����*********************");
            System.out.println("���� �� �ٸ� ���� �̵� : cd [������] / ���� ���� �̵� cd..");
            System.out.println("���� �� ���� �� ���� �˻� : �˻��ϰ��� �ϴ� ���� ������ dir �Է�");
            System.out.println("����: mkdir [������] �Ǵ� rmdir [������]");
            System.out.println("���� �̸� �ٲٱ� : rm �Է� �� �����ϰ��� �ϴ� ���ϸ� �Է� �� �����ϰ��� �ϴ� �̸� �Է�");
            System.out.println("�ؽ�Ʈ �б� : read �Է� �� �а��� �ϴ� �ؽ�Ʈ ���� �̸� �Է�");
            break;
        default:
            System.out.println("********************�Ʒ��� ���� �̿��� ������********************");
            System.out.println("���� �� �ٸ� ���� �̵� : cd [������] / ���� ���� �̵� cd..");
            System.out.println("���� �� ���� �� ���� �˻� : �˻��ϰ��� �ϴ� ���� ������ dir �Է�");
            System.out.println("����: mkdir [������] �Ǵ� rmdir [������]");
            System.out.println("���� �̸� �ٲٱ� : rm �Է� �� �����ϰ��� �ϴ� ���ϸ� �Է� �� �����ϰ��� �ϴ� �̸� �Է�");
            System.out.println("�ؽ�Ʈ �б� : read �Է� �� �а��� �ϴ� �ؽ�Ʈ ���� �̸� �Է�");
        }
    }
 
    // ���� �̸� ����
    /////////////////////////////////////////////////////////////////////////////
    private static void rename(String[] args) {
        System.out.println("�̸��� �����Ͻð��� �ϴ� ���ϸ��� Ȯ���ڱ��� �Է��ϼ���");
        String input1 = sc.nextLine();
        split1 = input1.split("\\.");
        path1 = path1 + "\\" + input1;
        File files1 = new File(path1);
        System.out.println("�����Ͻð��� �ϴ� ���� �̸��� Ȯ���ڱ��� �Է��� �ּ���");
        String input2 = sc.nextLine();
        split2 = input2.split("\\.");
        path2 = path2 + "\\" + input2;
        File files2 = new File(path2);
 
        if (!split1[1].equals(split2[1])) {
            System.out.println("Ȯ���ڰ� �ٸ��� �����Ͻ� �� �����ϴ�. �ٽ� Ȯ���� �ּ���");
        } else {
            files1.renameTo(files2);
            System.out.println("�̸� ���� �Ϸ�. ����� �̸��� : " + input2);
        }
    }
 
    // cd ���...*****************************************
    ////////////////////////////////////////////////////////////
    static void cdpre() throws IOException {
        File dir = new File(path2);//
        path2 = dir.getParent() + "\\";
        // System.out.println(path2);
        // C:// �ڷΰ��� �ּ�
        if (path2.equals("null\\")) {
            path2 = "C:\\";
        }
    }
 
    // cd ��� *****************************************
    //////////////////////////////////////////////////////////
    static void cd(String str) throws IOException {
        String temp = path2;
        path2 += str + "\\";
        File dir = new File(path2);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("������ ��θ� ã�� �� �����ϴ�.");
            path2 = temp;
 
        }
        // System.out.println(dir.getPath());
    }
 
    // DOS ���� �Լ�
    ////////////////////////////////////////////////////////
    public void first(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        System.out.print(path2 + ">");
        // File f = new File(path2);
        String cc = sc.nextLine();
        args = cc.split(" ");
        menuSelect(args);
    }
 
    // ���͸� ����
    /////////////////////////////////////////////////////////////////////////////
    static void mkDir(String str) throws IOException {
        File dir = new File(path2 + str);
        if (!dir.exists()) {
            dir.mkdirs();
            System.out.println(str + " ���丮�� �����߽��ϴ�.");
        } else {
            System.out.println("���� �̸��� ���丮�� �����մϴ�.");
        }
    }
 
    // ���丮 ���� �Լ�
    static void rmDir(String str) throws IOException {
        File dir = new File(path2 + str);
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
 
    // ���� ���� �б�
    /////////////////////////////////////////////////////////////////////////////
    public static void Read(String[] args) {
        System.out.println("�ҷ��� �ؽ�Ʈ ex)" + "kor.txt");
        System.out.print("������" + "\\" + "\\" + "���ϸ�.Ȯ��� : ");
        String name = sc.nextLine();
        File dir = new File(path2 + name);
        if (!dir.exists() || !dir.isFile()) {
            System.out.println("��ȿ���� ���� �����Դϴ� ��");
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
 
    // dir ���
    //////////////////////////////////////////////////////////////////////////
    static public void dir(String[] args) {
        File f = new File(path2);
        System.out.println(path2);
        if (!f.exists() || !f.isDirectory()) {
            System.out.println("��ȿ���� ���� ���丮 �Դϴ�");
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

