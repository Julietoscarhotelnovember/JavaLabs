package kr.or.kosta;

import java.io.FileNotFoundException;

public class Person {
	private int age;
	public Person(int age) throws FileNotFoundException { //예외 던지기를 클래스에 설계해 둠
		this.age=age;
	}
}