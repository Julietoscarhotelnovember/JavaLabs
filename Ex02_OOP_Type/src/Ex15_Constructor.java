class Note {
	//생성자를 가지고 있지 않은 경우
	//객체가 생성될 때 자동으로, 디폴트로 생성자가 만들어진다.
	//public Note(){}
}
class Note2 {
	public Note2() { //생성자를 만들었다면 의도는: 무언가를 초기화 하겠다
		System.out.println("나 default 생성자야");
	}
}

//생성자도 함수이기 때문에 overloading이 가능하다
class Note3 {
	public Note3(int num) {
		System.out.println("난 overloadig이야 받은 값은:"+num );		
	}
	//이렇게 해 놓으면 "객체가 생성될 때 무조껀 정수 하나는 받겠다"의 의도
}

class Note4 {
	public Note4() {
		System.out.println("난 디폴드");
	}
	public Note4(int num) {
		System.out.println("난 오버로딩");
	}
}

class Note5 {
	public Note5(int i) {}
	public Note5(int i, int j) {}
	public Note5(int i, int j, int k) {}
	//원칙은 생성자 중에서 객체 생성시에 하나만 호출할 수 있다
	//나중에 this를 배우면 여러 개의 생성자 호출이 가능하다
}
public class Ex15_Constructor {

	public static void main(String[] args) {
		Note n1=new Note();
		Note2 n2=new Note2();
		Note3 n3=new Note3(100);
		//Note3 n4=new Note3(); //이건 왜 안되냐?
		//overloading된 생성자가 하나라도 있다면
		//기본생성자는 구현하지 않으면 사용할 수 없다
		//이렇게 해 놓으면 "객체가 생성될 때 무조껀 정수 하나는 받겠다"의 의도
		Note4 n4=new Note4();
		Note4 n5=new Note4(10);
		
		Note5 n6=new Note5(1);
	}
}

