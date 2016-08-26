import java.util.Calendar;
import java.util.Date;

import kr.or.kosta.util.Company_Date;

/* �ڹ�api���� ��¥ �ٷ��
 
Calendar �� ��ӹ޾� ������ ������ Ŭ������ 
GregorianCalendar, buddhisCalendar�� �ִµ�,
getInstance()�� [�ý����� ������ ��������]�� [Ȯ��]�ؼ�
�±��� ��� buddhisCalendar �� �ν��Ͻ��� ��ȯ�ϰ�,
�� �ܿ��� GregorianCalendar�� �ν��Ͻ��� ��ȯ�Ѵ�.

GregorianCalendar�� Calendar�� ��ӹ޾� ���ó� ������ �������� ����ϰ� �ִ� 
�׷����¿� �°� ������ ������, �±��� ������ ������ ���������� GregorianCalendar ���

�׷��� �ν��Ͻ��� ���� �����ؼ� ������� �ʰ� �޼��带 ���ؼ� �ν��Ͻ��� ��ȯ�ް��ϴ�
������ �ּ��� �������� ���α׷� ������ �ϵ��� �ϱ� ����

class MyApp {
	static void main(){
    	Calendar cal = new GregorianCalendar();
   		//�ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......
   	}
}

API : ������ Protected Calendar() 
��¥ : Date (��) -> Calendar(��)

*/

public class Ex13_Calendar {

	public static void main(String[] args) {
		Date dt=new Date();
		System.out.println(dt);
		
		Calendar today=Calendar.getInstance(); //static, new�� ���� �ʴ´�(�̱���ó��)
		//�ڹ�api�� �˾Ƽ� �ý����� ��¥������ �о� ��ȯ�Ѵ�
		//ǥ��ȭ ���ѳ��� ������ ���� ��ü������ ���� �ʰ� �ٷ� ����
		System.out.println(today);
		
		//�������� ����
		System.out.print(today.get(Calendar.YEAR)+"�� ");
		System.out.print((today.get(Calendar.MONTH)+1)+"�� "); //���� 0~11������ ���´�
		System.out.println(today.get(Calendar.DATE)+"��");
		
		System.out.println("�� ���� "+today.get(Calendar.WEEK_OF_MONTH)+"��° ��");
		System.out.println("�� ���� "+today.get(Calendar.DAY_OF_MONTH)+"��° ��");
		System.out.println("�� ���� "+today.get(Calendar.DAY_OF_WEEK)+"��° ��"); //������-�Ͽ���(1)
		System.out.println("����/����: "+today.get(Calendar.AM_PM));
		System.out.println("���� �ð�: "+today.get(Calendar.HOUR)+":"
								+today.get(Calendar.MINUTE)+":"+today.get(Calendar.SECOND));
		
		//��¥/���� ����� ��� �������� �����ϴ� ���� ���� ��ģ��
		//�̷��� common util�� �Լ��� ���� ó���ϰ�, �� ������������ �Լ��� ȣ������
		Calendar date=Calendar.getInstance();
		System.out.println(Company_Date.DateString(date, "/"));
		
	}
}
