package app;

import java.util.Random;
import java.util.Scanner;

/*
 로또게임 만들기 
  조건>
  1.   1~45 숫자 중 6개 난수 발생
  2.   6개 난수 중 중복 X 
 */
public class RandomEx3 {

	public static void main(String[] args) {
		Random r = new Random();
		//System.out.println("==몇 게임을 구입하시겠습니까?");
		//Scanner sc =new Scanner(System.in);
		int lt[] = new int[6]; 
		//크기가 6인 로또 배열을 만든다.6개의 랜덤 수 가 들어갈배열		
		for(int i = 0; i < lt.length; i++) {
			lt[i] = (int)(Math.random() * 45)+ 1;	
		    //su[i] = r.nextInt(6) + 1;
		   for (int j = 0; j < i; j++) {	//뽑은 번호는  체크하여 다시 뽑히지 않도록 표시한다.	
				if(lt[i] == lt[j]) {
					lt[i] = r.nextInt(45) + 1;	
					j = -1;
				}
			}
		}
		for (int num : lt) {
			System.out.println("행운의 번호 : " + num);
		}
	}
}
	  


