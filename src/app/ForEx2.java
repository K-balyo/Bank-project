package app;
/*
 * 표현)
  for( 변수 선언(초기화); 조건식; 증가 혹은 감소 수식){
          실행 구문 1 ;
      for ( 변수 선언 (초기화); 조건식: 증가 혹은 감소 수식){
                   실행 구문 2;
  
 */
public class ForEx2 {
	public static void main(String[]args) {
		for( int i = 0; i < 2; i++) {
			System.out.println("실행1");
			for ( int j = 0; j < 5; j++) {
				System.out.println("실행 구문");
			}
		}
		
	
	   for ( int a = 2; a < 10; a++) {
		   System.out.print("구구단 "  + a + "단 입니다 " + "\t" );
		   for ( int b = 1; b <10; b++) {
			   System.out.print
			   (a + " * " + b + " = " + ( a * b ) + "\t");
		   }
		   System.out.println();
		   }
	   for ( int a = 2; a < 10; a++) {
		   System.out.println("구구단 "  + a + "단 입니다 " );
		   for ( int b = 1; b <10; b++) {
			   System.out.println
			   (a + " * " + b + " = " + ( a * b ));
		   }
	   }
	  
	   String star = "*" ;
		  for ( int i = 0; i < 5; i++){
		for(int j= 0; j <= i; j++) {
				System.out.print(star);
			}
		System.out.println();
		}
	 
		  String star1 = "*";
		  for (int i = 5; i > 0; i--) {
			  for(int j = 1; j < i; j++) {
	           System.out.print(star1);
			  }
		  System.out.println();
		  }
		  
		 
	
	 
}}
