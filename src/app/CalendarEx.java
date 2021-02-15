package app;

import java.util.Calendar;
import java.util.Scanner;
import java.util.*;

/*
 * Calendar class�� 1970�� 1�� 1�Ϻ��� Ư�� ������ ������ ���鼭
 * ��¥�� �ð��� ���� ������ ������ �� �ֵ��� �����Ǵ� abstract class�̴�.
  Object ���� ���� ������ ����.
       1) Calendar cal = Calendar.getInstance();
       2) GregorianCalendar cal = new GregorianCalendar();
 */

public class CalendarEx {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 1���� 0���ͽ����ؼ�
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR) + 12 ;
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println("�� : " + year);
		System.out.println("�� : " + month);
		System.out.println("�� : " + date);
		System.out.println("�� : " + hour);
		System.out.println("�� : " + minute);
		System.out.println("�� : " + second);
		//�� , ��, �� ����ϱ�
		int day1 = cal.get(Calendar.DAY_OF_YEAR);
		int day2 = cal.get(Calendar.DAY_OF_MONTH);
		int day3 = cal.get(Calendar.DAY_OF_WEEK);
		int week = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("������ ������ : " + day1 + "��° ���Դϴ�.");
		System.out.println("������ �̹��� : " + day2 + "���Դϴ�.");
		System.out.println("������ �̹��� : " + day3 + "���� �Դϴ�.");
		System.out.println("������ ������ : " + week + "��° ���Դϴ�.\n");
		// ���� ����� ������
		String[] yoil = {"��","��","ȭ","��","��","��","��"};
		System.out.println("������ " + yoil[day3-1] + "���� �Դϴ�.");
		
		//�޷� �����
		// cal.set(year, month, date); // ���ϴ� ��, ��, �� ����
        // cal.getActualMaximum(field) // field �ִ� ��(DATE)
		// int date = Calendar.DAY_OF_WEEK // �� ���� �� (DAY_OF_WEEK)
        // System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
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
	

