import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Btn_Handler implements ActionListener {
	private TextField txtid;
	private TextField txtpwd;
	public Btn_Handler(TextField txtid, TextField txtpwd) {
		this.txtid=txtid;
		this.txtpwd=txtpwd;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//txt_id 입력갑 가지고 오기
		if(txtid.getText().equals("kglim")) {
			System.out.println("방가 "+" / "+txtpwd.getText());
		} else {
			System.out.println("졸고 있는 너눈 누규");
		}
		//txt_pwd 입력값 가지고 오기
	}
}
class LoginForm extends Frame {
	Label lbl_id;
	Label lbl_pwd;
	TextField txt_id;
	TextField txt_pwd;
	Button btn_ok;
	public LoginForm(String title) {
		super(title);
		lbl_id=new Label("ID: ", Label.RIGHT);
		lbl_pwd=new Label("ID: ", Label.RIGHT);
		txt_id=new TextField(10);
		txt_pwd=new TextField(10);
		txt_pwd.setEchoChar('#');
		btn_ok=new Button("login");
		
		this.setLayout(new FlowLayout());
		this.setSize(500, 100);
		this.setVisible(true);
		
		//붙이기
		this.add(lbl_id);
		this.add(txt_id);
		this.add(lbl_pwd);
		this.add(txt_pwd);
		this.add(btn_ok);
		
		this.btn_ok.addActionListener(new Btn_Handler(txt_id, txt_pwd));
		
	}
}
public class Ex19_Event_Login {
	public static void main(String[] args) {
		LoginForm loginform=new LoginForm("로그인");
	}
}
