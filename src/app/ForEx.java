package app;

public class ForEx {
	
	  //반복문(for문)
	 /*  표현)
	    for( 변수 선언(초기화); 조건식; 증가 혹은 감소 수식){
	                실행 구문;
	                }
	           
	   
	  */
	public static void main(String[] args) {
	    for ( int i = 0; i < 10; i++) {
	    	System.out.println(i);
	    	
	    }
		
	
           //문제1) 1~100까지의 합을 구하시오.
	  int sum = 0;
	  for (int i = 1; i <=100; i++) {
		  sum += i; //sum = sum + i;
	   }
	  System.out.println("결과 : " + sum);
	  
}}




