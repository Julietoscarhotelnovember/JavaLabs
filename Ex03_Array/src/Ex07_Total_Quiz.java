public class Ex07_Total_Quiz {
	public static void main(String[] args) {
		int[][] score={
				{50, 60, 40}, //철이의 국, 영, 수
				{100, 80, 70}, //순이의 국, 영, 수
				{55, 60, 80} //용이의 국, 영, 수
		};
	//문제
	//1.각 과목별 총점, 평균 구하기
	//2.각 학생의 총점, 평균 구하기
		int[] sum=new int[score.length];
		float[] avg=new float[score.length];

		//과목별
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
				sum[i]+=score[j][i];
			}
		}
		for (int i=0; i<sum.length; i++) {
			avg[i]=(float)sum[i]/sum.length;
		}
		System.out.println("과목별 총점");
		System.out.println("국: "+sum[0]+" 영: "+sum[1]+" 수: "+sum[2]);
		System.out.println("과목별 평균");
		System.out.println("국: "+avg[0]+" 영: "+avg[1]+" 수: "+avg[2]);
		
		//학생별
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
		System.out.println("학생별 총점");
		System.out.println("철이: "+sum[0]+" 영이: "+sum[1]+" 용이: "+sum[2]);
		System.out.println("학생별 평균");
		System.out.println("철이: "+avg[0]+" 영이: "+avg[1]+" 용이: "+avg[2]);
	}
}
