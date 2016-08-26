/*
 * Ÿ��: �ڷ���
 * 8���� �⺻Ÿ��
 * ���� -> ���� -> byte(��Ʈ��ũ ��Ŵ����� ���)
 * 			    char(�ѹ���:2byte) : '��', 'a'
 * 				short(c��� ȣȯ)
 * 				int(4byte:������ �⺻Ÿ��,�ڹٿ��� ������ �⺻��)(-21��~21��)
 * 				long(8byte:int���� ū���� ���� ��)
 *    -> �Ǽ� -> float(4byte)
 *    			double(8byte,�⺻Ÿ��)
 * �� -> boolean(true, false) -> ���α׷��� �帧����
 * 
 */
public class Ex02_BasicType {

	public static void main(String[] args) {
		int i, j, k;
		i = 100;
		j = 200;
		k = 300;
		System.out.println(i + " : " + j + " : " + k);
		i = 1000000000;
		//int vs long
		//int num = 10000000000;
		//long num2 = 10000000000; //�ڹ� ���� �⺻Ÿ���� int�� �ν���
		long num2 = 10000000000L; //���̻�L�� ���� long Ÿ������ ����ؾ� ��
		System.out.println("long num2 : " + num2);
		
		//String�� ��� String Ŭ���� Ÿ���̴�.
		//�׳� int ���� ���ڿ� ��� Ÿ������ ����
		//���ڿ� �Է��� ""
		String name = "������";
		System.out.println(name);
		
		//char Ÿ�� �Է��� ''
		//unicodeü���� ���󰡱� ������ ������ 2byte ���
		//char�� ����Ÿ���̶� int�� ȣȯ �����ϴ�
		char single = '��';
		char c = 'a';
		//Ư������ ����ϱ�� \��
		//ex) c:\Temp
		char sing = '\'';
		System.out.println(sing);
		
		String str = "ȫ\"��\"��";
		System.out.println(str);
		
		String str2 = "1000";
		String str3 = "100";
		System.out.println(str2+str3);
		
		//��������
		//��Ʈ�� Ÿ������ �ٲ۴�
		System.out.println("100"+100); //100100
		System.out.println(100+"100"); //100100
		System.out.println(100+100+"100"); //200100
		System.out.println(100+"100"+100); //100100100
		
		//��������
		//c:\\utils
		//c:\\Temp
		//String Ÿ���� ����ؼ� �� ���ڿ��� ����غ�����.
		String path1 = "c:\\\\utils";
		String path2 = "c:\\\\Temp";
		System.out.println(path1+" "+path2);
		
		//��Ÿ��
		//�帧����
		boolean power = true;
		System.out.println(power);
		power = !power; //���������� !
		System.out.println(power);
		
		//char�� �����ڵ� 2byte -> �� ���ڸ� ǥ���� �� �ִ�(����,�ѱ� �������)
		//��Ģ : �ѱ� 2byte, ����,����,���� 1byte
		//ǥ���� ''�� ���
		//����! ���ڿ��� "", �ѹ��ڴ� ''
		
		//char�� ���������� �������� ������ �ִ� -> ���� Ÿ�԰� ȣȯ ����
		//������ -> �ѹ��� or �ѹ��� -> ������ ��ȯ ���� (�ƽ�Ű�ڵ�ǥ 10������ �̿��Ͽ�)
		
		char ch = 'a';
		System.out.println(ch);
		char ch2 = '��';
		char ch3 = '1';
		int cint = 65;
		char ch4 = (char)cint; //����� ����ȯ, int�� char�� �ٲٰڴ�
		System.out.println(ch4);
		
		int cint2 = ch4; //int�� char���� ũ�� ������ ����� ����ȯ ����
		//��� ������ ����ȯ�� �Ͼ�� (int)ch4 �Ͻ��� ����ȯ char -> int
		//��Ŀ�� ���� ���
		//100/100 -> 100/500 �Ͻ��� ����ȯ�� �߻�
		//100/500 -> 100/100 ����� ����ȯ�� �ؾ� ��
		//�� �� ������ �������� ���� �ƴ϶� Ÿ���� ����...
		//char�� ���ڸ� ������ ����Ÿ���̴�.
		System.out.println("cint2 : " + cint2);
		
		//�Ǽ�
		//float(4): �Ҽ� 7�ڸ� ���е�
		//double(8): �⺻Ÿ��(default): �Ҽ� 16�ڸ� ���е�
		
		//3.14 > default double
		float f = 3.14F; //���̻� ���̱�
		double d = 3.14;
		
		//��ȿ������ �Ѿ�� �ݿø��Ѵ�
		float f2 = 1.123456789f;
		System.out.println(f2);
		
		double d2 = 1.123456789123456789;
		System.out.println(d2);
		
		double d3 = (double)100; //�⺻�� int, double > int�� ���� �ȳ�, �Ͻ��� ����ȯ
		System.out.println(d3);
		int i4 = 100;
		//Quizzzz
		//int result = i4 + d3;
		//int + double�� ū���� ���󰣴� int->double��
		double result1 = (double)i4 + d3; //�̰��� �� ���� ���
		int result2 = i4 + (int)d3; //������ �ս��� ������ �ִ�
		
		//������ ��������
		//����Ÿ��+ūŸ�� = ūŸ��
		//�������� �̰� �ȵ�, ������ Ÿ�԰� ����ȯ�� ����
		//int i5 = 100;
		//byte b2 = i5; //byte�� -128~127���� ����, 2�� 7��
		
		//�̰ǵȴ�
		byte b3 = 20;
		int i6 = b3; //�Ͻ��� ����ȯ int i6 = (int)b3
		
		
		
	}

}
