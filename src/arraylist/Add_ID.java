package arraylist;

import java.util.ArrayList;

import java.util.Scanner;

public class Add_ID {
	public void add(UserClass uc, Scanner sc, ArrayList<UserClass> arr) { 
		System.out.println("--ȸ������--");
		System.out.println("�̸� : ");
	    String name = sc.next();
		uc.setName(name);
		System.out.println("ID : ");
		String id = sc.next();
		uc.setId(id); 
		System.out.print("PW : ");
		String pw = sc.next();
		uc.setPw(pw);		
		System.out.print("�ܰ� : ");
		uc.setBalance(sc.nextInt());
		if(arr.size() == 0) { //�迭�� �ƹ��͵� ���°�� �ٷ� ����
			arr.add(uc);
			System.out.println("--ȸ������ �Ϸ�--");
		}else {  // �迭�� ID �� �ִٸ� �ߺ�üũ �� ����
			for(int i = 0; i < arr.size(); i++) {
				if(arr.get(i).getId().equals(id)) {
				System.out.println("�̹� �����ϴ� ID�Դϴ�.");
				break;
			}else if(i == arr.size() -1) {
				arr.add(uc);
				System.out.println("--ȸ������ �Ϸ�--");
				break;
			}
		}
	}
		
	

}
	}
