package app;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
	    set.add(new Member("ȫ�浿", 30));
	    set.add(new Member("ȫ�浿", 30));
	    System.out.println("�� ��ü�� : " + set.size());
	    System.out.println(new Member("ȫ�浿", 30).hashCode());
	    System.out.println(new Member("ȫ�浿", 30).hashCode());
	}

}
