package app;


public class SwitchEx2 {
	public static void main(String[] args) throws java.io.IOException{
		System.out.print("Yes/No(Y,N) ?");
		char c = (char)System.in.read();  // in.read �� �����ν� ��� ������ ���Ʒ��� ���̴��� ������ �������� ���� 
		switch(c) {
		case 'y':
		case 'Y':
		 System.out.println("Yes");
		 break;
		case 'n': 
		case 'N':
		 System.out.println("No");
		 break;
		default:
			System.out.println("Wrong answer");
		}
	
	}

}
