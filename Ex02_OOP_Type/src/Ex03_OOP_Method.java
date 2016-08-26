//�Լ��� ����
//1. void�̸鼭 parameter�� �ִ� ���
//2. void�̸鼭 parameter�� ���� ���
//3. return type�̸鼭 parameter�� �ִ� ���
//4. return type�̸鼭 parameter�� ���� ���

//void: �����ִ� ���� ����
//return type: 8���� �⺻Ÿ�� + ����Ÿ�� + �迭 ����� �����ش�
//parameter: ����, �μ�, �Ű�����, ���� �޾Ƽ� �Լ� �������� �����ִ� ģ��
//           8���� �⺻Ÿ�� + ����Ÿ�� + �迭 ����� �����ش�

//�Լ��� ȣ�⿡ ���� ����ȴ�
//�Լ��� ����� ������ ����Ÿ��, �迭 ����� ���� ����
class Fclass {
	void m(){
		System.out.println("�Ϲ��Լ�(void, parameter ����)");
	}
	void m2(int param){
		System.out.println("param value: "+param);
		System.out.println("�Ϲ��Լ�(void, parameter ����)");
	}
	int m3(){
		return -100; //return type�� �����ϸ� ������ return�� ���
	}
	int m4(int param){
		return param+100;
	}
	int m5(int i, int j){
		return i+j;
	}
	//Quiz
	int max(int a, int b){
		//a �� b �� ū ���� return�ϴ� �Լ�
		//������ �ѹ��� �ϴ� ���� ����!
	/*	if (a>b) {
			return a;
		} else {
			return b;
		}*/
		/*int result=0;
		if(a>b){
			result=a;
		}else{
			result=b;
		}
		return result;*/
		int max=(a>b)?a:b;
		return max;	
	}
	String m6(String param1, String param2){
		return param1+":"+param2;
	}
	//������
	//class�� return type �Ǵ� parameter�� ����� �� �ִ�
	Car carMethod(){ //�ּҰ��� return�Ǿ� ������ ����ȴ� -> ��ü�� ������ �����ȴ�
		Car a=new Car();
		return a;
	}
	Car carMethod2(Car a){ //Car Ÿ������ ���� ��ü�� �ּ�
		return a;
	}
}

class Car{
	int door=10;
}

public class Ex03_OOP_Method {

	public static void main(String[] args) {
		Fclass f=new Fclass();
		f.m();
		f.m2(100);
		int result=f.m3();
		System.out.println("return value: "+result);
		result=f.m4(99);
		System.out.println("return value: "+result);
		result=f.m5(11, 17);
		System.out.println("return value: "+result);
		
		result=f.max(500, 499);
		System.out.println("return value: "+result);
		String str=f.m6("�浿", "����");
		System.out.println("return value: "+str);
		
		//������ ��������1
		//���� �ּҰ��� �����ϵ��� �ϴ� ����: return���� �ּҰ��� ���� ��ü�� �츮�� ����
		Car c=f.carMethod(); //���⼭ c�� �޾ұ� ������ heap�� �ö� �ִ� ��ü�� ����ִ�.
		System.out.println("return value: "+c.door);
		System.out.println(c);
		
		//������ ��������2
		Car car=new Car();
		Car car2=f.carMethod2(car);
		//c2 ���������� �ּҿ� car2 ���������� �ּҴ� ����.
		System.out.println(car==car2);
		System.out.println(car.hashCode()+":"+car2.hashCode());
		
	}

}
