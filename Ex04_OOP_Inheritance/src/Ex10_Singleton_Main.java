import kr.or.kosta.Singleton;

public class Ex10_Singleton_Main {

	public static void main(String[] args) {
		//Singleton s=new Singleton();
		//하나의 객체를 생성해서 공유하는 패턴
		//생성자 private, new 막기, static
		Singleton s=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
		System.out.println(s+" : "+s2+" "+s3);
		System.out.println(s==s2);
		System.out.println(s2==s3);
		
	}
}
