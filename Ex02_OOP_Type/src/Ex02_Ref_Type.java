/*사원이라는 설계도 만들기
사원은 사번, 이름 , 전화번호의 정보를 가지고 있음
사원의 사번, 이름 , 전화번호 정보를 출력하는 기능
사번은 숫자, 이름은 문자, 전화번호는 문자
kr.or.kosta 패키지 안에 사원이라는 설계도를 만들고 사원 2명을 만들고 정보 출력하기*/
import kr.or.kosta.Emp;
public class Ex02_Ref_Type {
	public static void main(String[] args){
		Emp e1=new Emp();
		Emp e2=new Emp();
		e1.epnum=1;
		e1.epname="이말년";
		e1.epphone="031-628-1480";
		e1.epPrint();
		e2.epnum=2;
		e2.epname="와장창";
		e2.epphone="031-628-1481";
		e2.epPrint();
	}
}
