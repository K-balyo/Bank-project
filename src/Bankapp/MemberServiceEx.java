package Bankapp;

import Bankapp.MemberService;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
//		memberService.createMember();                     // �ǽ� 1 ȸ������(DB���)
		boolean result = memberService.login("1", "1"); // �ǽ� 2 �α���(DB���)
		/*
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�");
		} else {
			System.out.println("���̵� �Ǵ� ��ȣ�� �ùٸ����ʽ��ϴ�");
		}
		 */	
	}

}
