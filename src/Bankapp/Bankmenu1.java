package Bankapp;

public class Bankmenu1 {
	public static void main(String[] args) {
		boolean run = true;
	//	int balance = 0; ��� ����
		int sum = 0; 
		do {		 
		System.out.println("---------------------------");
		System.out.println("1.����|2.���|3.�ܰ�|4.����");
		System.out.println("---------------------------");
		System.out.print("����>");
				int menuNum = new java.util.Scanner(System.in).nextInt();
        switch(menuNum){
        case 1:
   		 System.out.print("���ݾ��� �Է��ϼ��� >");
		int su = new java.util.Scanner(System.in).nextInt();
		System.out.println("���ݾ� : " + su);
		System.out.println("�ܾ� : " + (sum += sum + su));
   		 break;
   		case 2: 
   	     System.out.println("��ݾ��� �Է��ϼ���>");
   	  int su1 = new java.util.Scanner(System.in).nextInt();
   	    
		System.out.println("��ݾ� : " + su1);
		System.out.println("�ܾ� : " + (sum = sum - su1));
   		 break;
   		case 3: 
   		     System.out.println("�ܾ��� : " + sum + "�� �Դϴ�.");
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
