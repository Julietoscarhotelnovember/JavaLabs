import java.util.ArrayList;

//제너릭 (Generic)
//JDK1.5
//C# , Java 에서 모두 필수 기능

//개발자
//1. 사용시 타입 안정성 확보 (타입 강제) > Object 타입 탈피 > new 
//2. 형변환시 각 타입에 맞는 형변환 불합리 해결

class Person2{
	int age =100;
}
//Generic 클래스 만들어 보기
//T 라는 하는 것은 : Type Paramter
class MyGen<T>{
	T obj;
	void add(T obj){
		this.obj = obj;
	}
	
	T get(){return obj;}
}

class Car{
	String carname;
	Car(String carname){
		this.carname = carname;
	}
	String getCarname(){
		return this.carname;
	}
}


public class Ex08_Generic_keypoint {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(500);
		list.add(new Person());
		list.add("홍길동");
		//QUIZ (개선된 for문)
		//각각의 값을 출력하세요
		//500
		//Person 객체의 age 값 : 100
		//홍길동 
		for(Object obj : list){
			//System.out.println(obj);
			if(obj instanceof Person){
				Person p = (Person)obj;
				System.out.println(p.age);
			}else{
				System.out.println(obj);
			}
		}
		
		/*
		ArrayList list = new ArrayList();
		list.add(500);
		list.add(new Person());
		list.add("홍길동");
		만약에 데이터 add 한 종류의 타입만 강제할 수 있는 방법이 없을 까
		
		숫자만 넣을 수 있고
		객체만 넣을 수 (정해진 타입)
		*/
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(100);
		//intlist.add("A");
		
		ArrayList<String> stringlist = new ArrayList<>();
		stringlist.add("A");
		stringlist.add("B");
		for(String s : stringlist){
			System.out.println(s);
		}

		ArrayList<Person> personlist = new ArrayList<Person>();
		personlist.add(new Person());
		personlist.add(new Person());
		
		//식사 generic  클래스 만들기 ,,,
		/*
		class MyGen<Integer>{
			Integer obj;
			void add(Integer obj){
				this.obj = obj;
			}
			
			Integer get(){return obj;}
		}
		*/
		MyGen<String> mygen = new MyGen<String>();
		mygen.add("AA");
		System.out.println(mygen.get());
		
		MyGen<Integer> mygen2 = new MyGen<Integer>();
		mygen2.add(100);
		
		ArrayList<String> alist = new ArrayList<String>();
		
		//Car 타입을 강제하는 ArrayList 만드시고
		//Car 2개 넣어보세요
		ArrayList<Car> carlist = new ArrayList<Car>();
		Car c= new Car("포니");
		carlist.add(c);
		carlist.add(new Car("그렌져"));
		for(Car car : carlist){
			System.out.println(car.carname);
		}
		
		
	}

}
