//��ü�迭
//�迭�� Ÿ���̴�
class Person {
	String name;
	int age;
}
public class Ex04_Array_Object {
	public static void main(String[] args) {
		//8���� �⺻Ÿ��
		int[] intarry=new int[10];
		
		//�迭 ���� -> int i, j, k
		/*Person p=new Person();
		Person p2=new Person();
		Person p3=new Person();*/
		
		//�迭 ����
		Person[] objArray=new Person[3];
		System.out.println("Before");
		System.out.println(objArray[0]);
		System.out.println(objArray[1]);
		System.out.println(objArray[2]);
		//�� ������ ��ü�� �ø� �� �ִ� ������ �ְ�, ��ü�� ����
		//�ʱ�ȭ�� �� �־�� �Ѵ�
		objArray[0]=new Person();
		objArray[1]=new Person();
		objArray[2]=new Person();
		System.out.println("After");
		System.out.println(objArray[0]);
		System.out.println(objArray[1]);
		System.out.println(objArray[2]);
		
		objArray[0].name="ȫ�浿";
		objArray[0].age=100;
		System.out.println(objArray[0].name);
		System.out.println(objArray[0].age);
		
		//for���� ����ؼ� objArray�� �� �濡 �ִ� ��ü�� name, age���� ���
		for (int i=0; i<objArray.length; i++) {
			System.out.print(i+" ���� �̸�: "+objArray[i].name);
			System.out.print(" "+i+" ���� ����: "+objArray[i].age);
			System.out.println();
		}
		
		//��ü�迭 �����ϱ�=�迭������ ����
		Person[] array=new Person[]{new Person(), new Person(), new Person()};
		Person[] array2={new Person(), new Person()};
		
		//�迭�� ����
		Person[] parray=new Person[10];
		for (int i=0; i<parray.length; i++) {
			parray[i]=new Person();
			System.out.println(parray[i].age+" "+parray[i].name);
		}
	}
}
