package app;
/*interface MouseListener { // 마우스 클릭에 따른 이벤트 코드
    public void mousePressed(MouseEvent e);
     //마우스 버튼이 눌려지는 순간 
    public void mouseReleased(MouseEvent e);
    //눌린 마우스 버튼이 떼지는 순간
    public void mouseClicked(MouseEvent e);
    //마우스가 클릭되는 순간
    public void mouseEntered(MouseEvent e);
    //마우스가 컴포넌트 위에 올라가는 순간
    public void mouseExited(MouseEvent e);
    // 마우스가 컴포넌트 위에서 내려오는 순간
*/
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventEx extends Frame implements ActionListener   {
	public Button b1, b2, b3;
	public EventEx() {
		b1 = new Button("버튼1");
		b2 = new Button("버튼2");
		b3 = new Button("버튼3");
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		setSize(300, 300);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		//addAdjustmentListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램을 종료하겠다 라는 명령어
			}
		});
	}
	public void	actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		Button b = (Button)obj;
		System.out.println("이벤트 동작" + b.getLabel());
		System.out.println("객체 비교" + (b1 == obj));
		
	}
	/*void AdjustmentValueChanged(AdjustmentEvent e) {
		setBackground(Color c)
		new Color(int r, int g, int b)
		void setText(String t)
	}*/
	public static void main(String[] args) {
		new EventEx();
	}

}
