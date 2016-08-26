package kr.or.kosta;

public class Ex03_main3 {

	public static void main(String[] args) {
		//여기서 src 폴더 안에 있는 Test2라는 클래스를 사용할 수 없다
		//접근자가 default 이기 때문에
		//Test2 t2=new Test2();
		Car c=new Car();
		c.door=1;
		c.window=10;
	}
}
