import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex16_Event {

	public static void main(String[] args) {
		Button btn=new Button("Click");
		
		//btn.addActionListener(new EventHandler());
		//�ѹ��� ���� ��� �͸�Ŭ���� Ȱ��
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
}

//ActionListener�� Ŭ���� �����ϴ� �������̽�
class EventHandler implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
	}
}