
public class Ex02_ArrayBasic_Quiz {

	public static void main(String[] args) {
		//���а� �л��� �⸻��� ����
		int[] score=new int[]{79,88,97,54,56,95};
		int max=score[0];
		int min=score[0];
		
		//����: max�� ���� ���� ������ ���, min�� ���� ���� ������ ��ƶ�.
		for (int i=0; i<score.length; i++) {
			/*if (max<score[i]) {
				max=score[i];
			}
			if (min>score[i]) {
				min=score[i];
			}*/
			//���׿�����
			max=(max<score[i])? score[i]:max;
			min=(min>score[i])? score[i]:min;
		}
		System.out.println("�ְ�����: "+max);
		System.out.println("��������: "+min);
		
		//Quiz
		int [] number=new int[10];
		//������ �迭���� ���� 1~10������ �ʱ�ȭ �ϱ�
		for (int i=0; i<number.length; i++) {
			number[i]=i+1;
			System.out.printf("number[%d]=%d\n",i,number[i]);
		}
		
		//Quiz
		int sum=0;
		float average=0f;
		int[] jumsu={100,55,90,60,78};
		//�� �л���
		//�������� ��
		//�������� ��� ���
		int count=jumsu.length;
		for (int i=0; i<count; i++) {
			sum+=jumsu[i];
		}
		average=(((float)(sum))/(count));
		System.out.printf("�л���: %d �հ�: %d ���: %f\n",
				count, sum, average);
		
		//Quiz
		int[] rndnum=new int[10];
		for (int i=0; i<rndnum.length; i++) {
			rndnum[i]=i;
		}
		//rndum �迭�� ����ִ� ���� �������� ���� ���
		for (int i=0; i<100; i++) {
			int n=(int)(Math.random()*10);
			int temp=rndnum[0];
			rndnum[0]=rndnum[n];
			rndnum[n]=temp;
		}
		for (int i=0; i<10; i++) {
			System.out.print(rndnum[i]+" ");
		}
		System.out.println();
		
		//���ΰ���
		//���ܷζ� �ۼ��ϱ�
		//1.1~45���� ����, 6�� �迭
		//2.�ߺ� �ȵ�
		//3.������������
		
		//���߿� Ŭ������ȯ
		//�����߰�: 35 < 6�� �� < 45
		//��������: ���� ��ȣ ���� ������
		
		//1~45������ �迭 ä���
		int[] rndn=new int[6];
		for (int i=0; i<rndn.length; i++) {
			rndn[i]=(int)(Math.random()*45+1);
		}
		//�ߺ�����
		for (int i=0; i<rndn.length; i++) {
			for (int j=i+1; j<rndn.length; j++) {
				while (rndn[i]==rndn[j]) {
					rndn[j]=(int)(Math.random()*45+1);
				}
			}
		}
		//�������� ����
		for (int i=0; i<rndn.length; i++) {
			for (int j=0; j<rndn.length; j++) {
				if (rndn[i]<rndn[j]) {
					int temp=rndn[i];
					rndn[i]=rndn[j];
					rndn[j]=temp;
				}
			}
		}
		//���
		for (int i=0; i<rndn.length; i++) {
			System.out.print(rndn[i]+" ");
		}
	}
}
