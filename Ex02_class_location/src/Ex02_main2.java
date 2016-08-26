import kr.or.kosta.Car;

public class Ex02_main2 {

	public static void main(String[] args) {
		//Ex01_main.java의 Test class 사용 가능하다!!
		Test t=new Test();
		Test2 t2=new Test2(); //아이콘에 삼각형 붙으면 default
		
		Car c=new Car();
		c.window=4;  //public 선언하여 사용 가능
	}

}
