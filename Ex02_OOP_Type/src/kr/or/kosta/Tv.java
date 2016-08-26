package kr.or.kosta;

public class Tv {
	public int ch; //속성, 필드
	public String brandname; //객체 변수, instance variable
	//위 변수들은 전역자원(설계도 안에서는 어디에서든 가져다 쓸 수 있다.)
	
	//행위, 기능
	public void ch_Up(){
		ch++;
	}
	public void ch_Down(){
		ch--;
	}
}
