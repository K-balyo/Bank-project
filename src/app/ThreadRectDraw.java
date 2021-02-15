package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class ThreadRectDraw extends Frame implements Runnable {
    int x = 0;
    int y = 20;
    boolean xOrient, yOrient;
    Random ran;
    public ThreadRectDraw(String title) {
    	super(title);
    	ran = new Random();
    	setSize(300, 200);
    	setVisible(true);
    	addWindowListener(new WindowAdapter() {
    		public void windowClosing(WindowEvent e) {
    			System.exit(0);
    		}
    	});
    }
    public void paint(Graphics gr) {
    	Dimension d = this.getSize();//창 크기를 변경해도 문제없게 만들어주는 소스코드
    	if(xOrient) {
    		x--;
    		if(x < 0) {
    			x = 0;
    			xOrient = false;
    		}
    	}else {
    		x++;
    		if(x >= d.width - 20) {
    			x = d.width - 20;
    			xOrient = true;
    		}
    	}
    	if(yOrient) {
    		y--;
    		if(y < 0) {
    			y = 0;
    			yOrient = false;
    		}
    	}else {
    		y++;
    		if(y >= d.height - 20) {
    			y = d.height - 20;
    			yOrient = true;
    		}
    	}
    	int r = ran.nextInt(255);
    	int g = ran.nextInt(255);
    	int b = ran.nextInt(255);
    	gr.setColor(new Color(r, g, b));
    	gr.drawRect(x, y, 20, 20);
    }//end paint
    public void update(Graphics g) { paint(g);}
    @Override
    public void run() {
    	while(true) {
    		repaint();
    		try { Thread.sleep(10);}
    		catch(InterruptedException e)
    		{e.printStackTrace();}
    	}
    }
	public static void main(String[] args) {
		ThreadRectDraw thread =
				new ThreadRectDraw("TreadRecDraw");
		Thread task = new Thread(thread);
		task.start();
	}
}
