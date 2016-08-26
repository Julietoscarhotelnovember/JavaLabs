//기본타입: 8개 > 자바api가 클래스를 다 설계 해 놓았다(wrapper class)
//기본타입 자료형을 클래스로 만들어서 객체 단위로 처리 가능하게 하였다 

//언제 쓰는지?
//1.타입간 형변환(문자->숫자: Integer.parseInt)
//2.파라미터로 사용(void m(int i) -> void m(Integer i))
//3.클래스로 설계해서 내부 상수로 사용
public class Ex08_Wrapper_Class {
	public static void main(String[] args) {
		Integer n=new Integer(100);
		//내부적으로는 private int value; public Integer(int value){}
		//주소값이 아니라 값을 가지고 있다.
		System.out.println(n);
		System.out.println(n.hashCode());
		System.out.println(n.MIN_VALUE+" / "+n.MAX_VALUE);
		
		IntegerMethod(n); //주소값을 던지지만 값을 표현
		intMethod(n); //주소값에서 값을 찾아 intMethod(100);처럼
		
		Integer i2=new Integer(100);
		Integer i3=new Integer(100);
		System.out.println(i2==i3); //다른 주소값을 가지므로 false
		System.out.println(i2.equals(i3)); //equals override로 값을 비교해서 true
	}
	static void IntegerMethod(Integer i) { //String처럼 int와 같이 작동한다
		System.out.println("param: "+i);
	}
	static void intMethod(int i) {
		System.out.println("int param: "+i);
	}
}
