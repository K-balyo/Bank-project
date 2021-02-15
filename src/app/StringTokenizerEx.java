package app;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void mian(String[] args) {
		String text = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(text, "/", true);
		int countTokens = st.countTokens();

		for (int i = 0; i < countTokens; i++) { // 주의할점!
			String token = st.nextToken();
			System.out.println(token);
		}

		while (st.hasMoreElements()) {
			String tokenString = st.nextToken();
			System.out.println(tokenString);
		}
	}
}
