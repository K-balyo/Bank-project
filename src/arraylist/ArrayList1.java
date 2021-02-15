package arraylist;

import java.util.ArrayList;

/*
size() �氳���� ���

add(value) �� ������ �߰�

get(index) �ε��� ���

remove(index)   �ε��� ����

set(index, value) �ε����� �ִ� ���� ����

add(index. value)  �ε����� ���� �߰�

clear()        �ε����� ��� ������ ����
 */


public class ArrayList1 {
	
   public static void main(String[] args) {
	   
	   //ArrayList : �迭ó�� ��������� , ũ�Ⱑ ������ ���� ���� ����Ʈ ����
	  //(Set �� ��� add���� ���� ����, map�� ��� put ���� ��������)
	   //�÷��� = ���ʸ�Ÿ��<E>
	   
	   ArrayList<Integer> list = new ArrayList<>();
	   
	   System.out.println("������ : " + list.size());
   
	   
	   //add�� ������� �ε����� �� �߰�
	   list.add(0);
	   list.add(1);
	   list.add(2);
	   list.add(3);
	   list.add(4);
	   
	   
	   //��ü�� ����ص� �ּҰ��� �ƴ� ��� ������ ��µȴ�.(�迭���� ������
	   System.out.println(list);
	   
	   for(int i = 0; i < list.size(); i++) {
		   System.out.println("list["+i+") = " + list.get(i));
	   }
	   
	   // ���� = remove(index)
	   list.remove(1);
	   System.out.println("=====================");
	   for(int i = 0; i < list.size(); i++) {
		   System.out.println("list[" + i + "] = " + list.get(i));
	   }
	   
	   //���� .set(index, ��)
	   list.set(1,1);
	   list.set(2,2);
	   list.set(3,3);
	   System.out.println("======================");
	   for(int i = 0; i < list.size(); i++) {
		   System.out.println("list[" + i + "] = " + list.get(i));
	   }
	   //�߰� .add(index, ��)
	   list.add(1, 8);
	   System.out.println("===================");
		   for(int i = 0; i < list.size(); i++) {
			   System.out.println("list[" + i + "] = " + list.get(i));
		   }
	   //��ü���� ,clear()
	   list.clear();
	   System.out.println(list);
	   
	   ArrayList<Character> aList = new ArrayList<Character>();
       
       aList.add('S');
       
       if(aList.contains('S')) {
       	System.out.println("S�� �����մϴ�.");
       }
       if(aList.contains('F')) {
       	System.out.println("F�� �����մϴ�.");
       }
	   }
       
      
   }

