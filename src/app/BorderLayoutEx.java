package app;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;


public class BorderLayoutEx {
	  public Button b1, b2, b3, b4, b5;
      public BorderLayoutEx() {
    	  Frame f = new Frame("BorderLayout");
    	  b1 = new Button("��ư1");
    	  b2 = new Button("��ư2");
    	  b3 = new Button("��ư3");
    	  b4 = new Button("��ư4");
    	  b5 = new Button("��ư5");
    	  // f.setLayout(new.BorderLayout()); �̷� ������� �Է� �Ǵ� f.add(b1,"����"); ���ε� ���� ���ڴ� �빮�ڷ� 
    	  f.add(b1, "Center");
    	  f.add(b2, "East");
    	  f.add(b3, BorderLayout.WEST);
    	  f.add(b4, BorderLayout.SOUTH);
    	  f.add(b5, BorderLayout.NORTH);
    	  f.setSize(500, 500);
    	  f.setVisible(true);
    	  f.addWindowListener(new WindowAdapter(){           //27�׺��� 31�ױ��� �ݱ� ��ư�� ������ ������ �ڵ�
  			public void windowClosing(WindowEvent e) {
  		     System.exit(0); // ���α׷��� �����ϰڴ� ��� ��ɾ� 
  		  }
  		  });
      }
      public static void main(String[] args) {
    	  new BorderLayoutEx();
      }
}
