package app;
// int[] �� int... ��������
public class MethodEx4 {
	public static void prn(int... num) {             // ...�� �����ν� �󸶵��� �迭������ �ѱ� �� �ִ� num1 num2 �þ �ʿ䰡 ����
	     for(int i = 0; i < num.length; i++) {
	    	 System.out.println(num[i]);
	}
}
	public static void main(String[] args) {
		//int[] arr = {1, 2, 3};   �ȿ� ��찡 3�� ������ ���� ... �� �Ἥ int ... num ���� ��ħ ���� �� ���ϰ� �� �� �ִ�
		prn(2, 3);
	}

}
