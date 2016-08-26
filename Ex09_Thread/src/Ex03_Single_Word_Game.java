import javax.swing.JOptionPane;

//단어맞추기 게임
//단어 맞추는 창(입력창): 일정한 시간 부여, 시간이 지나면 게임 종료

public class Ex03_Single_Word_Game {

	public static void main(String[] args) {
		// UI요소는 AWT, SWING 사용
		// 별로 안쓴다 -> 자바FX로
		String inputdata = JOptionPane.showInputDialog("값을 입력: ");
		System.out.println("당신이 입력한 값은 " + inputdata);
		Timer();
	}

	static void Timer() {
		for (int i = 10; i > 0; i--) {
			System.out.println("남은시간: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("종료!");
	}

}
