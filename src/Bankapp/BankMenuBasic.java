package Bankapp;

public class BankMenuBasic {
	public static void main(String[] args) throws java.io.IOException{
		System.out.println("---------------------------");
		System.out.println("1.����|2.���|3.�ܰ�|4.����");
		System.out.println("---------------------------"); 
		System.out.print("����>");
		char c = (char)System.in.read();  // in.read �� �����ν� ��� ������ ���Ʒ��� ���̴��� ������ �������� ���� 
		switch(c) {
		case '1':
		 System.out.print("���ݾ� > ");
		 break;
		case '2': 
	     System.out.println("��ݾ� >");
		 break;
		case '3': 
		     System.out.println("�ܰ�");
			 break;
		case '4':  
		     System.out.println("����");
			 break;
		default:
			System.out.println("Wrong answer");
		}
		 		
	}
	

	
}


