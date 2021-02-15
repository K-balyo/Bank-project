package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarEx extends Frame implements AdjustmentListener {

	public Panel p1, p2;
	public Scrollbar sb_r, sb_g, sb_b;
	// public Label la1, la2, la3, la4, la5, la6, la7, la8, la9, la10;
	public Label[] la;
	public Label la_color;
	public TextField tf;
	public TextArea ta;

	public ScrollbarEx() {
		la = new Label[10];
		p1 = new Panel();
		p2 = new Panel();

		sb_r = new Scrollbar(0, 0, 10, 0, 265);
		sb_r.addAdjustmentListener(this);
		sb_g = new Scrollbar(0, 0, 10, 0, 265);
		sb_g.addAdjustmentListener(this);
		sb_b = new Scrollbar(0, 0, 10, 0, 265);
		sb_b.addAdjustmentListener(this);
		/*
		 * la1 = new Label("현재 색상"); la2 = new Label(""); la3 = new Label(""); la4 = new
		 * Label(""); la5 = new Label(""); la6 = new Label(""); la7 = new Label(""); la8
		 * = new Label(""); la9 = new Label(""); la10 = new Label("");
		 */
		la_color = new Label("현재 색상");
		for (int i = 0; i < la.length; i++) {
			la[i] = new Label("");
		}
		tf = new TextField("", 10);
		ta = new TextArea("", 10, 10);
		p1.setLayout(new GridLayout(10, 1));
		p1.add(la[1]);
		p1.add(sb_r);
		p1.add(la[2]);
		p1.add(sb_g);
		p1.add(la[3]);
		p1.add(sb_b);
		p1.add(la[4]);
		p1.add(la[5]);
		p1.add(tf);
		p1.add(la[6]);
		p2.setLayout(new BorderLayout());
		p2.add(BorderLayout.WEST, la[7]);
		p2.add("Center", ta);
		p2.add("East", la[8]);
		p2.add("North", la[9]);
		p2.add("South", la[0]);
		setLayout(new GridLayout(1, 2));
		add(p1);
		add(p2);
		setTitle("재미있는 스크롤바");
		setSize(500, 400);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램을 종료하겠다 라는 명령어
			}
		});
		sb_r.addAdjustmentListener(this);
		sb_g.addAdjustmentListener(this);
		sb_b.addAdjustmentListener(this);

	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		ta.setBackground(new Color(sb_r.getValue(), sb_g.getValue(), sb_b.getValue()));
		tf.setText("색상값 : " + "R : " + sb_r.getValue()+ ", "+ "G : " + sb_g.getValue() + ", " + "B : " + sb_b.getValue());
	}

	public static void main(String[] args) {
		new ScrollbarEx();
	}
}
