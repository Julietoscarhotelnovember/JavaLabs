import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class EventExam extends Frame implements WindowListener{
	TextArea ta;
	Button b1, b2;
	public EventExam() {
		super("�̺�Ʈ");
		ta=new TextArea();
		b1=new Button("�̺�Ʈ ����");
		b2=new Button("����");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ư: Ŭ���� ȣ��
				//textfield: ���ͽ� ȣ��
				System.out.println("�� ���� ����");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		
		//layout ����(����Ʈ boardlayout
		this.add("North",b1);
		this.add("Center",ta);
		this.add("South",b2);
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class Ex18_Event_Texarea {

	public static void main(String[] args) {
		EventExam ex=new EventExam();
		ex.setSize(300,400);
		ex.setVisible(true);
		ex.addWindowListener(ex);

	}
}

