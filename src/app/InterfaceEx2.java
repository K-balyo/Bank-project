package app;
// 모바일에서 많이 쓰는 표현 내부 익명 클래스 왜냐하면 간단하니까
import java.awt.Frame;
import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;

public class InterfaceEx2 {  //extends Frame implements WindowListener도 도 가능
    public InterfaceEx2() {
    	Frame frame = new Frame();
    	frame.setSize(300, 500); //창 크기는 가로 세로 마음대로 써도 상관 x 
    	frame.setVisible(true);
    	frame.addWindowListener(new WindowAdapter(){
    //public void windowActivated(WindowEvent e) {}
    //public void windowClosed(WindowEvent e) {}
            public void windowClosing(WindowEvent e) {
    	        System.exit(0); // 프로그램을 종료하겠다 라는 명령어 
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
