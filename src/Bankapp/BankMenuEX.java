package Bankapp;

//�ܲ��� ���ֽ� ����
public class BankMenuEX {
	public static void main(String[] args) {
		boolean run = true;
	//	int balance = 0; ��� ����
		do {		
		System.out.println("---------------------------");
		System.out.println("1.����|2.���|3.�ܰ�|4.����");
		System.out.println("---------------------------");
		System.out.print("����>");
		
		int menuNum = new java.util.Scanner(System.in).nextInt();
      switch(menuNum){
      case 1:
 		 System.out.print("���ݾ� >");
 		 break;
 		case 2: 
 	     System.out.println("��ݾ�>");
 		 break;
 		case 3: 
 		     System.out.println("�ܰ�");
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
}

}
