/*����̶�� ���赵 �����
����� ���, �̸� , ��ȭ��ȣ�� ������ ������ ����
����� ���, �̸� , ��ȭ��ȣ ������ ����ϴ� ���
����� ����, �̸��� ����, ��ȭ��ȣ�� ����
kr.or.kosta ��Ű�� �ȿ� ����̶�� ���赵�� ����� ��� 2���� ����� ���� ����ϱ�*/
import kr.or.kosta.Emp;
public class Ex02_Ref_Type {
	public static void main(String[] args){
		Emp e1=new Emp();
		Emp e2=new Emp();
		e1.epnum=1;
		e1.epname="�̸���";
		e1.epphone="031-628-1480";
		e1.epPrint();
		e2.epnum=2;
		e2.epname="����â";
		e2.epphone="031-628-1481";
		e2.epPrint();
	}
}
