package Bankapp;

import Bankapp.Member;

//�ܲ��� ���ֽ� ���� �迭(Array)���� ����
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
		System.out.println("ȸ������");
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
		System.out.print("ȸ���̸� : ");
		String id = inputStr();
		System.out.print("��й�ȣ : ");
		String pw = inputStr();
		boolean result = false;
		for( int i = 0; i < members.length; i++) {
			if (members[i] == null)break;
			if (id.equals(members[i].getId()) && pw.equals(members[i].getPw())){
				System.out.println(members[i].getName() + "��");
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
		System.out.println("1.����|2.���|3.�ܰ�|4.����");
		System.out.println("---------------------------"); 
		System.out.print("����>");
		int menuNum = new java.util.Scanner(System.in).nextInt();
		System.out.print("����� ���� : (0 or 1) ");
		int userNum = new java.util.Scanner(System.in).nextInt(); // 0.1�� �����ϴ� ���� �迭�� �����Ҽ� �ִ� ������ �ε���(0 ���� ���� �����ϴ� ����)�� 1���� �����ϰ�ʹٸ� �������ӿ� -1�߰� �ϸ� �� 
		switch(menuNum){
        case 1:
   		 System.out.print("���ݾ��� �Է��ϼ��� >"); 
		/*balance_arr[userNum] += new java.util.Scanner(System.in).nextInt();
		     break;
   		case 2: 
   	     System.out.println("��ݾ��� �Է��ϼ���>");
   	     balance_arr[userNum] = new java.util.Scanner(System.in).nextInt();
		System.out.println("��ݾ� : "  );
		     break;
   		case 3: 
   			 System.out.print("�ܰ�>");
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
        System.out.println("���α׷� ����");
*/
       
}
		
	
	

