package app;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListEx {

	public static void main(String[] args) {
		
		List<String> list1
		= Arrays.asList("ȫ�浿1", "ȫ�浿2", "ȫ�浿3");
		for(String name: list1) {
			System.out.println(name);
		}
		List<Integer> list2
		= Arrays.asList(1, 2, 3);
		for(int value : list2) {
			System.out.println(value);
		}

	}

}
