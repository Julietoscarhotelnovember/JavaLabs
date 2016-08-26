import java.io.File;

//File Ŭ����
//���ϰ� ������ �ٷ��
//MS�� File, Directory�� ������ ���Ҵ�

//���ο� ����/������ ����, ����, ����
//�� �󿡼��� ���� ���� ���ε� � ���δ�


public class Ex08_File {
	public static void main(String[] args) {
		String path="c:\\Temp\\aaa\\aaa.txt";
		File f=new File(path);
		
		//File Ŭ������ ���� ���� �� �� �ִ�
		String filename=f.getName();
		System.out.println(filename);
		
		//������ �̸�, Ȯ���� ��������
		//split substrign?
		int pos=filename.indexOf(".");
		System.out.println("���ϸ�: "+filename.substring(0, pos));
		System.out.println("Ȯ����: "+filename.substring(++pos));
		
		//File Ŭ������ ������ �ִ� �Լ�
		System.out.println("��ü���: "+f.getPath());
		//System.out.println("������: "+f.getAbsolutePath());
		System.out.println("������? "+f.isDirectory());
		System.out.println("����E��? "+f.isFile());
		System.out.println("���� ũ��: "+f.length()+"byte");
		System.out.println("�θ���: "+f.getParent()); //������ ������ ����� ����
		System.out.println("������ ������ ���� ����: "+f.exists());
		
		
	}
}
