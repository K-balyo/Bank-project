package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		out : while(true) {
			System.out.println("1. ID�߰�");
			System.out.println("2. IDȮ��");
			System.out.println("3. ID����");
			System.out.println("etc. ����");
			System.out.print("�Է� : ");
			int sel = sc.nextInt();
			if(sel==1) {
				System.out.print("ID�Է� : ");
				String id = sc.next();
				for(int i = 0; i < arr.size(); i++) {
					if(id.equals(arr.get(i))) {
						System.out.println("�ߺ��� ID �Դϴ�.");
						continue out;
					}
				} 
				arr.add(id);
			}else if(sel==2) {
				System.out.print("ID�Է� : ");
				String id = sc.next();
				if(arr.contains(id)) {
					System.out.println("�����ϴ� ID �Դϴ�");
				}else {
					System.out.println("�������� �ʴ� ID�Դϴ�");
				}
			}else if(sel==3) {
				System.out.print("ID�Է� : ");
				String id = sc.next();
				if(arr.contains(id)) {
					for(int i = 0; i < arr.size(); i++) {
						if(arr.get(i).equals(id)) {
							arr.remove(i);
							break;
						}
					}
				}else {
					System.out.println("�������� �ʴ� ID �Դϴ�.");
				}
				
			}else {
				break;
			}
			System.out.println(arr);
		}
	}

}
