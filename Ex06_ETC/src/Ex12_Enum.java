import java.awt.Color;

//�ý��� ��ü�� ���Ǵ� ��Ģ���� �ڿ�
//������ �ִ� ������ ���� ǥ��
//ex)��~��, ����, ����, �ڵ强 ������
enum Season2 {
	SPRING, SUMMER, AUTUMN, WINTER
}
class KostaInfo {
	String classcode;
	String classname;
	Season2 kostaseason; //������ �߿� 1���� ���� ������
	
	KostaInfo(String classcode, String classname, Season2 kostaseason) {
		this.classcode=classcode;
		this.classname=classname;
		this.kostaseason=kostaseason;
	}
	
}
public class Ex12_Enum {
	public static void main(String[] args) {
		KostaInfo javaclass=new KostaInfo("129th", "java", Season2.SUMMER);
		System.out.println("���: "+javaclass.classcode);
		System.out.println("���: "+javaclass.classname);
		
		//�ڹ�api���� �����Ǵ� ������ �ڷ�
		//Color.BLACK;
	}
}
