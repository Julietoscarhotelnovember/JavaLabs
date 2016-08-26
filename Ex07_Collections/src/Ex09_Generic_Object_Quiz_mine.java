import java.util.ArrayList;

class Product{}

class Tv extends Product{
	@Override
	public String toString() {
		return "Tv";
	}
}
class Audio extends Product{
	
}
class NoteBook{}

public class Ex09_Generic_Object_Quiz_mine {
	public static void main(String[] args) {
		Product p = new Product();
		Tv t = new Tv();
		Product p2 = new Audio(); //������ (�ڽ�Ÿ���� ��ü�� �θ� ����)
		Product[] parray = {new Tv(), new Audio()}; // , new NoteBook()}(X);
		/////////////////////////////////////////////////////
		//�� �ڵ� ����(Array) ���
		//Collection ��ȯ 
		//Generic ������ ����
		ArrayList<Product> plist = new ArrayList<Product>();
		plist.add(new Tv());
		plist.add(new Audio());
		//plist.add(new NoteBook()); NoteBook <-> Product ������(x)
		for(Product pro : plist){
			System.out.println(pro.toString());
		}
		
	}

}
