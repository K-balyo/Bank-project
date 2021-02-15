package app;

//반복문(While문)
/*
      표현)
   while( 조건식 ){
           실행 구문; 
      } 
 */
public class WhileEx {
	public static void main(String[] args){
		int count = 0;// input = 5; // 1~ 5까지 대입 후 거짓결과가 나오면 결과 도출 실행구문 5번 
		while(count < 5 ) {
			count++;
			System.out.println("실행구문");
		}
		
	  //문제1 1~10 까지 더하기
		int sum = 0 , cnt = 0;
		while(cnt <= 10) {
//			cnt++;
			sum += cnt++;
		} 
		System.out.println(sum);
		//문제2 1~100 범위 짝수를 출력하시오 (짝수하고 홀수)
		/*
		  sum +=1;
		  sum +=2;
		  sum +=3;
		  sum +=4;
		  sum +=5; 
		  sum +=6;
		  sum +=7;
		  sum +=8;
		  sum +=9;
		  
		 
		 */
		
		int count0 = 0;
		  while(count0 < 99 ) {
			   count0 = count0 +2;
			   System.out.println("결과 : " + count0 );
		  }
			   
		int count1 = -1;
		  while(count1 < 99 ) {
			   count1 = count1 +2 ;
			   System.out.println("결과 : " + count1 );
		}
		
		  cnt = 0;
		  while (cnt < 100) {
			  cnt++;
			  if(cnt++ % 2 != 0 ) {
				  System.out.println(cnt);
			  }
		  }
		  
		  cnt = 1 ;
		  while (cnt < 100) {
			  cnt++;
			  if(cnt++ % 2 != 0 ) {
				  System.out.println(cnt);
			  }
		  }
		
		 
		  
	}}
	
	
		
	