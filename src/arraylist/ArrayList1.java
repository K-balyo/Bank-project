package arraylist;

import java.util.ArrayList;

/*
size() 방개수를 출력

add(value) 방 개수를 추가

get(index) 인덱스 출력

remove(index)   인덱스 삭제

set(index, value) 인덱스에 있는 값을 수정

add(index. value)  인덱스에 값을 추가

clear()        인덱스의 모든 내용을 삭제
 */


public class ArrayList1 {
	
   public static void main(String[] args) {
	   
	   //ArrayList : 배열처럼 사용하지만 , 크기가 정해져 있지 않은 리스트 구조
	  //(Set 의 경우 add마다 방이 증가, map의 경우 put 마다 방이증가)
	   //컬렉션 = 제너릭타임<E>
	   
	   ArrayList<Integer> list = new ArrayList<>();
	   
	   System.out.println("사이즈 : " + list.size());
   
	   
	   //add의 순서대로 인덱스의 값 추가
	   list.add(0);
	   list.add(1);
	   list.add(2);
	   list.add(3);
	   list.add(4);
	   
	   
	   //객체를 출력해도 주소값이 아닌 모든 내용이 출력된다.(배열과의 차이점
	   System.out.println(list);
	   
	   for(int i = 0; i < list.size(); i++) {
		   System.out.println("list["+i+") = " + list.get(i));
	   }
	   
	   // 삭제 = remove(index)
	   list.remove(1);
	   System.out.println("=====================");
	   for(int i = 0; i < list.size(); i++) {
		   System.out.println("list[" + i + "] = " + list.get(i));
	   }
	   
	   //수정 .set(index, 값)
	   list.set(1,1);
	   list.set(2,2);
	   list.set(3,3);
	   System.out.println("======================");
	   for(int i = 0; i < list.size(); i++) {
		   System.out.println("list[" + i + "] = " + list.get(i));
	   }
	   //추가 .add(index, 값)
	   list.add(1, 8);
	   System.out.println("===================");
		   for(int i = 0; i < list.size(); i++) {
			   System.out.println("list[" + i + "] = " + list.get(i));
		   }
	   //전체삭제 ,clear()
	   list.clear();
	   System.out.println(list);
	   
	   ArrayList<Character> aList = new ArrayList<Character>();
       
       aList.add('S');
       
       if(aList.contains('S')) {
       	System.out.println("S는 존재합니다.");
       }
       if(aList.contains('F')) {
       	System.out.println("F는 존재합니다.");
       }
	   }
       
      
   }

