package app;
//내가한거
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
		

		Checkbox ch1 = new Checkbox("사과", false);
		Checkbox ch2 = new Checkbox("딸기", false);
		Checkbox ch3 = new Checkbox("배", false);

		JRadioButton rd1 = new JRadioButton("아침");
		JRadioButton rd2 = new JRadioButton("점심");
		JRadioButton rd3 = new JRadioButton("저녁");

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
		add(p1); // this.add(p); 와 같다 this가 생략되어있다
		add(p2);
		

		setSize(500, 500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램을 종료하겠다 라는 명령어
			}
		});
	}

	public static void main(String[] args) {
		new CheckboxEx2();
	}
}
