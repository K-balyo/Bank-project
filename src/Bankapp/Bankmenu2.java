package Bankapp;
// �޼ҵ� ���� �޴� �ø���
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
				System.out.println("1.ȸ������ |2.�α��� |3.���� |4.��� |5.�ܰ� |6.���� ");
				System.out.println("----------------------------------");
				System.out.print("����>");
				int menuNum = inputNum();
				System.out.print("����� ���� : (0 or 1)");
				int userNum = inputNum(); // 0, 1
				switch(menuNum){
				case 1:
					System.out.print("ȸ������ �Ǿ����ϴ� >");
					 break;
				case 2:
					System.out.print("�α��� �Ǿ����ϴ� >");
					 break;
				  case 3:
		   		 System.out.print("���ݾ��� �Է��ϼ��� >");
				 balance_arr[userNum] += inputNum();
				     break;
		   		  case 4: 
		   	     System.out.println("��ݾ��� �Է��ϼ���>");
		   	     balance_arr[userNum] -= inputNum();
				 System.out.println("��ݾ� : "  );
				     break;
		   		  case 5: 
		   	     System.out.print("�ܰ�>");
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
		        System.out.println("���α׷� ����");
		}
			

	}

