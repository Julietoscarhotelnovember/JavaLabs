//문자열 누적
//String str="A"
//for (str+="A") 10000번 -> 계속 메모리 재할당이 일어난다, 비효율적
//String을 컬렉션화 > StringBuffer, StringBuilder
public class Ex10_StringBuffer {

	public static void main(String[] args) {
/*		String str="A";  이렇게는 하지말자
			for (int i=0; i<10000; i++) {
			str+="B";
		}*/
		
		//대량의 데이터 추가는 이게 훨씬 빠르다
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity()); //기본 16개 -> 쭉쭉 늘어난다
		sb.append("A"); //문자열 추가
			
	}
}
