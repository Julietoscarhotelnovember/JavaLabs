package Library;
public class Main {
	public static void main(String[] args) {
		//å�����
		Book[] book=new Book[4];
		book[0]=new Book("å����1", "����1", 5);
		book[1]=new Book("å����2", "����2", 2);
		book[2]=new Book("å����3", "����3", 0);
		book[3]=new Book("å����4", "����4", 3);
		
		//�ý��� ����
		Management mang=new Management(book);
		mang.displayMenu();
	}
}