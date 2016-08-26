
public class Ex02_ArrayBasic_Quiz {

	public static void main(String[] args) {
		//수학과 학생들 기말고사 점수
		int[] score=new int[]{79,88,97,54,56,95};
		int max=score[0];
		int min=score[0];
		
		//문제: max에 가장 높은 점수를 담고, min에 가장 낮은 점수를 담아라.
		for (int i=0; i<score.length; i++) {
			/*if (max<score[i]) {
				max=score[i];
			}
			if (min>score[i]) {
				min=score[i];
			}*/
			//삼항연산자
			max=(max<score[i])? score[i]:max;
			min=(min>score[i])? score[i]:min;
		}
		System.out.println("최고점수: "+max);
		System.out.println("최저점수: "+min);
		
		//Quiz
		int [] number=new int[10];
		//각각의 배열방의 값을 1~10까지로 초기화 하기
		for (int i=0; i<number.length; i++) {
			number[i]=i+1;
			System.out.printf("number[%d]=%d\n",i,number[i]);
		}
		
		//Quiz
		int sum=0;
		float average=0f;
		int[] jumsu={100,55,90,60,78};
		//총 학생수
		//국어점수 합
		//국어점수 평균 출력
		int count=jumsu.length;
		for (int i=0; i<count; i++) {
			sum+=jumsu[i];
		}
		average=(((float)(sum))/(count));
		System.out.printf("학생수: %d 합계: %d 평균: %f\n",
				count, sum, average);
		
		//Quiz
		int[] rndnum=new int[10];
		for (int i=0; i<rndnum.length; i++) {
			rndnum[i]=i;
		}
		//rndum 배열에 들어있는 값을 순서없이 섞어 출력
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
		
		//라인과제
		//간단로또 작성하기
		//1.1~45까지 난수, 6개 배열
		//2.중복 안됨
		//3.오름차순으로
		
		//나중에 클래스변환
		//조건추가: 35 < 6개 합 < 45
		//자율조건: 지정 번호 빼고 돌리기
		
		//1~45난수로 배열 채우기
		int[] rndn=new int[6];
		for (int i=0; i<rndn.length; i++) {
			rndn[i]=(int)(Math.random()*45+1);
		}
		//중복제거
		for (int i=0; i<rndn.length; i++) {
			for (int j=i+1; j<rndn.length; j++) {
				while (rndn[i]==rndn[j]) {
					rndn[j]=(int)(Math.random()*45+1);
				}
			}
		}
		//오름차순 정렬
		for (int i=0; i<rndn.length; i++) {
			for (int j=0; j<rndn.length; j++) {
				if (rndn[i]<rndn[j]) {
					int temp=rndn[i];
					rndn[i]=rndn[j];
					rndn[j]=temp;
				}
			}
		}
		//출력
		for (int i=0; i<rndn.length; i++) {
			System.out.print(rndn[i]+" ");
		}
	}
}
