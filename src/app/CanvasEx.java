package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;

public class CanvasEx extends Canvas implements ActionListener {
	public Frame f;
	public Panel p;
	public Button b1, b2, b3, b4;
	public int x, y;
	public Image img;
	public CanvasEx() {
		x = 150;
		y = 100;
		img = Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Downloads/다운로드.jpg");
		p = new Panel(new GridLayout(2, 3));
		f = new Frame("Canvas");
		b1 = new Button("위");
		b2 = new Button("왼쪽");
		b3 = new Button("아래");
		b4 = new Button("오른쪽");
		p.add(new Label(""));
		p.add(b1);
		p.add(new Label(""));
		p.add(b2);
		p.add(b3);
		p.add(b4);
		f.add(this, "Center");
		f.add(p, "South");
		f.setSize(500, 500);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void paint(Graphics g) {
		g.drawRect(10, 10, 10, 10);
		g.setColor(Color.RED);
	//	g.fillRect(x, 100, 200, 300);
		g.drawImage(img, x, y, this);
	}

	// public void update(Graphics g) {
	// paint(g);
//	}
	public static void main(String[] args) {
		new CanvasEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == b1) {
			y -= 5;
		}else if (obj == b2) {
			x -= 5;	
		}else if (obj == b3) {
			y += 5;
	    }else if(obj == b4) {
            x += 5;}
		repaint();
	}
}
