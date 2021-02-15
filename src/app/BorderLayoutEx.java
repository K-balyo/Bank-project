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
    	  b1 = new Button("버튼1");
    	  b2 = new Button("버튼2");
    	  b3 = new Button("버튼3");
    	  b4 = new Button("버튼4");
    	  b5 = new Button("버튼5");
    	  // f.setLayout(new.BorderLayout()); 이런 방식으로 입력 또는 f.add(b1,"방향"); 으로도 가능 전자는 대문자로 
    	  f.add(b1, "Center");
    	  f.add(b2, "East");
    	  f.add(b3, BorderLayout.WEST);
    	  f.add(b4, BorderLayout.SOUTH);
    	  f.add(b5, BorderLayout.NORTH);
    	  f.setSize(500, 500);
    	  f.setVisible(true);
    	  f.addWindowListener(new WindowAdapter(){           //27항부터 31항까지 닫기 버튼을 누르면 꺼지는 코드
  			public void windowClosing(WindowEvent e) {
  		     System.exit(0); // 프로그램을 종료하겠다 라는 명령어 
  		  }
  		  });
      }
      public static void main(String[] args) {
    	  new BorderLayoutEx();
      }
}
