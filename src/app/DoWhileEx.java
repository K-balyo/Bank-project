package app;

//반복문(do- while문)
/*
   표현)
   do(
        실행 구문):
        )while( 조건식 );
        while 과 do while의 차이
        1.while과 표현식이 다르다 do사용  2. 최소한 한번은 실행해야함 (while은 1번도 실행 안할 수 있음)
 */
public class DoWhileEx {

	public static void main(String[] args) {
	
// 문제) 구구단 7 단을 출력하시오
	
		int sum = 0, a =1;
		do { 
			sum = (7 * a++);
			System.out.println(sum);
		}while( a < 10);
		
		int cnt = 0; 
		int dan = 7;
			do {
				cnt++;
				System.out.println(dan + " * " + cnt + "=" + (dan * cnt));
			}while(cnt < 9);
	
		}
	}


