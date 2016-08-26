import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Ex11_File_List {
	static int totalFiles = 0;
	static int totalDirs = 0;

	public static void main(String[] args) {
		// String[] args Ȱ��
		// cmd ���
		// java Ex11_File_List

		// ����� �Ķ���� ����
		if (args.length != 1) {
			System.out.println("����: java Ex11_File_List [path]");
			System.exit(0);
		}

		// ��� Ȯ��
		File f = new File(args[0]);
		if (!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���");
			System.exit(0);
		}
		printFileList(f);
		
	}
	static void printFileList(File dir) {
		System.out.println("[Full Path: "+dir.getAbsolutePath()+"]");
		//��������
		ArrayList<Integer> subDir=new ArrayList<Integer>();

		//���ϸ��
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
		
		System.out.println("���� ��ġ�� ���� ����: "+DirNum);
		System.out.println("���� ��ġ�� ���� ����: "+FileNum);
		System.out.println("****************************************");
		
		//c:\Temp�� ���������� �����ϸ� ������ �ʴ´�
		for (int j=0; j<subDir.size(); j++) {
			int index=subDir.get(j);
			printFileList(files[index]); //���ȣ��>�������� Ȯ��
			System.out.println("�� ���� ��: "+totalFiles);
			System.out.println("�� ���� ��: "+totalDirs);
		}

		//���ϻ���/����
		//f.createNewFile()
		//f.delete() ���ϻ���(�������� ���� ���� Ȯ��)
	}
}
