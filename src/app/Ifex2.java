package app;

/* 제어문(다중 조건문)
       표현)
    if( 조건식1 ){
              실행 구문 1;
    }else if( 조건식 2 ){
                실행 구문 2;
    } 
 
 */
public class Ifex2 {
	public static void main(String[] args) {
		int score = 30; ;
		if(score > 50 && score < 81) {
			System.out.println("A학점입니다.");
		}else if(score < 91) {
			System.out.println("합격");
		}else {
			System.out.println("기본실행");
		}
		
		/*
		 * 응용 문제)
		 *  int score;
		 *  0 ~ 60 까지 -> 문자열 C 출력 (C학점)
		 *  61 ~ 80 까지	-> 문자열 B 출력 (B학점)
		 *  81 ~ 100 까지	 -> 문자열 A 출력 (A학점)
		 *  출력 하시오.
		 *  */
		  int score0 = 77; ;    // &,&& 쓸 것 |,|| 써보니 앞이 거짓이라면 뒤는 돌아보지않음
	        if(score0 >= 0 && score0 <= 60) { 
	        	System.out.println("C학점입니다.");
	        }else if(score0 >= 61 && score0 <= 80) {
	        	System.out.println("B학점입니다.");
	        }else if(score0 >= 81 && score0 <= 100) {
	            System.out.println("A학점입니다.");
	        }
	       
	            
        int score1 = 100; ;    // &,&& 쓸 것 |,|| 써보니 앞이 거짓이라면 뒤는 돌아보지않음
        if(score1 >= 0 && score1 <= 60) {
        	System.out.println("C학점입니다.");
        }else if(score1 >= 61 && score1 <= 80) {
        	System.out.println("B학점입니다.");
        }else if(score1 >= 81 && score1 <= 99) {
            System.out.println("A학점입니다.");
        }else if(score1 >= 100) {
            System.out.println("올~백");    // 응용에 응용 
        }
         int score2 =88 ; ;
         if(score2 > 0 && score2 <61 ) {
        	 System.out.println("C");
         }else if(score2 < 81) {
             System.out.println("B");
	     }else if(score2 <101) {
	    	 System.out.println("A");
	     }
	
         }
        
	

}
