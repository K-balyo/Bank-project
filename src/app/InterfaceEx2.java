package app;
// ����Ͽ��� ���� ���� ǥ�� ���� �͸� Ŭ���� �ֳ��ϸ� �����ϴϱ�
import java.awt.Frame;
import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;

public class InterfaceEx2 {  //extends Frame implements WindowListener�� �� ����
    public InterfaceEx2() {
    	Frame frame = new Frame();
    	frame.setSize(300, 500); //â ũ��� ���� ���� ������� �ᵵ ��� x 
    	frame.setVisible(true);
    	frame.addWindowListener(new WindowAdapter(){
    //public void windowActivated(WindowEvent e) {}
    //public void windowClosed(WindowEvent e) {}
            public void windowClosing(WindowEvent e) {
    	        System.exit(0); // ���α׷��� �����ϰڴ� ��� ��ɾ� 
    }
   // public void windowDeactivated(WindowEvent e) {}
   // public void windowDeiconified(WindowEvent e) {}
   // public void windowIconified(WindowEvent e) {}
   // public void windowOpened(WindowEvent e) {}
 	});
    	}
	public static void main(String[] args) {
		new InterfaceEx2();
	}
}
