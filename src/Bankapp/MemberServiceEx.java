package Bankapp;

import Bankapp.MemberService;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
//		memberService.createMember();                     // 실습 1 회원가입(DB사용)
		boolean result = memberService.login("1", "1"); // 실습 2 로그인(DB사용)
		/*
		if (result) {
			System.out.println("로그인 되었습니다");
		} else {
			System.out.println("아이디 또는 암호가 올바르지않습니다");
		}
		 */	
	}

}
