package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	public void add(UserClass uc, Scanner sc, ArrayList<UserClass> arr) {
		System.out.print("���̵� : ");
		String id = sc.next();
		System.out.print("��й�ȣ :");
		String pw = sc.next();
		boolean result = false;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) != null) {
				if (id.equals(arr.get(i).getId()) && pw.equals(arr.get(i).getPw())) { // if(id.equals(member.getId())&&
																						// pw.equals(member.getPw()){ ��
//						member = members[i]; // ����
					System.out.println("ȯ�� �մϴ� " + arr.get(i).getName() + "��");

					result = true;

				}
			}
		}
//			return result;
	}

//	}}

	public boolean login() {
		return true;
	}  

}
