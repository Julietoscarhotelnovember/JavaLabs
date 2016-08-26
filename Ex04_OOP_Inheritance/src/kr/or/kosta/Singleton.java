package kr.or.kosta;
//디자인 패턴
//중 가장 많이 쓰이는 싱글톤 패턴

//new Singleton()을 못하게 막고 싶다면? (오버로딩 제외) 생성자를 private으로 막는다
//하나만 쓰게 하기 위해
//유지보수의 편리성 
//접근제어자 이용의 대표적인 패턴

//시나리오
//프린터 네트워크 공유
//드라이버 로드 후 공유
public class Singleton {
	private static Singleton p=new Singleton();
	private Singleton(){}
	public static Singleton getInstance(){
		if(p==null) {
			p=new Singleton();
		}
		return p;
	}
}
