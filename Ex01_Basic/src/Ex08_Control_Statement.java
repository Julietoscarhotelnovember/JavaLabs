import java.util.Scanner;

public class Ex08_Control_Statement {

	public static void main(String[] args) {
		// ����
		// ������ ��Ģ����� �����(+, -, *, /)
		// �Է°� 3��(����, �����ȣ, ����)
		// ���� ����� System.out.printf()�� ����ؼ� ���
		// ��Ʈ: ���� if, �Է°� Scanner, �⺻ nextLine()��ȯ
		// ��Ʈ ���ڿ� �񱳴� ==�� �ȵ� > String str="A" > str.equals("A")
		Scanner sc=new Scanner(System.in);
		System.out.print("ó�� ���ڸ� �Է��ϼ���: ");
		int num1=Integer.parseInt(sc.nextLine());
		System.out.print("�����ڸ� �Է��ϼ���: ");
		String cal=sc.nextLine();
		System.out.print("���� ���ڸ� �Է��ϼ���: ");
		int num2=Integer.parseInt(sc.nextLine());
		int sum=0;
		System.out.printf("%d %s %d �� ��� �մϴ�.\n", num1, cal, num2);
		
		/*if (cal.equals("+")){  //���ڿ� ��
			sum=num1+num2;
		} else if (cal.equals("-")) {
			sum=num1-num2;
		} else if (cal.equals("*")) {
			sum=num1*num2;
		} else if (cal.equals("/")) {
			sum=num1/num2;
		} else {
			System.out.println("�߸� �Է���");
			return;  //�̷��� �ϸ� ���α׷��� ����ȴ�. return�� �Լ� ���� �����̱� ������
		}*/
			
		switch (cal) {
			case "+":
				sum=num1+num2;
				break;
			case "-":
				sum=num1-num2;
				break;
			case "*":
				sum=num1*num2;
				break;
			case "/":
				sum=num1/num2;
				break;
			default:
				System.out.println("�߸� �Է���");
				return;
		}
		System.out.println("���: "+sum);
	}

}
