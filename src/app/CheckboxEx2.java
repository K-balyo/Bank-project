package app;
//�����Ѱ�
import java.awt.Checkbox;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JRadioButton;

public class CheckboxEx2 extends Frame {
	public Panel p1, p2, p3;

	public CheckboxEx2() {

		p1 = new Panel();
		p2 = new Panel();
		

		Checkbox ch1 = new Checkbox("���", false);
		Checkbox ch2 = new Checkbox("����", false);
		Checkbox ch3 = new Checkbox("��", false);

		JRadioButton rd1 = new JRadioButton("��ħ");
		JRadioButton rd2 = new JRadioButton("����");
		JRadioButton rd3 = new JRadioButton("����");

		TextArea ta = new TextArea("TextArea", 40, 50, 1);

		//rd1.setSelected(true);

		p1.add(rd1);
		p1.add(rd2);
		p1.add(rd3);
		p1.add(ch1);
		p1.add(ch2);
		p1.add(ch3);
		p2.add(ta);

		setLayout(new GridLayout(3, 3));
		add(p1); // this.add(p); �� ���� this�� �����Ǿ��ִ�
		add(p2);
		

		setSize(500, 500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // ���α׷��� �����ϰڴ� ��� ��ɾ�
			}
		});
	}

	public static void main(String[] args) {
		new CheckboxEx2();
	}
}
