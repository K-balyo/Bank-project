package app;

import java.util.Scanner;
import java.util.Set;

//import Collection.HashMember;

public class BankMenu {
	public boolean logInTask;
	boolean loged;
	boolean bankingTask;
	boolean result;
	public Scanner scn;
	static BankMember bnkmems[];
	static BankMember bnkmem;
//	static Set<BankMember> bnkmems;
	int idx;
	int userNum;
	public BankMenu() {
		bnkmems = new BankMember[100];
//		bnkmems = new HashSet<>();
		userNum = 0;
		idx = 1;
		scn = new Scanner(System.in);
	}
	public static void main(String[] args) {
		
		new BankMenu().BankService();
		
	}
	public void BankService() {
		
//		------------------------------���α׷� start
		do {
			bnkmem = null;
			logInTask = true;
			loged = false;
			bankingTask = true;
			result = true;
//		-------------------------------�α��� start
			do {
				menu1();
				int select = input().nextInt();
				switch(select) {
				case 0:
					creatMember();
					break;
					
				case 1:
					loged = logIn(loged);
					if(loged) {
						System.out.println("ȸ�� ��ȣ : "+userNum);
					}
					logInTask = !loged;
					break;
	
				case 9:
					exit();
					break;
					
				default:
					defaultMenu();
					break;
				}
			} while(logInTask);
//		-------------------------------�α��� end
//		------------------------------���� ���� start
			if(!result) {
				break;
			}
			do {
				menu2();
				System.out.print("����> ");
				int select = input().nextInt();
				
				switch(select){
				case 1:
					loged = logIn(loged);
					break;
					
				case 2:
					moneyInput();
					break;
					
				case 3:
					moneyOutput();
					break;
	
				case 4:
					moneySent();
					break;
					
				case 5:
					moneyHave();
					break;

				case 6:
					memberList();
					break;

				case 7:
					deleteMember();
					break;

				case 8:
					logOut();
					break;
					
				case 9:
					exit();
					break;
					
				default:
					defaultMenu();
					break;
				}
				System.out.println();
			}while(bankingTask);
//		------------------------------���� ���� end
		}while(result);
		System.out.println("���α׷��� �����Ͽ����ϴ�.");
//		------------------------------���α׷� end
		
	}
	public void memberList() {
		for(BankMember bnkmem : bnkmems) {
			if(bnkmem != null) {
			System.out.println("\n----------------------------------");
			System.out.println("\t�̸�\t : "+bnkmem.getName());
			System.out.println("\tID\t : "+bnkmem.getId());
			System.out.println("\tPASSWORD : "+bnkmem.getPw());
			System.out.println("\tȸ����ȣ\t : "+bnkmem.getIdx());
			System.out.println("\t���� �ܰ�\t : "+bnkmem.getBalance());
			System.out.println("----------------------------------\n");
			}
		}
	}
	public Scanner input() {
		return scn;
	}
	public int inputInt() {
		int num = new java.util.Scanner(System.in).nextInt();
		return num;
	}
	public String inputStr() {
		String str = new java.util.Scanner(System.in).next();
		return str;
	}
	public void menu1() {
		System.out.println("--------------------------");
		System.out.println("0.ȸ������"+" | "+"1.�α���"+" | "+"9.����");
		System.out.println("--------------------------");
	}
	public void menu2() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("2.����"+" | "+"3.���"+" | "+"4.��ü"+" | "+"5.�ܰ�"+" | "+"6.???"+" | "+"7.ȸ�� Ż��"+" | "+"8.�α׾ƿ�"+" | "+"9.����");
		System.out.println("--------------------------------------------------------------------");
	}
	public void creatMember() {
		System.out.println("[ ȸ������ ]");
		System.out.print("[�̸�]�� �Է��� �ּ���.\n�̸� > ");
		String name = inputStr();
		System.out.print("[���̵�]�� �Է��� �ּ���.\n���̵� > ");
		String id = inputStr();
		boolean checkId = checkId(id);
		if(checkId) {
			System.out.print("[�н�����]�� �Է��� �ּ���.\n�н����� > ");
			String pw = inputStr();
			BankMember bnkmem = new BankMember(name, id, pw, idx, 0, "");
			bnkmems[idx++] = bnkmem;
			System.out.println("[ ȸ������ ]�� �Ϸ�Ǿ����ϴ�.");
//		Ȯ�ο�
			System.out.println("�̸�\t : "+bnkmem.getName());
			System.out.println("ID\t : "+bnkmem.getId());
			System.out.println("PASSWORD : "+bnkmem.getPw());
			System.out.println("ȸ����ȣ\t : "+bnkmem.getIdx());
			System.out.println("���� �ܰ�\t : "+bnkmem.getBalance());
//		Ȯ�ο�
		}
	}
	public boolean checkId(String id) {
		boolean checkId = true;
		for(int i=1; i<bnkmems.length; i++) {
			if(bnkmems[i] != null) {
				if(id.equals(bnkmems[i].getId())) {
					System.out.println("------�̹� ����ϰ� �ִ� ���̵��Դϴ�.------");
					checkId = false;
					break;
				} 		
			}
		}
		if(checkId) {
			System.out.println("\n=====��� ������ ���̵��Դϴ�.=====\n");
		}
		return checkId;
	}
	public boolean logIn(boolean loged) {
		loginTask: if(loged) {
			System.out.println("�̹� �α��� �Ǿ��ֽ��ϴ�.");
		} else {
			System.out.print("ID : ");
			String inputId = inputStr();
			System.out.print("Password : ");
			String inputPw = inputStr();
			for(int i=1; i<bnkmems.length; i++) {
				if(bnkmems[i] != null) {
					if(inputId.equals(bnkmems[i].getId()) && inputPw.equals(bnkmems[i].getPw())) {
						System.out.println("�ε���....");
						userNum = i;
						System.out.println("���������� �α��� �߽��ϴ�.");
						bnkmem = bnkmems[i];
						loged = true;
						break loginTask;
					} else if (inputId.equals(bnkmems[i].getId()) || inputPw.equals(bnkmems[i].getPw())) {
						System.out.println("ID �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
						break loginTask;
					}
				}
			}
			System.out.println("ȸ�������� �������� �ʽ��ϴ�.");
		}
		return loged;
	}
	public void moneyInput() {
		System.out.print("���ݾ�> ");
		int input = inputInt();
		bnkmem.setBalance(bnkmem.getBalance() + input);
		System.out.println(input+"���� �Ա��ϼ̽��ϴ�.");
	}
	public void moneyOutput() {
		System.out.print("��ݾ�> ");
		int output = inputInt();
		int cost = 0;
		if(output>=5000) {
			cost = 300;
		}
		if(bnkmem.getBalance() < (output+cost)) {
			System.out.println("�ܾ��� �����մϴ�..");
		} else {
			if(output>=5000) {
				bnkmem.setBalance(bnkmem.getBalance() - (output + cost));
				System.out.println("������ 300���� �����Ǿ����ϴ�.");
			} else {
				bnkmem.setBalance(bnkmem.getBalance() - output);
			}
			System.out.println(output+"���� �����ϼ̽��ϴ�.");
		}
	}
	public void moneySent() {
//		System.out.println("���¹�ȣ�� �Է��� �ֽʽÿ�.");
//		System.out.print("���� ��ȣ> ");
		System.out.println("ȸ����ȣ�� �Է��� �ֽʽÿ�.");
		System.out.print("ȸ�� ��ȣ> ");
		int sentNum = inputInt();
		System.out.print("��ü �ݾ�> ");
		int sentMoney = inputInt();
		int cost = 0;
		if(sentMoney >= 5000) {
			cost = 500;
		}
		SentTask: if(bnkmems[sentNum] == null) {
			System.out.println("�������� �ʴ� ȸ���Դϴ�.");
		} else {
			BankMember bnkmemSented = bnkmems[sentNum];
			System.out.println("----------------------------------");
			System.out.println("\t������ ��\t: "+bnkmem.getName()+"\t��");
			System.out.println("\t�޴� ��\t: "+bnkmemSented.getName()+"\t��");
			System.out.println("\t��ü �ݾ�\t: "+sentMoney+"\t��");
			System.out.println("\t������\t: "+cost+"\t��");
			System.out.println("----------------------------------");
			System.out.println("��ü�� ���� �Ͻðڽ��ϱ�?");
			System.out.println("Y / N");
			String select = inputStr();
			if(bnkmem.getBalance() < (sentMoney+cost)) {
				System.out.println("�ܾ��� �����մϴ�..");
				break SentTask;
			} 
//			----------------------------------------------------------------------------------- switch / case ver
			switch(select) {
			case "Y" :
			case "y" :
				bnkmem.setBalance(bnkmem.getBalance() - (sentMoney+cost));
				bnkmemSented.setBalance(bnkmemSented.getBalance()+sentMoney);
				System.out.println("\n----------------------------------");
				System.out.println("\t��ü ����");
				System.out.println("\t������ ��\t: "+bnkmem.getName()+"\t��");
				System.out.println("\t�޴� ��\t: "+bnkmemSented.getName()+"\t��");
				System.out.println("\t��ü �ݾ�\t: "+sentMoney+"\t��");
				System.out.println("\t������\t: "+cost+"\t��");
				System.out.println("\t�ܰ�\t: "+bnkmem.getBalance()+"\t��");
				System.out.println("----------------------------------");
				System.out.println("���������� ��ü �Ǿ����ϴ�.");
				break;
			case "N" :
			case "n" :
				System.out.println("��ü�� ����Ͽ����ϴ�.");
				break;
			default :
				System.out.println("�Է� �����Դϴ�.");
				break;
			}
//			----------------------------------------------------------------------------------- if / else ver
//			if(select.equals("y") || select.equals("Y")) {
//				bnkmem.setBalance(bnkmem.getBalance() - (sentMoney + cost));
//				bnkmemSented.setBalance(bnkmemSented.getBalance() + sentMoney);
//				System.out.println("\n----------------------------------");
//				System.out.println("\t��ü ����");
//				System.out.println("\t������ ��\t: "+bnkmem.getName());
//				System.out.println("\t�޴� ��\t: "+bnkmemSented.getName());
//				System.out.println("\t��ü �ݾ�\t: "+sentMoney);
//				System.out.println("\t������\t: "+cost+"��");
//				System.out.println("\t�ܰ�\t: "+bnkmem.getBalance());
//				System.out.println("----------------------------------");
//				System.out.println("���������� ��ü �Ǿ����ϴ�.");
//			} else if(select.equals("N") || select.equals("n"))  {
//				System.out.println("��ü�� ����Ͽ����ϴ�.");
//			} else {
//				System.out.println("�Է� �����Դϴ�.");
//			}
//			-----------------------------------------------------------------------------------
		}
	}
	public void moneyHave() {
		System.out.println("���� �ܰ� : "+bnkmem.getBalance()+"��");
	}
	public void deleteMember() {
		System.out.print("ID : ");
		String inputId = inputStr();
		System.out.print("Password : ");
		String inputPw = inputStr();
		if(inputId.equals(bnkmem.getId()) && inputPw.equals(bnkmem.getPw())) {
			System.out.println("������ Ż�� �Ͻðڽ��ϱ�?");
			System.out.println("Y / N");
			String select = inputStr();
			if(select.equals("Y") || select.equals("y")) {
				bnkmems[userNum] = bnkmems[0];
				System.out.println("Ż��Ǿ����ϴ�.");
				logInTask = false;
				loged = false;
				bankingTask = false;
				result = true;
			} else if(select.equals("N") || select.equals("n"))  {
				System.out.println("Ż�� ����մϴ�.");
			} else {
				System.out.println("�Է� �����Դϴ�.");
			}
		} else {
			System.out.println("ID �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
		}
	}
	public void logOut() {
		System.out.println("���������� �α׾ƿ��߽��ϴ�.");
		System.out.println("����� "+bnkmem.getName()+"���� �ܰ�� "+bnkmem.getBalance()+"�� �Դϴ�.");
		logInTask = false;
		loged = false;
		bankingTask = false;
		result = true;
	}
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		if(loged) {
			System.out.println("����� "+bnkmem.getName()+"���� �ܰ�� "+bnkmem.getBalance()+"�� �Դϴ�.\n");
		}
		logInTask = false;
		loged = false;
		bankingTask = false;
		result = false;
	}
	public void defaultMenu() {
		System.out.println("�ٽ� �õ��� �ֽʽÿ�.");
	}
}
//		------------------------------�����
class BankMember {
	private String id;
	private String pw;
	private String name;
	private int idx;
	private int balance;
	private String date;
	public BankMember(String name, String id, String pw, int idx, int balance, String date) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.idx = idx;
		this.balance = balance;
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override	// ��ü�� �����ϰ� ����
	public boolean equals(Object o) {
		if(o instanceof BankMember) {
			BankMember bnk = (BankMember) o;
			return bnk.id.equals(id);
		} else {
			return false;
		}
	}
	@Override	// �̸��� ���� ����� ���� ��ü��ô �Ѵ�.
	public int hashCode() {
		return id.hashCode() + idx;
	}
}




