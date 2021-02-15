package app;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx2 {
	public int year;  //����� �Է� "��"
	public int month;  //����� �Է� "��"
	public int lastDay;   //month�� ������ ��
	public int startWeek;  //month�� ���� ����
	CalendarEx2(int year, int month){  //�����ڸ� ���� �ޱ�
		this.year=year;
		this.month=month;
	}
	//�ʵ��� ���� ã�� �����ϴ� �޼ҵ�
	public void find(){
		Calendar day = Calendar.getInstance();
		//����� �������� ���� �Է���
		day.set(year, month-1,1);
		//�Է¹��� ���� ������ �� �� ���(30��, 31�� ��)
		this.lastDay = day.getActualMaximum(day.DAY_OF_MONTH);
		//1�̸� �Ͽ���, 2�̸� ������ ...������ �Է� ���� ���� ���ϰ� ����
		this.startWeek = day.get(day.DAY_OF_WEEK);
	}
	public void display(){
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		//����� �� ��
		int day=1;
		switch(startWeek){
			case 7:System.out.print(" \t");
			case 6: System.out.print(" \t");
			case 5: System.out.print(" \t");
			case 4: System.out.print(" \t");
			case 3: System.out.print(" \t");
			case 2: System.out.print(" \t");
		}
		//��ŸƮ ��ġ ����
		int countDay=startWeek;
		for(int i=1;i<=lastDay;i++){
			System.out.print(i+"\t");
			if(countDay%7==0){
				System.out.println();
			}
			countDay++;
		}
	}
}
