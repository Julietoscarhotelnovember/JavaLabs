import java.util.ArrayList;

//���ʸ� (Generic)
//JDK1.5
//C# , Java ���� ��� �ʼ� ���

//������
//1. ���� Ÿ�� ������ Ȯ�� (Ÿ�� ����) > Object Ÿ�� Ż�� > new 
//2. ����ȯ�� �� Ÿ�Կ� �´� ����ȯ ���ո� �ذ�

class Person2{
	int age =100;
}
//Generic Ŭ���� ����� ����
//T ��� �ϴ� ���� : Type Paramter
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
		list.add("ȫ�浿");
		//QUIZ (������ for��)
		//������ ���� ����ϼ���
		//500
		//Person ��ü�� age �� : 100
		//ȫ�浿 
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
		list.add("ȫ�浿");
		���࿡ ������ add �� ������ Ÿ�Ը� ������ �� �ִ� ����� ���� ��
		
		���ڸ� ���� �� �ְ�
		��ü�� ���� �� (������ Ÿ��)
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
		
		//�Ļ� generic  Ŭ���� ����� ,,,
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
		
		//Car Ÿ���� �����ϴ� ArrayList ����ð�
		//Car 2�� �־����
		ArrayList<Car> carlist = new ArrayList<Car>();
		Car c= new Car("����");
		carlist.add(c);
		carlist.add(new Car("�׷���"));
		for(Car car : carlist){
			System.out.println(car.carname);
		}
		
		
	}

}
