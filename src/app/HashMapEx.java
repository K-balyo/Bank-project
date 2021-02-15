package app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		//Map �÷��� ����
		Map<String, Integer> map =
				new HashMap<String, Integer>();
        map.put("ȫ�浿1", 85);
        map.put("ȫ�浿2", 90);
        map.put("ȫ�浿3", 80);
        map.put("ȫ�浿4", 95);
        System.out.println("�� Entry �� : " + map.size());
        //��ü ã��
        System.out.println("\tȫ�浿2 : " + map.get("ȫ�浿2"));
        System.out.println();
        //��ü�� �ϳ��� ó��
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) {
        	String key = iterator.next();
        	Integer value = map.get(key);
        	System.out.println("\t" + key + " : " + value);
        }
        System.out.println();
        //��ü ����
        map.remove("ȫ�浿2");
        System.out.println("�� Entry �� : " + map.size());
}
	
}
