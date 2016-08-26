package kr.or.kosta;

public class Hp {
	private int number;
	private String hpname;
	//쓰기전용
	public void writeNumber(int num) {
		number=num;
	}
	//읽기전용
	public int readNumber() {
		return number;
	}
	//캡슐화된 member field에 대해서
	//이럴바엔 자바에서 그냥 getter, setter를 지원해 주겠다.
	//C#에서는 property, 자바에서는 read(getter), write(setter)
	//이클립스 우클릭->Source->Generate getter/setter
	//나중에 연결해서 쓸 것이 있기 때문에, 앞으로 게터/세터는 이클립스에서 자동적으로 만들어지는
	//함수를 쓸 것이다.
	public String getHpname() {
		return hpname;
	}
	public void setHpname(String hpname) {
		this.hpname = hpname;
	}
	
}
