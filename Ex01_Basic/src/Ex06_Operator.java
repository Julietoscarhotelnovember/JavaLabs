public class Ex06_Operator {
	public static void main(String[] args) {
		// ���
		// ���ǹ� : if, if ~else, if~ else if ~else
		// ���ǹ� : switch�� ����� ���� ���� ��� �����ϰ� ����ϱ� ����
		// C#�� switch ��� select case�� ���
		/*
		 * switch(���ǰ�){ case 100: �������; break; case 90: �������; break; default:����;
		 * }
		 */
		int score = 80;
		switch (score) {
		case 100:
			System.out.println("100: " + score);
			break;
		case 90:
			System.out.println("90: " + score);
			break;
		case 80:
			System.out.println("80: " + score);
			break;
		case 70:
			System.out.println("70: " + score);
			break;
		default:
			System.out.println("�� ����: " + score);
			// break�� ���� case�� �ɸ� �� ���� �Ʒ��� �� �� �����Ѵ�.
			// �ڵ� ������ �� ���� �� ctrl+shift+F
		}
		switch (score) {
			case 100:System.out.println("100: " + score);
			case 90:System.out.println("90: " + score);
			case 80:System.out.println("80: " + score);
			case 70:System.out.println("70: " + score);
			default:System.out.println("�� ����: " + score);
		}
		//�ڹ� API > �������� ����
		//java.lang�� default ��Ű���� �⺻���� ���� �ִ�. �ٽ� �� �� ����.
		//������ ������� �ϰ���?
		System.out.println("Math.random(): "+Math.random());
		//���򸻿� S�� ����ƽ �ڿ�, ��ü�� ������ �ʰ� �� �� �ִ�.
		//���򸻿� ���� Ÿ��, ��ó ������ ���� ������� ����Ǿ� �ִ�.
		System.out.println("Math.random()*10: "+Math.random()*10);
		//0~9������ ���´�
		System.out.println("(int)(Math.random()*10): "+(int)(Math.random()*10));
		//�����θ� �������� int�� ĳ���� �ϸ� �ȴ�
		
		//Java API ��������, ��� Ŭ������ object���� �Ļ��ȴ�.(extend)
		//0 <= random() < 1 (�߿�! 1���� �۴�)
		//Returns: a pseudorandom double greater than or equal to 0.0 and less than 1.0.
		
		//���� 1~10������ ������ ��� �ʹٸ�
		System.out.println("(int)(Math.random()*10)+1: "+((int)(Math.random()*10)+1));
		
		//�ó�����: ��ȭ�� ��ǰ��÷
		//1000��:TV, ��Ʈ��, �����, �ѿ�, ����, �縻
		//900��:     ��Ʈ��, �����, �ѿ�, ����, �縻
		//800��:           �����, �ѿ�, ����, �縻
		//700��:                 �ѿ�, ����, �縻
		//600��:                      ����, �縻
		//�׿�:                            �縻
		//switch, Math.random ����ϱ�
		//break ���� �Ƹ��ٿ� �ڵ�
		int lotto=((int)((Math.random()*10)+1))*100;
		String item="";
		switch (lotto) {
			case 1000: item+="TV ";
			case 900: item+="��Ʈ�� ";
			case 800: item+="����� ";
			case 700: item+="�ѿ� ";
			case 600: item+="���� ";
			default: item+="�縻";	
		}
		System.out.println("�� ����: "+lotto);
		System.out.println("�̰� ��÷: "+item);
	}
}