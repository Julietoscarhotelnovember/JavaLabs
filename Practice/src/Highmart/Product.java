package Highmart;

class Product {
	int price;
	int bonuspoint;

	public Product(int price) {
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}
}
