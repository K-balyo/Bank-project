package app;

/* �� ������
   <
   >
   <=
   >=
   ==
   !=
   |
   instanceof
 */

public class OperEx2 {
	public static void main(String[] args) {
		int x = 30;
		int y = 20;
		boolean result = x < y;
		System.out.println("��� 1 : " + result);
		result = x > y;
		System.out.println("��� 2 : " + result);
		result = x <= y;
		System.out.println("��� 3 : " + result);
		result = x >= y;
		System.out.println("��� 4 : " + result);
		result = x == y;
		System.out.println("��� 5 : " + result);
		result = x != y;
		System.out.println("��� 6 : " + result);
		result = !result;
	    System.out.println("��� 7 : " + result);
}

}