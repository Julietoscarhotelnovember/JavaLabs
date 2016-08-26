class Data {
	int iv=0;
}
class MyTreadData extends Thread {
	Data d;
	public MyTreadData(Data d) {
		this.d=d;
	}
	@Override
	public void run() {
		int lv=0;
		while (lv<3) {
			System.out.println(this.getName()+" local variable: "+ ++lv);
			System.out.println(this.getName()+" instance variable: "+ ++d.iv);
			System.out.println();
		}
	}
}
//이것도 객체공유
public class Ex11_Sync_Thread_Ref {
	public static void main(String[] args) {
		Data d=new Data();
		MyTreadData th=new MyTreadData(d);
		MyTreadData th2=new MyTreadData(d);
		th.start();
		th2.start();
	}
}
