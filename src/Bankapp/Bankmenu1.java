package Bankapp;

public class Bankmenu1 {
	public static void main(String[] args) {
		boolean run = true;
	//	int balance = 0; 없어도 무관
		int sum = 0; 
		do {		 
		System.out.println("---------------------------");
		System.out.println("1.예금|2.출금|3.잔고|4.종료");
		System.out.println("---------------------------");
		System.out.print("선택>");
				int menuNum = new java.util.Scanner(System.in).nextInt();
        switch(menuNum){
        case 1:
   		 System.out.print("예금액을 입력하세요 >");
		int su = new java.util.Scanner(System.in).nextInt();
		System.out.println("예금액 : " + su);
		System.out.println("잔액 : " + (sum += sum + su));
   		 break;
   		case 2: 
   	     System.out.println("출금액을 입력하세요>");
   	  int su1 = new java.util.Scanner(System.in).nextInt();
   	    
		System.out.println("출금액 : " + su1);
		System.out.println("잔액 : " + (sum = sum - su1));
   		 break;
   		case 3: 
   		     System.out.println("잔액은 : " + sum + "원 입니다.");
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
}

}
