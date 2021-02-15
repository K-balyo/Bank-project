package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	public void add(UserClass uc, Scanner sc, ArrayList<UserClass> arr) {
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 :");
		String pw = sc.next();
		boolean result = false;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) != null) {
				if (id.equals(arr.get(i).getId()) && pw.equals(arr.get(i).getPw())) { // if(id.equals(member.getId())&&
																						// pw.equals(member.getPw()){ 도
//						member = members[i]; // 가능
					System.out.println("환영 합니다 " + arr.get(i).getName() + "님");

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
