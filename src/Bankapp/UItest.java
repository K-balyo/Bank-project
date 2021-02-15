package Bankapp;

import java.awt.Button;


import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner; //임포트로 따로 쓴다면 공용적으로 쓸 수 있다

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import db.DBEx7;

public class UItest extends JFrame {
//	static Member members[];
	static List<Member> members;
//    ArrayList<String> member = new ArrayList<>();
//	creatMember cm = new creatMember
	boolean run;
	public Scanner scanner;
	public TextField id_tf;
	public TextField pw_tf;
	public TextArea output_ta;
	public Button submit;
	public Panel p1;
	public Panel p2;

	public Scanner input() {
		return scanner;
	}

	public int inputNum() { // 정수 입력장치
		int num = new java.util.Scanner(System.in).nextInt();
		return num;
	}

	public String inputStr() { // 문자열 입력장치
		return new java.util.Scanner(System.in).next();
	}

	int idx;
	Statement stmt;
	ResultSet rs;

	public void database() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bank?" + 
		            "characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
//		Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			stmt = conn.createStatement();

		} catch (Exception e) {
//			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
	}

	public void creatMember() {

		System.out.print("성함 : ");
		if (text1.getText().trim().length() < 1 && text2.getText().trim().length() < 1
				&& value1.getText().trim().length() < 1)
			return;

		String name = text1.getText().trim();

		System.out.print("아이디 : ");
		String id = text2.getText().trim();

		System.out.print("비밀번호 : ");
		String pw = value1.getText().trim();

		System.out.print("잔고 : ");
		int balance = 1000;
		System.out.print("회원가입이 완료되었습니다.");
		// id, pw, balance ...
		String num = "";
		Random r = new Random();
		int n[] = new int[6];
		String sql = "SELECT num FROM MEMBER ";
		List<String> list = new ArrayList<>();
		try {
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(rs.getString("num"));
			}
			boolean checknum = false;
			do {
				for (int i = 0; i < n.length; i++) {
					n[i] = r.nextInt(9);
					num += n[i];
				}
				numcheck: for (int i = 0; i < list.size(); i++) {
					if (num.equals(list.get(i))) {
						checknum = true;
						break numcheck;
					} else {
						checknum = false;
					}
				}
			} while (checknum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Member member = new Member(num, name, id, pw, balance);
		/*
		 * String sql = "insert into DBTEST values('" + name + "', '" + id + "', '" + pw
		 * + "', '1000')"; // insert 문
		 */
		sql = "insert into MEMBER values('" + member.getNum() + "', + '" + member.getName() + "', '" + member.getId()
				+ "', '" + member.getPw() + "', " + member.getBalance() + ")"; // insert 문

		int result = -1;
		try {
			result = stmt.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}
		members.add(member);
	}

	static Member member;

	public boolean mk() { // 관리자
		boolean result = false;
		String sql = "SELECT * FROM MK WHERE ID = '" + text.getText().trim() + "'";
		try {
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String r_pw = rs.getString("PW");
				if (value.getText().equals(r_pw)) {
					result = true;
				} else {
					String data = "패스워드가 일치하지 않습니다.";
					JOptionPane.showMessageDialog(p1, data);
					System.out.println(" PW X ");
				}
			} else {
				String data = "아이디가 일치하지 않습니다.";
				JOptionPane.showMessageDialog(p1, data);
				System.out.println(" ID X ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public void mkdelete() { // 관리자 회원 탈퇴
		String wId = text9.getText().trim(); // 조건 ID
		String wPw = text10.getText().trim(); // 조건 PW
		if (wId.equals(member.getId()) && wPw.equals(member.getPw())) {
			if (text9.getText().trim().length() > 0 && text10.getText().trim().length() > 0) {
				String sql = "DELETE FROM MEMBER WHERE ID = '" + wId + "' " + "&& PW = '" + wPw + "'";
				int result = -1;
				try {
					result = stmt.executeUpdate(sql);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				String data = "최소 한 글자 이상의 정보를 입력 해주세요.";
				JOptionPane.showMessageDialog(p1, data);
			}
		} else {
			String data = "아이디 혹은 비밀번호가 틀렸습니다.";
			JOptionPane.showMessageDialog(p1, data);
		}
	}// end mkdelete
	
	public boolean login() { // 로그인
		boolean result = false;
		String sql = "SELECT * FROM MEMBER WHERE ID = '" + text.getText().trim() + "'";
		try {
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String r_pw = rs.getString("PW");
				if (value.getText().equals(r_pw)) {
					member = new Member(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							Integer.parseInt(rs.getString(5)));
					result = true;
				} else {
					String data = "패스워드가 일치하지 않습니다.";
					JOptionPane.showMessageDialog(p1, data);
					System.out.println(" PW X ");
				}
			} else {
				String data = "아이디가 일치하지 않습니다.";
				JOptionPane.showMessageDialog(p1, data);
				System.out.println(" ID X ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public void checkId() {
		boolean checkId = true;
		if (text2.getText().trim().length() > 0) {
			String sql = "SELECT * FROM MEMBER WHERE ID = '" + text2.getText().trim() + "'";
			try {
				rs = stmt.executeQuery(sql);
				if (rs.next()) {
					String r_id = rs.getString("ID");
					if (text2.getText().equals(r_id)) {
						String data = "이미 사용하고 있는 아이디입니다.";
						JOptionPane.showMessageDialog(p1, data);
						System.out.println("------이미 사용하고 있는 아이디입니다.------");
						checkId = false;
					}
				} else {
					String data = "사용 가능한 아이디입니다.";
					JOptionPane.showMessageDialog(p1, data);
				}
				return;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return;
		} else {
			String data = "최소 1자리 이상의 아이디를 입력해주세요.";
			JOptionPane.showMessageDialog(p1, data);
		}
	}// end 클래스

	public void logout() {
		member = null;
	}

	public boolean update() { // 회원정보 수정
		String pw = value2.getText().trim(); // 바꿀 비밀번호
		String wId = text5.getText().trim(); // 조건 ID
		String wPw = value3.getText().trim(); // 조건 PW
		boolean result = false;
		if (text5.getText().trim().length() > 0 && value3.getText().trim().length() > 0) {
			if(wId.equals(member.getId()) && wPw.equals(member.getPw()))  {
				String sql = "update MEMBER set PW = '" + pw + "' WHERE ID = '" + wId + "'" + " && PW = '" + wPw + "'";
//				int result = -1;
				try {
					result = stmt.executeUpdate(sql) > -1 ? true : false;
					String data = " 정보가 변경 되었습니다. ";
					JOptionPane.showMessageDialog(p2, data);
					member.setPw(pw);	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else {
				String data = "아이디 혹은 비밀번호가 틀렸습니다.";
				JOptionPane.showMessageDialog(p1, data);
				text5.setText("");
				value2.setText("");
				value3.setText("");
			}
		}
		else {
			String data = "최소 한 글자 이상의 정보를 입력 해주세요.";
			JOptionPane.showMessageDialog(p1, data);
			text5.setText("");
			value2.setText("");
			value3.setText("");
		}
		return result;
	}

	int delete;
	public boolean delete() { // 회원 탈퇴
		String wId = text6.getText().trim(); // 조건 ID
		String wPw = value4.getText().trim(); // 조건 PW
		boolean result = false;
		if (text6.getText().trim().length() > 0 && value4.getText().trim().length() > 0) {
			if (wId.equals(member.getId()) && wPw.equals(member.getPw())) {
				String sql = "DELETE FROM MEMBER WHERE ID = '" + wId + "' " + "&& PW = '" + wPw + "'";
				try {
					result = stmt.executeUpdate(sql) > -1 ? true : false;
				} catch (Exception e) {
					e.printStackTrace();
				}
				String data = "회원 탈퇴되었습니다.";
				JOptionPane.showMessageDialog(p1, data);

			} else {
				String data = "아이디 혹은 비밀번호가 틀렸습니다.";
				JOptionPane.showMessageDialog(p1, data);
				
			}
		} else {
			String data = "빈 칸에 정보를 입력해주세요.";
			JOptionPane.showMessageDialog(p1, data);			
		}
		return result;
	}// 끝

	public boolean deposit() { // 예금
//		if( text3.getText().trim().length() < 1 )  return;
		boolean result = false;
		if (text3.getText().trim().length() > 0) {
			String a = text3.getText().trim();
			int b = Integer.parseInt(a);
		member.setBalance(member.getBalance() + b);
		String data = text3.getText() + "원이 입금되었습니다.";
		JOptionPane.showMessageDialog(p1, data);
		String sql = " update MEMBER set BALANCE = " + member.getBalance() + " WHERE ID = '" + member.getId() + "'";
		try {
			result = stmt.executeUpdate(sql) > -1 ? true : false;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}else {
			String data = "금액을 입력 해주세요.";
			JOptionPane.showMessageDialog(p1, data);
		}
		return result;
	}// 끝

	public boolean withdraw() { // 출금
		boolean result = false;
		if (text4.getText().trim().length() > 0) {
			String a = text4.getText().trim();
			int b = Integer.parseInt(a);
			if ((member.getBalance() - b) >= 0) {
				member.setBalance(member.getBalance() - b);
				String data = text4.getText() + " 원이 출금 되었습니다.";
				JOptionPane.showMessageDialog(p2, data);
				String sql = " update MEMBER set BALANCE = " + member.getBalance() + " WHERE ID = '" + member.getId()
						+ "'";
				try {
					result = stmt.executeUpdate(sql) > -1 ? true : false;
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				String data = " 잔액 부족으로 출금이 취소되었습니다";
				JOptionPane.showMessageDialog(p2, data);
			}
		} else {
			String data = " 금액을 입력해주세요.";
			JOptionPane.showMessageDialog(p2, data);
		}
		return result;
	}

	public void mkmemberList() { // 관리자회원정보
		ta2.setText("");
		ta2.append("=========================================================\n");
		for (Member member : new DBEx7().memberList()) {
			ta2.append("회원이름 : " + member.getName() + ", ");
			ta2.append("아이디 : " + member.getId() + ", ");
			ta2.append("비밀번호 : " + member.getPw() + ", ");
			ta2.append("잔고 : " + member.getBalance() + "\n");
			ta2.append("계좌번호 : " + member.getNum() + "\n");
			ta2.append("---------------------------------------------------------\n");
		}
		ta2.append("=========================================================");
	}

	public void memberList() { // 회원정보
		ta1.setText("");
		ta1.append("=========================================================\n");
		ta1.append("회원이름 : " + member.getName() + ", ");
		ta1.append("아이디 : " + member.getId() + ", ");
		ta1.append("비밀번호 : " + member.getPw() + ", ");
		ta1.append("잔고 : " + member.getBalance() + "\n");
		ta1.append("계좌번호 : " + member.getNum() + "\n");
		ta1.append("---------------------------------------------------------\n");
		ta1.append("=========================================================");
	}

	public void money() { // 계좌
		String UN;
		UN = text7.getText();// 계좌
		int UM;
		UM = Integer.parseInt(text8.getText());// 송금액
		int UMO = 0;
		if (text7.getText().trim().length() < 1 && text8.getText().trim().length() < 1)
			return;
		if ((member.getBalance() - UM) >= 0) {
			if (text7.getText().trim().length() == 6) {
				String sql = " select BALANCE FROM MEMBER WHERE NUM = '" + UN + "'";
				int result = -1;
				try {
					ResultSet rs = stmt.executeQuery(sql);
					if (rs.next()) {
						UMO = rs.getInt("balance");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sql = " update MEMBER set BALANCE = " + (UMO + UM) + " WHERE NUM = '" + UN + "'";
				result = -1;
				try {
					result = stmt.executeUpdate(sql);
				} catch (Exception e) {
					e.printStackTrace();
				}
				sql = " update MEMBER set BALANCE = " + (member.getBalance() - UM) + " WHERE NUM = '" + member.getNum()
						+ "'";
				member.setBalance(member.getBalance() - UM);
				result = -1;
				try {
					result = stmt.executeUpdate(sql);
				} catch (Exception e) {
					e.printStackTrace();
				}
				String data = text8.getText() + " 원이 이체 완료 되었습니다";
				JOptionPane.showMessageDialog(p2, data);
			} else {
				String data = " 계좌 번호가 존재하지 않습니다.";
				JOptionPane.showMessageDialog(p2, data);
			}
		} else {
			String data = " 잔액 부족으로 이체가 취소되었습니다";
			JOptionPane.showMessageDialog(p2, data);
		}
	}

	JTextField text;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	JTextField text5;
	JTextField text6;
	JTextField text7;
	JTextField text8;
	JTextField text9;
	JTextField text10;
	JPasswordField value;
	JPasswordField value1;
	JPasswordField value2;
	JPasswordField value3;
	JPasswordField value4;
	JPasswordField value5;
	JPasswordField value6;
	JPasswordField value7;
	TextArea ta1;
	TextArea ta2;

	public UItest() {
		database();
		members = new ArrayList<Member>();

//		Member member = new Member("000000", "관리자", "abc", "123", 0); 
		members.add(member);
		JFrame f = new JFrame("자바 은행 로그인 창");
		JFrame g = new JFrame("회원가입 창");
		JFrame h = new JFrame("메뉴 창");
		JFrame i = new JFrame("회원정보 창");
		JFrame j = new JFrame("예금 창");
		JFrame k = new JFrame("출금 창");
		JFrame l = new JFrame("회원 정보수정 창");
		JFrame m = new JFrame("회원탈퇴 확인 창");
		JFrame n = new JFrame("계좌이체 창");
		JFrame o = new JFrame("관리자 창");
		JFrame p = new JFrame("회원 목록");

		ta1 = new TextArea("회원정보", 500, 500, 1); // 일반 회원정보
		ta1.setBounds(100, 150, 370, 150);

		ta2 = new TextArea("회원목록", 500, 500, 1); // 관리자 회원목록
		ta2.setBounds(100, 150, 370, 150);

		JLabel l1 = new JLabel("사용자 : "); // 로그인 아이디
		l1.setBounds(5, 20, 80, 30);
		text = new JTextField();
		text.setBounds(65, 20, 100, 30);

		JLabel l2 = new JLabel("비밀번호 : "); // 로그인 비밀번호
		l2.setBounds(5, 75, 80, 30);
		value = new JPasswordField();
		value.setBounds(65, 75, 100, 30);

		JLabel l6 = new JLabel("예금액 : ");
		l6.setBounds(20, 20, 80, 30);
		text3 = new JTextField();
		text3.setBounds(100, 20, 100, 30);

		JLabel l7 = new JLabel("출금액 : ");
		l7.setBounds(20, 20, 80, 30);
		text4 = new JTextField();
		text4.setBounds(100, 20, 100, 30);
//f
		JButton b = new JButton("로그인");
		JButton b2 = new JButton("회원가입");
		JButton b3 = new JButton("종료");
//g		
		JButton b4 = new JButton("회원가입"); // 회원가입 완료!
//h		
		JButton b5 = new JButton("예금");
		JButton b6 = new JButton("출금");
		JButton b7 = new JButton("잔고");
		JButton b8 = new JButton("회원정보");
		JButton b9 = new JButton("종료");

		JButton b10 = new JButton("확인"); // 예금확인
		JButton b11 = new JButton("확인"); // 출금확인
		JButton b12 = new JButton("확인"); // 잔고확인

		JButton b13 = new JButton("뒤로"); // 메인 메뉴로
		JButton b14 = new JButton("홈으로"); // 로그인 창으로

		JButton b15 = new JButton("정보수정"); // 수정
		JButton b16 = new JButton("회원탈퇴"); // 탈퇴

		JButton b17 = new JButton("변경"); // 회원 정보 변경

		JButton b18 = new JButton("확인"); // 회원 탈퇴 확인
		JButton b19 = new JButton("취소"); // 회원 탈퇴 취소 뒤로

		JButton b20 = new JButton("계좌이체"); // 계좌이체
		JButton b21 = new JButton("확인"); // 계좌이체 확인
		JButton b22 = new JButton("취소"); // 계좌이체 취소버튼
		JButton b23 = new JButton("취소"); // 회원정보 수정 취소버튼

		JButton b24 = new JButton("취소"); // 예금 취소버튼
		JButton b25 = new JButton("취소"); // 출금 취소버튼

		JButton b26 = new JButton("로그아웃"); // 로그아웃
		JButton b27 = new JButton("관리자"); // 관리자
		JButton b28 = new JButton("회원목록"); // 관리자 회원목록
		JButton b29 = new JButton("회원 탈퇴"); // 관리자 회원 탈퇴 확인
		JButton b30 = new JButton("홈으로"); // 관리자 회원 탈퇴 홈으로

		JButton b31 = new JButton("중복확인"); // 아이디 중복확인
		JButton b32 = new JButton("로그아웃"); // 관리자 로그아웃

		// 회원가입
		JLabel l3 = new JLabel("이름 : ");
		l3.setBounds(20, 120, 80, 30);
		text1 = new JTextField();
		text1.setBounds(100, 120, 100, 30);

		JLabel l4 = new JLabel("아이디 : ");
		l4.setBounds(20, 175, 80, 30);
		text2 = new JTextField();
		text2.setBounds(100, 175, 100, 30);

		JLabel l5 = new JLabel("비밀번호 : ");
		l5.setBounds(20, 225, 80, 30);
		value1 = new JPasswordField();
		value1.setBounds(100, 225, 100, 30);

		// 회원정보 수정

		JLabel l8 = new JLabel("새 비밀번호 : ");
		l8.setBounds(20, 120, 80, 30);
		value2 = new JPasswordField();
		value2.setBounds(100, 120, 100, 30);

		JLabel l9 = new JLabel("아이디 : ");
		l9.setBounds(20, 170, 80, 30);
		text5 = new JTextField();
		text5.setBounds(100, 175, 100, 30);

		JLabel l10 = new JLabel("비밀번호 : ");
		l10.setBounds(20, 230, 80, 30);
		value3 = new JPasswordField();
		value3.setBounds(100, 225, 100, 30);

		// 회원탈퇴

		JLabel l11 = new JLabel("아이디 : ");
		l11.setBounds(20, 170, 80, 30);
		text6 = new JTextField();
		text6.setBounds(100, 175, 100, 30);

		JLabel l12 = new JLabel("비밀번호 : ");
		l12.setBounds(20, 230, 80, 30);
		value4 = new JPasswordField();
		value4.setBounds(100, 225, 100, 30);

		// 계좌이체

		JLabel l13 = new JLabel("계좌번호 : ");
		l13.setBounds(20, 170, 80, 30);
		text7 = new JTextField();
		text7.setBounds(100, 175, 100, 30);

		JLabel l14 = new JLabel("송금액 : ");
		l14.setBounds(20, 230, 80, 30);
		text8 = new JTextField();
		text8.setBounds(100, 225, 100, 30);

		// 관리자 회원 탈퇴

		JLabel l15 = new JLabel("아이디 : ");
		l15.setBounds(20, 335, 80, 30);
		text9 = new JTextField();
		text9.setBounds(100, 335, 100, 30);

		JLabel l16 = new JLabel("비밀번호 : ");
		l16.setBounds(20, 390, 80, 30);
		text10 = new JTextField();
		text10.setBounds(100, 390, 100, 30);

		// 회원가입창
		g.add(l3);
		g.add(l4);
		g.add(l5);
		g.add(text1);
		g.add(text2);
		g.add(value1);
		g.add(b4);
		g.add(b14);
		g.add(b31);
		setLayout(new FlowLayout());

		b.setBounds(5, 120, 80, 30);
		b2.setBounds(90, 120, 90, 30);
		b3.setBounds(185, 120, 80, 30);
		b4.setBounds(20, 270, 100, 30);
		b14.setBounds(150, 270, 100, 30);

		// 로그인 창
		f.add(l1);
		f.add(text);
		f.add(l2);
		f.add(value);
		f.add(b);
		f.add(b2);
		f.add(b3);
		f.add(b27);

		// 메뉴 창
		h.add(b5);
		h.add(b6);
		h.add(b7);
		h.add(b8);
		h.add(b9);
		h.add(b20);
		h.add(b26);

		b5.setBounds(150, 120, 80, 30);// 예금 버튼
		b6.setBounds(300, 120, 80, 30);
		b7.setBounds(300, 230, 80, 30);// 잔고 버튼
		b8.setBounds(150, 320, 100, 30);// 회원 정보
		b9.setBounds(220, 420, 80, 30);
		b10.setBounds(50, 120, 100, 30);// 예금 확인
		b11.setBounds(50, 120, 100, 30);// 출금 확인
		b12.setBounds(100, 120, 100, 30);
		b13.setBounds(360, 420, 100, 30);
		b15.setBounds(80, 420, 100, 30);
		b16.setBounds(220, 420, 100, 30);
		b17.setBounds(100, 270, 100, 30);
		b18.setBounds(100, 270, 100, 30);
		b19.setBounds(200, 270, 100, 30);
		b20.setBounds(150, 230, 100, 30); // 계좌이체 버튼
		b21.setBounds(100, 270, 100, 30);
		b22.setBounds(200, 270, 100, 30);
		b23.setBounds(200, 270, 100, 30); // 회원 정보 수정 취소
		b24.setBounds(150, 120, 100, 30); // 예금 취소
		b25.setBounds(150, 120, 100, 30); // 출금 취소
		b26.setBounds(300, 320, 100, 30); // 로그아웃
		b27.setBounds(185, 20, 80, 30); // 관리자 로그인
		b28.setBounds(150, 120, 100, 30); // 관리자 회원정보
		b29.setBounds(120, 430, 100, 30); // 관리자 회원 탈퇴확인
		b30.setBounds(20, 430, 80, 30); // 관리자 회원목록 홈으로
		b31.setBounds(200, 175, 90, 30); // 관리자 회원목록 홈으로
		b32.setBounds(300, 120, 100, 30); // 관리자 로그인창으로

		i.add(ta1);// 회원정보
		i.add(b13);// 뒤로 버튼
		i.add(b15);// 회원정보 수정
		i.add(b16);// 회원탈퇴

		j.add(l6); // 예금
		j.add(b10);
		j.add(b24);
		j.add(text3);

		k.add(l7); // 출금
		k.add(b11);
		k.add(b25);
		k.add(text4);

		l.add(l8); // 회원정보 수정
		l.add(l9);
		l.add(l10);
		l.add(text5);
		l.add(value2);
		l.add(value3);
		l.add(b17);
		l.add(b23);

		m.add(l11);
		m.add(l12);
		m.add(b18);
		m.add(b19);
		m.add(text6);
		m.add(value4);
		// 계좌이체
		n.add(text7);
		n.add(text8);
		n.add(l13);
		n.add(l14);
		n.add(b21);
		n.add(b22);
		// 관리자 창
		o.add(b28);
		o.add(b32);

		// 관리자 회원정보 창
		p.add(b29);
		p.add(b30);
		p.add(text9);
		p.add(text10);
		p.add(l15);
		p.add(l16);
		p.add(ta2);

		f.setLocation(700, 250);// 프레임 창 뜨는 위치 코드
		g.setLocation(700, 300);// 프레임 창 뜨는 위치 코드
		h.setLocation(500, 150);// 프레임 창 뜨는 위치 코드
		i.setLocation(500, 150);// 프레임 창 뜨는 위치 코드
		j.setLocation(500, 150);// 프레임 창 뜨는 위치 코드
		k.setLocation(500, 150);// 프레임 창 뜨는 위치 코드
		l.setLocation(500, 150);// 프레임 창 뜨는 위치 코드
		m.setLocation(500, 150);// 프레임 창 뜨는 위치 코드
		n.setLocation(500, 150);// 프레임 창 뜨는 위치 코드
		o.setLocation(500, 150);// 프레임 창 뜨는 위치 코드
		p.setLocation(500, 150);// 프레임 창 뜨는 위치 코드

		f.setSize(300, 200);
		g.setSize(600, 600);
		h.setSize(600, 600);
		i.setSize(600, 600);
		j.setSize(300, 300);
		k.setSize(300, 300);
		l.setSize(600, 600);
		m.setSize(600, 600);
		n.setSize(600, 600);
		o.setSize(600, 600);
		p.setSize(600, 600);

		f.setLayout(null);
		g.setLayout(null);
		h.setLayout(null);
		i.setLayout(null);
		j.setLayout(null);
		k.setLayout(null);
		l.setLayout(null);
		m.setLayout(null);
		n.setLayout(null);
		o.setLayout(null);
		p.setLayout(null);

		f.setVisible(true);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		void windowClosed(WindowEvent e)
		b.addActionListener(new ActionListener() { // 로그인
			public void actionPerformed(ActionEvent e) {
				if (login()) {
					String data = member.getName() + " 님 접속을 환영합니다";
					JOptionPane.showMessageDialog(f, data);
					f.setVisible(false);
					h.setVisible(true);
				}
			}
		});
		b2.addActionListener(new ActionListener() { // 회원가입
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
				value1.setText("");
				text2.setText("");
				g.setVisible(true);
				f.setVisible(false);
			}
		});
		b3.addActionListener(new ActionListener() { // 종료
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		b4.addActionListener(new ActionListener() { // 회원가입 완료!
			public void actionPerformed(ActionEvent e) {
				creatMember();
				String data = text1.getText() + " 님 회원가입을 축하드립니다";
				JOptionPane.showMessageDialog(g, data);
				g.setVisible(false);
				f.setVisible(true);
			}
		});
		b5.addActionListener(new ActionListener() { // 예금
			public void actionPerformed(ActionEvent e) {
				h.setVisible(false);
				j.setVisible(true);
				text3.setText("");

			}
		});
		b6.addActionListener(new ActionListener() { // 출금
			public void actionPerformed(ActionEvent e) {
				h.setVisible(false);
				k.setVisible(true);
				text4.setText("");
			}
		});
		b7.addActionListener(new ActionListener() { // 잔고
			public void actionPerformed(ActionEvent e) {
				String data = "고객님의 통장에는 " + member.getBalance() + " 원이 들어있습니다";
				JOptionPane.showMessageDialog(h, data);
			}
		});
		b8.addActionListener(new ActionListener() { // 회원목록
			public void actionPerformed(ActionEvent e) {
				h.setVisible(false);
				i.setVisible(true);
				memberList();
			}
		});

		b9.addActionListener(new ActionListener() { // 종료
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		b10.addActionListener(new ActionListener() {// 예금완료버튼
			public void actionPerformed(ActionEvent e) {
				if(deposit()) {
				h.setVisible(true);
				j.setVisible(false);
				text3.setText("");
			}}
		});
		b11.addActionListener(new ActionListener() {// 출금완료버튼
			public void actionPerformed(ActionEvent e) {
				if(withdraw()) {
				h.setVisible(true);
				k.setVisible(false);
				text4.setText("");
			}}

		});
		b12.addActionListener(new ActionListener() { // 잔고 확인 종료 버튼
			public void actionPerformed(ActionEvent e) {

			}
		});
		b13.addActionListener(new ActionListener() { // 뒤로
			public void actionPerformed(ActionEvent e) {
				h.setVisible(true);
				i.setVisible(false);
			}
		});
		b14.addActionListener(new ActionListener() { // 홈으로
			public void actionPerformed(ActionEvent e) {
				text.setText("");
				value.setText("");
				g.setVisible(false);
				f.setVisible(true);
			}
		});
		b15.addActionListener(new ActionListener() { // 회원정보 수정
			public void actionPerformed(ActionEvent e) {
				text5.setText("");
				value3.setText("");
				value2.setText("");
				i.setVisible(false);
				l.setVisible(true);
			}
		});
		b16.addActionListener(new ActionListener() { // 회원탈퇴
			public void actionPerformed(ActionEvent e) {
				text6.setText("");
				value4.setText("");
				i.setVisible(false);
				m.setVisible(true);
//				
			}
		});
		b17.addActionListener(new ActionListener() { // 회원정보 수정 변경
			public void actionPerformed(ActionEvent e) {
				if(update()){	
					h.setVisible(true);
					l.setVisible(false);
					
				}
//				
			}
		});
		b18.addActionListener(new ActionListener() { // 회원탈퇴 확인
			public void actionPerformed(ActionEvent e) {
				if(delete()) {
					f.setVisible(true);
					m.setVisible(false);
					text.setText("");
					value.setText("");
					text6.setText("");
					value4.setText("");
					logout();
				}	
			}
		});
		b19.addActionListener(new ActionListener() { // 회원탈퇴 취소
			public void actionPerformed(ActionEvent e) {
				i.setVisible(true);
				m.setVisible(false);
				memberList();
			}
		});
		b20.addActionListener(new ActionListener() { // 계좌이체
			public void actionPerformed(ActionEvent e) {
				text7.setText("");
				text8.setText("");
				h.setVisible(false);
				n.setVisible(true);
			}
		});
		b21.addActionListener(new ActionListener() { // 계좌이체 확인
			public void actionPerformed(ActionEvent e) {
				money(); 				
				h.setVisible(true);
				n.setVisible(false);
				text7.setText("");
				text8.setText("");
			}
		});
		b22.addActionListener(new ActionListener() { // 공백
			public void actionPerformed(ActionEvent e) {
				h.setVisible(true);
				n.setVisible(false);

			}
		});
		b23.addActionListener(new ActionListener() { // 회원정보 수정 취소버튼
			public void actionPerformed(ActionEvent e) {
				i.setVisible(true);
				l.setVisible(false);
			}
		});
		b24.addActionListener(new ActionListener() { // 예금 취소버튼
			public void actionPerformed(ActionEvent e) {
				h.setVisible(true);
				j.setVisible(false);
			}
		});
		b25.addActionListener(new ActionListener() { // 출금 취소버튼
			public void actionPerformed(ActionEvent e) {
				h.setVisible(true);
				k.setVisible(false);
			}
		});
		b26.addActionListener(new ActionListener() { // 로그아웃
			public void actionPerformed(ActionEvent e) {
				text.setText("");
				value.setText("");
				logout();
				f.setVisible(true);
				h.setVisible(false);
			}
		});
		b27.addActionListener(new ActionListener() { // 관리자
			public void actionPerformed(ActionEvent e) {
				if (mk()) {
					String data = "관리자님 접속을 환영합니다";
					JOptionPane.showMessageDialog(f, data);
					f.setVisible(false);
					o.setVisible(true);
				}
			}
		});
		b28.addActionListener(new ActionListener() { // 관리자 회원관리
			public void actionPerformed(ActionEvent e) {
				text9.setText("");
				text10.setText("");
				mkmemberList();
				p.setVisible(true);
				o.setVisible(false);
			}
		});
		b29.addActionListener(new ActionListener() { // 관리자 회원탈퇴
			public void actionPerformed(ActionEvent e) {
				mkdelete();
				text9.setText("");
				text10.setText("");
				ta2.setText("");
				mkmemberList();
				String data = "회원 탈퇴되었습니다.";
				JOptionPane.showMessageDialog(p, data);

			}
		});
		b30.addActionListener(new ActionListener() { // 관리자 메뉴로
			public void actionPerformed(ActionEvent e) {
				o.setVisible(true);
				p.setVisible(false);
			}
		});
		b31.addActionListener(new ActionListener() { // 아이디 중복 확인
			public void actionPerformed(ActionEvent e) {
				checkId();
			}
		});
		b32.addActionListener(new ActionListener() { // 관리자 로그아웃
			public void actionPerformed(ActionEvent e) {
				logout();
				text.setText("");
				value.setText("");
				o.setVisible(false);
				f.setVisible(true);
			}
		});

	}

	public static void main(String[] args) {
		new UItest();
	}

}
