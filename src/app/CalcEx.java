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
		
	//	int n1 = Integer.parseInt(args[0]); ���߿� ���� ����?�� ���������� �ٲܼ� �ִ� ���ǻ���  () ��ȣ�ȿ� ��ġ�� ������ �ؾ��Ѵ� ���ڷ� �Է½� ��� ��������
	//	int n2 = args[1];                 �̴�� ���ٸ� int�� ������ �Է��ؾ��ؼ� ������ ���� int�� String���� ��ȯ�ϰų� �ڿ� args�� ������ ��ȯ�ؾ��Ѵ�
		int n1 = Integer.parseInt(args[0]);   //[] �ȿ� ���ڸ� �ٲٸ� �ƱԸ������� �Է��ϴ� ������ �ٲ� �� �ִ�  ex) 1 + 1 0 ��° 2��° 1��° �̷���  ������ 1 1 + �� ������ 32�� 33�� 34 ��[0] [1] [2] ������  [0][1][2] �������� 
		int n2 = Integer.parseInt(args[2]);
		char operator = args[1].charAt(0);   // ���ڿ��� �����Ҷ� ���°��� charAt 1���� ���� �迭�� �����Ѵٰ��մϴ�
	    new CalcEx().result(operator, n1, n2); //Ǯ� ���ٸ� CalcEx calcEx = new CalcEx();
	}
	

}
