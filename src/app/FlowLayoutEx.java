package app;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;
public class FlowLayoutEx extends Frame {
	 public Button b1, b2, b3;   
   	 public FlowLayoutEx() {
    	  
    	  	   b1 = new Button("��ư 1");
    		   b2 = new Button("��ư 2");
    		   b3 = new Button("��ư 3");
    		   setLayout(new FlowLayout());
    		   add(b1);
    		   add(b2);
    		   add(b3);
    		   setSize(300, 300);
    		   setVisible(true);
    		   addWindowListener(new WindowAdapter(){                   //21�� ���� 25�� ���� �ݱ� ��ư ������ ������â�� ������ ������ �ڵ��
    				public void windowClosing(WindowEvent e) {
    			     System.exit(0); // ���α׷��� �����ϰڴ� ��� ��ɾ� 
    			  }
    			  });
    	   }
    	   public static void main(String[] args) {
    		   new FlowLayoutEx();   
    	   }
       }
       

