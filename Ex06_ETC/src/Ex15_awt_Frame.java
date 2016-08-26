import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame {
	public MyFrame(String title) {
		super(title);
	}
}

public class Ex15_awt_Frame {
	public static void main(String[] args) {
		MyFrame my = new MyFrame("mylogin");
		my.setSize(350, 300);
		my.setVisible(true);
		my.setLayout(new FlowLayout());

		Button btn = new Button("나버튼");
		btn.setSize(60, 80);
		/*BtnClickHandler bclick=new BtnClickHandler();
		btn.addActionListener(bclick);*/
		
		//여기밖에 안쓴다면 -> 익명메소드?로 바로 구현해 버리자(이너클래스)
		//btn.addActionListener(new BtnClickHandler());
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					System.out.println("인터페이스 직접 구현");		
			}
		});
		
		
		TextField txtid = new TextField("ID입력: ");
		TextField txtpwd = new TextField(0);
		txtpwd.setSize(80, 60);
		txtpwd.setEchoChar('*');

		my.add(txtid);
		my.add(txtpwd);
		my.add(btn);

	}
}
class BtnClickHandler implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("나 클릭됨ㅋ");
	}
}