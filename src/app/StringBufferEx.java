package app;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("ȯ��");
		sb.append("�մϴ�");
		sb.append(" JAVA ");
		sb.append("application programming");
		String result = sb.toString();
        System.out.println("��� : " + result);
        System.out.println("���� : " + sb.length());
	}

}
