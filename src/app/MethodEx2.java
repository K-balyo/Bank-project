package app;
// ��ȯŸ��
public class MethodEx2 {
	
	public static void methodA() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i ;
			}
		System.out.println("���1 : " + sum);
	}
	public static int methodB() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
		     sum += i;
	}
	return sum;
}
	public static void main(String[] args) {
		//����) 1~10 ������ ���� ����Ͻÿ� / (Method ���)
		methodA();
		int sum = methodB();
		System.out.println("���2 : " + sum );
	}

}
