class Fclass {
	Car carMethod(){
		Car a=new Car();
		return a;
	}
}

class Car{
	int door=10;
}

public class Test {
	public static void main(String[] args) {
		Fclass f=new Fclass();
		Car c=f.carMethod();
		System.out.println("return value: "+c.door);
		System.out.println(c);	
	}
}