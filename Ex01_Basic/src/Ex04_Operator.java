public class Ex04_Operator {

	public static void main(String[] args) {
		// %�� ������
		int result =100/100;
		System.out.println(result);
		
		// ������(++, --)
		int i=10;
		++i;	//��ġ����, ���� �ܵ� ����� ��ġ/��ġ ����
		System.out.println(i);
		i++;	//��ġ����
		System.out.println(i);
		
		// Ȯ��
		int i2=5;
		int j2=6;
		
		int result2=i2+ ++j2;	//������� �� ����
		System.out.println("result2: "+result2);
		
		result2=i2+ j2++;	//������� �� ����
		System.out.println("result2: "+result2);
		System.out.println(j2);
		
		// �ڹٿ����� �����Ģ
		// ������ ��� ������ int�� ��ȯ �� ó��
		// byte+byte => int+int�� ���
		byte b=100;
		byte c=101;
		//byte result3=b+c; �� �ȵ�
		int result3=b+c;	//�̰� �� ����
		byte result4=(byte)(b+c); //�Ϲ������� �����÷ο��� ��Ȳ������,
		//byte�� ��ȸ�ϰ�, ������ �߻����� ������, Ʋ�� ���̴�.
		System.out.println("result4: "+result4);
		
		// byte+short => int+int
		// char+char => int+int
		
		// �Ǽ�+���� �ϸ� �Ǽ��� �̱��
		// float+int => float+float
		// float+long => flat+float
		// double+float => double+double
		float num2=10f;
		int num3=20;
		//float result5 = num2+num3;
		int result5 = (int)(num2+num3);	//�ս�����
		
		char c2='!';	//�ƽ�Ű�ڵ� 33
		char c3='!';
		int ch_result=c2+c3;
		System.out.println(ch_result);
		char ch_result2=(char)(c2+c3);
		System.out.println(ch_result2);
		
		//������
		int sh=10/8;
		System.out.println("��: "+sh);
		sh=10%8;
		System.out.println("������: "+sh);
		
		//1~10������ �� �߿��� ¦���� ���� ���ϼ���. (%�������� Ȱ��)
		int sum=0;
		for (int j=1; j<=10; j++) {
				if (j%2==0) {
					sum=sum+j;
				}
		}
		System.out.println("1~10���� ¦���� ��: "+sum);
		
		//�� ��
		if(10 == 10.0f){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if('A'!=65) {
			System.out.println("ture"); //�ٸ��� true
		} else {
			System.out.println("false");
		}
		
		//�ܿ��: ���׿�����, ���� ������, ���� �ȿ� ���׿����ڰ� �� ���� ��
		int p=10;
		int k=-10;
		int result6= (p==10)? p:k;
		System.out.println(result6);
		//����ǥ �� ���ǽ��� true�̸� :���� ���� ���ϰ�, false�� :���� ���� ����
		/*if(p==10){
			result6=p;
		}else{
			result6=k;
		}*/
		
		/*
		����ǥ     or, and
		0 0		0	0
		0 1		1	0
		1 0		1	0
		1 1		1	1
		*/
		
		int x=3;
		int y=5;
		
		//������ �� ������ ������ |
		//������ �� �ص� ������ &
		//��Ʈ������(������ ���� ����, ����ó�� ����?)
		System.out.println(x|y);
		//������ 3�� 2������ �ٲٴ� ���� ���
		//128 64 32 16 8 4 2 1
		//             0 0 1 1  �ΰ� ���� 3�� �Ǵ°�
		//������ 5�� 2������ �ٲٴ� ���� ���
		//             0 1 0 1  �ΰ� ���� 5�� �Ǵ� ��
		//			   0 1 1 1  or ����
		//               4+2+1 2������ 10������
		System.out.println(x&y);
		//128 64 32 16 8 4 2 1
		//             0 0 1 1  �ΰ� ���� 3�� �Ǵ°�
		//������ 5�� 2������ �ٲٴ� ���� ���
		//             0 1 0 1  �ΰ� ���� 5�� �Ǵ� ��
		//			   0 0 0 1  or ����
		//                   1  2������ 10������
		
		//&&(and), ||(or) (��������)
		//����ӵ��� ������ �� �� �ִ� (true, false����� �־)
		//if(10>0 && -1>1 && 100>2 && 1>-1 && ....) -1>1����
		//if(10>0 || -1>1 || 100>2 || 1>-1 || ....) 10>0��
		
	}

}
