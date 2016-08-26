package kr.or.kosta;
//Ŭ����, ����(����ʵ�), method �տ���
//������ ������, ������, �����ڰ� �´�
//default(�������ذ���, import�� �ȵ�)
//public(��ü����)
//private(Ŭ���� ���� ����, ��ü ���忡���� ���� �Ұ�)
//protected(���)

//private���� ���߰� �Լ��� read/write�ؼ� ��� ������ ����?(��ü�������� �߿��� Ư¡)
//ĸ��ȭ�� ��¥ ����: �����Ҵ��� ���� �����Ҵ��� ����(�ڷẸȣ)
//�����ڰ� ���ϴ� ������ ���� �Է� �ǵ��� �ϱ� ���Ͽ�
//��ȿ�� �˻�

public class Car {
	public String color;

	//private�� public �Լ��� �̿��Ͽ� �����ؾ� �Ѵ�
	private int speed;
	private int window;
	//read/write�� �� �־�� �Ѵ�.
	//���� ��Ģ�� ���� �Լ� 1�� �� ��� 1��
	
	//window�� ���� write
	public void writeWindow(int num){
		if (num>0){
			window=num;
		} else {
			window=0;
		}
	}
	//window�� ���� read
	public int readWindow(){
		return window;
	}
	
	//speed ����ʵ忡 ���� read/write�� �� �ִ� �޼ҵ� �����
	//���ǵ� ������ 5�� (5, 10, 15) => speedUP()
	//���ǵ� ���Ҵ� 5��, 0�̻� => speedDown()
	public void speedUp(){
		speed+=5;
	}
	public void speedDown(){
		speed=-5;
		if (speed>0){
			speed=-5;
		} else {
			speed=0;
		}
	}
	public void speedPrint(){
		System.out.println("����ӵ�: "+speed);
	}
}
