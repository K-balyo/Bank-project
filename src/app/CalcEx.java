package app;

public class CalcEx {
	public int addition(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	public int subtraction(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public int multiplication(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	public int division(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
	public void result(char operator, int n1, int n2) {
		switch(operator) {
		case '+' : System.out.println(addition(n1, n2));break;
		case '-' : System.out.println(subtraction(n1, n2));break;
		case 'X' : System.out.println(multiplication(n1, n2));break;
		case '/' : System.out.println(division(n1, n2));break;
		}
	}
	public static void main(String[] args) {
		
	//	int n1 = Integer.parseInt(args[0]); 나중에 배우는 레퍼?식 정수식으로 바꿀수 있다 주의사항  () 괄호안에 수치를 정수로 해야한다 문자로 입력시 계속 오류난다
	//	int n2 = args[1];                 이대로 쓴다면 int는 정수를 입력해야해서 오류가 난다 int를 String으로 변환하거나 뒤에 args를 정수로 변환해야한다
		int n1 = Integer.parseInt(args[0]);   //[] 안에 숫자를 바꾸면 아규먼츠에서 입력하는 순서를 바꿀 수 있다  ex) 1 + 1 0 번째 2번째 1번째 이렇게  원래는 1 1 + 로 썼어야함 32행 33행 34 행[0] [1] [2] 순서라서  [0][1][2] 순서였음 
		int n2 = Integer.parseInt(args[2]);
		char operator = args[1].charAt(0);   // 문자열을 가공할때 쓰는거임 charAt 1차원 문자 배열로 저장한다고합니다
	    new CalcEx().result(operator, n1, n2); //풀어서 쓴다면 CalcEx calcEx = new CalcEx();
	}
	

}
