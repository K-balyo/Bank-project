package app;

import java.util.Random;
import java.util.Scanner;

public class RandomEx2 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int na, com;
		System.out.print("������ ���ڽ��ϱ�?\n1.����\n2.����\n3.��\n1~3�� ���� �Է��ϼ���.->");
		na = sc.nextInt();
		com = r.nextInt(3);// 3���� �� �߿� �ϳ��� �������� �����ؼ� ��ǻ���� �ǻ縦 ����
		if ( com == 1){
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
		}else if ( com == 2) {
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�");
		}else { //��ǻ�Ͱ� 0�� ������ ��쿡�� ���� ��
			System.out.println("��ǻ�ʹ� ���� �½��ϴ�");
		}
		int result = (na - com +3) % 3;
		switch(result) {
		case 0:
			System.out.print("�����ϴ�~~~");
			break;
		case 1:
			System.out.print("�̰���ϴ�~~~");
			break;
		case 2:
			System.out.print("�����ϴ�~~~");
			break;
		}
	}

}
