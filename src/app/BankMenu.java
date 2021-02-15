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
		
//		------------------------------프로그램 start
		do {
			bnkmem = null;
			logInTask = true;
			loged = false;
			bankingTask = true;
			result = true;
//		-------------------------------로그인 start
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
						System.out.println("회원 번호 : "+userNum);
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
//		-------------------------------로그인 end
//		------------------------------예금 업무 start
			if(!result) {
				break;
			}
			do {
				menu2();
				System.out.print("선택> ");
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
//		------------------------------예금 업무 end
		}while(result);
		System.out.println("프로그램을 종료하였습니다.");
//		------------------------------프로그램 end
		
	}
	public void memberList() {
		for(BankMember bnkmem : bnkmems) {
			if(bnkmem != null) {
			System.out.println("\n----------------------------------");
			System.out.println("\t이름\t : "+bnkmem.getName());
			System.out.println("\tID\t : "+bnkmem.getId());
			System.out.println("\tPASSWORD : "+bnkmem.getPw());
			System.out.println("\t회원번호\t : "+bnkmem.getIdx());
			System.out.println("\t현재 잔고\t : "+bnkmem.getBalance());
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
		System.out.println("0.회원가입"+" | "+"1.로그인"+" | "+"9.종료");
		System.out.println("--------------------------");
	}
	public void menu2() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("2.예금"+" | "+"3.출금"+" | "+"4.이체"+" | "+"5.잔고"+" | "+"6.???"+" | "+"7.회원 탈퇴"+" | "+"8.로그아웃"+" | "+"9.종료");
		System.out.println("--------------------------------------------------------------------");
	}
	public void creatMember() {
		System.out.println("[ 회원가입 ]");
		System.out.print("[이름]을 입력해 주세요.\n이름 > ");
		String name = inputStr();
		System.out.print("[아이디]를 입력해 주세요.\n아이디 > ");
		String id = inputStr();
		boolean checkId = checkId(id);
		if(checkId) {
			System.out.print("[패스워드]를 입력해 주세요.\n패스워드 > ");
			String pw = inputStr();
			BankMember bnkmem = new BankMember(name, id, pw, idx, 0, "");
			bnkmems[idx++] = bnkmem;
			System.out.println("[ 회원가입 ]이 완료되었습니다.");
//		확인용
			System.out.println("이름\t : "+bnkmem.getName());
			System.out.println("ID\t : "+bnkmem.getId());
			System.out.println("PASSWORD : "+bnkmem.getPw());
			System.out.println("회원번호\t : "+bnkmem.getIdx());
			System.out.println("현재 잔고\t : "+bnkmem.getBalance());
//		확인용
		}
	}
	public boolean checkId(String id) {
		boolean checkId = true;
		for(int i=1; i<bnkmems.length; i++) {
			if(bnkmems[i] != null) {
				if(id.equals(bnkmems[i].getId())) {
					System.out.println("------이미 사용하고 있는 아이디입니다.------");
					checkId = false;
					break;
				} 		
			}
		}
		if(checkId) {
			System.out.println("\n=====사용 가능한 아이디입니다.=====\n");
		}
		return checkId;
	}
	public boolean logIn(boolean loged) {
		loginTask: if(loged) {
			System.out.println("이미 로그인 되어있습니다.");
		} else {
			System.out.print("ID : ");
			String inputId = inputStr();
			System.out.print("Password : ");
			String inputPw = inputStr();
			for(int i=1; i<bnkmems.length; i++) {
				if(bnkmems[i] != null) {
					if(inputId.equals(bnkmems[i].getId()) && inputPw.equals(bnkmems[i].getPw())) {
						System.out.println("로딩중....");
						userNum = i;
						System.out.println("성공적으로 로그인 했습니다.");
						bnkmem = bnkmems[i];
						loged = true;
						break loginTask;
					} else if (inputId.equals(bnkmems[i].getId()) || inputPw.equals(bnkmems[i].getPw())) {
						System.out.println("ID 또는 비밀번호가 틀립니다.");
						break loginTask;
					}
				}
			}
			System.out.println("회원정보가 존재하지 않습니다.");
		}
		return loged;
	}
	public void moneyInput() {
		System.out.print("예금액> ");
		int input = inputInt();
		bnkmem.setBalance(bnkmem.getBalance() + input);
		System.out.println(input+"원을 입금하셨습니다.");
	}
	public void moneyOutput() {
		System.out.print("출금액> ");
		int output = inputInt();
		int cost = 0;
		if(output>=5000) {
			cost = 300;
		}
		if(bnkmem.getBalance() < (output+cost)) {
			System.out.println("잔액이 부족합니다..");
		} else {
			if(output>=5000) {
				bnkmem.setBalance(bnkmem.getBalance() - (output + cost));
				System.out.println("수수료 300원이 차감되었습니다.");
			} else {
				bnkmem.setBalance(bnkmem.getBalance() - output);
			}
			System.out.println(output+"원을 인출하셨습니다.");
		}
	}
	public void moneySent() {
//		System.out.println("계좌번호를 입력해 주십시오.");
//		System.out.print("계좌 번호> ");
		System.out.println("회원번호를 입력해 주십시오.");
		System.out.print("회원 번호> ");
		int sentNum = inputInt();
		System.out.print("이체 금액> ");
		int sentMoney = inputInt();
		int cost = 0;
		if(sentMoney >= 5000) {
			cost = 500;
		}
		SentTask: if(bnkmems[sentNum] == null) {
			System.out.println("존재하지 않는 회원입니다.");
		} else {
			BankMember bnkmemSented = bnkmems[sentNum];
			System.out.println("----------------------------------");
			System.out.println("\t보내는 분\t: "+bnkmem.getName()+"\t님");
			System.out.println("\t받는 분\t: "+bnkmemSented.getName()+"\t님");
			System.out.println("\t이체 금액\t: "+sentMoney+"\t원");
			System.out.println("\t수수료\t: "+cost+"\t원");
			System.out.println("----------------------------------");
			System.out.println("이체를 진행 하시겠습니까?");
			System.out.println("Y / N");
			String select = inputStr();
			if(bnkmem.getBalance() < (sentMoney+cost)) {
				System.out.println("잔액이 부족합니다..");
				break SentTask;
			} 
//			----------------------------------------------------------------------------------- switch / case ver
			switch(select) {
			case "Y" :
			case "y" :
				bnkmem.setBalance(bnkmem.getBalance() - (sentMoney+cost));
				bnkmemSented.setBalance(bnkmemSented.getBalance()+sentMoney);
				System.out.println("\n----------------------------------");
				System.out.println("\t이체 내역");
				System.out.println("\t보내는 분\t: "+bnkmem.getName()+"\t님");
				System.out.println("\t받는 분\t: "+bnkmemSented.getName()+"\t님");
				System.out.println("\t이체 금액\t: "+sentMoney+"\t원");
				System.out.println("\t수수료\t: "+cost+"\t원");
				System.out.println("\t잔고\t: "+bnkmem.getBalance()+"\t원");
				System.out.println("----------------------------------");
				System.out.println("성공적으로 이체 되었습니다.");
				break;
			case "N" :
			case "n" :
				System.out.println("이체를 취소하였습니다.");
				break;
			default :
				System.out.println("입력 오류입니다.");
				break;
			}
//			----------------------------------------------------------------------------------- if / else ver
//			if(select.equals("y") || select.equals("Y")) {
//				bnkmem.setBalance(bnkmem.getBalance() - (sentMoney + cost));
//				bnkmemSented.setBalance(bnkmemSented.getBalance() + sentMoney);
//				System.out.println("\n----------------------------------");
//				System.out.println("\t이체 내역");
//				System.out.println("\t보내는 분\t: "+bnkmem.getName());
//				System.out.println("\t받는 분\t: "+bnkmemSented.getName());
//				System.out.println("\t이체 금액\t: "+sentMoney);
//				System.out.println("\t수수료\t: "+cost+"원");
//				System.out.println("\t잔고\t: "+bnkmem.getBalance());
//				System.out.println("----------------------------------");
//				System.out.println("성공적으로 이체 되었습니다.");
//			} else if(select.equals("N") || select.equals("n"))  {
//				System.out.println("이체를 취소하였습니다.");
//			} else {
//				System.out.println("입력 오류입니다.");
//			}
//			-----------------------------------------------------------------------------------
		}
	}
	public void moneyHave() {
		System.out.println("현재 잔고 : "+bnkmem.getBalance()+"원");
	}
	public void deleteMember() {
		System.out.print("ID : ");
		String inputId = inputStr();
		System.out.print("Password : ");
		String inputPw = inputStr();
		if(inputId.equals(bnkmem.getId()) && inputPw.equals(bnkmem.getPw())) {
			System.out.println("정말로 탈퇴 하시겠습니까?");
			System.out.println("Y / N");
			String select = inputStr();
			if(select.equals("Y") || select.equals("y")) {
				bnkmems[userNum] = bnkmems[0];
				System.out.println("탈퇴되었습니다.");
				logInTask = false;
				loged = false;
				bankingTask = false;
				result = true;
			} else if(select.equals("N") || select.equals("n"))  {
				System.out.println("탈퇴를 취소합니다.");
			} else {
				System.out.println("입력 오류입니다.");
			}
		} else {
			System.out.println("ID 또는 비밀번호가 틀립니다.");
		}
	}
	public void logOut() {
		System.out.println("성공적으로 로그아웃했습니다.");
		System.out.println("사용자 "+bnkmem.getName()+"님의 잔고는 "+bnkmem.getBalance()+"원 입니다.");
		logInTask = false;
		loged = false;
		bankingTask = false;
		result = true;
	}
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		if(loged) {
			System.out.println("사용자 "+bnkmem.getName()+"님의 잔고는 "+bnkmem.getBalance()+"원 입니다.\n");
		}
		logInTask = false;
		loged = false;
		bankingTask = false;
		result = false;
	}
	public void defaultMenu() {
		System.out.println("다시 시도해 주십시오.");
	}
}
//		------------------------------멤버십
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
	@Override	// 객체를 동일하게 만듦
	public boolean equals(Object o) {
		if(o instanceof BankMember) {
			BankMember bnk = (BankMember) o;
			return bnk.id.equals(id);
		} else {
			return false;
		}
	}
	@Override	// 이름이 같은 놈들을 같은 객체인척 한다.
	public int hashCode() {
		return id.hashCode() + idx;
	}
}




