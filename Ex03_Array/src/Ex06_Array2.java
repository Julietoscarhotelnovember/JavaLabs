class Car {
	int door;
	String color;
}

public class Ex06_Array2 {
	public static void main(String[] args) {
		// 2���� �迭
		int[][] score=new int[3][2];
		System.out.println(score[0][0]);
		/*score[0][0]=100;
		score[0][1]=200;
		score[1][0]=300;
		score[1][1]=400;
		score[2][0]=500;
		score[2][1]=600;*/
		int sum=100;
		for (int i=0; i<score.length; i++) { //.lengh�δ� 1������ ���̸� ���´�
			for (int j=0; j<score[i].length; j++) { //��Ʈ: ��-���� �������� �迭 �׸�
				score[i][j]=sum;
				sum+=100;		
			}
		}
		for (int i=0; i<score.length; i++) { //.lengh�δ� 1������ ���̸� ���´�
			for (int j=0; j<score[i].length; j++) { //��Ʈ: ��-���� �������� �迭 �׸�
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
		
		//�ٸ��� �迭�����2
		int[][] score2=new int[][] { {1, 2},
									 {3, 4},
									 {5, 6} };
		for (int i=0; i<score2.length; i++) { //.lengh�δ� 1������ ���̸� ���´�
			for (int j=0; j<score2[i].length; j++) { //��Ʈ: ��-���� �������� �迭 �׸�
				System.out.print(score2[i][j]+" ");
			}
			System.out.println();
		}
		
		//�ٸ��� �迭�����3
		int[][] score3={ {10, 20},
			             {30, 40},
			             {50, 60} };
		
		//���� �߿��� for��, ������ for��
		//C#: for (type ������ in �迭or�÷���) {���}
		//�ڹ�: for (type ������ : �迭or�÷���) {���} �����迭(����� ������ ��ȭ�ȴ�)->�÷���
		int[] arr={5, 6, 7, 8, 9, 10};
		//�Ϲ� ���
		/*for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		//������ for�� ���
		for (int i: arr) { //�����Ϸ��� �Ⱦ��մϴ�. ���������� while���� ������
						   //�迭�� ũ�⸦ �� �ʿ䰡 ����!
			System.out.print(" "+i); //i�� arr ����"��"�� ���������� �޾��ش�
		}
		
		String[] strarr={"��", "��", "��", "��"};
		for (String i: strarr) {
			System.out.print(" "+i);
		}
		
		//����-2���� ����� ������ for������ ����ϱ�????
		int[][] score4=new int[][] { {11, 12},
									 {13, 14},
									 {15, 16}};
		for (int[] i: score4) { //�࿡ ���� �迭�ּҸ� ���
			for (int j: i) {    //���� ���
				System.out.println(j);
			}
		}
		
		//////////////////////////
		Car[] carArr=new Car[2];
		
		carArr[0]=new Car();
		carArr[0].color="gold";
		carArr[0].door=4;
		carArr[1]=new Car();
		carArr[1].color="red";
		carArr[1].door=2;
		
		for (int i=0; i<carArr.length; i++) {
			System.out.println(carArr[i].color+" "+carArr[i].door);
		}
		for (Car c:carArr) { //��ü�� ������ for������
			System.out.println(c.color+" "+c.door); //Ư�̰�ü �迭 ��¿� ����
		}
		
		//�������迭
		//���� �����ϰ�, ���� �����Ѵ�
		int[][] arr4={{1, 2,}, {3, 4, 5}, {1}};
		for (int i=0; i<arr4.length; i++) { 
			for (int j=0; j<arr4[i].length; j++) { 
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
	}	
}
