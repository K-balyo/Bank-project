package app;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		//Scanner ��ü ����
		//scanf : ������
		//new : �޼ҵ� Ÿ��
		//Scanner(System.in) : System.in �Ǿ��ִ� Ŭ���� ����
		
		System.out.printf("�̸��� �Է��ϼ��� : ");
		String name = scanf.next();
		//name ���� ���� , scanf�� ���� �� ����
		System.out.printf("���̸� �Է��ϼ��� : ");
		int age = scanf.nextInt();
		//age ���� ���� scanf�� ���� �� ����
		System.out.printf("�������� �Է��ϼ���(�Ҽ��� ����) : ");
		double weight = scanf.nextDouble();
		// weight ���� ���� = scanf�� ���� �� ����
		
		System.out.printf("%s ���� ���̴� %d�� �̸� �����Դ� %.1fkg �Դϴ�", name, age, weight);
		//���� ���� ����Ѵ�
	}

}
