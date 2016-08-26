import kr.or.kosta.Car;
public class Ex04_OOP_Method2 {
//private변수 이용하기
	public static void main(String[] args) {
		Car c=new Car();
		c.color="red";
		System.out.println("책상: "+c.color);
		
		c.writeWindow(10);
		System.out.println("창문: "+c.readWindow());
		
		c.speedUp();
		c.speedUp();
		c.speedPrint();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedPrint();
	}
}
