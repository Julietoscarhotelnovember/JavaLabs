package kr.or.kosta;
/*
�ó�����
����⸦ �ֹ� �����ϴ� ȸ�翡��
����� ���� ���赵�� ������� �Ѵ�
�䱸����
1.����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο���
2.����Ⱑ ����Ǹ� ����� ����(�̸�, ��ȣ)�� ����ؼ� Ȯ���� �� ����
3.������� ������� ������� ��������� ����ؼ� Ȯ���� �� ����
*/
public class AirPlane {
	private int apnum;
	private String apname;
	public static int apsum;
/*	������ ���� ��
	public void setData(String name, int num) {
		apname=name;
		apnum=num;
		apsum++;
	}
	public void printData() {
		System.out.printf("�̸�: %s\t��ȣ: %d\n", apname, apnum);
	}
	public static void countData() {
		System.out.println("�� ���� ���: "+apsum);
	}
	*/
	//������ ��� �� �ϴϱ� private get set �ϱ⵵ ���ϳ�!!!
	public AirPlane(String apname, int apnum) {
		this.apname=apname;
		this.apnum=apnum;
		apsum++;
	}
	public void printData() {
		System.out.printf("�̸�: %s\t��ȣ: %d\n", apname, apnum);
	}
	public static void countData() {
		System.out.println("�� ���� ���: "+apsum);
	}
}
