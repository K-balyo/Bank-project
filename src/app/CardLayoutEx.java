package app;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutEx extends Frame implements MouseListener {
		private Panel p1, p2, p3, p4;
		private Label lb1, lb2, lb3, lb4;
		private CardLayout cards;
		public CardLayoutEx() {
		setTitle("CardLayout");
		cards = new CardLayout();
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();
        setLayout(cards);
        lb1 = new Label("I");
        p1.setBackground(Color.YELLOW);
        p1.add(lb1);
        lb2 = new Label("I LOVE ");
        p2.setBackground(Color.GREEN);
        p2.add(lb2);
        lb3 = new Label("I LOVE JAVA");
        p3.setBackground(Color.MAGENTA);
        p3.add(lb3);
        lb4 = new Label("I LOVE JavaBible");
        p4.setBackground(Color.WHITE);
        p4.add(lb4);
        add(p1,"p1");
        add(p2,"p2");
        add(p3,"p3");
        add(p4,"p4"); 
        cards.show(this,"frame");
        setSize(200, 200);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
		     System.exit(0); // 프로그램을 종료하겠다 라는 명령어 
		  }
		  });
        p1.addMouseListener(this);
        p2.addMouseListener(this);
        p3.addMouseListener(this);
        p4.addMouseListener(this);
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) { cards.next(this);}
		public void mouseEntered(MouseEvent e) {}//cards.next(this); 이거 넣으면 난리부르
		public void mouseExited(MouseEvent e) {}
      		
	public static void main(String[] args) {
          	new CardLayoutEx	();
	}

}
