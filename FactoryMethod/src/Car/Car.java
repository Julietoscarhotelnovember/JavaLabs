package Car;

import Framework.Product;

public class Car extends Product {
	Car() {
		System.out.println("�� ����");
	}

	@Override
	public void use() {
		System.out.println("�� ���");
	}

}
