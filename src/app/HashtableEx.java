package app;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


public class HashtableEx { 
	
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("spring", "1");
		map.put("summer", "2");
		map.put("fall", "3");
		map.put("winter", "4");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵� : ");
			String id = scanner.next();
			System.out.print("��й�ȣ : ");
			String password = scanner.next();
			System.out.println();
			if(map.containsKey(id)) {
			if(map.get(id).equals(password)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
			break;
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}else {
			System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
		}
		
	}

}
	}
