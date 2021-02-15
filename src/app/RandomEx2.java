package app;

import java.util.Random;
import java.util.Scanner;

public class RandomEx2 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int na, com;
		System.out.print("무엇을 내겠습니까?\n1.가위\n2.바위\n3.보\n1~3의 값을 입력하세요.->");
		na = sc.nextInt();
		com = r.nextInt(3);// 3가지 수 중에 하나를 랜덤으로 선택해서 컴퓨터의 의사를 결정
		if ( com == 1){
			System.out.println("컴퓨터는 가위를 냈습니다.");
		}else if ( com == 2) {
			System.out.println("컴퓨터는 바위를 냈습니다");
		}else { //컴퓨터가 0을 선택할 경우에는 보를 냄
			System.out.println("컴퓨터는 보를 냈습니다");
		}
		int result = (na - com +3) % 3;
		switch(result) {
		case 0:
			System.out.print("비겼습니다~~~");
			break;
		case 1:
			System.out.print("이겼습니다~~~");
			break;
		case 2:
			System.out.print("졌습니다~~~");
			break;
		}
	}

}
