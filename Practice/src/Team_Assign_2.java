public class Team_Assign_2 {
	public static void main(String[] args) {
		int count=0;
		for (int i=1; i<=6; i++)
			for (int j=1; j<=6; j++)
				if (i+j==6) {
					System.out.printf("%d + %d = %d\n", i, j, i+j);
					count+=1;
				}
		System.out.println("ÃÑ °³¼ö: "+count);
	}
}