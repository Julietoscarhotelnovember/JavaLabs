package ParkingLot;

public class CarMaker extends Thread {

	@Override
	public void run() {
		//���� ����ȣ
		int carnum = (int) (Math.random() * 100) + 1;
		int time;

		//���� �ð�
		time = (int) (Math.random() * 10000) + 1;
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Car Number: " + carnum);
		Main.carnum = carnum;
		this.run();
	}
}
