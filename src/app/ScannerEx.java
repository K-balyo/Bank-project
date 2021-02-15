package app;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		//Scanner 객체 생성
		//scanf : 변수명
		//new : 메소드 타입
		//Scanner(System.in) : System.in 되어있는 클래스 선언
		
		System.out.printf("이름을 입력하세요 : ");
		String name = scanf.next();
		//name 변수 생성 , scanf로 부터 값 저장
		System.out.printf("나이를 입력하세요 : ");
		int age = scanf.nextInt();
		//age 변수 생성 scanf로 부터 값 저장
		System.out.printf("몸묵세를 입력하세요(소수점 포함) : ");
		double weight = scanf.nextDouble();
		// weight 변수 생성 = scanf로 부터 값 저장
		
		System.out.printf("%s 님의 나이는 %d세 이며 몸무게는 %.1fkg 입니다", name, age, weight);
		//받은 값을 출력한다
	}

}
