public class Ex03_Array_Quiz_Lotto {

	public static void main(String[] args) {
		// ���� ���� (���� Lotto �ۼ��ϱ�)
		// 1. 1~45 ������ ������ �߻����� 6���� �迭�� ��������
		// 2. �迭�� ��� 6���� ���� �ߺ����� ������ �ȵǿ�
		// 3. �迭�� �ִ� 6���� ���� ���� �� ������ ����ϼ���
		// 4. java ���� (ī�信 )�ø�����
		//�߰� : class ���赵 ��ȯ
		//���� �߰� (6�� �迭�� ���� 35 < sum < 45) 
		//���� ���� : �߰�

		int[] lotto = new int[6];
		int temp = 0;

		//1,2 ��
		for (int i = 0; i < lotto.length; i++) 
		{
			lotto[i] = (int) ((Math.random() * 45) + 1);

			for (int j = 0; j < i; j++) 
			{
				if (lotto[i] == lotto[j]) 
				{
					i--; //i�� ������Ű�� �ʰ� �ٽ� ����
					break;
				}
			}
		}
		
		//3��
		for (int i = 0; i < 6; i++) 
		{
			for (int j = i + 1; j < 6; j++) 
			{
				if (lotto[i] > lotto[j]) 
				{
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		//���	
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
