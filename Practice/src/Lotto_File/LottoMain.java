package Lotto_File;

public class LottoMain {

	public static void main(String[] args) {
		Lotto lottomachine=new Lotto(); 
				int[] selectednum=lottomachine.selectNum(); //�ߺ� ���� ��ȣ 6�� ����
				int[] lottonum=lottomachine.sumCheck(selectednum); //50< <200 üũ
				int bonusnum=lottomachine.bonusNum(); //���ʽ���ȣ ����
				int realbonus=lottomachine.bounusCheck(lottonum, bonusnum); //���ʽ���ȣ �ߺ� üũ
				lottomachine.sortNum(lottonum); //�ζǹ�ȣ ����
				lottomachine.printNum(lottonum, realbonus);//��ȣ ���
				lottomachine.Writer();
	}
}