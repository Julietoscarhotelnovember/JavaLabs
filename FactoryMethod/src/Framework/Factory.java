package Framework;

public abstract class Factory {
	public final Product create() {
		return createProduct(); // 추상함수로 제품 생산
	}

	protected abstract Product createProduct(); // 구체화된 클래스에서 구현될 제품 생산 메서드
}