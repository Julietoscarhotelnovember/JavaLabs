package kr.or.kosta;

public class SCard {
	public int numer;
	public String kind;
	
	public static int h=10;
	public static int w=20;
	
	public void card_Info() {
		System.out.printf("��ȣ: %d\t���: %s\th: %d\tw: %d\n",numer, kind, h, w);
	}
}