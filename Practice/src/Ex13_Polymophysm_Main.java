//�������� ��ġ�� ���� �� �ܿ�

//�ó�����
//������ǰ ���� �ַ�� ���� ���������, A��� �ϴ� ������ǰ ������ �����Ͽ���

//�䱸����
//�������: ��ǰ�� ��������, ��ǰ�� ����Ʈ ����
//�� ������ǰ�� ��ǰ�� Ư¡�� ������ ����(��ǰ�̸�, ex) TV, Audio, Computer)
//TV������ ������ ����, Audio ������ ������ ���� ���, ����Ʈ�� ������ 10%

//������: ��ǰ�� �����ϱ� ���� �ݾ�����, ����Ʈ ������ ������ ����
//�����ڴ� ������ǰ�� ���� ���������� �Ѵ�.
//�����ϸ� �������� �ݾ� ����, ����Ʈ�� ����
//�����ڴ� �⺻ �ݾ��� ������ �ִ�

//1���ڵ� ���� 100�� ǰ�� �߰� �� ���� ��Ը� ����
//������: ��ǰ���� �Ǹ������� ���� ���� ���� �ִ�
//��ǰ�� �߰� �� ������ �����Լ��� ���� �߰��ؾ� �Ѵ�.
//�� �ڵ带 �����϶�.

class Price {
	int price;
	int point;
}
class Television extends Price {
	String name;
	Television(String name, int price){
		this.name=name;
		this.price=price;
		this.point+=(int)(price*0.1);
	}
}
class Audio extends Price {
	String name;
	Audio(String name, int price){
		this.name=name;
		this.price=price;
		this.point+=(int)(price*0.1);
	}
}
class Computer extends Price {
	String name;
	Computer(String name, int price){
		this.name=name;
		this.price=price;
		this.point+=(int)(price*0.1);
	}
}
class Person {
	int amount=10000000;
	int point=0;
	void Buy(int price){
		this.amount-=price;
		this.point+=(int)(price*0.1);	
	}
}

//2���ڵ�
//�����Լ��� �̸��� �����ϰ�(buy)�Ͽ� ��� ������ �����ϵ���
//������� �ѵ�

//3���ڵ�
//�ټ��� ������ �԰�Ǿ��� �� �Լ� �ڵ带 �߰��ؾ���
//�ݺ����� �ڵ带 �����ؾ� ���ʹ�

public class Ex13_Polymophysm_Main {
	public static void main(String[] args) {
		Television t=new Television("����UHD", 5000000);
		Audio a=new Audio("�����̺������", 100000);
		Computer c=new Computer("LG�׷�", 1000000);
		Person p=new Person();
		System.out.println(p.amount+" : "+p.point);
		p.Buy(t.price);
		System.out.println(p.amount+" : "+p.point);
	}
}
