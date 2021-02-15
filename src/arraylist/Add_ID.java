package arraylist;

import java.util.ArrayList;

import java.util.Scanner;

public class Add_ID {
	public void add(UserClass uc, Scanner sc, ArrayList<UserClass> arr) { 
		System.out.println("--회원가입--");
		System.out.println("이름 : ");
	    String name = sc.next();
		uc.setName(name);
		System.out.println("ID : ");
		String id = sc.next();
		uc.setId(id); 
		System.out.print("PW : ");
		String pw = sc.next();
		uc.setPw(pw);		
		System.out.print("잔고 : ");
		uc.setBalance(sc.nextInt());
		if(arr.size() == 0) { //배열에 아무것도 없는경우 바로 생성
			arr.add(uc);
			System.out.println("--회원가입 완료--");
		}else {  // 배열에 ID 가 있다면 중복체크 후 생성
			for(int i = 0; i < arr.size(); i++) {
				if(arr.get(i).getId().equals(id)) {
				System.out.println("이미 존재하는 ID입니다.");
				break;
			}else if(i == arr.size() -1) {
				arr.add(uc);
				System.out.println("--회원가입 완료--");
				break;
			}
		}
	}
		
	

}
	}
