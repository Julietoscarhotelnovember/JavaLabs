import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class LoginForm3 extends Frame {
	Label lbl_id;
	Label lbl_pwd;
	TextField txt_id;
	TextField txt_pwd;
	Button btn_ok;

	public LoginForm3(String title) {
		super(title);
		lbl_id = new Label("ID: ", Label.RIGHT);
		lbl_pwd = new Label("PWD: ", Label.RIGHT);
		txt_id = new TextField(10);
		txt_pwd = new TextField(10);
		txt_pwd.setEchoChar('#');
		btn_ok = new Button("login");

		this.setLayout(new FlowLayout());
		this.setSize(500, 100);
		this.setVisible(true);

		// 붙이기
		this.add(lbl_id);
		this.add(txt_id);
		this.add(lbl_pwd);
		this.add(txt_pwd);
		this.add(btn_ok);

		/*// Inner class
		// 장점: outter class의 자원에 접근할 수 있다
		// 이렇게 코드가 짧아진다
		// 이벤트 기반 프로그램들은 이렇게 하는 것이 편하다
		class Btn_Handler implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText(); // outter 자원을 내부에서 쓰고 있다
				String pwd = txt_pwd.getText();
				System.out.println(id + " / " + pwd);
				if (!id.equals("kglim")) {
					System.out.println("유효하지 않은 ID");
					txt_id.requestFocus();
					txt_id.selectAll();
				} else if (!pwd.equals("1004")) {
					System.out.println("유효하지 않은 PWD");
					txt_pwd.requestFocus();
					txt_pwd.selectAll();
				} else {
					System.out.println("관리자님: " + txt_id.getText());
				}
			}
		}*/

		this.btn_ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText(); // outter 자원을 내부에서 쓰고 있다
				String pwd = txt_pwd.getText();
				System.out.println(id + " / " + pwd);
				if (!id.equals("kglim")) {
					System.out.println("유효하지 않은 ID");
					txt_id.requestFocus();
					txt_id.selectAll();
				} else if (!pwd.equals("1004")) {
					System.out.println("유효하지 않은 PWD");
					txt_pwd.requestFocus();
					txt_pwd.selectAll();
				} else {
					System.out.println("관리자님: " + txt_id.getText());
				}
				
			}
		});
		
		//	인터페이스의 모든 자원을 강제 구현해야 되는데 되게 귀찮다
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//코드 개선을 위해 WindowAdapter로 필요한 것들만 재정의 하도록 해놓았다
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
			}			
		});
	}
}

public class Ex21_Event_Login3 {
	public static void main(String[] args) {
		LoginForm3 login = new LoginForm3("인터페이스로 구현");
	}
}
