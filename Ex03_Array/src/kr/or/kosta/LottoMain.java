package kr.or.kosta;

public class LottoMain {

	public static void main(String[] args) {
		Lotto lottomachine=new Lotto(); 
		try {
			for (int i=0; i<30; i++) {
				System.out.println(i+1+"ȸ �ζ� ��÷");
				int[] selectednum=lottomachine.selectNum(); //�ߺ� ���� ��ȣ 6�� ����
				int[] lottonum=lottomachine.sumCheck(selectednum); //50< <200 üũ
				int bonusnum=lottomachine.bonusNum(); //���ʽ���ȣ ����
				int realbonus=lottomachine.bounusCheck(lottonum, bonusnum); //���ʽ���ȣ �ߺ� üũ
				lottomachine.sortNum(lottonum); //�ζǹ�ȣ ����
				lottomachine.printNum(lottonum, realbonus);//��ȣ ���
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}