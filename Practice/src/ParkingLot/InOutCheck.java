package ParkingLot;

import java.util.Calendar;

public class InOutCheck extends Thread {

	@Override
	public void run() {

		//들어온 차
		while (!Main.carnum.) {
			System.out.println("입차 된 차: "+Main.carnum);
			System.out.println("입차 시간: "+Calendar.getInstance().getTime());
		}

		//나가는 차
	}
}
