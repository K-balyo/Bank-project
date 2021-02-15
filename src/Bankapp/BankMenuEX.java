package Bankapp;

//쌤께서 해주신 예시
public class BankMenuEX {
	public static void main(String[] args) {
		boolean run = true;
	//	int balance = 0; 없어도 무관
		do {		
		System.out.println("---------------------------");
		System.out.println("1.예금|2.출금|3.잔고|4.종료");
		System.out.println("---------------------------");
		System.out.print("선택>");
		
		int menuNum = new java.util.Scanner(System.in).nextInt();
      switch(menuNum){
      case 1:
 		 System.out.print("예금액 >");
 		 break;
 		case 2: 
 	     System.out.println("출금액>");
 		 break;
 		case 3: 
 		     System.out.println("잔고");
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
