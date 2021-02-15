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
		// 2�� ����
		txt.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				int key = (int) e.getKeyChar();
				if (key >= 65 && key <= 90) {
					limit();
				} else if (key >= 97 && key <= 122) {
					limit();
				} else {
					ta.append(key + "�� �Է�\n");
				}
			}
		});
		// 1������
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txt.setText("");
				ta.setText("");
			}
		});
	}

	public void limit() {
		System.out.println("���ѵ� �Է� !!");
	}

//�Էµ� Ű�� ���� �Ǻ�
	/*
	 * public void keyTyped(KeyEvent e) { ta.append(e.getKeyChar() + "�� �Է�\n"); }
	 * 
	 * // Ű�� �������� �߻� public void keyPressed(KeyEvent e) { if(e.getKeyChar() ==
	 * KeyEvent.VK_SPACE) { System.out.println("�����̽��� �ԷµǾ����ϴ�."); if(e.getKeyChar()
	 * == KeyEvent.VK_BACK_SPACE) { } } }
	 * 
	 * // Ű�� �������� �߻� public void keyReleased(KeyEvent e) { ta.append( e.getKeyChar()
	 * + " �� ������\n");
	 * 
	 * }
	 */
	public static void main(String[] args) {
		new KeyEventEx();
	}
	// �ǽ�����
	// 1. ��ư�� Ŭ�������� �Է� �� ��� ���������� �ڵ带 �ۼ��� ������
	// 2. ���� �ۼ��� ������ ������ ex)System.out.println("���ѵ� �Է�!!"); �ƽ�Ű �ڵ尪 ����

}
