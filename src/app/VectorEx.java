package app;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx {
	/*
	 * collection
	 * ��ü�� ���� �� �ִ� ������, �������� �ڷḦ ������ ���·� ó���ϰ�
	      �����ϴ� ��������(����)�� �ڷᱸ��.
	 */
        public static void main(String[] args) {
        	//Vector vc = new Vector();         // ���׸� Ÿ���� �����ϴ��� vc�� ������ΰ� 
        	Vector<String> vc = new Vector<String>(5); //���׸� Ÿ��
           	// ��ü ����
        	vc.add("ȫ�浿1");
        	vc.add("ȫ�浿2");
        	vc.add("ȫ�浿3");
        	// ��ü ����
        	String str1 = (String)vc.get(0);
        	String str2 = (String)vc.get(1);
        	String str3 = (String)vc.get(2);
        	// ���
        	System.out.println(str1);
        	System.out.println(str2);
        	System.out.println(str3);
        	System.out.print("�̸��� �Է��ϼ��� : ");
        	String name  = new Scanner(System.in).next();
        	int index = vc.indexOf(name);
        	if(vc.contains(name)) {
        		System.out.println("�˻���� ���� : " + vc.get(index));
        		if(vc.remove(name)) {
        			System.out.println("���� �Ϸ�!");
        		}
        		System.out.println("<��� ��� ǥ��1>");
        		for(int i = 0; i < vc.size(); i++) {
        			Object obj = vc.get(i);
        			String str = (String)obj;
        			//String str = e.nextElement();
        			//
        			System.out.println(str);
        		}
        	   System.out.println("<��� ��� ǥ��2>");
        	   Iterator it = vc.iterator(); 
        	   while(it.hasNext()) {
        		   String e = (String)it.next();
        		   System.out.println(e);
        	   }
        	   System.out.println("<��� ��� ǥ��3>");
        	   Enumeration e = vc.elements();
        	   while(e.hasMoreElements()) {
        		   Object obj = e.nextElement();
        		   String str = (String) obj;
        		   System.out.println(str);
        	   }
        	   System.out.println("<��� ��� ǥ�� 4>");
        	   for(Object obj : vc) {
        		   String str = (String)obj;
        		   System.out.println(str);
        	   }
        	}else {
        		System.out.println("�˻���� ����!");
        	}
        	
        	
        	
        	
        	
        	
        }
}
