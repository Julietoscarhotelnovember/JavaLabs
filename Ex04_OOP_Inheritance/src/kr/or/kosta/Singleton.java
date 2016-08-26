package kr.or.kosta;
//������ ����
//�� ���� ���� ���̴� �̱��� ����

//new Singleton()�� ���ϰ� ���� �ʹٸ�? (�����ε� ����) �����ڸ� private���� ���´�
//�ϳ��� ���� �ϱ� ����
//���������� ���� 
//���������� �̿��� ��ǥ���� ����

//�ó�����
//������ ��Ʈ��ũ ����
//����̹� �ε� �� ����
public class Singleton {
	private static Singleton p=new Singleton();
	private Singleton(){}
	public static Singleton getInstance(){
		if(p==null) {
			p=new Singleton();
		}
		return p;
	}
}
