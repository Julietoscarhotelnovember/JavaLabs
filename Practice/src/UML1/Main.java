package UML1;

public class Main {
	public static void main(String[] args) {
		Data data1=new Data(1, "�ǻ簡 û����� ����");
		Data data2=new Data(2, "��ȣ�簡 �ֻ�� �ֻ縦 ����");
		Data data3=new Data(3, "ȯ�ڰ� �ش�� ��������");
		Doctor d=new Doctor("�ǻ�", 50, "û����", data1);
		Nurse n=new Nurse("��ȣ��", 25, "�ֻ��", data2);
		Patient p=new Patient("ȯ��", 30, "�ش�", data3);
		d.printData();
		n.printData();
		p.printData();
	}
}