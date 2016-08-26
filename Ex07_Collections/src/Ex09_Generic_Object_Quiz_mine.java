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
		Product p2 = new Audio(); //다형성 (자식타입의 객체를 부모가 참조)
		Product[] parray = {new Tv(), new Audio()}; // , new NoteBook()}(X);
		/////////////////////////////////////////////////////
		//위 코드 정적(Array) 사용
		//Collection 전환 
		//Generic 다형성 적용
		ArrayList<Product> plist = new ArrayList<Product>();
		plist.add(new Tv());
		plist.add(new Audio());
		//plist.add(new NoteBook()); NoteBook <-> Product 연관성(x)
		for(Product pro : plist){
			System.out.println(pro.toString());
		}
		
	}

}
