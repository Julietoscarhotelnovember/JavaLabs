package IDCard;

import Framework.*;

public class IDCardFactory extends Factory {

	@Override
	protected Product createProduct() {
		return new IDCard();
	}
}