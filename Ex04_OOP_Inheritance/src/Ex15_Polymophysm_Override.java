class Parent {
	int x=100;
	void pMethod() {
		System.out.println("parent method");
	}
}
class Child2 extends Parent {
	int x=200; //MS���: �θ� ���� �����ϱ�
	@Override
	void pMethod(){
		System.out.println("clild method");
	}
	void parentMethod() {
		super.pMethod();
		
	}
	void parentX() {
		System.out.println(super.x);
	}
}
public class Ex15_Polymophysm_Override {

	public static void main(String[] args) {
		Child2 c=new Child2();
		System.out.println("x�� ���� ��? "+c.x);
		c.pMethod();
		
		Parent p=c;
		System.out.println("x�� ���� ��? "+p.x);
		p.pMethod();
		
		//�θ� ���� pMethod ȣ��
		c.parentMethod();
		c.parentX();
		if(p instanceof Child2) {
			System.out.println("true");
		}

	}

}
