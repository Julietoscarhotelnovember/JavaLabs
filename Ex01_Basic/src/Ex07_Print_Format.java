import java.util.Scanner; //.*�� �ǵ��� ���� ����. ���� ������ �ƴ϶� ������ ������
//C#������ using

public class Ex07_Print_Format {

	public static void main(String[] args) {
		//C#
		//println(); > Console.WriteLine();
		//print(); > Console.Write();
		//Console.ReadLine();
		System.out.println("�ϳ�");
		System.out.println("��");
		System.out.print("��"); //ĳ���� ���� ���� �ǵ�??
		System.out.print("��");
		System.out.println();
		System.out.print("�ټ�");
		System.out.println();
		
		//System.out.printf(format, args);
		//format (���Ĺ���)
		//%d (10���� ����)
		//%f (10���� �Ǽ�)
		//%s (���ڿ�)
		//%c (�ѹ���)
		//���Ǽ��� �����̸�, ��� ¥�� �������.
		int num=100;
		int num2=200;
		System.out.printf("���� num ���� %d �̴�.", num);
		System.out.println();
		System.out.println("���� num ���� "+num+" �̴�.");
		System.out.printf("���� num ���� %d �̰�, num2 ���� %d �̴�.", num, num2);
		
		int age=10;
		String name="ȫ�浿";
		System.out.printf("\n%s�� ���̴� %d��\t�Դϴ�.", name, age); //��, �ٹٲ�
		System.out.println();
		
		float f=3f;
		System.out.println(f); //�ǹ��� ���̰�????
		System.out.printf("f��: %f\n",f);
		
		//�Է¹ޱ�
		Scanner sc=new Scanner(System.in); //��ü���� sc, scanner�� �����ε�
		System.out.print("���ڸ� �Է��ϼ���: ");
		//int result=sc.nextInt(); ��Ŭ������ ���� ������ �����
		
		//���ڸ� ���ڷ� ��ȯ�ϱ�
		int result=Integer.parseInt(sc.nextLine()); //integer�� wrapperŬ����
		//�Ǽ����ڸ� ���ڷ�
		//Double.parseDouble(s)
		//Float.parseFloat(s)
		System.out.println("�Է°�: "+result);
		
		System.out.println("�̸�: ");
		String ename=sc.nextLine();
		System.out.println(ename);
		
		String str2="10000"; //������ ����
		int value=Integer.parseInt(str2);
		System.out.println(value);
		
		//���ڸ� ���ڷ�
		int value2=1000;
		String str=String.valueOf(value2);
		System.out.println(value2);
		
		
	}

}
