//������
//�ϳ��� ���������� ���� ���� ��ü�� ������ �� �ִ�.
//��, ��Ӱ��迡��
//�ҹ��� ���� > ������ �ڵ���
class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive car");
	}

	void stop() {
		System.out.println("stop car");
	}
}

class FireCar extends Car {
	void water() {
		System.out.println("water car");
	}
}

public class Ex12_Inheritance_Polymophysm {

	public static void main(String[] args) {
		FireCar f=new FireCar();
		f.drive();
		f.stop();
		f.water();
		
		Car c=null;
		c=f; //�θ�c �ڽ�f �ڽ��� �θ𿡰� ���Ǿ��� �� �� �ִ�
		//c=(Car)f; ��ĳ����(�θ� ������ ĳ����)
		FireCar f2=(FireCar)c; //�ڽ� ������ �ٿ�ĳ����, 8���� �⺻Ÿ�Կ����� �����, �Ͻ��� ĳ���ð� �ݴ�
		
	}

}
