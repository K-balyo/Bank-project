package arraylist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import arraylist.UItest;

public class UItest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<UserClass> arr = new ArrayList<>();
		Add_ID ai = new Add_ID();
		Login lg = new Login();

		new UItest();
		JFrame f = new JFrame("로그인 창");
		JLabel l1 = new JLabel("사용자 : ");
		l1.setBounds(20, 20, 80, 30);
		JTextField text = new JTextField();
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
		f.setSize(300, 200);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = text.getText() + " 님 접속을 환영합니다";
				// data += ", 비밀번호 : " + new String(value.getPassword())
				;
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

		while (true) {
			UserClass uc = new UserClass();
			System.out.println("---------------------------");
			System.out.println("1.회원가입 |2.로그인 |3.회원목록 |4.종료");
			System.out.println("---------------------------");
			System.out.print("선택>");
			int sel = sc.nextInt();
			if (sel == 4)
				break;
			switch (sel) {

			case 1: // 회원가입
				ai.add(uc, sc, arr);
				break;
			case 2:
				lg.add(uc, sc, arr);
				switch(sel) {
				case 1: //예금
				case 2: //출금
				case 3: //잔고
					if (arr == null) {
						System.out.println("로그인을 먼저 해 주세요.");
					} else {
						System.out.print("잔고>");
						System.out.println(uc.getBalance());
					}
					break;
				case 4: //회원정보
					switch(sel) {
					case 1: // 회원정보 수정
					case 2: // 회원탈퇴
					case 3: // 뒤로
					}
					break;
				case 5: //로그아웃
				
				case 6: //종료	
				
				default:
					return;
				}
				break;

			case 3:

				break;
			default:
				return;
			}
		}
		// 모든 클래스는 제너릭 타입으로 사용이 가능
		// 단 제너릭 타입으로 사용된 클래스에서 생성된 변수만 사용이 가능
	}
}
/*
 * 회원탈퇴 System.out.println("--회원탈퇴--"); System.out.println("ID : "); String id =
 * sc.next(); uc.setId(id); System.out.println("PW : "); int pw = sc.nextInt();
 * uc.setPw(pw); for(int i = 0; i < arr.size(); i++){ if
 * (id.equals(arr.get(i).getId())){ if(arr.get(i).getPw() == pw) {
 * arr.remove(i); System.out.println("[" + id + "]님 회원탈퇴"); break; }else{
 * System.out.println("비밀번호가 일치하지 않습니다"); break; } }else if (i == arr.size() -
 * 1){ System.out.println("등록된 정보가 없습니다"); } } break; 전체 회원 목록 ( 관리자 아이디용)
 * System.out.println("전체 회원 정보"); System.out.println("회원수 : " + arr.size());
 * for (int i = 0; i < arr.size(); i++) { System.out.print(arr.get(i).getId() +
 * "/"); System.out.println(arr.get(i).getPw()); }
 */
