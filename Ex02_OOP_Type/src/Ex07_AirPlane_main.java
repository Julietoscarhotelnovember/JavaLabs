import kr.or.kosta.AirPlane;

public class Ex07_AirPlane_main {

	public static void main(String[] args) {
		System.out.println("����� ����");
		
		AirPlane ap1=new AirPlane("�Ӿ���", 1);
		ap1.printData();
		
		AirPlane ap2=new AirPlane("��Ⱑ", 2);
		ap2.printData();
		
		AirPlane ap3=new AirPlane("���ٿ�", 3);
		ap3.printData();
		
		AirPlane.countData();
	}
}
