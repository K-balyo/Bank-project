package app;

public class NumberFormatEx {

	public static void main(String[] args) {
		//����� ó��
		String data1 = "100"; //data1 �� ���� 100���� a �ιٲ㵵 ������ �ȳ����� ����� �ܼ�â���� ������ ���� 
		String data2 = "100";
        int value1 = Integer.parseInt(data1);	
        int value2 = Integer.parseInt(data2);
        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);
	}
}
