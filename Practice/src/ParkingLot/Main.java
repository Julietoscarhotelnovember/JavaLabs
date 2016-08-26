package ParkingLot;

public class Main {
	public static int carnum=0;
	
	public static void main(String[] args) {
		CarMaker carmaker=new CarMaker();
		carmaker.run();
		InOutCheck inoutcheck=new InOutCheck();
		inoutcheck.run();

	}

}
