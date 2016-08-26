package UML1;

public class Doctor extends Person {
	String stethoscope;
	Data data; //composite
	
	Doctor(String name, int age, String stethoscope, Data data) {
		this.name=name;
		this.age=age;
		this.stethoscope=stethoscope;
		this.data=data;
	}
	void printData() {
		System.out.println(name+" "+age+" "+stethoscope);
		System.out.println(this.data.num+" "+this.data.mdata);
	}
}