package Bankapp;

import java.util.Scanner; //����Ʈ�� ���� ���ٸ� ���������� �� �� �ִ�

public class Bankmenu {
	// private static final int[] balance_arr = null;
	// int[] balance_arr;
	Member members[];
	boolean run;
	public Scanner scanner;

	public Bankmenu() {
		// balance_arr = new int[2];
		members = new Member[5]; // ȸ������ 2�� ����
		run = true;
		scanner = new Scanner(System.in);
	}

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

	public void creatMember() {
		System.out.print("���� : ");
		// String name = inputStr(); // �̷�������..
		String name = input().next(); // �̷��Ե� ����

		System.out.print("���̵� : ");
		String id = inputStr();

		System.out.print("��й�ȣ : ");
		String pw = inputStr();

		System.out.print("�ܰ� : ");
		int balance = inputNum();
		System.out.print("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		// id, pw, balance ...
//		Member member = new Member(name, id, pw, balance);
		members[idx++] = member;
	}

	Member member;

	public boolean login() { 
		System.out.print("���̵� : ");
		String id = inputStr();
		System.out.print("��й�ȣ :");
		String pw = inputStr();
		boolean result = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (id.equals(members[i].getId()) && pw.equals(members[i].getPw())) { // if(id.equals(member.getId())&&
																						// pw.equals(member.getPw()){ ��
					member = members[i]; // ����
					System.out.println(members[i].getName() + "��");

					result = true;
				}else {System.out.println("���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");}
			}
		}

		return result;
	}

	public void memberList() {
		for (Member member : members) {
			if (member != null) {
				System.out.println("------------------------");
				System.out.println("ȸ���̸� : " + member.getName());
				System.out.println("���̵� : " + member.getId());
				System.out.println("��й�ȣ : " + member.getPw());
				System.out.println("�ܰ� : " + member.getBalance());
				System.out.println("------------------------");
			}
		}
		System.out.println("====================================");
	}

	/*
	 * �޴���� ���
	 */
	public void menu() {
		// int balance = 0;
		do {
			/*
			  System.out.println("---------------------------");
			  System.out.println("1.ȸ������ |2.�α��� |3.���� ");
			  System.out.println("---------------------------");
			  System.out.print("����>");
			 */
			// �޴� Ȯ��
			/*
			  System.out.println("-----------------------------------");
			  System.out.println("1.���� |2.��� |3.�ܰ� |4.ȸ������ |5.�α׾ƿ� |6.���� ");
			  System.out.println("--------------------------------------");
			  System.out.print("����>");
			 */
			System.out.println("-----------------------------------");
			System.out.println("1.ȸ������ |2.�α��� |3.���� |4.��� |5.�ܰ� |6.ȸ������ |7.���� ");
			System.out.println("--------------------------------------");
			// memberList();
			System.out.print("����>");
			int menuNum = inputNum();
			// System.out.print("����� ���� : (0 or 1)");
			// int userNum = bank.inputNum(); // 0, 1
			if (menuNum == 7)
				break;
			switch (menuNum) {

			case 1:
				creatMember();
				break;
			case 2:
				login();
				break;
			case 3:
				if (member == null) {
					System.out.println("�α����� ���� �� �ּ���.");
				} else {
					System.out.print("���ݾ��� �Է��ϼ��� >");
					/*
					 * System.out.print("����� ���� : (0 or 1)"); int userNum = inputNum(); // 0, 1
					 */
					// Member member = members[userNum];
					member.setBalance(member.getBalance() + inputNum());
					// bank.balance_arr[userNum] += bank.inputNum();
					System.out.println("���� �� �ܾ��� : " + member.getBalance() + "�� �Դϴ�");
				}
				break;
			case 4:
				if (member == null) {
					System.out.println("�α����� ���� �� �ּ���.");
				} else {
					System.out.println("��ݾ��� �Է��ϼ���>");
					int a;
					a = inputNum();
					// member.setBalance(member.getBalance() - inputNum() );
					if ((member.getBalance() - a) >= 0) {

						member.setBalance(member.getBalance() - a);
						System.out.println(a + "�� ��� �Ϸ� �Ǿ����ϴ�.");
						System.out.println("���� �ܾ���  " + member.getBalance() + "�� �Դϴ�.");
					} else {
						System.out.println("�ܾ� �������� ����� ���� �Ͽ����ϴ�.");
					}
				}
				break;
			case 5:
				if (member == null) {
					System.out.println("�α����� ���� �� �ּ���.");
				} else {
					System.out.print("�ܰ�>");
					System.out.println(member.getBalance());
				}
				break;
			case 6:
				if (member == null) {
					System.out.println("�α����� ���� �� �ּ���.");
				} else {
					memberList();
				}
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
			System.out.println();
		} while (run);
		System.out.println("���α׷� ����");

	}

	public static void main(String[] args) {
		Bankmenu bank = new Bankmenu();
		bank.menu();
	}

}
