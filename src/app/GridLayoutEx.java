package app;


import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {
	public JButton b1, b2, b3;
	public Button b4, b5, b6;
	public GridLayoutEx() {
		b1 = new JButton("��ư1");
		b2 = new JButton("��ư2");
		b3 = new JButton("��ư3");
		b4 = new Button("��ư4");
		b5 = new Button("��ư5");
		b6 = new Button("��ư6");
	    setLayout(new GridLayout(2, 3));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
