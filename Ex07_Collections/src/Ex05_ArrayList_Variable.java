import java.util.ArrayList;

class Empdata {
	private ArrayList elist;
	private int[] number;
	public Empdata() {
		this.elist=new ArrayList();
		this.number=new int[10];
	}
	public int[] getNumber() {
		return number;
	}
	public void setNumber(int[] number) {
		this.number = number;
	}
	public ArrayList getElist() {
		return elist;
	}
	public void setElist(ArrayList elist) {
		this.elist = elist;
	}
}
public class Ex05_ArrayList_Variable {

	public static void main(String[] args) {
		Empdata empdata=new Empdata();
		ArrayList arraylist=new ArrayList();
		arraylist.add(100);
		empdata.setElist(arraylist);
		ArrayList relist=empdata.getElist();
		System.out.println(relist.get(0));
	}
}
