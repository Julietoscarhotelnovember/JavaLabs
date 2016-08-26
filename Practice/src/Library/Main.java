package Library;
public class Main {
	public static void main(String[] args) {
		//氓父甸扁
		Book[] book=new Book[4];
		book[0]=new Book("氓力格1", "历磊1", 5);
		book[1]=new Book("氓力格2", "历磊2", 2);
		book[2]=new Book("氓力格3", "历磊3", 0);
		book[3]=new Book("氓力格4", "历磊4", 3);
		
		//矫胶袍 积己
		Management mang=new Management(book);
		mang.displayMenu();
	}
}