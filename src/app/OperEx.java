package app;

/* ������
        ��� : +, -, /, %, *
        ���� : ++, --
        �� : <, <=, >, >=, ==, !=, instanceof
        ��Ʈ : &,|
        �� : &&,||
        ����
        
        + => ���ϱ�
        - => ����
        * => ���ϱ�
        / => ������
        % => ������

 */
public class OperEx {
	public static void main(String[] args) {
		int su1 = 10;
		int su2 = 20;
		int result = 0;
		result = su1 + su2;
		System.out.println("���1 : " + result);
		result = su1 - su2;
		System.out.println("���2 : " + result);
		result = su1 * su2;
		System.out.println("���3 : " + result);
		result = su1 / su2;
		System.out.println("���4 : " + result);
		result = su1 % su2;
		System.out.println("���5 : " + result);
	}
}
