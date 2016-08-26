package kr.or.kosta;
//클래스, 변수(멤버필드), method 앞에는
//다음의 접근자, 수정자, 한정자가 온다
//default(폴더기준공유, import도 안됨)
//public(전체공유)
//private(클래스 내부 공유, 객체 입장에서는 접근 불가)
//protected(상속)

//private으로 감추고 함수로 read/write해서 얻는 장점은 뭘까?(객체지향언어의 중요한 특징)
//캡슐화의 진짜 이유: 직접할당을 막고 간접할당을 통해(자료보호)
//개발자가 원하는 형태의 값만 입력 되도록 하기 위하여
//유효성 검사

public class Car {
	public String color;

	//private는 public 함수를 이용하여 접근해야 한다
	private int speed;
	private int window;
	//read/write할 수 있어야 한다.
	//개발 원칙은 보통 함수 1개 당 기능 1개
	
	//window에 대한 write
	public void writeWindow(int num){
		if (num>0){
			window=num;
		} else {
			window=0;
		}
	}
	//window에 대한 read
	public int readWindow(){
		return window;
	}
	
	//speed 멤버필드에 대해 read/write할 수 있는 메소드 만들기
	//스피드 증가는 5씩 (5, 10, 15) => speedUP()
	//스피드 감소는 5씩, 0이상 => speedDown()
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
		System.out.println("현재속도: "+speed);
	}
}
