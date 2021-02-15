package app;

import java.util.Random;

/* Random
 Random Object 는 일련의 난수를 생성한다
 이렇게 생성된 Random Object 는 int type, float type 등의 
 난수가 발생 가능하며 장수형 난수 발생은 특정 범위가 없다
 하지만 부동소수점을 가지는 실수형들의 난수는 0.0 에서 1.0 사이의 
 값을 받는다.
 Random Object를 생성할 수 있는 Constructor
 
 1) Random ran =new Random();
      ex) int sul = ran.nextInt(3)
 2) Math class 기능으로 난수를 사용할 수 있음
      ex) int su2 = (int)(Math.random() * 3);
 
 */

public class RandomEx {
	public static void main(String[] args) {
		Random ran = new Random();
		//float 0.0 에서 1.0 범위
        float a = ran.nextFloat();
        
        System.out.println("Float형 난수 : " + a);
        //int n 범위
        int b = ran.nextInt(3);
        System.out.println("Int형 난수1 : " + b);
        //Math class
        int c = (int)(Math.random() * 3);
        System.out.println("Int형 난수2 : " + c);	
	}

}
