package app;

import java.util.Random;

/* Random
 Random Object �� �Ϸ��� ������ �����Ѵ�
 �̷��� ������ Random Object �� int type, float type ���� 
 ������ �߻� �����ϸ� ����� ���� �߻��� Ư�� ������ ����
 ������ �ε��Ҽ����� ������ �Ǽ������� ������ 0.0 ���� 1.0 ������ 
 ���� �޴´�.
 Random Object�� ������ �� �ִ� Constructor
 
 1) Random ran =new Random();
      ex) int sul = ran.nextInt(3)
 2) Math class ������� ������ ����� �� ����
      ex) int su2 = (int)(Math.random() * 3);
 
 */

public class RandomEx {
	public static void main(String[] args) {
		Random ran = new Random();
		//float 0.0 ���� 1.0 ����
        float a = ran.nextFloat();
        
        System.out.println("Float�� ���� : " + a);
        //int n ����
        int b = ran.nextInt(3);
        System.out.println("Int�� ����1 : " + b);
        //Math class
        int c = (int)(Math.random() * 3);
        System.out.println("Int�� ����2 : " + c);	
	}

}
