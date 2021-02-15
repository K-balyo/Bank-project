package app;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventEx extends JFrame {
	JTextArea ta;
	JButton b;
	JTextField txt;

	public KeyEventEx() {
		b = new JButton("Swing Button");
		txt = new JTextField();
		ta = new JTextArea();
		add("North", txt);
		add("Center", ta);
		add("South", b);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// txt.addKeyListener(this);
		// 2번 문제
		txt.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				int key = (int) e.getKeyChar();
				if (key >= 65 && key <= 90) {
					limit();
				} else if (key >= 97 && key <= 122) {
					limit();
				} else {
					ta.append(key + "가 입력\n");
				}
			}
		});
		// 1번문제
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txt.setText("");
				ta.setText("");
			}
		});
	}

	public void limit() {
		System.out.println("제한된 입력 !!");
	}

//입력된 키의 종류 판별
	/*
	 * public void keyTyped(KeyEvent e) { ta.append(e.getKeyChar() + "가 입력\n"); }
	 * 
	 * // 키가 눌렸을때 발생 public void keyPressed(KeyEvent e) { if(e.getKeyChar() ==
	 * KeyEvent.VK_SPACE) { System.out.println("스페이스가 입력되었습니다."); if(e.getKeyChar()
	 * == KeyEvent.VK_BACK_SPACE) { } } }
	 * 
	 * // 키가 놓였을때 발생 public void keyReleased(KeyEvent e) { ta.append( e.getKeyChar()
	 * + " 를 놓았음\n");
	 * 
	 * }
	 */
	public static void main(String[] args) {
		new KeyEventEx();
	}
	// 실습문제
	// 1. 버튼을 클릭했을때 입력 글 모두 지워지도록 코드를 작성해 보세요
	// 2. 영문 작성을 제한해 보세요 ex)System.out.println("제한된 입력!!"); 아스키 코드값 참고

}
