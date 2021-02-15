package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxEx extends Frame implements ItemListener {
	Panel p1, p2, p3;
	Label[] la = new Label[15];
	CheckboxGroup cg;
	Checkbox ch1, ch2, ch3, ch4, ch5, ch6;
	TextArea ta;
	Choice cho;

	public CheckboxEx() {
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		for (int i = 0; i < la.length; i++) {
			la[i] = new Label("");
		}
		cg = new CheckboxGroup();
		ch1 = new Checkbox("아침", cg, true);
		ch2 = new Checkbox("점심", cg, false);
		ch3 = new Checkbox("저녁", cg, false);
		ch4 = new Checkbox("사과");
		ch5 = new Checkbox("딸기");
		ch6 = new Checkbox("배");
		ta = new TextArea(" << 자바 수강생 식생활 >> ", 20, 20, TextArea.SCROLLBARS_NONE);
		cho = new Choice();
		cho.add("아침");
		cho.add("점심");
		cho.add("저녁");
		p1.setLayout(new GridLayout(2, 5));
		p1.add(la[0]);
		p1.add(ch1);
		p1.add(ch2);
		p1.add(ch3);
		p1.add(la[1]);
		p1.add(la[2]);
		p1.add(ch4);
		p1.add(ch5);
		p1.add(ch6);
		p1.add(la[11]);
		p2.setLayout(new BorderLayout());
		p2.add(ta, BorderLayout.CENTER);
		p2.add(la[3], BorderLayout.NORTH);
		p2.add(la[4], BorderLayout.SOUTH);
		p2.add(la[5], BorderLayout.WEST);
		p2.add(la[6], BorderLayout.EAST);
		p3.setLayout(new BorderLayout());
		p3.add(cho, BorderLayout.CENTER);
		p3.add(la[7], BorderLayout.NORTH);
		p3.add(la[8], BorderLayout.SOUTH);
		p3.add(la[9], BorderLayout.WEST);
		p3.add(la[10], BorderLayout.EAST);
		add("North", p1);
		add("Center", p2);
		add("South", p3);

		setSize(500, 500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램을 종료하겠다 라는 명령어
			}
		});
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		ch4.addItemListener(this);
		ch5.addItemListener(this);
		ch6.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource(); 
		if (obj == cho) {
		String str = cho.getSelectedItem();
		if (str.equals("아침")) {
			ch1.setState(true);
		} else if (str.equals("점심")) {
                  ch2.setState(true);
		}else if (str.equals("저녁")) {
            ch3.setState(true);
	}
	}
	Checkbox temp = cg.getSelectedCheckbox();
	ta.setText(" << " + temp.getLabel() + " >> \n\n");
	ta.append("1. 사과 : " + ch4.getState() + "\n");
	ta.append("2. 딸기 : " + ch5.getState() + "\n");
	ta.append("3. 배 : " + ch6.getState() + "\n");
    cho.select(temp.getLabel());
	}
	public static void main(String[] args) {
		new CheckboxEx();

	}
}
