
public class Ex05_Operator {

	public static void main(String[] args) {
		//������
		int sum=0; //�������� (�ʱ�ȭ)
		//sum=sum+1;
		//����ǥ�� +=, -=, *=
		sum+=1;
		sum-=1;
		
		//���� ����
		//�̻�, ����, �ʰ�, �̸�
		
		//�ó�����: ������ 90 �̻��̶�� A
		//            90 �̻� 95�̻��̸� A+
		//			  95 �̻��� �ƴ� �������� A-
		//�׷� A0�¿�????
		int score=84;
		String grade="";
		System.out.println("�� ������: " + score);
		if (score>=90){
			grade="A";
			if (score>=95){
				grade+="+"; //�̰� �߿�!
			}else{
				grade+="-";
			}
		}else if(score>=80){
			grade="B";
			if (score>=85){
				grade+="+"; //�̰� �߿�!
			}else{
				grade+="-";
			}
		}else if(score>=70){
			grade="C";
			if (score>=75){
				grade+="+"; //�̰� �߿�!
			}else{
				grade+="-";
			}
		}else{
			grade="F";
		}
		System.out.println("�� ������: " + grade);
	}
}

