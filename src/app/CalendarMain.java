package app;

import java.util.Scanner;

public class CalendarMain {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("�⵵ �Է�: ");
		int year = sc.nextInt();
		System.out.print("�� �Է�: ");
		int month = sc.nextInt();
		CalendarEx2 c = new CalendarEx2(year, month);
		c.find();
		c.display();
	}
}

