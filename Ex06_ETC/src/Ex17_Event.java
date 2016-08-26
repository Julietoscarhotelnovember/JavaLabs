import java.awt.BufferCapabilities;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//이벤트 처리를 위해서는
//1.Event Resource: 발생지(button, textfield, txtarea)
//2.Event Handler: 처리기(창 닫기, 창 열기)
//3.Event Listener: 감지기(이벤트 감지, handler 연결)
class WindowEventHandler implements WindowListener {

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
		//프레임에서 창 닫을 때
		 e.getWindow().setVisible(false); //안보이게
		 e.getWindow().dispose(); //메모리 제거
		 System.out.println("창닫기 성공");
		
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
public class Ex17_Event {

	public static void main(String[] args) {
		Frame f=new Frame("login");
		f.setSize(300,200);
		f.addWindowListener(new WindowEventHandler());
		f.setVisible(true);

	}

}
