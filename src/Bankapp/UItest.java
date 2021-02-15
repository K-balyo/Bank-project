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
import java.util.Scanner; //����Ʈ�� ���� ���ٸ� ���������� �� �� �ִ�

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

	public int inputNum() { // ���� �Է���ġ
		int num = new java.util.Scanner(System.in).nextInt();
		return num;
	}

	public String inputStr() { // ���ڿ� �Է���ġ
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
//			System.out.println("�����ͺ��̽� ���� ����");
			e.printStackTrace();
		}
	}

	public void creatMember() {

		System.out.print("���� : ");
		if (text1.getText().trim().length() < 1 && text2.getText().trim().length() < 1
				&& value1.getText().trim().length() < 1)
			return;

		String name = text1.getText().trim();

		System.out.print("���̵� : ");
		String id = text2.getText().trim();

		System.out.print("��й�ȣ : ");
		String pw = value1.getText().trim();

		System.out.print("�ܰ� : ");
		int balance = 1000;
		System.out.print("ȸ�������� �Ϸ�Ǿ����ϴ�.");
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
		 * + "', '1000')"; // insert ��
		 */
		sql = "insert into MEMBER values('" + member.getNum() + "', + '" + member.getName() + "', '" + member.getId()
				+ "', '" + member.getPw() + "', " + member.getBalance() + ")"; // insert ��

		int result = -1;
		try {
			result = stmt.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}
		members.add(member);
	}

	static Member member;

	public boolean mk() { // ������
		boolean result = false;
		String sql = "SELECT * FROM MK WHERE ID = '" + text.getText().trim() + "'";
		try {
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String r_pw = rs.getString("PW");
				if (value.getText().equals(r_pw)) {
					result = true;
				} else {
					String data = "�н����尡 ��ġ���� �ʽ��ϴ�.";
					JOptionPane.showMessageDialog(p1, data);
					System.out.println(" PW X ");
				}
			} else {
				String data = "���̵� ��ġ���� �ʽ��ϴ�.";
				JOptionPane.showMessageDialog(p1, data);
				System.out.println(" ID X ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public void mkdelete() { // ������ ȸ�� Ż��
		String wId = text9.getText().trim(); // ���� ID
		String wPw = text10.getText().trim(); // ���� PW
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
				String data = "�ּ� �� ���� �̻��� ������ �Է� ���ּ���.";
				JOptionPane.showMessageDialog(p1, data);
			}
		} else {
			String data = "���̵� Ȥ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.";
			JOptionPane.showMessageDialog(p1, data);
		}
	}// end mkdelete
	
	public boolean login() { // �α���
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
					String data = "�н����尡 ��ġ���� �ʽ��ϴ�.";
					JOptionPane.showMessageDialog(p1, data);
					System.out.println(" PW X ");
				}
			} else {
				String data = "���̵� ��ġ���� �ʽ��ϴ�.";
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
						String data = "�̹� ����ϰ� �ִ� ���̵��Դϴ�.";
						JOptionPane.showMessageDialog(p1, data);
						System.out.println("------�̹� ����ϰ� �ִ� ���̵��Դϴ�.------");
						checkId = false;
					}
				} else {
					String data = "��� ������ ���̵��Դϴ�.";
					JOptionPane.showMessageDialog(p1, data);
				}
				return;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return;
		} else {
			String data = "�ּ� 1�ڸ� �̻��� ���̵� �Է����ּ���.";
			JOptionPane.showMessageDialog(p1, data);
		}
	}// end Ŭ����

	public void logout() {
		member = null;
	}

	public boolean update() { // ȸ������ ����
		String pw = value2.getText().trim(); // �ٲ� ��й�ȣ
		String wId = text5.getText().trim(); // ���� ID
		String wPw = value3.getText().trim(); // ���� PW
		boolean result = false;
		if (text5.getText().trim().length() > 0 && value3.getText().trim().length() > 0) {
			if(wId.equals(member.getId()) && wPw.equals(member.getPw()))  {
				String sql = "update MEMBER set PW = '" + pw + "' WHERE ID = '" + wId + "'" + " && PW = '" + wPw + "'";
//				int result = -1;
				try {
					result = stmt.executeUpdate(sql) > -1 ? true : false;
					String data = " ������ ���� �Ǿ����ϴ�. ";
					JOptionPane.showMessageDialog(p2, data);
					member.setPw(pw);	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else {
				String data = "���̵� Ȥ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.";
				JOptionPane.showMessageDialog(p1, data);
				text5.setText("");
				value2.setText("");
				value3.setText("");
			}
		}
		else {
			String data = "�ּ� �� ���� �̻��� ������ �Է� ���ּ���.";
			JOptionPane.showMessageDialog(p1, data);
			text5.setText("");
			value2.setText("");
			value3.setText("");
		}
		return result;
	}

	int delete;
	public boolean delete() { // ȸ�� Ż��
		String wId = text6.getText().trim(); // ���� ID
		String wPw = value4.getText().trim(); // ���� PW
		boolean result = false;
		if (text6.getText().trim().length() > 0 && value4.getText().trim().length() > 0) {
			if (wId.equals(member.getId()) && wPw.equals(member.getPw())) {
				String sql = "DELETE FROM MEMBER WHERE ID = '" + wId + "' " + "&& PW = '" + wPw + "'";
				try {
					result = stmt.executeUpdate(sql) > -1 ? true : false;
				} catch (Exception e) {
					e.printStackTrace();
				}
				String data = "ȸ�� Ż��Ǿ����ϴ�.";
				JOptionPane.showMessageDialog(p1, data);

			} else {
				String data = "���̵� Ȥ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.";
				JOptionPane.showMessageDialog(p1, data);
				
			}
		} else {
			String data = "�� ĭ�� ������ �Է����ּ���.";
			JOptionPane.showMessageDialog(p1, data);			
		}
		return result;
	}// ��

	public boolean deposit() { // ����
//		if( text3.getText().trim().length() < 1 )  return;
		boolean result = false;
		if (text3.getText().trim().length() > 0) {
			String a = text3.getText().trim();
			int b = Integer.parseInt(a);
		member.setBalance(member.getBalance() + b);
		String data = text3.getText() + "���� �ԱݵǾ����ϴ�.";
		JOptionPane.showMessageDialog(p1, data);
		String sql = " update MEMBER set BALANCE = " + member.getBalance() + " WHERE ID = '" + member.getId() + "'";
		try {
			result = stmt.executeUpdate(sql) > -1 ? true : false;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}else {
			String data = "�ݾ��� �Է� ���ּ���.";
			JOptionPane.showMessageDialog(p1, data);
		}
		return result;
	}// ��

	public boolean withdraw() { // ���
		boolean result = false;
		if (text4.getText().trim().length() > 0) {
			String a = text4.getText().trim();
			int b = Integer.parseInt(a);
			if ((member.getBalance() - b) >= 0) {
				member.setBalance(member.getBalance() - b);
				String data = text4.getText() + " ���� ��� �Ǿ����ϴ�.";
				JOptionPane.showMessageDialog(p2, data);
				String sql = " update MEMBER set BALANCE = " + member.getBalance() + " WHERE ID = '" + member.getId()
						+ "'";
				try {
					result = stmt.executeUpdate(sql) > -1 ? true : false;
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				String data = " �ܾ� �������� ����� ��ҵǾ����ϴ�";
				JOptionPane.showMessageDialog(p2, data);
			}
		} else {
			String data = " �ݾ��� �Է����ּ���.";
			JOptionPane.showMessageDialog(p2, data);
		}
		return result;
	}

	public void mkmemberList() { // ������ȸ������
		ta2.setText("");
		ta2.append("=========================================================\n");
		for (Member member : new DBEx7().memberList()) {
			ta2.append("ȸ���̸� : " + member.getName() + ", ");
			ta2.append("���̵� : " + member.getId() + ", ");
			ta2.append("��й�ȣ : " + member.getPw() + ", ");
			ta2.append("�ܰ� : " + member.getBalance() + "\n");
			ta2.append("���¹�ȣ : " + member.getNum() + "\n");
			ta2.append("---------------------------------------------------------\n");
		}
		ta2.append("=========================================================");
	}

	public void memberList() { // ȸ������
		ta1.setText("");
		ta1.append("=========================================================\n");
		ta1.append("ȸ���̸� : " + member.getName() + ", ");
		ta1.append("���̵� : " + member.getId() + ", ");
		ta1.append("��й�ȣ : " + member.getPw() + ", ");
		ta1.append("�ܰ� : " + member.getBalance() + "\n");
		ta1.append("���¹�ȣ : " + member.getNum() + "\n");
		ta1.append("---------------------------------------------------------\n");
		ta1.append("=========================================================");
	}

	public void money() { // ����
		String UN;
		UN = text7.getText();// ����
		int UM;
		UM = Integer.parseInt(text8.getText());// �۱ݾ�
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
				String data = text8.getText() + " ���� ��ü �Ϸ� �Ǿ����ϴ�";
				JOptionPane.showMessageDialog(p2, data);
			} else {
				String data = " ���� ��ȣ�� �������� �ʽ��ϴ�.";
				JOptionPane.showMessageDialog(p2, data);
			}
		} else {
			String data = " �ܾ� �������� ��ü�� ��ҵǾ����ϴ�";
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

//		Member member = new Member("000000", "������", "abc", "123", 0); 
		members.add(member);
		JFrame f = new JFrame("�ڹ� ���� �α��� â");
		JFrame g = new JFrame("ȸ������ â");
		JFrame h = new JFrame("�޴� â");
		JFrame i = new JFrame("ȸ������ â");
		JFrame j = new JFrame("���� â");
		JFrame k = new JFrame("��� â");
		JFrame l = new JFrame("ȸ�� �������� â");
		JFrame m = new JFrame("ȸ��Ż�� Ȯ�� â");
		JFrame n = new JFrame("������ü â");
		JFrame o = new JFrame("������ â");
		JFrame p = new JFrame("ȸ�� ���");

		ta1 = new TextArea("ȸ������", 500, 500, 1); // �Ϲ� ȸ������
		ta1.setBounds(100, 150, 370, 150);

		ta2 = new TextArea("ȸ�����", 500, 500, 1); // ������ ȸ�����
		ta2.setBounds(100, 150, 370, 150);

		JLabel l1 = new JLabel("����� : "); // �α��� ���̵�
		l1.setBounds(5, 20, 80, 30);
		text = new JTextField();
		text.setBounds(65, 20, 100, 30);

		JLabel l2 = new JLabel("��й�ȣ : "); // �α��� ��й�ȣ
		l2.setBounds(5, 75, 80, 30);
		value = new JPasswordField();
		value.setBounds(65, 75, 100, 30);

		JLabel l6 = new JLabel("���ݾ� : ");
		l6.setBounds(20, 20, 80, 30);
		text3 = new JTextField();
		text3.setBounds(100, 20, 100, 30);

		JLabel l7 = new JLabel("��ݾ� : ");
		l7.setBounds(20, 20, 80, 30);
		text4 = new JTextField();
		text4.setBounds(100, 20, 100, 30);
//f
		JButton b = new JButton("�α���");
		JButton b2 = new JButton("ȸ������");
		JButton b3 = new JButton("����");
//g		
		JButton b4 = new JButton("ȸ������"); // ȸ������ �Ϸ�!
//h		
		JButton b5 = new JButton("����");
		JButton b6 = new JButton("���");
		JButton b7 = new JButton("�ܰ�");
		JButton b8 = new JButton("ȸ������");
		JButton b9 = new JButton("����");

		JButton b10 = new JButton("Ȯ��"); // ����Ȯ��
		JButton b11 = new JButton("Ȯ��"); // ���Ȯ��
		JButton b12 = new JButton("Ȯ��"); // �ܰ�Ȯ��

		JButton b13 = new JButton("�ڷ�"); // ���� �޴���
		JButton b14 = new JButton("Ȩ����"); // �α��� â����

		JButton b15 = new JButton("��������"); // ����
		JButton b16 = new JButton("ȸ��Ż��"); // Ż��

		JButton b17 = new JButton("����"); // ȸ�� ���� ����

		JButton b18 = new JButton("Ȯ��"); // ȸ�� Ż�� Ȯ��
		JButton b19 = new JButton("���"); // ȸ�� Ż�� ��� �ڷ�

		JButton b20 = new JButton("������ü"); // ������ü
		JButton b21 = new JButton("Ȯ��"); // ������ü Ȯ��
		JButton b22 = new JButton("���"); // ������ü ��ҹ�ư
		JButton b23 = new JButton("���"); // ȸ������ ���� ��ҹ�ư

		JButton b24 = new JButton("���"); // ���� ��ҹ�ư
		JButton b25 = new JButton("���"); // ��� ��ҹ�ư

		JButton b26 = new JButton("�α׾ƿ�"); // �α׾ƿ�
		JButton b27 = new JButton("������"); // ������
		JButton b28 = new JButton("ȸ�����"); // ������ ȸ�����
		JButton b29 = new JButton("ȸ�� Ż��"); // ������ ȸ�� Ż�� Ȯ��
		JButton b30 = new JButton("Ȩ����"); // ������ ȸ�� Ż�� Ȩ����

		JButton b31 = new JButton("�ߺ�Ȯ��"); // ���̵� �ߺ�Ȯ��
		JButton b32 = new JButton("�α׾ƿ�"); // ������ �α׾ƿ�

		// ȸ������
		JLabel l3 = new JLabel("�̸� : ");
		l3.setBounds(20, 120, 80, 30);
		text1 = new JTextField();
		text1.setBounds(100, 120, 100, 30);

		JLabel l4 = new JLabel("���̵� : ");
		l4.setBounds(20, 175, 80, 30);
		text2 = new JTextField();
		text2.setBounds(100, 175, 100, 30);

		JLabel l5 = new JLabel("��й�ȣ : ");
		l5.setBounds(20, 225, 80, 30);
		value1 = new JPasswordField();
		value1.setBounds(100, 225, 100, 30);

		// ȸ������ ����

		JLabel l8 = new JLabel("�� ��й�ȣ : ");
		l8.setBounds(20, 120, 80, 30);
		value2 = new JPasswordField();
		value2.setBounds(100, 120, 100, 30);

		JLabel l9 = new JLabel("���̵� : ");
		l9.setBounds(20, 170, 80, 30);
		text5 = new JTextField();
		text5.setBounds(100, 175, 100, 30);

		JLabel l10 = new JLabel("��й�ȣ : ");
		l10.setBounds(20, 230, 80, 30);
		value3 = new JPasswordField();
		value3.setBounds(100, 225, 100, 30);

		// ȸ��Ż��

		JLabel l11 = new JLabel("���̵� : ");
		l11.setBounds(20, 170, 80, 30);
		text6 = new JTextField();
		text6.setBounds(100, 175, 100, 30);

		JLabel l12 = new JLabel("��й�ȣ : ");
		l12.setBounds(20, 230, 80, 30);
		value4 = new JPasswordField();
		value4.setBounds(100, 225, 100, 30);

		// ������ü

		JLabel l13 = new JLabel("���¹�ȣ : ");
		l13.setBounds(20, 170, 80, 30);
		text7 = new JTextField();
		text7.setBounds(100, 175, 100, 30);

		JLabel l14 = new JLabel("�۱ݾ� : ");
		l14.setBounds(20, 230, 80, 30);
		text8 = new JTextField();
		text8.setBounds(100, 225, 100, 30);

		// ������ ȸ�� Ż��

		JLabel l15 = new JLabel("���̵� : ");
		l15.setBounds(20, 335, 80, 30);
		text9 = new JTextField();
		text9.setBounds(100, 335, 100, 30);

		JLabel l16 = new JLabel("��й�ȣ : ");
		l16.setBounds(20, 390, 80, 30);
		text10 = new JTextField();
		text10.setBounds(100, 390, 100, 30);

		// ȸ������â
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

		// �α��� â
		f.add(l1);
		f.add(text);
		f.add(l2);
		f.add(value);
		f.add(b);
		f.add(b2);
		f.add(b3);
		f.add(b27);

		// �޴� â
		h.add(b5);
		h.add(b6);
		h.add(b7);
		h.add(b8);
		h.add(b9);
		h.add(b20);
		h.add(b26);

		b5.setBounds(150, 120, 80, 30);// ���� ��ư
		b6.setBounds(300, 120, 80, 30);
		b7.setBounds(300, 230, 80, 30);// �ܰ� ��ư
		b8.setBounds(150, 320, 100, 30);// ȸ�� ����
		b9.setBounds(220, 420, 80, 30);
		b10.setBounds(50, 120, 100, 30);// ���� Ȯ��
		b11.setBounds(50, 120, 100, 30);// ��� Ȯ��
		b12.setBounds(100, 120, 100, 30);
		b13.setBounds(360, 420, 100, 30);
		b15.setBounds(80, 420, 100, 30);
		b16.setBounds(220, 420, 100, 30);
		b17.setBounds(100, 270, 100, 30);
		b18.setBounds(100, 270, 100, 30);
		b19.setBounds(200, 270, 100, 30);
		b20.setBounds(150, 230, 100, 30); // ������ü ��ư
		b21.setBounds(100, 270, 100, 30);
		b22.setBounds(200, 270, 100, 30);
		b23.setBounds(200, 270, 100, 30); // ȸ�� ���� ���� ���
		b24.setBounds(150, 120, 100, 30); // ���� ���
		b25.setBounds(150, 120, 100, 30); // ��� ���
		b26.setBounds(300, 320, 100, 30); // �α׾ƿ�
		b27.setBounds(185, 20, 80, 30); // ������ �α���
		b28.setBounds(150, 120, 100, 30); // ������ ȸ������
		b29.setBounds(120, 430, 100, 30); // ������ ȸ�� Ż��Ȯ��
		b30.setBounds(20, 430, 80, 30); // ������ ȸ����� Ȩ����
		b31.setBounds(200, 175, 90, 30); // ������ ȸ����� Ȩ����
		b32.setBounds(300, 120, 100, 30); // ������ �α���â����

		i.add(ta1);// ȸ������
		i.add(b13);// �ڷ� ��ư
		i.add(b15);// ȸ������ ����
		i.add(b16);// ȸ��Ż��

		j.add(l6); // ����
		j.add(b10);
		j.add(b24);
		j.add(text3);

		k.add(l7); // ���
		k.add(b11);
		k.add(b25);
		k.add(text4);

		l.add(l8); // ȸ������ ����
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
		// ������ü
		n.add(text7);
		n.add(text8);
		n.add(l13);
		n.add(l14);
		n.add(b21);
		n.add(b22);
		// ������ â
		o.add(b28);
		o.add(b32);

		// ������ ȸ������ â
		p.add(b29);
		p.add(b30);
		p.add(text9);
		p.add(text10);
		p.add(l15);
		p.add(l16);
		p.add(ta2);

		f.setLocation(700, 250);// ������ â �ߴ� ��ġ �ڵ�
		g.setLocation(700, 300);// ������ â �ߴ� ��ġ �ڵ�
		h.setLocation(500, 150);// ������ â �ߴ� ��ġ �ڵ�
		i.setLocation(500, 150);// ������ â �ߴ� ��ġ �ڵ�
		j.setLocation(500, 150);// ������ â �ߴ� ��ġ �ڵ�
		k.setLocation(500, 150);// ������ â �ߴ� ��ġ �ڵ�
		l.setLocation(500, 150);// ������ â �ߴ� ��ġ �ڵ�
		m.setLocation(500, 150);// ������ â �ߴ� ��ġ �ڵ�
		n.setLocation(500, 150);// ������ â �ߴ� ��ġ �ڵ�
		o.setLocation(500, 150);// ������ â �ߴ� ��ġ �ڵ�
		p.setLocation(500, 150);// ������ â �ߴ� ��ġ �ڵ�

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
		b.addActionListener(new ActionListener() { // �α���
			public void actionPerformed(ActionEvent e) {
				if (login()) {
					String data = member.getName() + " �� ������ ȯ���մϴ�";
					JOptionPane.showMessageDialog(f, data);
					f.setVisible(false);
					h.setVisible(true);
				}
			}
		});
		b2.addActionListener(new ActionListener() { // ȸ������
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
				value1.setText("");
				text2.setText("");
				g.setVisible(true);
				f.setVisible(false);
			}
		});
		b3.addActionListener(new ActionListener() { // ����
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		b4.addActionListener(new ActionListener() { // ȸ������ �Ϸ�!
			public void actionPerformed(ActionEvent e) {
				creatMember();
				String data = text1.getText() + " �� ȸ�������� ���ϵ帳�ϴ�";
				JOptionPane.showMessageDialog(g, data);
				g.setVisible(false);
				f.setVisible(true);
			}
		});
		b5.addActionListener(new ActionListener() { // ����
			public void actionPerformed(ActionEvent e) {
				h.setVisible(false);
				j.setVisible(true);
				text3.setText("");

			}
		});
		b6.addActionListener(new ActionListener() { // ���
			public void actionPerformed(ActionEvent e) {
				h.setVisible(false);
				k.setVisible(true);
				text4.setText("");
			}
		});
		b7.addActionListener(new ActionListener() { // �ܰ�
			public void actionPerformed(ActionEvent e) {
				String data = "������ ���忡�� " + member.getBalance() + " ���� ����ֽ��ϴ�";
				JOptionPane.showMessageDialog(h, data);
			}
		});
		b8.addActionListener(new ActionListener() { // ȸ�����
			public void actionPerformed(ActionEvent e) {
				h.setVisible(false);
				i.setVisible(true);
				memberList();
			}
		});

		b9.addActionListener(new ActionListener() { // ����
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		b10.addActionListener(new ActionListener() {// ���ݿϷ��ư
			public void actionPerformed(ActionEvent e) {
				if(deposit()) {
				h.setVisible(true);
				j.setVisible(false);
				text3.setText("");
			}}
		});
		b11.addActionListener(new ActionListener() {// ��ݿϷ��ư
			public void actionPerformed(ActionEvent e) {
				if(withdraw()) {
				h.setVisible(true);
				k.setVisible(false);
				text4.setText("");
			}}

		});
		b12.addActionListener(new ActionListener() { // �ܰ� Ȯ�� ���� ��ư
			public void actionPerformed(ActionEvent e) {

			}
		});
		b13.addActionListener(new ActionListener() { // �ڷ�
			public void actionPerformed(ActionEvent e) {
				h.setVisible(true);
				i.setVisible(false);
			}
		});
		b14.addActionListener(new ActionListener() { // Ȩ����
			public void actionPerformed(ActionEvent e) {
				text.setText("");
				value.setText("");
				g.setVisible(false);
				f.setVisible(true);
			}
		});
		b15.addActionListener(new ActionListener() { // ȸ������ ����
			public void actionPerformed(ActionEvent e) {
				text5.setText("");
				value3.setText("");
				value2.setText("");
				i.setVisible(false);
				l.setVisible(true);
			}
		});
		b16.addActionListener(new ActionListener() { // ȸ��Ż��
			public void actionPerformed(ActionEvent e) {
				text6.setText("");
				value4.setText("");
				i.setVisible(false);
				m.setVisible(true);
//				
			}
		});
		b17.addActionListener(new ActionListener() { // ȸ������ ���� ����
			public void actionPerformed(ActionEvent e) {
				if(update()){	
					h.setVisible(true);
					l.setVisible(false);
					
				}
//				
			}
		});
		b18.addActionListener(new ActionListener() { // ȸ��Ż�� Ȯ��
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
		b19.addActionListener(new ActionListener() { // ȸ��Ż�� ���
			public void actionPerformed(ActionEvent e) {
				i.setVisible(true);
				m.setVisible(false);
				memberList();
			}
		});
		b20.addActionListener(new ActionListener() { // ������ü
			public void actionPerformed(ActionEvent e) {
				text7.setText("");
				text8.setText("");
				h.setVisible(false);
				n.setVisible(true);
			}
		});
		b21.addActionListener(new ActionListener() { // ������ü Ȯ��
			public void actionPerformed(ActionEvent e) {
				money(); 				
				h.setVisible(true);
				n.setVisible(false);
				text7.setText("");
				text8.setText("");
			}
		});
		b22.addActionListener(new ActionListener() { // ����
			public void actionPerformed(ActionEvent e) {
				h.setVisible(true);
				n.setVisible(false);

			}
		});
		b23.addActionListener(new ActionListener() { // ȸ������ ���� ��ҹ�ư
			public void actionPerformed(ActionEvent e) {
				i.setVisible(true);
				l.setVisible(false);
			}
		});
		b24.addActionListener(new ActionListener() { // ���� ��ҹ�ư
			public void actionPerformed(ActionEvent e) {
				h.setVisible(true);
				j.setVisible(false);
			}
		});
		b25.addActionListener(new ActionListener() { // ��� ��ҹ�ư
			public void actionPerformed(ActionEvent e) {
				h.setVisible(true);
				k.setVisible(false);
			}
		});
		b26.addActionListener(new ActionListener() { // �α׾ƿ�
			public void actionPerformed(ActionEvent e) {
				text.setText("");
				value.setText("");
				logout();
				f.setVisible(true);
				h.setVisible(false);
			}
		});
		b27.addActionListener(new ActionListener() { // ������
			public void actionPerformed(ActionEvent e) {
				if (mk()) {
					String data = "�����ڴ� ������ ȯ���մϴ�";
					JOptionPane.showMessageDialog(f, data);
					f.setVisible(false);
					o.setVisible(true);
				}
			}
		});
		b28.addActionListener(new ActionListener() { // ������ ȸ������
			public void actionPerformed(ActionEvent e) {
				text9.setText("");
				text10.setText("");
				mkmemberList();
				p.setVisible(true);
				o.setVisible(false);
			}
		});
		b29.addActionListener(new ActionListener() { // ������ ȸ��Ż��
			public void actionPerformed(ActionEvent e) {
				mkdelete();
				text9.setText("");
				text10.setText("");
				ta2.setText("");
				mkmemberList();
				String data = "ȸ�� Ż��Ǿ����ϴ�.";
				JOptionPane.showMessageDialog(p, data);

			}
		});
		b30.addActionListener(new ActionListener() { // ������ �޴���
			public void actionPerformed(ActionEvent e) {
				o.setVisible(true);
				p.setVisible(false);
			}
		});
		b31.addActionListener(new ActionListener() { // ���̵� �ߺ� Ȯ��
			public void actionPerformed(ActionEvent e) {
				checkId();
			}
		});
		b32.addActionListener(new ActionListener() { // ������ �α׾ƿ�
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
