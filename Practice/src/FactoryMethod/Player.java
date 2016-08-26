package FactoryMethod;

public abstract class Player {
	private int age;
	private String name;

	public abstract void batting_Ball();

	public abstract void throw_Ball();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
