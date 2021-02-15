package app;

import java.io.IOException;

public class IOEx3 {

	public static void main(String[] args) {
		byte b[] = new byte[5];// 문자 담을 배열 공간 확보
		System.out.print("입력 : ");
		char c = ' ';
		try {
			System.in.read(b, 0, 5);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.print("출력 : ");
		System.out.write(b, 0, 5);
		System.out.println();

	}

}
