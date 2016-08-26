import java.awt.Color;

//시스템 전체에 사용되는 규칙적인 자원
//순서가 있는 데이터 구조 표현
//ex)월~금, 색상, 계절, 코드성 데이터
enum Season2 {
	SPRING, SUMMER, AUTUMN, WINTER
}
class KostaInfo {
	String classcode;
	String classname;
	Season2 kostaseason; //열거형 중에 1가지 값만 가진다
	
	KostaInfo(String classcode, String classname, Season2 kostaseason) {
		this.classcode=classcode;
		this.classname=classname;
		this.kostaseason=kostaseason;
	}
	
}
public class Ex12_Enum {
	public static void main(String[] args) {
		KostaInfo javaclass=new KostaInfo("129th", "java", Season2.SUMMER);
		System.out.println("기수: "+javaclass.classcode);
		System.out.println("기수: "+javaclass.classname);
		
		//자바api에서 제공되는 열거형 자료
		//Color.BLACK;
	}
}
