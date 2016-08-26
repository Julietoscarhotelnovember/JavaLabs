package Car;

import Framework.*;

public class CarFactory extends Factory {

	@Override
	protected Product createProduct() {
		return new Car();
	}
}