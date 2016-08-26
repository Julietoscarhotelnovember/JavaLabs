package UML1;

public class Patient extends Person {
	String bandage;
	Data data; //composite
	
	Patient(String name, int age, String bandage, Data data) {
		this.name=name;
		this.age=age;
		this.bandage=bandage;
		this.data = data;
	}
	void printData() {
		System.out.println(name+" "+age+" "+bandage);
		System.out.println(this.data.num+" "+this.data.mdata);
	}
}