//this ����: ������ ������ ��ü�� �ּҰ� ��� ������ �����ϰ� ����Ѵ�
//��ü�� �ּ�(������)�� ����
//1.��ü�� ����Ű�� this.name
//2.�����ڸ� ȣ���ϴ� this()
//������ this ��뿹��(Ex18���� ����)

class Selfthis {
	String name;
	Selfthis() {
		//this.name="������";
		this("������");
	}
	Selfthis(String name) {
		this.name=name;
	}
}
public class Ex19_this {

	public static void main(String[] args) {
		Selfthis t=new Selfthis();
		System.out.println(t.name);
		Selfthis t2=new Selfthis("���߳�");
		System.out.println(t2.name);
	}
}
