package app;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void mian(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		StringTokenizer st = new StringTokenizer(text, "/", true);
		int countTokens = st.countTokens();

		for (int i = 0; i < countTokens; i++) { // ��������!
			String token = st.nextToken();
			System.out.println(token);
		}

		while (st.hasMoreElements()) {
			String tokenString = st.nextToken();
			System.out.println(tokenString);
		}
	}
}
