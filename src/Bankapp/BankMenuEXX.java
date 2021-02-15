package Bankapp;

import Bankapp.Member;

//쌤께서 해주신 예시 배열(Array)까지 적용
public class BankMenuEXX {
	Member members[];
	boolean run;
	public BankMenuEXX() {
		members = new Member[2];
		run = true;
	}
    public int inputNum() {
		int num = new java.util.Scanner(System.in).nextInt();
		return num;
	}
	public String inputStr(){
		return new java.util.Scanner(System.in).next();
	}
	int idx;
	public void createMember() {
		System.out.println("-------------");
		System.out.println("회원가입");
		System.out.println("-------------");
		System.out.println();
		String name = inputStr();
		System.out.println();
		String id = inputStr();
		System.out.println();
		String pw = inputStr(); 
		System.out.println();
		int balance =inputNum();
//		Member member = new Member(name, id, pw, balance);
//		members[idx++] = member;
	}
	public boolean login() {
		System.out.print("회원이름 : ");
		String id = inputStr();
		System.out.print("비밀번호 : ");
		String pw = inputStr();
		boolean result = false;
		for( int i = 0; i < members.length; i++) {
			if (members[i] == null)break;
			if (id.equals(members[i].getId()) && pw.equals(members[i].getPw())){
				System.out.println(members[i].getName() + "님");
				result = true;
			}
		}
		return result;
	}
	/*public static void main(String[] args) {
		BankMenu bank = new BankMenu();
		//int balance = 0;
		do {		 
		System.out.println("---------------------------");
		System.out.println("1.예금|2.출금|3.잔고|4.종료");
		System.out.println("---------------------------"); 
		System.out.print("선택>");
		int menuNum = new java.util.Scanner(System.in).nextInt();
		System.out.print("사용자 선택 : (0 or 1) ");
		int userNum = new java.util.Scanner(System.in).nextInt(); // 0.1로 구분하는 이유 배열은 구분할수 있는 개념이 인덱스(0 부터 점차 증가하는 개념)라서 1부터 시작하고싶다면 유저네임에 -1추가 하면 됨 
		switch(menuNum){
        case 1:
   		 System.out.print("예금액을 입력하세요 >"); 
		/*balance_arr[userNum] += new java.util.Scanner(System.in).nextInt();
		     break;
   		case 2: 
   	     System.out.println("출금액을 입력하세요>");
   	     balance_arr[userNum] = new java.util.Scanner(System.in).nextInt();
		System.out.println("출금액 : "  );
		     break;
   		case 3: 
   			 System.out.print("잔고>");
   		     System.out.println(balance_arr[userNum]);
   		 break;
   		case 4:  
   		     run = false;
   			 break;
   		default:
   			System.out.println("Wrong answer");
		}
        System.out.println();
	    }while(run);
        System.out.println("프로그램 종료");
*/
       
}
		
	
	

