import kr.or.kosta.Car;
public class Ex04_OOP_Method2 {
//private���� �̿��ϱ�
	public static void main(String[] args) {
		Car c=new Car();
		c.color="red";
		System.out.println("å��: "+c.color);
		
		c.writeWindow(10);
		System.out.println("â��: "+c.readWindow());
		
		c.speedUp();
		c.speedUp();
		c.speedPrint();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedPrint();
	}
}
