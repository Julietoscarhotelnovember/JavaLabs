import java.util.Scanner;

public class Ex10_Control_statement {

	public static void main(String[] args) {
		// �ݺ��� while
		// while(), do while()
		int i=10;
		while (i>=10) {  //������ false�� �� ������ ����
			System.out.println("i: "+i);
			i--;
		}
		//1~100������ ��
		int sum=0;
		int j=0;
		while (j<=100) {  //������ false�� �� ������ ����
			sum+=j;
			//System.out.println("j: "+j);
			j++; //������ ���� �޶���
		}
		System.out.println("1~100������ ��: "+sum);
		
		//while���� �̿��� ������ ���
		//������ Ȱ�������� ���� ����
		int k=2;
		int l=1;
		while (k<=9) {
			l=1; //�߿�!! �ʱ�ȭ �ؾ� �Ѵ�, for��ó�� ���ú����� ����� �� ����???
			while (l<=9) {
				System.out.printf("%d * %d = %d\t", k, l, k*l);
				l++;
			}
			k++;
			System.out.println();
		}
		
		//do{���๮} while(���ǽ�): 1ȸ ������ ����
		//�޴� ���� � ����
		//1. �λ� 2. �޿� �׿ܹ�ȣ �Է½� �޴��ʱ�ȭ -> �ǵ��ϴ� ���ڸ� �Է��ϵ��� ������ �� �ִ�.
		
		Scanner sc=new Scanner(System.in);
		int inputdata=0;
		do {
			System.out.print("�����Է�: ");
			inputdata=Integer.parseInt(sc.nextLine());
		} while (inputdata>10);
			System.out.println("����� �Է��� ���ڴ�: "+inputdata);
		}
	}
