//this 정리: 앞으로 생설될 객체의 주소가 담길 것으로 가정하고 사용한다
//객체의 주소(참조값)이 들어간다
//1.객체를 가리키는 this.name
//2.생성자를 호출하는 this()
//간단한 this 사용예제(Ex18보다 쉽다)

class Selfthis {
	String name;
	Selfthis() {
		//this.name="누구야";
		this("누구야");
	}
	Selfthis(String name) {
		this.name=name;
	}
}
public class Ex19_this {

	public static void main(String[] args) {
		Selfthis t=new Selfthis();
		System.out.println(t.name);
		Selfthis t2=new Selfthis("나야나");
		System.out.println(t2.name);
	}
}
