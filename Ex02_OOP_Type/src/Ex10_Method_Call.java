class Data {
	int i;
}
public class Ex10_Method_Call {

	public static void main(String[] args) {
		Data data=new Data();
		data.i=100;
		Call(data); //주소를 전달
		System.out.println(data.i);
		
		Vcall(data.i); //값을 전달
		System.out.println(data.i);
	}
	static void Call(Data d) { //주소값을 받음
		System.out.println(d.i);
		d.i=5555;
	}
	static void Vcall(int x) { //값을 받음
		x=8888;
		System.out.println(x);
	}
}

//설계도 안에 굳이 static 메소드를 만들어 넣었다면 그 의도는?
//많이 쓰는 자원이라서 편하게 쓰도록 만들겠다
//ex) System.out.println(); -> out이 스태틱 자원