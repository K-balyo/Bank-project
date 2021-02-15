package app;
/*
GUI Programing?
GUI는 과거에 사용하였던 DOS(CUI방식)와 같은 방식의 Text 기반
OS가 아닌 Graphic을 이용하여 User 와 Program 간의 상호작용을 할 수 있도록 해주는 Interface를 의미한다
Java에서 이러한 Graphic Programming을 지원하기 위해 나온 것이 바로 AWT이다
<<학습 목차>>
- AWT의 기본 개념
- 자바에서 제공하는 Component 와 Container
- Layout Manager  //디자인 구성 배치
- 이벤트
- Graphic

 AWT의 기본 개념
 
AWT(Abstract Window Toolkit)는 GUI Programming을 제작하기 위해 Java에서 제공하는 library를 모아놓은 것이다.
AWT는 모든 GUI Program에 사용되는 Compinent 및 Toolkit을 제공하고 있으며 향후에는 JFC와 깊은 Swing 및 Java2D의 모태가 되는 개념.
AWT는 OS에 구해받지 않고 쓸 수 있도록 OS의 것을 그대로 사용하지 않고 
공통적이고 기본적인 Component들을 추상화 시켜 제공한다.
실행되는 OS에 따라 다르게 보이거나 동작 방식에 차이가 있을 수 있다
이러한 단점을 극복하기 위해 개발된 것이 JFC(Java Foundation Classes)이다
*/

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiEx extends Frame{
	public GuiEx() {	    
		Panel p = new Panel();
		Button b = new Button("버튼");
		b.setLabel("변경된 라벨");
		Checkbox ch1 = new Checkbox("체크 박스", true);
		Checkbox ch2 = new Checkbox("체크 박스", false);
		Checkbox ch3 = new Checkbox("체크 박스", false);
		CheckboxGroup ch = new CheckboxGroup();
		Checkbox ch4 = new Checkbox("라디오 버튼", true);
		Checkbox ch5 = new Checkbox("라디오 버튼", false);
		Checkbox ch6 = new Checkbox("라디오 버튼", false);
		Choice cho = new Choice();
		cho.add("학년 선택");
		cho.add("1학년");
		cho.add("2학년");
		cho.add("3학년");
		cho.add("4학년");
		Label la = new Label("자바 수강생");
	    List ls = new List(5);
	    ls.add("List 1");
	    ls.add("List 2");
	    ls.add("List 3");
	    ls.add("List 4");
	    ls.add("List 5");
	    ls.add("List 6");
	    Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 200, 100, 0, 255);
	    Scrollbar sb2 = new Scrollbar(1, 200, 100, 0, 255);
	    TextField tf = new TextField("TextField", 50);
	    TextArea ta = new TextArea("TextArea", 20, 10, 1); // 3 값에 1 또는 TextArea.SCROLLBARS_BOTH를 넣으면 세로 스크롤바가 생성된다
		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		p.add(cho);
		p.add(ch4);
		p.add(ch5);
		p.add(ch6);
		p.add(b);
		p.add(la);
		p.add(ls);
		p.add(sb);
		p.add(sb2);
		p.add(tf);
		p.add(ta);
		add(p); //this.add(p); 와 같다 this가 생략되어있다
	    setSize(500, 500);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
		     System.exit(0); // 프로그램을 종료하겠다 라는 명령어 
		  }
		  });
		}
	public static void main(String[] args) {
		new GuiEx();
	}

}
