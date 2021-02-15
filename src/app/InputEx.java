package app;


public class InputEx {
	public static void main(String[] args) {
		System.out.print("수를 입력하세요 : " ); //수를 다룰 수 있는 입력장치
				int su = new java.util.Scanner(System.in).nextInt();
				System.out.print("문자열을 입력하세요 : ");
				String srt = new java.util.Scanner(System.in).next();//in을 넣지않아 문자열로 입력가능
				System.out.println("입력한 수 : " + su);
				System.out.println("입려한 문자열 : " + srt);
				 		
	}

}
