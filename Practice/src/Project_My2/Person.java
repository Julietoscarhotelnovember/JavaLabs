package Project_My2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable{

	private String id; // 이름
	private String pw;
	public boolean gender;
	private String live; // 사는곳
	private int age;
	ArrayList<String> msg = new ArrayList<>();
	ArrayList<String> likeperson = new ArrayList<>();

	public Person(String id, String pw, boolean gender, String live, int age) {
		this.id = id;
		this.pw = pw;
		this.gender = gender;
		this.live = live;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getLive() {
		return live;
	}

	public void setLive(String live) {
		this.live = live;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String gender() {
		return this.gender ? "남자" : "여자";
	}

	@Override
	public String toString() {
		return getId() + "\t" + gender() + "\t" + getAge() + "\t" + getLive();
	}
}