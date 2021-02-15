package Bankapp;

import java.util.Scanner; //임포트로 따로 쓴다면 공용적으로 쓸 수 있다

public class Bankmenu3 {
	// private static final int[] balance_arr = null;
	// int[] balance_arr;
	Member members[];
	boolean run;
	public Scanner scanner;

	public Bankmenu3() {
		// balance_arr = new int[2];
		members = new Member[5]; // 회원가입 2명만 가능
		run = true;
		scanner = new Scanner(System.in);
	}

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

	public void creatMember() {
		System.out.print("성함 : ");
		// String name = inputStr(); // 이런식으로..
		String name = input().next(); // 이렇게도 가능
		System.out.print("아이디 : ");
		String id = inputStr();
		/*
		 * for(int i = 0; i < members.length; i++){ if (
		 * member.get(i).getId().contains(id)){ System.out.println(" 이미 존재하는 ID입니다");
		 * break;
		 */
		System.out.print("비밀번호 : ");
		String pw = inputStr();

		System.out.print("잔고 : ");
		int balance = inputNum();
		System.out.print("회원가입이 완료되었습니다.");
		// id, pw, balance ...
//		Member member = new Member(name, id, pw, balance);
		members[idx++] = member;
	}

	Member member;

	public boolean login() {
		System.out.print("아이디 : ");
		String id = inputStr();
		System.out.print("비밀번호 :");
		String pw = inputStr();
		boolean result = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (id.equals(members[i].getId()) && pw.equals(members[i].getPw())) { // if(id.equals(member.getId())&&
																						// pw.equals(member.getPw()){ 도
					member = members[i]; // 가능
					System.out.println(members[i].getName() + "님");

					result = true;
				} else {
					System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
				}
			}
		}

		return result;
	}

	public void memberList() {
		for (Member member : members) {
			if (member != null) {
				System.out.println("------------------------");
				System.out.println("회원이름 : " + member.getName());
				System.out.println("아이디 : " + member.getId());
				System.out.println("비밀번호 : " + member.getPw());
				System.out.println("잔고 : " + member.getBalance());
				System.out.println("------------------------");
			}
		}
		System.out.println("====================================");
	}

	/*
	 * 메뉴출력 기능
	 */
	public void menu() {
		// int balance = 0;
		do {
			  System.out.println("---------------------------");
			  System.out.println("1.회원가입 |2.로그인 |3.종료 ");
			  System.out.println("---------------------------");
			  System.out.print("선택>");
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
						  System.out.println("1.예금 |2.출금 |3.잔고 |4.회원정보 |5.로그아웃 |6.종료 ");
						  System.out.println("--------------------------------------");
						  System.out.print("선택>");
						  int menuNum1 = inputNum();
						  switch (menuNum1) {
						  case 1 :
							  System.out.print("예금액을 입력하세요 >");
								member.setBalance(member.getBalance() + inputNum());
								// bank.balance_arr[userNum] += bank.inputNum();
								System.out.println("예금 후 잔액은 : " + member.getBalance() + "원 입니다");
							break;
							  
						  case 2 :
							  System.out.println("출금액을 입력하세요>");
								int a;
								a = inputNum();
								if ((member.getBalance() - a) >= 0) {
			
									member.setBalance(member.getBalance() - a);
									System.out.println(a + "원 출금 완료 되었습니다.");
									System.out.println("계좌 잔액은  " + member.getBalance() + "원 입니다.");
								} else {
									System.out.println("잔액 부족으로 출금을 실패 하였습니다.");
								}
								break;
							  
						  case 3 :
							  System.out.print("잔고>");
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
				System.out.println("프로그램 종료");
			}
		} while (run);
	}
	// 메뉴 확장
	/*
	 * System.out.println("-----------------------------------");
	 * System.out.println("1.회원정보 수정 |2.회원탈퇴 |3.홈화면 ");
	 * System.out.println("--------------------------------------");
	 * System.out.print("선택>"); case 1 : case 2 : System.out.println("===회원탈퇴===");
	 * System.out.print("아이디 : "); String id = inputStr();
	 * System.out.print("비밀번호 :"); String pw = inputStr(); for (int i = 0; i <
	 * member.length; i++){ if (id.equals(members[i].getId())){
	 * if(pw.equals(members[i].getPw())){ members.remove(i); System.out.println("["
	 * + id + "] 님 회원탈퇴"); break; }else { System.out.println("비밀번호가 틀렸습니다."); break;
	 * } }else if ( i == member.length() - 1){ System.out.println("등록된 정보가 없습니다"); }
	 * } break; member = members[i]; case 3 : break;
	 */

	public static void main(String[] args) {
		Bankmenu3 bank = new Bankmenu3();
		bank.menu();
	}

}
