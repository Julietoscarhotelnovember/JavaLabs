import java.io.Serializable;

//객체통신
//객체를 분해(직렬화)해서 보낸 후 다시 조립(역직렬화)
//단, 클래스 설계 시에 "직렬화 가능하다"라고 찍혀있어야 됨
//implements Serializable
//프로세스, 네트워크 간에 객체를 주고 받을 수 있다
public class UserInfo implements Serializable {
	public String name;
	public String pwd;
	public int age;
	
	public UserInfo() {}
	public UserInfo(String name, String pwd, int age) {
		this.name=name;
		this.pwd=pwd;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
	

}
