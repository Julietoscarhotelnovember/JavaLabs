import java.util.Calendar;
import java.util.Date;

import kr.or.kosta.util.Company_Date;

/* 자바api에서 날짜 다루기
 
Calendar 를 상속받아 완전히 구현한 클래스는 
GregorianCalendar, buddhisCalendar가 있는데,
getInstance()는 [시스템의 국가와 지역설정]을 [확인]해서
태국인 경우 buddhisCalendar 의 인스턴스를 반환하고,
그 외에는 GregorianCalendar의 인스턴스를 반환한다.

GregorianCalendar는 Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는 
그레고리력에 맞게 구현한 것으로, 태국을 제외한 나머지 국가에서는 GregorianCalendar 사용

그래서 인스턴스를 직접 생성해서 사용하지 않고 메서드를 통해서 인스턴스를 반환받게하는
이유는 최소의 변경으로 프로그램 동작을 하도록 하기 위함

class MyApp {
	static void main(){
    	Calendar cal = new GregorianCalendar();
   		//다른 종류의 역법의 사용하는 국가에서 실행하면 변경......
   	}
}

API : 생성자 Protected Calendar() 
날짜 : Date (구) -> Calendar(신)

*/

public class Ex13_Calendar {

	public static void main(String[] args) {
		Date dt=new Date();
		System.out.println(dt);
		
		Calendar today=Calendar.getInstance(); //static, new를 하지 않는다(싱글톤처럼)
		//자바api가 알아서 시스템의 날짜정보를 읽어 반환한다
		//표준화 시켜놨기 때문에 굳이 객체생성을 하지 않고 바로 쓴다
		System.out.println(today);
		
		//열거형을 쓴다
		System.out.print(today.get(Calendar.YEAR)+"년 ");
		System.out.print((today.get(Calendar.MONTH)+1)+"월 "); //주의 0~11월으로 나온다
		System.out.println(today.get(Calendar.DATE)+"일");
		
		System.out.println("이 달의 "+today.get(Calendar.WEEK_OF_MONTH)+"번째 주");
		System.out.println("이 달의 "+today.get(Calendar.DAY_OF_MONTH)+"번째 일");
		System.out.println("이 주의 "+today.get(Calendar.DAY_OF_WEEK)+"번째 일"); //시작일-일요일(1)
		System.out.println("오전/오후: "+today.get(Calendar.AM_PM));
		System.out.println("현재 시각: "+today.get(Calendar.HOUR)+":"
								+today.get(Calendar.MINUTE)+":"+today.get(Calendar.SECOND));
		
		//날짜/문자 등등을 모든 페이지에 세팅하는 것은 정말 미친짓
		//이러한 common util은 함수를 만들어서 처리하고, 각 페이지에서는 함수를 호출하자
		Calendar date=Calendar.getInstance();
		System.out.println(Company_Date.DateString(date, "/"));
		
	}
}
