public class Team_Assign_1 {
	public static void main(String[] args) {
		int sum=0;
		for (int i=1; i<=20; i++) {
			if (i%2!=0 || i%3!=0) {
				System.out.println("2의 배수가 아니거나 3의 배수가 아닌 수: "+i);
				sum+=i;
			}
		}
		System.out.println("합계: "+sum);
	}
}
