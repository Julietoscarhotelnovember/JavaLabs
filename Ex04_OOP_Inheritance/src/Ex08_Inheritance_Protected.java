import kr.or.kosta.Pclass;

//��Ӱ��迡�� protected�� ����ϴ� �ǹ̴�?
//�������� ���� ���ɼ��� ������ �ϰ� ������ ������ ���ڴµ�....
class Dclass {
	private int i;
	public int j;
	protected int k; //��Ӱ��迡���� ���
}
class Fclass extends Dclass{
	void fMethod(){
		j=500;
		k=200; //��Ӱ��迡���� ������ ����
		//�ٸ� ��Ű���� Ŭ���� �ȿ�  protected �����ڴ�
		//��ü ���忡���� private, ��ӿ����� public
		
		//������ Ŭ������ �ٸ� ��Ű������ �����ϰ� �ȴ�
		//-> �ᱹ ��Ӱ��迡���� ���� �����ϰ� �ȴ�
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
		f.k=2000; //protected���� ���� ������ �־ ���� ����
		Pclass p =new Pclass();
		//p.tint=555; //�ٸ� ������ �־ ���� �Ұ�
	}

}
