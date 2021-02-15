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

import Bankapp.UItest;

public class UserMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<UserClass> arr = new ArrayList<>();
		Add_ID ai = new Add_ID();
		Login lg = new Login();
		UserClass uc = new UserClass();
		while (true) {
		
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
				do {
				System.out.println("---------------------------");
				System.out.println("1.���� |2.��� |3.�ܰ� |4.ȸ������|5.�α׾ƿ�|6.����");
				System.out.println("---------------------------");
				System.out.print("����>");
				int sel1 = sc.nextInt();
				switch(sel1) {
				case 1: //����
					System.out.print("���ݾ��� �Է��ϼ��� >");
					
					uc.setBalance(uc.getBalance() + sc.nextInt());
					// bank.balance_arr[userNum] += bank.inputNum();
					System.out.println("���� �� �ܾ��� : " + uc.getBalance() + "�� �Դϴ�");
					break;
				case 2: //���
					System.out.println("��ݾ��� �Է��ϼ���>");
					int a;
					a = sc.nextInt();
					
					if ((uc.getBalance() - a) >= 0) {

						uc.setBalance(uc.getBalance() - a);
						System.out.println(a + "�� ��� �Ϸ� �Ǿ����ϴ�.");
						System.out.println("���� �ܾ���  " + uc.getBalance() + "�� �Դϴ�.");
					} else {
						System.out.println("�ܾ� �������� ����� ���� �Ͽ����ϴ�.");
					}
				
				break;
				
				case 3: //�ܰ�
						System.out.print("�ܰ�>");
						System.out.println(uc.getBalance());
					break;
				
				case 4: //ȸ������
					while (true) {
					System.out.println("------------------------");
					System.out.println("ȸ���̸� : " + uc.getName());
					System.out.println("���̵� : " + uc.getId());
					System.out.println("��й�ȣ : " + uc.getPw());
					System.out.println("�ܰ� : " + uc.getBalance());
					System.out.println("------------------------");
			        System.out.println("1.ȸ������ ����|2.ȸ��Ż��|3.�ڷ�");
			        System.out.print("����>");
			        int sel2 = sc.nextInt();
			        if (sel2 == 3)
						return;
			        switch(sel2) {
					case 1: // ȸ������ ����
					case 2: // ȸ��Ż��
						System.out.println("--ȸ��Ż��--"); 
						System.out.println("ID : "); 
						String id =	sc.next(); 
						uc.setId(id); 
						System.out.println("PW : "); 
						String pw = sc.next();
					    uc.setPw(pw); 
						for(int i = 0; i < arr.size(); i++){ 
					    if (id.equals(arr.get(i).getId())){ 
					    if(arr.get(i).getPw() == pw) {
						arr.remove(i); System.out.println("[" + id + "]�� ȸ��Ż��"); 
						break; 
						}else{
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�"); 
						break; 
						} 
					    }else if (i == arr.size() -  1)   { 
					    	System.out.println("��ϵ� ������ �����ϴ�"); 
					    	} 
					    } 
						break; 
					}
				}
				case 5: //�α׾ƿ�
				
				default:
					return;
				}}while( sel != 6);
			
			case 3:
				System.out.println("��ü ȸ�� ����"); 
				System.out.println("ȸ���� : " + arr.size());
				for (int i = 0; i < arr.size(); i++) { 
				System.out.print(arr.get(i).getId() + "/"); 
				System.out.println(arr.get(i).getPw()); }
				break;
			default:
				return;
			}
		}
		// ��� Ŭ������ ���ʸ� Ÿ������ ����� ����
		// �� ���ʸ� Ÿ������ ���� Ŭ�������� ������ ������ ����� ����
	}
}
