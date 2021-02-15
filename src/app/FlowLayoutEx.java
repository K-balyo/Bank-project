package app;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;
public class FlowLayoutEx extends Frame {
	 public Button b1, b2, b3;   
   	 public FlowLayoutEx() {
    	  
    	  	   b1 = new Button("버튼 1");
    		   b2 = new Button("버튼 2");
    		   b3 = new Button("버튼 3");
    		   setLayout(new FlowLayout());
    		   add(b1);
    		   add(b2);
    		   add(b3);
    		   setSize(300, 300);
    		   setVisible(true);
    		   addWindowListener(new WindowAdapter(){                   //21항 무터 25항 까지 닫기 버튼 누르면 윈도우창이 꺼지는 역할의 코드다
    				public void windowClosing(WindowEvent e) {
    			     System.exit(0); // 프로그램을 종료하겠다 라는 명령어 
    			  }
    			  });
    	   }
    	   public static void main(String[] args) {
    		   new FlowLayoutEx();   
    	   }
       }
       

