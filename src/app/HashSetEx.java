package app;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		int size = set.size();
		System.out.println("ÃÑ °´Ã¼¼ö : " + size);
		Iterator<String> iterator = set.iterator();
 		while(iterator.hasNext()){
 			String element = iterator.next();
 			System.out.println("\t" + element);
 		}
 		set.remove("JDBC");
 		set.remove("iBATIS");
 		System.out.println("ÃÑ °´Ã¼¼ö : " + set.size());
 		for(String element : set) {
 			System.out.println("\t" + element);
 		}
 		set.clear();
 		if(set.isEmpty()) {
 			System.out.println("ºñ¾î ÀÖÀ½");
 		}
 		
	}

}
