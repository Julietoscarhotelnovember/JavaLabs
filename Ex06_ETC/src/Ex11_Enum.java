//������(enum) Ÿ��
/*class Calendar { �̷��� ����� ��ü�ϴ� �ڿ�
	public static final int NUM=0;
}*/

//����ڰ� ������ ����� �������� "���"���� ������ �ϴ� �ڷ���
//static final
//enum �����̸� {��� ��� ����Ʈ}
//ex) ������ Spring�̱� ������, ���������δ� 0
//public enum Season {SPRING, SUMMER, FALL, WINTER}
//������ ����� ���������� 0���� 1�� �����ϸ鼭 ���� ������
//�����ڰ� �ڵ��� �������� ���̱� ���� ����Ѵ�
//��ġ�� Ŭ����, Ŭ���� ���� ��� ����
enum Season {SPRING, SUMMER, AUTUMN, WINTER}

public class Ex11_Enum {
	public static void main(String[] args) {
		Season s=Season.SPRING;
		System.out.println(s);
		for (Season s2:Season.values()) {
			System.out.println(s2.name()+" / "+s2.ordinal());
		}
	}
}
