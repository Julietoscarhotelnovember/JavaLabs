package UML1;

public class Nurse extends Person {
	String syringe;
	Data data; //composite
	
	Nurse(String name, int age, String syringe, Data data) {
		this.name=name;
		this.age=age;
		this.syringe=syringe;
		this.data = data;
	}
	void printData() {
		System.out.println(name+" "+age+" "+syringe);
		System.out.println(this.data.num+" "+this.data.mdata);
	}
}
