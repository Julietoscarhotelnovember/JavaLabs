package kr.or.kosta;

public class Card {
	public int numer;
	public String kind;
	
	public int h=10;
	public int w=20;
	
	public void card_Info() {
		System.out.printf("��ȣ: %d\t���: %s\th: %d\tw: %d\n",numer, kind, h, w);
	}
}
