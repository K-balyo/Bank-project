package Bankapp;

import java.util.Scanner; //����Ʈ�� ���� ���ٸ� ���������� �� �� �ִ�

public class Bankmenu3 {
	// private static final int[] balance_arr = null;
	// int[] balance_arr;
	Member members[];
	boolean run;
	public Scanner scanner;

	public Bankmenu3() {
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
		/*
		 * for(int i = 0; i < members.length; i++){ if (
		 * member.get(i).getId().contains(id)){ System.out.println(" �̹� �����ϴ� ID�Դϴ�");
		 * break;
		 */
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
				} else {
					System.out.println("���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
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
			  System.out.println("---------------------------");
			  System.out.println("1.ȸ������ |2.�α��� |3.���� ");
			  System.out.println("---------------------------");
			  System.out.print("����>");
			  int menuNum = inputNum();
			  if (menuNum == 3)
				break;
			switch (menuNum) {
					  case 1 :
					  creatMember();
						break;
					  case 2 :
					  login();
					do {
							System.out.println("-----------------------------------");
						  System.out.println("1.���� |2.��� |3.�ܰ� |4.ȸ������ |5.�α׾ƿ� |6.���� ");
						  System.out.println("--------------------------------------");
						  System.out.print("����>");
						  int menuNum1 = inputNum();
						  switch (menuNum1) {
						  case 1 :
							  System.out.print("���ݾ��� �Է��ϼ��� >");
								member.setBalance(member.getBalance() + inputNum());
								// bank.balance_arr[userNum] += bank.inputNum();
								System.out.println("���� �� �ܾ��� : " + member.getBalance() + "�� �Դϴ�");
							break;
							  
						  case 2 :
							  System.out.println("��ݾ��� �Է��ϼ���>");
								int a;
								a = inputNum();
								if ((member.getBalance() - a) >= 0) {
			
									member.setBalance(member.getBalance() - a);
									System.out.println(a + "�� ��� �Ϸ� �Ǿ����ϴ�.");
									System.out.println("���� �ܾ���  " + member.getBalance() + "�� �Դϴ�.");
								} else {
									System.out.println("�ܾ� �������� ����� ���� �Ͽ����ϴ�.");
								}
								break;
							  
						  case 3 :
							  System.out.print("�ܰ�>");
								System.out.println(member.getBalance());
								break;
							  
						  case 4 :
							  memberList();
							 
							  break;
							  
						  case 5 :
							break;
							
						  } 
						  System.out.println();
					} while (run);
				System.out.println("���α׷� ����");
			}
		} while (run);
	}
	// �޴� Ȯ��
	/*
	 * System.out.println("-----------------------------------");
	 * System.out.println("1.ȸ������ ���� |2.ȸ��Ż�� |3.Ȩȭ�� ");
	 * System.out.println("--------------------------------------");
	 * System.out.print("����>"); case 1 : case 2 : System.out.println("===ȸ��Ż��===");
	 * System.out.print("���̵� : "); String id = inputStr();
	 * System.out.print("��й�ȣ :"); String pw = inputStr(); for (int i = 0; i <
	 * member.length; i++){ if (id.equals(members[i].getId())){
	 * if(pw.equals(members[i].getPw())){ members.remove(i); System.out.println("["
	 * + id + "] �� ȸ��Ż��"); break; }else { System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�."); break;
	 * } }else if ( i == member.length() - 1){ System.out.println("��ϵ� ������ �����ϴ�"); }
	 * } break; member = members[i]; case 3 : break;
	 */

	public static void main(String[] args) {
		Bankmenu3 bank = new Bankmenu3();
		bank.menu();
	}

}
