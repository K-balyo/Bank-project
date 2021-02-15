package app;
/*interface MouseListener { // ���콺 Ŭ���� ���� �̺�Ʈ �ڵ�
    public void mousePressed(MouseEvent e);
     //���콺 ��ư�� �������� ���� 
    public void mouseReleased(MouseEvent e);
    //���� ���콺 ��ư�� ������ ����
    public void mouseClicked(MouseEvent e);
    //���콺�� Ŭ���Ǵ� ����
    public void mouseEntered(MouseEvent e);
    //���콺�� ������Ʈ ���� �ö󰡴� ����
    public void mouseExited(MouseEvent e);
    // ���콺�� ������Ʈ ������ �������� ����
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
		b1 = new Button("��ư1");
		b2 = new Button("��ư2");
		b3 = new Button("��ư3");
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
				System.exit(0); // ���α׷��� �����ϰڴ� ��� ��ɾ�
			}
		});
	}
	public void	actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		Button b = (Button)obj;
		System.out.println("�̺�Ʈ ����" + b.getLabel());
		System.out.println("��ü ��" + (b1 == obj));
		
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
