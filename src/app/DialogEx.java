package app;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DialogEx extends JFrame {
	public JButton button;
	Dialog dialog;
	public DialogEx() {
		button = new JButton("새창");
		dialog = new Dialog(this);
		dialog.setSize(100, 100);
		dialog.setLocation(850, 400);
		dialog.add(new Button("로그인 버튼"));
		setLayout(new FlowLayout());
		dialog.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//dialog.setVisible(false);
				dialog.dispose();
			}
		});
		add(button);
		setLocation(700, 300);// 프레임 창 뜨는 위치 코드
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
	}
	public static void main(String[] args) {
		new DialogEx();
		
	}
}
