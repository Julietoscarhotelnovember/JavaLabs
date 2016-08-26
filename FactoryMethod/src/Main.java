import Framework.*;
import IDCard.*;
import Car.*;

public class Main {

	public static void main(String[] args) {
		// Factory Ÿ������ IDī�带 �����ϴ� ���� ����
		Factory factory1 = new IDCardFactory();
		// Product Ÿ������ IDī�� ����
		Product p1 = factory1.create();
		// ����� IDī�� ���
		p1.use();

		// Factory Ÿ������ �ڵ����� �����ϴ� ���� ����
		Factory factory2 = new CarFactory();
		// Product Ÿ������ �ڵ��� ����
		Product p2 = factory2.create();
		// ����� �ڵ��� ���
		p2.use();
	}
}