package kr.or.kosta.util;

import java.util.Calendar;

public class Company_Date {
	//시스템에서 사용하는 날짜 제공 함수
	//빈도가 높으니 static으로 하는 것이 좋겠다
	public static String DateString(Calendar date) {
		//2016년 8월 3일 형식 리턴함수
		String sum=date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)
				        +"월 "+date.get(Calendar.DATE)+"일";
		return sum;
	}
	//(date, "/") > 2016/8/3 이런식으로 출력 해보기
	public static String DateString(Calendar date, String opr) {
		String sum=date.get(Calendar.YEAR)+opr+(date.get(Calendar.MONTH)+1)
		            	+opr+date.get(Calendar.DATE);
		return sum;
	}
	//년월일 > 1~9 한자리, 10~12 두자리 > 무조껀 2자리로 맞추기
	public static String MonthFormat(Calendar date) {
		//아직...
		return null;
		
	}
}
