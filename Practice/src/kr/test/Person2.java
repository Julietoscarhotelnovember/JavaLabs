package kr.test;
public class Person2 {
	private int num;
	private String name;
	private String gender;
	private String phone;
	public void updateNum(int i) {
		num=i;
		System.out.print("학번: "+num+"\t\t");
	}
	public void updateName(String i) {
		name=i;
		System.out.print("이름: "+name+"\t");
	}
	public void updateGender(String i) {
		gender=i;
		System.out.print("성별: "+gender+"\t\t");
	}
	public void updatePhone(String i) {
		phone=i;
		System.out.println("성별: "+phone+"\t");
	}
}
