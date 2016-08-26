//다형성을 땡치기 위해 다 외워

//시나리오
//가전제품 매장 솔루션 개발 사업팀에서, A라고 하는 가전제품 매장이 오픈하였다

//요구사항
//공통사항: 제품의 가격정보, 제품의 포인트 정보
//각 가전제품은 제품별 특징을 가지고 있음(상품이름, ex) TV, Audio, Computer)
//TV끼리는 가격이 같고, Audio 끼리는 가격이 같다 등등, 포인트는 가격의 10%

//구매자: 제품을 구매하기 위한 금액정보, 포인트 정보를 가지고 있음
//구매자는 가전제품에 대한 구매행위를 한다.
//구매하면 구매자의 금액 감소, 포인트는 증가
//구매자는 기본 금액을 가지고 있다

//1차코드 이후 100개 품목 추가 후 매장 대규모 세일
//문제점: 제품마다 판매행위를 각각 따로 갖고 있다
//제품이 추가 될 때마다 구매함수를 같이 추가해야 한다.
//이 코드를 개선하라.

class Price {
	int price;
	int point;
}
class Television extends Price {
	String name;
	Television(String name, int price){
		this.name=name;
		this.price=price;
		this.point+=(int)(price*0.1);
	}
}
class Audio extends Price {
	String name;
	Audio(String name, int price){
		this.name=name;
		this.price=price;
		this.point+=(int)(price*0.1);
	}
}
class Computer extends Price {
	String name;
	Computer(String name, int price){
		this.name=name;
		this.price=price;
		this.point+=(int)(price*0.1);
	}
}
class Person {
	int amount=10000000;
	int point=0;
	void Buy(int price){
		this.amount-=price;
		this.point+=(int)(price*0.1);	
	}
}

//2차코드
//구매함수의 이름은 동일하게(buy)하여 모든 물건을 구매하도록
//여기까지 한듯

//3차코드
//다수의 물건이 입고되었을 때 함수 코드를 추가해야함
//반복적인 코드를 제거해야 쓰것다

public class Ex13_Polymophysm_Main {
	public static void main(String[] args) {
		Television t=new Television("샘숭UHD", 5000000);
		Audio a=new Audio("샤오미블루투스", 100000);
		Computer c=new Computer("LG그램", 1000000);
		Person p=new Person();
		System.out.println(p.amount+" : "+p.point);
		p.Buy(t.price);
		System.out.println(p.amount+" : "+p.point);
	}
}
