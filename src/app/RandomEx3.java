package app;

import java.util.Random;
import java.util.Scanner;

/*
 �ζǰ��� ����� 
  ����>
  1.   1~45 ���� �� 6�� ���� �߻�
  2.   6�� ���� �� �ߺ� X 
 */
public class RandomEx3 {

	public static void main(String[] args) {
		Random r = new Random();
		//System.out.println("==�� ������ �����Ͻðڽ��ϱ�?");
		//Scanner sc =new Scanner(System.in);
		int lt[] = new int[6]; 
		//ũ�Ⱑ 6�� �ζ� �迭�� �����.6���� ���� �� �� ���迭		
		for(int i = 0; i < lt.length; i++) {
			lt[i] = (int)(Math.random() * 45)+ 1;	
		    //su[i] = r.nextInt(6) + 1;
		   for (int j = 0; j < i; j++) {	//���� ��ȣ��  üũ�Ͽ� �ٽ� ������ �ʵ��� ǥ���Ѵ�.	
				if(lt[i] == lt[j]) {
					lt[i] = r.nextInt(45) + 1;	
					j = -1;
				}
			}
		}
		for (int num : lt) {
			System.out.println("����� ��ȣ : " + num);
		}
	}
}
	  


