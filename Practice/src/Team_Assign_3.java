import java.util.Scanner;

public class Team_Assign_3 {

	public static void main(String[] args) {
		
		//���������� �Է¹ޱ�
		Scanner sc=new Scanner(System.in);
		System.out.print("�Է�: ");
		String inputdata=sc.nextLine();
		System.out.printf("����� %s �� �½��ϴ�\n", inputdata);
		
		//����-1 ����-2 ��-3 ���� ��ȯ
		int num=0;
		if (inputdata.equals("����")) {
			num=1;
		} else if (inputdata.equals("����")) {
			num=2;
		} else if (inputdata.equals("��")) {
			num=3;
		}

		//1~3 ����
		int com;
		while (true) {
			com=(int)(Math.random()*10+1);
			if (com<=3 && com>=1)
				break;
		}
		
		//��ǻ�� ���
		if (com==1) {
			inputdata="����";
		} else if (com==2) {
			inputdata="����";
		} else if (com==3) {
			inputdata="��";
		}
		System.out.printf("��ǻ�ʹ� %s �� �½��ϴ�\n", inputdata);
		
		//�Ǵ�
		if (num==com) {
			System.out.println("�����ϴ�");
		} else if (num==1 & com==2) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�");
		} else if (num==1 & com==3) {
			System.out.println("����� �̰���ϴ�");
		} else if (num==2 & com==1) {
			System.out.println("����� �̰���ϴ�");
		} else if (num==2 & com==3) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�");
		} else if (num==3 & com==1) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�");
		}  else {
			System.out.println("����� �̰���ϴ�");
		}
	}
}
