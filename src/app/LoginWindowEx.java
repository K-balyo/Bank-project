package app;
//인터넷 보고 만든거
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginWindowEx extends JFrame  {
	public static void main(String[] args) {
		JFrame f = new JFrame("로그인 창");
		JLabel l1 = new JLabel("사용자 : ");
		l1.setBounds(20, 20, 80, 30);
		JTextField text= new JTextField();
		text.setBounds(100, 20, 100, 30);
		JLabel l2 = new JLabel("비밀번호 : ");
		l2.setBounds(20, 70, 80, 30);
		JPasswordField value = new JPasswordField();
		value.setBounds(100, 75, 100, 30);
		JButton b = new JButton("로그인");
		JButton b2 = new JButton("회원가입");
		JButton b3 = new JButton("종료");
		b.setBounds(5, 120, 80, 30);
		b2.setBounds(95, 120, 100, 30); 
		b3.setBounds(200, 120, 80, 30);
		f.add(l1);
		f.add(text);
		f.add(l2);
		f.add(value);
		f.add(b);
		f.add(b2);
		f.add(b3);
		f.setLocation(700, 300);// 프레임 창 뜨는 위치 코드
		f.setSize(300,200);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String data = text.getText() + " 님 접속을 환영합니다"; 
				//data += ", 비밀번호 : " + new String(value.getPassword())
						
				JOptionPane.showMessageDialog(f, data);
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		}
	}




       
