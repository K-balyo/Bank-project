package app;
/*
       연산후 대입 연산자
       형식)
        +=
        -=
        *=
        /=
        %=
        ex)
            int su = 5;
            su %= 10;  ->  su = su % 10;
 */
public class OperEx5 { 
	
	public static void main(String[] args) {
		//TODD Auto-generated method stub
		int su1 = 10, su2 = 20, sum = 0;
		sum = su1 + su2;
		sum += 10;   // sum = sum + 10;
		System.out.println("결과 : " + sum);
		sum += 10;
		System.out.println("결과 : " + sum);
		//문제) 1 부터 10까지 합과 곱의 결과를 각각 출력하시오.
		
		
		System.out.println(1+2+3+4+5+6+7+8+9+10 );
		System.out.println(1*2*3*4*5*6*7*8*9*10 );

	    int sum0 = 0;
		sum0 += 1;
		System.out.println("결과1 : " + sum0);
		sum0 += 2;
		System.out.println("결과1 : " + sum0);
		sum0 += 3;
		System.out.println("결과1 : " + sum0);
		sum0 += 4;
		System.out.println("결과1 : " + sum0);
		sum0 += 5;
		System.out.println("결과1 : " + sum0);
		sum0 += 6;
		System.out.println("결과1 : " + sum0);
		sum0 += 7;
		System.out.println("결과1 : " + sum0);
		sum0 += 8;
		System.out.println("결과1 : " + sum0);
		sum0 += 9;
		System.out.println("결과1 : " + sum0);
		sum0 += 10;
		System.out.println("결과1 : " + sum0);
		
		int sum1 = 1;
		sum1 *= 1;
		System.out.println("결과2 : " + sum1);
		sum1 *= 2;
		System.out.println("결과2 : " + sum1);
		sum1 *= 3;
		System.out.println("결과2 : " + sum1);
		sum1 *= 4;
		System.out.println("결과2 : " + sum1);
		sum1 *= 5;
		System.out.println("결과2 : " + sum1);
		sum1 *= 6;
		System.out.println("결과2 : " + sum1);
		sum1 *= 7;
		System.out.println("결과2 : " + sum1);
		sum1 *= 8;
		System.out.println("결과2 : " + sum1);
		sum1 *= 9;
		System.out.println("결과2 : " + sum1);
		sum1 *= 10;
		System.out.println("결과2 : " + sum1);
		
		int sum4 = 1;
		sum4 *= 1;
		sum4 *= 2;
		sum4 *= 3;
		sum4 *= 4;
		sum4 *= 5;
		sum4 *= 6;
		sum4 *= 7;
		sum4 *= 8;
		sum4 *= 9;
		sum4 *= 10;
		System.out.println(1+2+3+4+5+6+7+8+9+10 );
		System.out.println(sum4 );
	
		
		
		
	}

}
