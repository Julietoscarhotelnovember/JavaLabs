import java.util.Properties;

//Map의 일종
//특수한 Map 형태 <String, String>
//어플리케이션의 공통속성(환경변수)를 설정하는데 사용
//속성을 저장/관리하도록 설계되어 있음
//별도의 property 파일을 만들어서 관리 가능
//다국어 처리 가능

//ex)200개의 웹사이트 하단에 관리자 email 주소 넣기
public class Ex17_Properties {
	public static void main(String[] args) {
		Properties prop=new Properties();
		prop.setProperty("master", "admin@master.com");
		prop.setProperty("lang", "kr");
		prop.setProperty("ver", "1.01");
		prop.setProperty("DefaultPath", "c:/naver/dotcom");
		System.out.println("웹사이트 하단: "+prop.getProperty("master"));
		System.out.println(prop.getProperty("ver"));

	}
}
