import java.util.Properties;

//Map�� ����
//Ư���� Map ���� <String, String>
//���ø����̼��� ����Ӽ�(ȯ�溯��)�� �����ϴµ� ���
//�Ӽ��� ����/�����ϵ��� ����Ǿ� ����
//������ property ������ ���� ���� ����
//�ٱ��� ó�� ����

//ex)200���� ������Ʈ �ϴܿ� ������ email �ּ� �ֱ�
public class Ex17_Properties {
	public static void main(String[] args) {
		Properties prop=new Properties();
		prop.setProperty("master", "admin@master.com");
		prop.setProperty("lang", "kr");
		prop.setProperty("ver", "1.01");
		prop.setProperty("DefaultPath", "c:/naver/dotcom");
		System.out.println("������Ʈ �ϴ�: "+prop.getProperty("master"));
		System.out.println(prop.getProperty("ver"));

	}
}
