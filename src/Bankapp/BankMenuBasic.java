package Bankapp;

public class BankMenuBasic {
	public static void main(String[] args) throws java.io.IOException{
		System.out.println("---------------------------");
		System.out.println("1.예금|2.출금|3.잔고|4.종료");
		System.out.println("---------------------------"); 
		System.out.print("선택>");
		char c = (char)System.in.read();  // in.read 를 씀으로써 결과 도출이 위아래로 쌓이느냐 옆으로 나오느냐 차이 
		switch(c) {
		case '1':
		 System.out.print("예금액 > ");
		 break;
		case '2': 
	     System.out.println("출금액 >");
		 break;
		case '3': 
		     System.out.println("잔고");
			 break;
		case '4':  
		     System.out.println("종료");
			 break;
		default:
			System.out.println("Wrong answer");
		}
		 		
	}
	

	
}


