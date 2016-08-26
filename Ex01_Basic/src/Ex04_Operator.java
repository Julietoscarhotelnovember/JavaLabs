public class Ex04_Operator {

	public static void main(String[] args) {
		// %는 나머지
		int result =100/100;
		System.out.println(result);
		
		// 증가감(++, --)
		int i=10;
		++i;	//전치증가, 변수 단독 사용은 전치/후치 동일
		System.out.println(i);
		i++;	//후치증가
		System.out.println(i);
		
		// 확인
		int i2=5;
		int j2=6;
		
		int result2=i2+ ++j2;	//연산수행 전 증가
		System.out.println("result2: "+result2);
		
		result2=i2+ j2++;	//연산수행 후 증가
		System.out.println("result2: "+result2);
		System.out.println(j2);
		
		// 자바에서의 연산규칙
		// 정수의 모든 연산은 int로 변환 후 처리
		// byte+byte => int+int의 결과
		byte b=100;
		byte c=101;
		//byte result3=b+c; 는 안됨
		int result3=b+c;	//이게 더 좋다
		byte result4=(byte)(b+c); //일반적으로 오버플로우의 상황이지만,
		//byte는 순회하고, 에러가 발생하지 않지만, 틀린 값이다.
		System.out.println("result4: "+result4);
		
		// byte+short => int+int
		// char+char => int+int
		
		// 실수+정수 하면 실수가 이긴다
		// float+int => float+float
		// float+long => flat+float
		// double+float => double+double
		float num2=10f;
		int num3=20;
		//float result5 = num2+num3;
		int result5 = (int)(num2+num3);	//손실주의
		
		char c2='!';	//아스키코드 33
		char c3='!';
		int ch_result=c2+c3;
		System.out.println(ch_result);
		char ch_result2=(char)(c2+c3);
		System.out.println(ch_result2);
		
		//연산자
		int sh=10/8;
		System.out.println("몫: "+sh);
		sh=10%8;
		System.out.println("나머지: "+sh);
		
		//1~10까지의 수 중에서 짝수의 합을 구하세요. (%연산자의 활용)
		int sum=0;
		for (int j=1; j<=10; j++) {
				if (j%2==0) {
					sum=sum+j;
				}
		}
		System.out.println("1~10까지 짝수의 합: "+sum);
		
		//값 비교
		if(10 == 10.0f){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if('A'!=65) {
			System.out.println("ture"); //다르면 true
		} else {
			System.out.println("false");
		}
		
		//외우기: 삼항연산자, 많이 쓰세요, 삼항 안에 삼항연산자가 또 들어가는 것
		int p=10;
		int k=-10;
		int result6= (p==10)? p:k;
		System.out.println(result6);
		//물음표 앞 조건식이 true이면 :앞의 값을 취하고, false면 :뒤의 값을 취함
		/*if(p==10){
			result6=p;
		}else{
			result6=k;
		}*/
		
		/*
		진리표     or, and
		0 0		0	0
		0 1		1	0
		1 0		1	0
		1 1		1	1
		*/
		
		int x=3;
		int y=5;
		
		//연산자 중 파이프 연산자 |
		//연산자 중 앤드 연산자 &
		//비트연산자(쓸일이 거의 없음, 영상처리 정도?)
		System.out.println(x|y);
		//십진수 3을 2진수로 바꾸는 쉬운 방법
		//128 64 32 16 8 4 2 1
		//             0 0 1 1  두개 합쳐 3이 되는것
		//십진수 5를 2진수로 바꾸는 쉬운 방법
		//             0 1 0 1  두개 합쳐 5가 되는 것
		//			   0 1 1 1  or 연산
		//               4+2+1 2진수를 10진수로
		System.out.println(x&y);
		//128 64 32 16 8 4 2 1
		//             0 0 1 1  두개 합쳐 3이 되는것
		//십진수 5를 2진수로 바꾸는 쉬운 방법
		//             0 1 0 1  두개 합쳐 5가 되는 것
		//			   0 0 0 1  or 연산
		//                   1  2진수를 10진수로
		
		//&&(and), ||(or) (논리연산자)
		//연산속도를 빠르게 할 수 있다 (true, false기능이 있어서)
		//if(10>0 && -1>1 && 100>2 && 1>-1 && ....) -1>1거짓
		//if(10>0 || -1>1 || 100>2 || 1>-1 || ....) 10>0참
		
	}

}
