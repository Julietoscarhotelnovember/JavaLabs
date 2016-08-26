import kr.or.kosta.Pclass;

//상속관계에서 protected를 사용하는 의미는?
//앞으로의 변경 가능성이 있으니 니가 변경을 했으면 좋겠는데....
class Dclass {
	private int i;
	public int j;
	protected int k; //상속관계에서만 사용
}
class Fclass extends Dclass{
	void fMethod(){
		j=500;
		k=200; //상속관계에서는 접근이 가능
		//다른 패키지의 클래스 안에  protected 접근자는
		//객체 입장에서는 private, 상속에서는 public
		
		//어차피 클래스는 다른 패키지에서 성성하게 된다
		//-> 결국 상속관계에서만 접근 가능하게 된다
	}
}
class Fclass2 extends Pclass{
	void method(){
		pint=100;
		tint=200;
	}
}
public class Ex08_Inheritance_Protected {
	public static void main(String[] args) {
		Fclass f=new Fclass();
		f.k=2000; //protected여도 같은 폴더에 있어서 접근 가능
		Pclass p =new Pclass();
		//p.tint=555; //다른 폴더에 있어서 접근 불가
	}

}
