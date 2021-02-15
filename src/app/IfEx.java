package app;

/* 제어문(조건문)
     if, else의 조건식에 따라 프로그램의 흐름을 연결한다
        표현)
        if( 조건식 )(
                    실행 구분;
        )
        
        if( 조건식 )(
                    실행 구분 1;
        )else(
                    실행 구분 2;
        )
        
   
 */

public class IfEx {
	public  static void main(String[] args) {
		int num = 10;
//      ex1)
		if(num == 10) {
			System.out.println("참");
		}
		System.out.println("main 실행구문");
//		ex2)
		if (num < 10) {
		     System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
	}

}
