//this ���
//������ ������ ��ü�� �ּҸ� ���� ���� �����ؼ� �����ϴ� Ű����
//1.��ü �ڽ��� ����Ű�� this -> �ڵ��� �������� ��������(����ʵ带 ������ �� �ִ�)
//2.�����ڸ� ȣ���ϴ� this -> �ڵ��� ���뼺�� ��������

class Test5 {
	int i;
	int j;
	Test5() {}
	/*Test5(int num, int num2) {
		i=num;
		j=num2;
	}*/
	Test5(int i, int j) {
		this.i=i; //��ü �ڽ��� ����Ű�� this
		this.j=j;
	}
}
class Scar {
	String color;
	String gearType;
	int door;
	Scar() {
		//�����ڸ� ȣ���ϴ� this()
		this("red", 4, "Auto"); //�ٽ� �����ڸ� ����->3��© ��� �ٽ� ����� ���ƿ´�
		System.out.println("default ������ ȣ��");
		/*this.color="red";
		this.door=4;
		this.gearType="Auto";*/
	}
	Scar(String color, int door) {
		this.color=color;
		this.door=door;
		//���Ÿ���� null
	}
	Scar(String color, int door, String gearType) {
		this.color=color;
		this.door=door;
		this.gearType=gearType;
		System.out.println("�Ķ���� 3��© ������ ȣ��");
	}
	void display() {
		System.out.println(this.color+" : "+this.door+" : "+this.gearType);
	}
}

class Scar2 {
	String color;
	String gearType;
	int door;
	Scar2() { //�Ҵ��� �� ������ �����ڿ����� �Ͼ��
			  //�ǵ�: �⺻ ���� ��4 ����, ���� ���� �ɼǿ� ���� ����, ���߿� ������ �� �� �ִ�
		this("red", 4);
		System.out.println("default constructor"); //3������
	}
	Scar2(String color, int door) {
		this(color, door, "Auto");
		System.out.println("parameter 2��"); //2������
	}
	Scar2(String color, int door, String gearType) {
		this.color=color;
		this.door=door;
		this.gearType=gearType;
		System.out.println("parameter 3��"); //1�� ����
	}
	void display() {
		System.out.println(this.color+" : "+this.door+" : "+this.gearType);
	}
}
public class Ex18_this {
	public static void main(String[] args) {
		Test5 t=new Test5(10, 20);
		Test5 t2=new Test5(11, 12);
		
		//��Ģ: ��ü ������ �����ڴ� 1���� ȣ���� �����ϴ�
		Scar sc1=new Scar();
		sc1.display();
		Scar sc2=new Scar("blue", 5);
		sc2.display();
		Scar sc3=new Scar("yellow", 5, "Manual");
		sc3.display();
		
		//this�� �ٸ� ������ ȣ��->ȣ�� ������ ����
		Scar sc4=new Scar();
		sc4.display();
		
		Scar2 sc5=new Scar2();
		sc4.display();
		Scar2 sc6=new Scar2("yellow", 2);
		sc6.display();
		Scar2 sc7=new Scar2("gold", 1, "manual");
		sc7.display();
	}
}
