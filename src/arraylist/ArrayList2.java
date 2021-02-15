package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		out : while(true) {
			System.out.println("1. ID추가");
			System.out.println("2. ID확인");
			System.out.println("3. ID삭제");
			System.out.println("etc. 종료");
			System.out.print("입력 : ");
			int sel = sc.nextInt();
			if(sel==1) {
				System.out.print("ID입력 : ");
				String id = sc.next();
				for(int i = 0; i < arr.size(); i++) {
					if(id.equals(arr.get(i))) {
						System.out.println("중복된 ID 입니다.");
						continue out;
					}
				} 
				arr.add(id);
			}else if(sel==2) {
				System.out.print("ID입력 : ");
				String id = sc.next();
				if(arr.contains(id)) {
					System.out.println("존재하는 ID 입니다");
				}else {
					System.out.println("존재하지 않는 ID입니다");
				}
			}else if(sel==3) {
				System.out.print("ID입력 : ");
				String id = sc.next();
				if(arr.contains(id)) {
					for(int i = 0; i < arr.size(); i++) {
						if(arr.get(i).equals(id)) {
							arr.remove(i);
							break;
						}
					}
				}else {
					System.out.println("존재하지 않는 ID 입니다.");
				}
				
			}else {
				break;
			}
			System.out.println(arr);
		}
	}

}
