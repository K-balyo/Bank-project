package app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		//Map ÄÃ·º¼Ç »ý¼º
		Map<String, Integer> map =
				new HashMap<String, Integer>();
        map.put("È«±æµ¿1", 85);
        map.put("È«±æµ¿2", 90);
        map.put("È«±æµ¿3", 80);
        map.put("È«±æµ¿4", 95);
        System.out.println("ÃÑ Entry ¼ö : " + map.size());
        //°´Ã¼ Ã£±â
        System.out.println("\tÈ«±æµ¿2 : " + map.get("È«±æµ¿2"));
        System.out.println();
        //°´Ã¼¸¦ ÇÏ³ª¾¿ Ã³¸®
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) {
        	String key = iterator.next();
        	Integer value = map.get(key);
        	System.out.println("\t" + key + " : " + value);
        }
        System.out.println();
        //°´Ã¼ »èÁ¦
        map.remove("È«±æµ¿2");
        System.out.println("ÃÑ Entry ¼ö : " + map.size());
}
	
}
