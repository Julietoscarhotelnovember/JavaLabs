package ParkingLot;

import java.util.Calendar;

public class InOutCheck extends Thread {

	@Override
	public void run() {

		//���� ��
		while (!Main.carnum.) {
			System.out.println("���� �� ��: "+Main.carnum);
			System.out.println("���� �ð�: "+Calendar.getInstance().getTime());
		}

		//������ ��
	}
}
