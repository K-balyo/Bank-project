package arraylist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Bankapp.UItest;

public class UserMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<UserClass> arr = new ArrayList<>();
		Add_ID ai = new Add_ID();
		Login lg = new Login();
		UserClass uc = new UserClass();
		while (true) {
		
			System.out.println("---------------------------");
			System.out.println("1.회원가입 |2.로그인 |3.회원목록 |4.종료");
			System.out.println("---------------------------");
			System.out.print("선택>");
			int sel = sc.nextInt();
			if (sel == 4)
				break;
			switch (sel) {

			case 1: // 회원가입
				ai.add(uc, sc, arr);
				break;

			case 2:
				lg.add(uc, sc, arr);
				do {
				System.out.println("---------------------------");
				System.out.println("1.예금 |2.출금 |3.잔고 |4.회원정보|5.로그아웃|6.종료");
				System.out.println("---------------------------");
				System.out.print("선택>");
				int sel1 = sc.nextInt();
				switch(sel1) {
				case 1: //예금
					System.out.print("예금액을 입력하세요 >");
					
					uc.setBalance(uc.getBalance() + sc.nextInt());
					// bank.balance_arr[userNum] += bank.inputNum();
					System.out.println("예금 후 잔액은 : " + uc.getBalance() + "원 입니다");
					break;
				case 2: //출금
					System.out.println("출금액을 입력하세요>");
					int a;
					a = sc.nextInt();
					
					if ((uc.getBalance() - a) >= 0) {

						uc.setBalance(uc.getBalance() - a);
						System.out.println(a + "원 출금 완료 되었습니다.");
						System.out.println("계좌 잔액은  " + uc.getBalance() + "원 입니다.");
					} else {
						System.out.println("잔액 부족으로 출금을 실패 하였습니다.");
					}
				
				break;
				
				case 3: //잔고
						System.out.print("잔고>");
						System.out.println(uc.getBalance());
					break;
				
				case 4: //회원정보
					while (true) {
					System.out.println("------------------------");
					System.out.println("회원이름 : " + uc.getName());
					System.out.println("아이디 : " + uc.getId());
					System.out.println("비밀번호 : " + uc.getPw());
					System.out.println("잔고 : " + uc.getBalance());
					System.out.println("------------------------");
			        System.out.println("1.회원정보 수정|2.회원탈퇴|3.뒤로");
			        System.out.print("선택>");
			        int sel2 = sc.nextInt();
			        if (sel2 == 3)
						return;
			        switch(sel2) {
					case 1: // 회원정보 수정
					case 2: // 회원탈퇴
						System.out.println("--회원탈퇴--"); 
						System.out.println("ID : "); 
						String id =	sc.next(); 
						uc.setId(id); 
						System.out.println("PW : "); 
						String pw = sc.next();
					    uc.setPw(pw); 
						for(int i = 0; i < arr.size(); i++){ 
					    if (id.equals(arr.get(i).getId())){ 
					    if(arr.get(i).getPw() == pw) {
						arr.remove(i); System.out.println("[" + id + "]님 회원탈퇴"); 
						break; 
						}else{
						System.out.println("비밀번호가 일치하지 않습니다"); 
						break; 
						} 
					    }else if (i == arr.size() -  1)   { 
					    	System.out.println("등록된 정보가 없습니다"); 
					    	} 
					    } 
						break; 
					}
				}
				case 5: //로그아웃
				
				default:
					return;
				}}while( sel != 6);
			
			case 3:
				System.out.println("전체 회원 정보"); 
				System.out.println("회원수 : " + arr.size());
				for (int i = 0; i < arr.size(); i++) { 
				System.out.print(arr.get(i).getId() + "/"); 
				System.out.println(arr.get(i).getPw()); }
				break;
			default:
				return;
			}
		}
		// 모든 클래스는 제너릭 타입으로 사용이 가능
		// 단 제너릭 타입으로 사용된 클래스에서 생성된 변수만 사용이 가능
	}
}
