package kr.or.kosta;

public class Hp {
	private int number;
	private String hpname;
	//��������
	public void writeNumber(int num) {
		number=num;
	}
	//�б�����
	public int readNumber() {
		return number;
	}
	//ĸ��ȭ�� member field�� ���ؼ�
	//�̷��ٿ� �ڹٿ��� �׳� getter, setter�� ������ �ְڴ�.
	//C#������ property, �ڹٿ����� read(getter), write(setter)
	//��Ŭ���� ��Ŭ��->Source->Generate getter/setter
	//���߿� �����ؼ� �� ���� �ֱ� ������, ������ ����/���ʹ� ��Ŭ�������� �ڵ������� ���������
	//�Լ��� �� ���̴�.
	public String getHpname() {
		return hpname;
	}
	public void setHpname(String hpname) {
		this.hpname = hpname;
	}
	
}
