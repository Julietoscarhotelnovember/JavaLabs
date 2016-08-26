package kr.or.kosta;

public class LottoMain {

	public static void main(String[] args) {
		Lotto lottomachine=new Lotto(); 
		try {
			for (int i=0; i<30; i++) {
				System.out.println(i+1+"회 로또 추첨");
				int[] selectednum=lottomachine.selectNum(); //중복 제거 번호 6개 생성
				int[] lottonum=lottomachine.sumCheck(selectednum); //50< <200 체크
				int bonusnum=lottomachine.bonusNum(); //보너스번호 생성
				int realbonus=lottomachine.bounusCheck(lottonum, bonusnum); //보너스번호 중복 체크
				lottomachine.sortNum(lottonum); //로또번호 정렬
				lottomachine.printNum(lottonum, realbonus);//번호 출력
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}