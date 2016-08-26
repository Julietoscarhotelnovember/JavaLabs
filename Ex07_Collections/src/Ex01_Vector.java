import java.util.Vector;

/*
Collection Framework
ǥ��ȭ�� �������̽��� �����ϰ� �ִ� Ŭ������ ����
Collection Interface -> List Interface (ArrayList)
						   -> Set Interface (HashSet)
Map Interface -> HashMap

1. List Interface (���� ���ÿ�)
����O �ߺ�O -> ���������� �����Ͱ����� �迭�� ���
ex) ����� ��ܿ� ��ȣǥ
Vector(��) -> ��Ƽ������ ����ȭ(��) �⺻ ����
ArrayList(��) -> ��Ƽ������ ����ȭ ��밡�� -> ���� ������, Ȱ�뵵�� ���� ����

�����迭(array)
1. �迭ũ�� ����
2. ���ٹ��: �ε����� ������ Ư�� ��ġ�� ����
3. �ʱ⿡ ������ �迭 ũ�⸦ ������ �� ����
 vs �ݷ���(�����迭) �� List �������̽�
 1. �迭�� ũ�⸦ �������� Ȯ��(����� ���� �迭�� ���Ҵ�)
 2. ������ ����(���������� index), �ߺ��� ���
 3. ������ ��������� object �迭 (private Object[] data;)
 4. Object[]�� �غ��� ���� Generic�� ���
 5. ����

2. Set Interface (�� �ȿ� �����ֱ�)
3. Map Interface (��ȭ��ȣ)
*/
public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("A");
		v.add("B");
		v.add(100);
		System.out.println(v.toString()); //�̹� ������ �Ǿ��ִ�
		for (int i=0; i<v.size(); i++) { //�迭ũ�� .length->.size
			System.out.println(v.get(i)); //�迭÷�� ��� get(index)
		}
		for (Object o:v) { //Ÿ�Լ��� ������ ��ȿ����
			System.out.println(o);
		}
		//�׷��� Object��뿡 ���� �������� �ذ��ϱ� ���� generic ���
		//��ü�� ���� �� �ʿ��� Ÿ���� ����
		Vector<String> v2=new Vector<String>();
		v2.add("AAA");
		v2.add("AAA");
		v2.add("BBB");
		for (String s:v2) {
			System.out.println(s);
		}
		System.out.println(v2.toString());
		System.out.println("�ݷ��� ũ��: "+v2.toString());
		System.out.println("�ݷ��� ����ɷ�: "+v2.capacity()); //����� �߿�
		//capacity-���� �ɷ� size-���� �����Ͱ� ä���� ����
		//.trimToSize() //�޸��� ���Ҵ��� �̷������(�׸��� �ڸ��ų� �ø����� ���Ѵ�)
		//.ensureCapacity(int)
		//.setSize(int)//����ɷº��� ������ �ڵ����� x2 ũ��
		//���ɻ����δ� ����, ����̸� �ִ� ����뷮���� ��Ƴ��� ���� ����
		//.clear() size ������ null�� ä��
		//�÷����� �߰��� ���� ������ ä��� �δ� (null�� �������� ��������)
		
		Vector v3=new Vector();
		System.out.println(v3.capacity()); //default 10
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println(v3.size());
		System.out.println(v3.capacity());
		v3.add("A");
		System.out.println(v3.size());
		System.out.println(v3.capacity()); //???
		
		
		
		

	}

}
