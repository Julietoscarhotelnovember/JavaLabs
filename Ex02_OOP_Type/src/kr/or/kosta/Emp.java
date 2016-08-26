package kr.or.kosta;

public class Emp {
	public int epnum;
	public String epname;
	public String epphone;
	public void epPrint(){
		System.out.printf("사번: %d\t이름: %s\t전화번호: %s\n", epnum, epname, epphone);
	}
}
