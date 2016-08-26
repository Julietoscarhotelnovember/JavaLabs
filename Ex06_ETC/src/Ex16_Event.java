import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex16_Event {

	public static void main(String[] args) {
		Button btn=new Button("Click");
		
		//btn.addActionListener(new EventHandler());
		//한번만 ㅆ는 경우 익명클래스 활용
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
}

//ActionListener는 클릭을 감지하는 인터페이스
class EventHandler implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
	}
}