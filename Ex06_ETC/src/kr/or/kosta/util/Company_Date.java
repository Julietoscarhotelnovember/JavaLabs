package kr.or.kosta.util;

import java.util.Calendar;

public class Company_Date {
	//�ý��ۿ��� ����ϴ� ��¥ ���� �Լ�
	//�󵵰� ������ static���� �ϴ� ���� ���ڴ�
	public static String DateString(Calendar date) {
		//2016�� 8�� 3�� ���� �����Լ�
		String sum=date.get(Calendar.YEAR)+"�� "+(date.get(Calendar.MONTH)+1)
				        +"�� "+date.get(Calendar.DATE)+"��";
		return sum;
	}
	//(date, "/") > 2016/8/3 �̷������� ��� �غ���
	public static String DateString(Calendar date, String opr) {
		String sum=date.get(Calendar.YEAR)+opr+(date.get(Calendar.MONTH)+1)
		            	+opr+date.get(Calendar.DATE);
		return sum;
	}
	//����� > 1~9 ���ڸ�, 10~12 ���ڸ� > ������ 2�ڸ��� ���߱�
	public static String MonthFormat(Calendar date) {
		//����...
		return null;
		
	}
}
