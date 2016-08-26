public class Ex06_Operator {
	public static void main(String[] args) {
		// 제어문
		// 조건문 : if, if ~else, if~ else if ~else
		// 조건문 : switch는 경우의 수가 많은 경우 간결하게 사용하기 위해
		// C#은 switch 대신 select case를 사용
		/*
		 * switch(조건값){ case 100: 문장실행; break; case 90: 문장실행; break; default:문장;
		 * }
		 */
		int score = 80;
		switch (score) {
		case 100:
			System.out.println("100: " + score);
			break;
		case 90:
			System.out.println("90: " + score);
			break;
		case 80:
			System.out.println("80: " + score);
			break;
		case 70:
			System.out.println("70: " + score);
			break;
		default:
			System.out.println("님 점수: " + score);
			// break를 빼면 case에 걸린 것 부터 아래를 쭉 다 실행한다.
			// 코드 정리는 블럭 지정 후 ctrl+shift+F
		}
		switch (score) {
			case 100:System.out.println("100: " + score);
			case 90:System.out.println("90: " + score);
			case 80:System.out.println("80: " + score);
			case 70:System.out.println("70: " + score);
			default:System.out.println("님 점수: " + score);
		}
		//자바 API > 난수생성 제공
		//java.lang은 default 패키지라 기본으로 열려 있다. 다시 열 수 없다.
		//하위는 열어봐야 하겠지?
		System.out.println("Math.random(): "+Math.random());
		//도움말에 S는 스태틱 자원, 객체를 만들지 않고 쓸 수 있다.
		//도움말에 리턴 타입, 출처 순으로 값을 넣으라고 설명되어 있다.
		System.out.println("Math.random()*10: "+Math.random()*10);
		//0~9까지만 나온다
		System.out.println("(int)(Math.random()*10): "+(int)(Math.random()*10));
		//정수부만 얻으려면 int로 캐스팅 하면 된다
		
		//Java API 문서에서, 모든 클래스는 object에서 파생된다.(extend)
		//0 <= random() < 1 (중요! 1보다 작다)
		//Returns: a pseudorandom double greater than or equal to 0.0 and less than 1.0.
		
		//정수 1~10까지의 난수를 얻고 싶다면
		System.out.println("(int)(Math.random()*10)+1: "+((int)(Math.random()*10)+1));
		
		//시나리오: 백화점 경품추첨
		//1000점:TV, 노트북, 냉장고, 한우, 휴지, 양말
		//900점:     노트북, 냉장고, 한우, 휴지, 양말
		//800점:           냉장고, 한우, 휴지, 양말
		//700점:                 한우, 휴지, 양말
		//600점:                      휴지, 양말
		//그외:                            양말
		//switch, Math.random 사용하기
		//break 없는 아름다운 코드
		int lotto=((int)((Math.random()*10)+1))*100;
		String item="";
		switch (lotto) {
			case 1000: item+="TV ";
			case 900: item+="노트북 ";
			case 800: item+="냉장고 ";
			case 700: item+="한우 ";
			case 600: item+="휴지 ";
			default: item+="양말";	
		}
		System.out.println("님 점수: "+lotto);
		System.out.println("이거 당첨: "+item);
	}
}