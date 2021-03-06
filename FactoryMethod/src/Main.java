import Framework.*;
import IDCard.*;
import Car.*;

public class Main {

	public static void main(String[] args) {
		// Factory 타입으로 ID카드를 생산하는 공장 생성
		Factory factory1 = new IDCardFactory();
		// Product 타입으로 ID카드 생산
		Product p1 = factory1.create();
		// 생산된 ID카드 사용
		p1.use();

		// Factory 타입으로 자동차를 생산하는 공장 생성
		Factory factory2 = new CarFactory();
		// Product 타입으로 자동차 생산
		Product p2 = factory2.create();
		// 생산된 자동차 사용
		p2.use();
	}
}
