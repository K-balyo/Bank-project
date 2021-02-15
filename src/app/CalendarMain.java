package app;

import java.util.Scanner;

public class CalendarMain {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("년도 입력: ");
		int year = sc.nextInt();
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		CalendarEx2 c = new CalendarEx2(year, month);
		c.find();
		c.display();
	}
}

