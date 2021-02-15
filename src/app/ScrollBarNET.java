package app;

import javax.swing.*;
import java.awt.event.*;



public class ScrollBarNET {
    ScrollBarNET(){
    	JFrame f = new JFrame("스크롤바");
    	final JLabel lb = new JLabel();
    	lb.setHorizontalAlignment(JLabel.CENTER);
    	lb.setSize(400, 100);
    	final JScrollBar sc = new JScrollBar();
    	sc.setBounds(100, 100, 50, 100);
    	f.add(sc);
    	f.add(lb);
    	f.setSize(400, 400);
    	f.setLayout(null);;
    	f.setVisible(true);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	sc.addAdjustmentListener(new AdjustmentListener() {
    		public void adjustmentValueChanged(AdjustmentEvent e) {
    			lb.setText("수직 스크롤바 값 : " + sc.getValue());
    		}
    	});
    }
    public static void main(String[] args) {
    	new ScrollBarNET();
    }
	 
}
