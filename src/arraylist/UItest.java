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
		JFrame f = new JFrame("�α��� â");
		JLabel l1 = new JLabel("����� : ");
		l1.setBounds(20, 20, 80, 30);
		JTextField text = new JTextField();
		text.setBounds(100, 20, 100, 30);
		JLabel l2 = new JLabel("��й�ȣ : ");
		l2.setBounds(20, 70, 80, 30);
		JPasswordField value = new JPasswordField();
		value.setBounds(100, 75, 100, 30);
		JButton b = new JButton("�α���");
		JButton b2 = new JButton("ȸ������");
		JButton b3 = new JButton("����");
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
		f.setLocation(700, 300);// ������ â �ߴ� ��ġ �ڵ�
		f.setSize(300, 200);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = text.getText() + " �� ������ ȯ���մϴ�";
				// data += ", ��й�ȣ : " + new String(value.getPassword())
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
			System.out.println("1.ȸ������ |2.�α��� |3.ȸ����� |4.����");
			System.out.println("---------------------------");
			System.out.print("����>");
			int sel = sc.nextInt();
			if (sel == 4)
				break;
			switch (sel) {

			case 1: // ȸ������
				ai.add(uc, sc, arr);
				break;
			case 2:
				lg.add(uc, sc, arr);
				switch(sel) {
				case 1: //����
				case 2: //���
				case 3: //�ܰ�
					if (arr == null) {
						System.out.println("�α����� ���� �� �ּ���.");
					} else {
						System.out.print("�ܰ�>");
						System.out.println(uc.getBalance());
					}
					break;
				case 4: //ȸ������
					switch(sel) {
					case 1: // ȸ������ ����
					case 2: // ȸ��Ż��
					case 3: // �ڷ�
					}
					break;
				case 5: //�α׾ƿ�
				
				case 6: //����	
				
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
		// ��� Ŭ������ ���ʸ� Ÿ������ ����� ����
		// �� ���ʸ� Ÿ������ ���� Ŭ�������� ������ ������ ����� ����
	}
}
/*
 * ȸ��Ż�� System.out.println("--ȸ��Ż��--"); System.out.println("ID : "); String id =
 * sc.next(); uc.setId(id); System.out.println("PW : "); int pw = sc.nextInt();
 * uc.setPw(pw); for(int i = 0; i < arr.size(); i++){ if
 * (id.equals(arr.get(i).getId())){ if(arr.get(i).getPw() == pw) {
 * arr.remove(i); System.out.println("[" + id + "]�� ȸ��Ż��"); break; }else{
 * System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�"); break; } }else if (i == arr.size() -
 * 1){ System.out.println("��ϵ� ������ �����ϴ�"); } } break; ��ü ȸ�� ��� ( ������ ���̵��)
 * System.out.println("��ü ȸ�� ����"); System.out.println("ȸ���� : " + arr.size());
 * for (int i = 0; i < arr.size(); i++) { System.out.print(arr.get(i).getId() +
 * "/"); System.out.println(arr.get(i).getPw()); }
 */
