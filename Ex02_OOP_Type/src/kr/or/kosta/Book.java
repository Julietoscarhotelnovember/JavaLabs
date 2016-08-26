package kr.or.kosta;

public class Book {
	public String bname;
	private int amount;
	public void writeAmount(int num) {
		amount=num;
	}
	public int readAmount() {
		return amount;
	}
}
