import java.awt.BufferCapabilities;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//�̺�Ʈ ó���� ���ؼ���
//1.Event Resource: �߻���(button, textfield, txtarea)
//2.Event Handler: ó����(â �ݱ�, â ����)
//3.Event Listener: ������(�̺�Ʈ ����, handler ����)
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
		//�����ӿ��� â ���� ��
		 e.getWindow().setVisible(false); //�Ⱥ��̰�
		 e.getWindow().dispose(); //�޸� ����
		 System.out.println("â�ݱ� ����");
		
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
