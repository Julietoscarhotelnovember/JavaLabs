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

		Button btn = new Button("����ư");
		btn.setSize(60, 80);
		/*BtnClickHandler bclick=new BtnClickHandler();
		btn.addActionListener(bclick);*/
		
		//����ۿ� �Ⱦ��ٸ� -> �͸�޼ҵ�?�� �ٷ� ������ ������(�̳�Ŭ����)
		//btn.addActionListener(new BtnClickHandler());
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					System.out.println("�������̽� ���� ����");		
			}
		});
		
		
		TextField txtid = new TextField("ID�Է�: ");
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
		System.out.println("�� Ŭ���ʤ�");
	}
}