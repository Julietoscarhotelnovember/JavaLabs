//String 설계 시에 int, float 등과 사용법을 같게 만들었다
//String 클래스는 내부적으로 char[]으로 관리한다
//String name="홍길동" > [홍][길][동] > length 등 배열 자원 그대로 사용 가능 
public class Ex05_String {
	public static void main(String[] args) {
		String str1="AAA";
		String str2="AAA";
		System.out.println(str1+"/"+str2);
		System.out.println(str1==str2); //같은 값은 같은 주소를 가리킨다 +쓰면 에러
		System.out.println("값 비교: "+str1.equals(str2));
		
		System.out.println();
		String str3=new String("BBB");
		String str4=new String("BBB");
		System.out.println(str3+"/"+str4);
		System.out.println("주소값 비교: "+str3==str4);
		System.out.println("값 비교: "+str3.equals(str4));
	}
}
