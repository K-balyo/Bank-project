package app;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx {
	/*
	 * collection
	 * 객체를 담을 수 있는 기억장소, 여러가지 자료를 적절한 형태로 처리하고
	      저장하는 저장형태(묶음)의 자료구조.
	 */
        public static void main(String[] args) {
        	//Vector vc = new Vector();         // 제네릭 타입을 권장하느라 vc가 노란색인것 
        	Vector<String> vc = new Vector<String>(5); //제네릭 타입
           	// 객체 저장
        	vc.add("홍길동1");
        	vc.add("홍길동2");
        	vc.add("홍길동3");
        	// 객체 추출
        	String str1 = (String)vc.get(0);
        	String str2 = (String)vc.get(1);
        	String str3 = (String)vc.get(2);
        	// 출력
        	System.out.println(str1);
        	System.out.println(str2);
        	System.out.println(str3);
        	System.out.print("이름을 입력하세요 : ");
        	String name  = new Scanner(System.in).next();
        	int index = vc.indexOf(name);
        	if(vc.contains(name)) {
        		System.out.println("검색결과 있음 : " + vc.get(index));
        		if(vc.remove(name)) {
        			System.out.println("삭제 완료!");
        		}
        		System.out.println("<출력 결과 표현1>");
        		for(int i = 0; i < vc.size(); i++) {
        			Object obj = vc.get(i);
        			String str = (String)obj;
        			//String str = e.nextElement();
        			//
        			System.out.println(str);
        		}
        	   System.out.println("<출력 결과 표현2>");
        	   Iterator it = vc.iterator(); 
        	   while(it.hasNext()) {
        		   String e = (String)it.next();
        		   System.out.println(e);
        	   }
        	   System.out.println("<출력 결과 표현3>");
        	   Enumeration e = vc.elements();
        	   while(e.hasMoreElements()) {
        		   Object obj = e.nextElement();
        		   String str = (String) obj;
        		   System.out.println(str);
        	   }
        	   System.out.println("<출력 결과 표현 4>");
        	   for(Object obj : vc) {
        		   String str = (String)obj;
        		   System.out.println(str);
        	   }
        	}else {
        		System.out.println("검색결과 없음!");
        	}
        	
        	
        	
        	
        	
        	
        }
}
