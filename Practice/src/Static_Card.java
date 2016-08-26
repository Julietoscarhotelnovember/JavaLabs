
public class Static_Card {

	public static void main(String[] args) {
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		System.out.printf("종류: %s\t숫자: %d\t너비: %d\t높이: %d\n",c1.kind, c1.number, c1.width, c1.height);
		Card c2=new Card();
		c2.kind="Spade";
		c2.number=4;
		System.out.printf("종류: %s\t숫자: %d\t너비: %d\t높이: %d\n",c2.kind, c2.number, c2.width, c2.height);
	}

}
class Card {
	String kind;
	int number;
	static int width=200;
	static int height=250;
}