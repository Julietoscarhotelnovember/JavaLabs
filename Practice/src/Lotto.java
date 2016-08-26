
public class Lotto {

	public static void main(String[] args) {
		int i=0;
		int[] num=new int[100];
		for(i=0;i<99;i++) {
			num[i]=(int)(Math.random()*100)+1;
			System.out.println(num[i]);
		}
		
	}

}
