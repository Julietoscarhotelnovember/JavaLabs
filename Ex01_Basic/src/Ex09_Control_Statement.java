
public class Ex09_Control_Statement {

	public static void main(String[] args) {
		//���
		//1~100������ �� ���ϱ�
		int sum=0;
		for (int i=1; i<=100; i++) {
			//System.out.println(i);
			sum+=i;
		}
		System.out.println("1~100������ ��: "+sum);
		//���糯 ���� ����ġ ���躻�ٰ�?
		
		int sum2=0;
		for(int i=1; i<=100; i+=2) { //���������� ������� �� �� �ִ�
			sum2+=i; //Ȧ���� ��
		}
		System.out.println("1~100���� Ȧ���� ��: "+sum2);
		
		//for, if�� Ȱ���� ¦���� ��
		int sum3=0;
		for (int i=1; i<=100; i++) {
			if (i%2==0) {
				sum3+=i;
			}
		}
		System.out.println("1~100���� ¦���� ��: "+sum3);
		
		//��ø for���� �߿�
		//������ 2��~9�ܱ��� ���
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}
		
		//for�� ��ģ continue, break
		//continue�� ���� ���� skip
		System.out.println();
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				if (i==j) continue;
				System.out.printf("%d * %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}
		//break�� �� Ż��
		System.out.println();
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				if (i==j) break;
				System.out.printf("%d * %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}
		
		//���� ����� �����ϱ�
		System.out.println();
		for(int i=2; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				if(i==j) break;
				System.out.print("*");
			}
			System.out.println();
		}
		
		//�ڷᱸ������ ���� ���̴� ����
		for (int i=2; i<=9; i++) {
			for (int j=1; j<i; j++) { //���ǽ����� �ϱ�
				System.out.print("*");
			}
			System.out.println();
		}
		
		//�Ǻ���ġ ����
		int p1=1;
		int p2=1;
		int p3=0;
		for (int i=1; i<=100; i++) {
			p1=p2;
			p2=p3;
			p3=p1+p2;
			System.out.println(p3);
		}
	}

}
