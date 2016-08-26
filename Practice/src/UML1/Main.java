package UML1;

public class Main {
	public static void main(String[] args) {
		Data data1=new Data(1, "의사가 청진기로 진찰");
		Data data2=new Data(2, "간호사가 주사로 주사를 놓음");
		Data data3=new Data(3, "환자가 붕대로 감겨있음");
		Doctor d=new Doctor("의사", 50, "청진기", data1);
		Nurse n=new Nurse("간호사", 25, "주사기", data2);
		Patient p=new Patient("환자", 30, "붕대", data3);
		d.printData();
		n.printData();
		p.printData();
	}
}