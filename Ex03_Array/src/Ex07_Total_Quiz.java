public class Ex07_Total_Quiz {
	public static void main(String[] args) {
		int[][] score={
				{50, 60, 40}, //ö���� ��, ��, ��
				{100, 80, 70}, //������ ��, ��, ��
				{55, 60, 80} //������ ��, ��, ��
		};
	//����
	//1.�� ���� ����, ��� ���ϱ�
	//2.�� �л��� ����, ��� ���ϱ�
		int[] sum=new int[score.length];
		float[] avg=new float[score.length];

		//����
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
				sum[i]+=score[j][i];
			}
		}
		for (int i=0; i<sum.length; i++) {
			avg[i]=(float)sum[i]/sum.length;
		}
		System.out.println("���� ����");
		System.out.println("��: "+sum[0]+" ��: "+sum[1]+" ��: "+sum[2]);
		System.out.println("���� ���");
		System.out.println("��: "+avg[0]+" ��: "+avg[1]+" ��: "+avg[2]);
		
		//�л���
		sum=new int[score.length];
		avg=new float[score.length];
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
				sum[i]+=score[i][j];
			}
		}
		for (int i=0; i<sum.length; i++) {
			avg[i]=(float)sum[i]/sum.length;
		}
		System.out.println("�л��� ����");
		System.out.println("ö��: "+sum[0]+" ����: "+sum[1]+" ����: "+sum[2]);
		System.out.println("�л��� ���");
		System.out.println("ö��: "+avg[0]+" ����: "+avg[1]+" ����: "+avg[2]);
	}
}
