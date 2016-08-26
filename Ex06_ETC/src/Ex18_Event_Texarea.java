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
		super("이벤트");
		ta=new TextArea();
		b1=new Button("이벤트 생성");
		b2=new Button("종료");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼: 클릭시 호출
				//textfield: 엔터시 호출
				System.out.println("나 불좀 꺼줘");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		
		//layout 설정(디폴트 boardlayout
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

