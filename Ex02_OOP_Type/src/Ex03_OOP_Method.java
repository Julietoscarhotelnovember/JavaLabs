//함수의 종류
//1. void이면서 parameter가 있는 경우
//2. void이면서 parameter가 없는 경우
//3. return type이면서 parameter가 있는 경우
//4. return type이면서 parameter가 없는 경우

//void: 돌려주는 값이 없다
//return type: 8가지 기본타입 + 참조타입 + 배열 등등을 돌려준다
//parameter: 인자, 인수, 매개변수, 값을 받아서 함수 안쪽으로 던져주는 친구
//           8가지 기본타입 + 참조타입 + 배열 등등을 돌려준다

//함수는 호출에 의해 실행된다
//함수가 어려운 이유는 참조타입, 배열 등등이 들어가기 때문
class Fclass {
	void m(){
		System.out.println("일반함수(void, parameter 없음)");
	}
	void m2(int param){
		System.out.println("param value: "+param);
		System.out.println("일반함수(void, parameter 있음)");
	}
	int m3(){
		return -100; //return type이 존재하면 무조껀 return을 명시
	}
	int m4(int param){
		return param+100;
	}
	int m5(int i, int j){
		return i+j;
	}
	//Quiz
	int max(int a, int b){
		//a 와 b 중 큰 값을 return하는 함수
		//리턴은 한번만 하는 것이 좋다!
	/*	if (a>b) {
			return a;
		} else {
			return b;
		}*/
		/*int result=0;
		if(a>b){
			result=a;
		}else{
			result=b;
		}
		return result;*/
		int max=(a>b)?a:b;
		return max;	
	}
	String m6(String param1, String param2){
		return param1+":"+param2;
	}
	//어려운거
	//class를 return type 또는 parameter로 사용할 수 있다
	Car carMethod(){ //주소값이 return되어 변수에 저장된다 -> 객체의 연결이 유지된다
		Car a=new Car();
		return a;
	}
	Car carMethod2(Car a){ //Car 타입으로 만든 객체의 주소
		return a;
	}
}

class Car{
	int door=10;
}

public class Ex03_OOP_Method {

	public static void main(String[] args) {
		Fclass f=new Fclass();
		f.m();
		f.m2(100);
		int result=f.m3();
		System.out.println("return value: "+result);
		result=f.m4(99);
		System.out.println("return value: "+result);
		result=f.m5(11, 17);
		System.out.println("return value: "+result);
		
		result=f.max(500, 499);
		System.out.println("return value: "+result);
		String str=f.m6("길동", "아재");
		System.out.println("return value: "+str);
		
		//오늘의 포토제닉1
		//같은 주소값을 참조하도록 하는 이유: return으로 주소값을 받은 객체를 살리기 위해
		Car c=f.carMethod(); //여기서 c가 받았기 때문에 heap에 올라가 있던 객체가 살아있다.
		System.out.println("return value: "+c.door);
		System.out.println(c);
		
		//오늘의 포토제닉2
		Car car=new Car();
		Car car2=f.carMethod2(car);
		//c2 참조변수의 주소와 car2 참조변수의 주소는 같다.
		System.out.println(car==car2);
		System.out.println(car.hashCode()+":"+car2.hashCode());
		
	}

}
