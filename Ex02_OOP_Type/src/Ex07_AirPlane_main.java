import kr.or.kosta.AirPlane;

public class Ex07_AirPlane_main {

	public static void main(String[] args) {
		System.out.println("비행기 정보");
		
		AirPlane ap1=new AirPlane("머엇진", 1);
		ap1.printData();
		
		AirPlane ap2=new AirPlane("뱅기가", 2);
		ap2.printData();
		
		AirPlane ap3=new AirPlane("난다요", 3);
		ap3.printData();
		
		AirPlane.countData();
	}
}
