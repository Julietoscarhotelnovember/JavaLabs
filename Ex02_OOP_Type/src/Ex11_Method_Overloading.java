//��ü�������� ��ǥ���� ����: Method Overloading
//�ϳ��� �޼ҵ� �̸����� ���� ���� ����� �ϵ��� �Ѵ�
//����
//1.�Լ��� �̸��� ����
//2.parameter�� ������ type�� �ٸ���
//3.return type�� overloading �Ǵ� ������ �� �� ����
//4.parameter�� ������ �ٸ���

//������ �����ΰ�? ������ ���忡�� ���ؼ�
//�ϳ��� �Լ� �̸����� �������� ����� �� �� �־
//�����ε� ��� �� �������� ����
class OverTest {
	int add(int i) {
		return i+100;
	}
	int add(int i, int j) {
		return i+j;
	}
	int[] add(int[] param) { //param�� �޴°��� �迭�� �ּҰ�
		int[] target=new int[param.length];
		for (int i=0; i<param.length; i++) {
			target[i]=param[i]+1;
		}
		return target;
	}
	int[] add(int[] so, int[] so2) {
		int[] arr=new int[so.length];
		for (int i=0; i<so.length; i++) {
			arr[i]=so[i]+so2[i];
		}
		return arr;
	}
	
/* �̷��� �ȵ�	
	void add(int i) {
		return i+200;
	}
*/	
	void add(int i, String s) {
		//����
	}
	void add(String s, int i) {
		//����
	}
}

public class Ex11_Method_Overloading {

	public static void main(String[] args) {
		OverTest ot=new OverTest();
		int result=ot.add(100, 200);
		System.out.println(result);
		result=ot.add(50);
		System.out.println(result);
		
		//ó������ ����ߴ� �����ε� �Լ�
		//System.out.println();
		//���� ���鼭 ���� ����� �Ϳ� ����
		
		//�迭�� ��� �� �����ε� �����ϱ�	
		int[] source=new int[]{10,20,30};
		int[] target2=ot.add(source);
		for (int value:target2) {
			System.out.println(value);
		}
		
		int[] source2=new int[]{100,200,300};
		int[] source3=new int[]{400,500,600};
		int[] target3=ot.add(source2, source3);
		for (int value:target3) {
			System.out.println(value);
		}
		

	}
}
