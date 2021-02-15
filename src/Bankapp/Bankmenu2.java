package Bankapp;
// 메소드 응용 메뉴 늘리기
public class Bankmenu2 {
	
		public static int inputNum() {
				int num = new java.util.Scanner(System.in).nextInt();
				return num;
			}
			
			public static void main(String[] args) {
				int[] balance_arr = new int[2]; 
				boolean run = true;
			//	int balance = 0;
				do {
				System.out.println("----------------------------------");
				System.out.println("1.회원가입 |2.로그인 |3.예금 |4.출금 |5.잔고 |6.종료 ");
				System.out.println("----------------------------------");
				System.out.print("선택>");
				int menuNum = inputNum();
				System.out.print("사용자 선택 : (0 or 1)");
				int userNum = inputNum(); // 0, 1
				switch(menuNum){
				case 1:
					System.out.print("회원가입 되었습니다 >");
					 break;
				case 2:
					System.out.print("로그인 되었습니다 >");
					 break;
				  case 3:
		   		 System.out.print("예금액을 입력하세요 >");
				 balance_arr[userNum] += inputNum();
				     break;
		   		  case 4: 
		   	     System.out.println("출금액을 입력하세요>");
		   	     balance_arr[userNum] -= inputNum();
				 System.out.println("출금액 : "  );
				     break;
		   		  case 5: 
		   	     System.out.print("잔고>");
		   		 System.out.println(balance_arr[userNum]);
		   		     break;
		   		  case 6:  
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

