//String ���� �ÿ� int, float ��� ������ ���� �������
//String Ŭ������ ���������� char[]���� �����Ѵ�
//String name="ȫ�浿" > [ȫ][��][��] > length �� �迭 �ڿ� �״�� ��� ���� 
public class Ex05_String {
	public static void main(String[] args) {
		String str1="AAA";
		String str2="AAA";
		System.out.println(str1+"/"+str2);
		System.out.println(str1==str2); //���� ���� ���� �ּҸ� ����Ų�� +���� ����
		System.out.println("�� ��: "+str1.equals(str2));
		
		System.out.println();
		String str3=new String("BBB");
		String str4=new String("BBB");
		System.out.println(str3+"/"+str4);
		System.out.println("�ּҰ� ��: "+str3==str4);
		System.out.println("�� ��: "+str3.equals(str4));
	}
}
