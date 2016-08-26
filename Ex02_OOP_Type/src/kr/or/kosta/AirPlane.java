package kr.or.kosta;
/*
시나리오
비행기를 주문 제작하는 회사에서
비행기 생산 설계도를 만들려고 한다
요구사항
1.비행기를 생산하고 비행기의 이름과 번호를 부여함
2.비행기가 생산되면 비행기 정보(이름, 번호)를 출력해서 확인할 수 있음
3.현재까지 만들어진 비행기의 누적대수를 출력해서 확인할 수 있음
*/
public class AirPlane {
	private int apnum;
	private String apname;
	public static int apsum;
/*	생성자 배우기 전
	public void setData(String name, int num) {
		apname=name;
		apnum=num;
		apsum++;
	}
	public void printData() {
		System.out.printf("이름: %s\t번호: %d\n", apname, apnum);
	}
	public static void countData() {
		System.out.println("총 생산 대수: "+apsum);
	}
	*/
	//생성자 배운 후 하니까 private get set 하기도 편하네!!!
	public AirPlane(String apname, int apnum) {
		this.apname=apname;
		this.apnum=apnum;
		apsum++;
	}
	public void printData() {
		System.out.printf("이름: %s\t번호: %d\n", apname, apnum);
	}
	public static void countData() {
		System.out.println("총 생산 대수: "+apsum);
	}
}
