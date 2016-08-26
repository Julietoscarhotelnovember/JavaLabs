import java.util.StringTokenizer;

//문자 관련 함수
public class Ex06_String_Function {

	public static void main(String[] args) {
		// String 클래스가 가지고 있는 public 자원은 사용할 수 있다
		// 활용도가 높다
		String str; // null
		String str2 = ""; // 문자열 초기화
		char c = ' '; // 한문자 초기화
		String[] strarray = { "ab", "abc", "abcd" };
		for (String s : strarray) {
			System.out.println(s);
		}

		String s = "hello";
		String concat_s = s.concat("world");
		System.out.println(concat_s);

		boolean bo = s.contains("h");
		System.out.println(bo);
		bo = s.contains("ell");
		System.out.println(bo);
		bo = s.contains("lle");
		System.out.println(bo);

		String s2 = "a b c d";
		System.out.println(s2.length());
		String filename = "hello java, world";
		int indexvalue = filename.indexOf(",");
		System.out.println(indexvalue);
		indexvalue = filename.indexOf("l");
		System.out.println(indexvalue);
		indexvalue = filename.indexOf("hello");
		System.out.println(indexvalue);
		indexvalue = filename.indexOf("hollo");
		System.out.println(indexvalue); // 값이 없는 경우 -1 반환 -> 0보다 크면 찾는 문자가 있다

		indexvalue = filename.lastIndexOf("l");
		System.out.println(indexvalue);

		// 문자 추출
		String result = "superman";
		System.out.println(result.substring(1));
		System.out.println(result.substring(1, 2)); // 이건 -1을 한다더라
		System.out.println("Test: " + result.substring(1, 1));

		// 퀴즈
		String filename2 = "cat.jpg";
		// 파일명과 확장자를 분리해서 출력해보기
		int position = filename2.indexOf(".");
		String fn = filename2.substring(0, position);
		// String ext=filename2.substring(position+1, filename2.length());
		String ext = filename2.substring(++position); // 멋진 코드
		System.out.println(fn);
		System.out.println(ext);

		// 치환함수
		String s4 = "ABCD";
		String result2 = s4.replace("A", "가");
		System.out.println(result2);
		result2 = s4.replace("BCD", "홍길동바보");
		System.out.println(result2);

		// s4.charAt(index)
		// s4.endsWith(suffix)

		// 폴더: a.hwp, b.txt, c.jpg, ...
		String file2 = "1.jpg";
		System.out.println(file2.endsWith("jpg"));

		String s5 = "abc";
		System.out.println(s5.equals("Abc")); // 대소문자 구별
		System.out.println(s5.equalsIgnoreCase("Abc")); // 안구별

		// split-특정 구분자로 분리
		String s6 = "슈퍼맨,팬티,노랑색,우하하,우하하";
		String[] namearray = s6.split(",");
		for (String str3 : namearray) {
			System.out.println(str3);
		}
		String filename3 = "korea.jpg";
		String[] filearray = filename3.split(".");
		for (String str1 : filearray) {
			System.out.println(str1);
		} // 안나오는게 정상
			// split은 정규표현식에 따른다->.을 구분자로 보지 않는다-> \\.으로 표시해아 나옴
			// 표준, 모든 언어, DB에서 모두사용

		// 조별과제 - 정규표현식 5개 만들기
		// 계좌번호, 주민등록번호, IP, 차량등록번호(34호6654)
		// 우편번호, 의사등록번호, 카드번호, 법인등록번호, 기기번호
		// 회원가입시 이름
		// 만들고 검증사이트에서 확인
		// 8월2일까지

		String s8 = "a//b.c,d-f";
		// a b c d f 분리는 tokenizer
		StringTokenizer sto = new StringTokenizer(s8, "/.,-"); // 원하는 구분자 전부 입력
		while (sto.hasMoreTokens()) { // 구분자가 존재하는 경우
			System.out.println(sto.nextToken()); // 다음 토큰 출력
		}
		System.out.println("*******");
		String[] tokens=new String[10];
		int index=0;
		StringTokenizer sto2=new StringTokenizer(s8, "/.,-");
		while(sto2.hasMoreTokens()) {
			tokens[index++]=sto2.nextToken();
		}
		for(String a: tokens) {
			System.out.println(a);
		}
		StringTokenizer sto3=new StringTokenizer(s8, "/.,-", true); //true 쓰면 구분자도 문자로 나옴
		while(sto3.hasMoreTokens()) {
			System.out.println(sto3.nextToken());
		}
		
		//활용
		//게시판 파일 업로드 할 때
		//1.jpg가 존재하는데  다시 1.jpg를 올리는 경우 끝에 _1 추가
		String uploadfile="hello.hwp";
		String[] upload=uploadfile.split("\\.");
		System.out.println("파일명: "+upload[0]+" "+"확장자: "+upload[1]);
		String newfile=upload[0]+"_1."+upload[1];
		System.out.println(newfile);
		
		//퀴즈
		String s9="홍         길              동";
		//저장시에 홍길동으로 하고 싶다 -> 공백제거하기
		System.out.println(s9.replace(" ", ""));
		
		String s1="             홍  길  동      ";
		System.out.println(s1.trim()); //연속된 바깥쪽 공백 제거

		//method chain
		String chain=s1.trim().replace(" ", ""); //결과가 문자열인 경우 chain이 가능하다, 깔끔하다
		System.out.println(chain);
		
		"홍길동".length(); //String은 문자열이라 바로 이렇게 쓰는 것도 가능하다
		//isEmpty() 문자열 길이가 0인지 아닌지
		System.out.println("".isEmpty());
		//charAt() 인덱스를 넣으면 해당 위치의 문자 반환
		System.out.println("홍길동".charAt(2));
		
		//퀴즈
		String sumstr="";
		int sum=0;
		String[] numberarr={"1", "2", "3", "4", "5"};
		//String 배열이 가지고 있는 문자들의 합을 구하기
		for (int i=0; i<numberarr.length; i++) {
			sumstr=numberarr[i];
			sum+=Integer.parseInt(sumstr);
		}
		System.out.println(sum);
		
		//퀴즈
		String jumin="123456-1234567";
		//주민번호의 합 구하기
		String[] tokens2=new String[13];
		sum=0;
		String sumstr2;
		for (int i=0; i<tokens2.length; i++) {
			tokens2[i]=jumin.replace("-", "").substring(i, i+1);
		}
		for(String a: tokens2) {
			sumstr2=a;
			sum+=Integer.parseInt(sumstr2);
		}
		System.out.println(sum);
		
		//String.valueOf(값) -> 안에 들어가는 값을 무조껀 문자로 변경
		
		//퀴즈
		String s10="hello java, world";
		//,를 없애고 뒤에 "방가방가"를 합치고 앞에서 4자리부터 출력
		System.out.println(s10.replace(",", "").concat("방가방가").substring(4));
		//chain.replace(",","").concat(sumstr2) //?????
		
		System.out.printf("%d-%s\n", 10, "A");
		//String 클래스의 static 함수 중 format ->  포맷팅 형태로 변수에 저장해서 쓸 수 있다
		String formatter=String.format("%d-%s\n", 10, "A");
		System.out.println(formatter);
		
	}
}