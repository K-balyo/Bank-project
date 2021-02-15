package app;

import java.util.Calendar;
import java.util.Scanner;
import java.util.*;

/*
 * Calendar class는 1970년 1월 1일부터 특정 값으로 진보해 오면서
 * 날짜와 시각에 대한 조작을 수행할 수 있도록 제공되는 abstract class이다.
  Object 생성 법은 다음과 같다.
       1) Calendar cal = Calendar.getInstance();
       2) GregorianCalendar cal = new GregorianCalendar();
 */

public class CalendarEx {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 1월이 0부터시작해서
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR) + 12 ;
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println("년 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + date);
		System.out.println("시 : " + hour);
		System.out.println("분 : " + minute);
		System.out.println("초 : " + second);
		//시 , 분, 초 출력하기
		int day1 = cal.get(Calendar.DAY_OF_YEAR);
		int day2 = cal.get(Calendar.DAY_OF_MONTH);
		int day3 = cal.get(Calendar.DAY_OF_WEEK);
		int week = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("오늘은 올해의 : " + day1 + "번째 날입니다.");
		System.out.println("오늘은 이번달 : " + day2 + "일입니다.");
		System.out.println("오늘은 이번주 : " + day3 + "요일 입니다.");
		System.out.println("오늘은 올해의 : " + week + "번째 날입니다.\n");
		// 요일 출력해 보세요
		String[] yoil = {"일","월","화","수","목","금","토"};
		System.out.println("오늘은 " + yoil[day3-1] + "요일 입니다.");
		
		//달력 만들기
		// cal.set(year, month, date); // 원하는 년, 월, 일 설정
        // cal.getActualMaximum(field) // field 최대 일(DATE)
		// int date = Calendar.DAY_OF_WEEK // 월 시작 일 (DAY_OF_WEEK)
        // System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//for (int j = 1; j < 13; j++)
		cal.set(2020, 9 -1, 1);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		for(int i = 1; i < lastDay + startDay; i++) {
			if(i < startDay) {System.out.print("\t");continue;}
		    System.out.print((i - startDay + 1) + "\t");
		    if( i % 7 == 0) {System.out.println();}
			}
}
	}
	

