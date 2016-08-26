public class Ex03_Array_Quiz_Lotto {

	public static void main(String[] args) {
		// 라인 과제 (간단 Lotto 작성하기)
		// 1. 1~45 까지의 난수를 발생시켜 6개의 배열에 담으세요
		// 2. 배열에 담기 6개의 값은 중복값이 나오면 안되요
		// 3. 배열에 있는 6개의 값을 작은 값 순으로 출력하세요
		// 4. java 과제 (카페에 )올리세요
		//추가 : class 설계도 변환
		//조건 추가 (6개 배열의 합이 35 < sum < 45) 
		//자율 조건 : 추가

		int[] lotto = new int[6];
		int temp = 0;

		//1,2 번
		for (int i = 0; i < lotto.length; i++) 
		{
			lotto[i] = (int) ((Math.random() * 45) + 1);

			for (int j = 0; j < i; j++) 
			{
				if (lotto[i] == lotto[j]) 
				{
					i--; //i를 증가시키지 않고 다시 돌림
					break;
				}
			}
		}
		
		//3번
		for (int i = 0; i < 6; i++) 
		{
			for (int j = i + 1; j < 6; j++) 
			{
				if (lotto[i] > lotto[j]) 
				{
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		//출력	
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
