package app;

import java.util.ArrayList;

public class ArrayListEx {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("MYBATIS");
		int size = list.size();
		System.out.println("�� ��ü�� : " + size);
		System.out.println("��� ��� : " + list.get(2));
		System.out.println();
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		list.remove(2);
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		list.remove(2);
		skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		list.remove("MYBATIS");
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}

}
