package app;
/*
 * �迭(array)
   -���� �ڷ����� �����͸� ������ �����ϱ� ���� �޸� ������ ����
   -������ �޸� ������ index�� �̿��Ͽ� �� �����Ҹ� ������
   -�迭 ũ��� length�� ����Ͽ� ����
   
   ǥ��)
   - int[] arr = new int[n];  -> ex) arr[0] = 1;
                       // n �� ��ŭ 0���� �ʱ�ȭ
   - int[] arr = { 1, 2, 3};
   - int[] arr = new int[]{1, 2, 3};
 */
public class ArrayEx {
	public static void main(String[] args) {
		int[] arr = new int[3];
		System.out.println(arr[0]);
		arr[0] = 10; 
		arr[1] = 20;
		arr[2] = 30;
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2] + "\n");
		System.out.println("------------------------");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();		
		System.out.println("------------------------");
		
		String[] str = new String[2];
		str[0] = "A";
		str[1] = "B";
		System.out.println("str[0] = " + str[0]);
		System.out.println("str[1] = " + str[1]);
	
		
		 for (int i = 0; i < 2; i++) {
			 System.out.println("str[" + i + "] = " + str[i]);
		 }
		 System.out.println("------------------------");
		 
		int[] arr2 = {10, 20, 30};
		System.out.println();
		System.out.println("arr2[2] = " + arr2[2]);
		for(int val : arr2) {
			System.out.println(val);
		}System.out.println("------------------------");
		
		// ����) int dan[] = {3, 7, 9 }; �迭 ���� �������� ���
		
		  int dan[] = {3, 7, 9 };
		  int d = dan[0];
		  for(int i = 1; i < 10; i++){
		  System.out.println(d+ "*" + i + "=" + d * i);
		  } 
		   d = dan[1];
		  for(int i = 1; i < 10; i++){
		  System.out.println(d+ "*" + i + "=" + d * i);
		  } 
		   d = dan[2];
		  for(int i = 1; i < 10; i++){
		  System.out.println(d+ "*" + i + "=" + d * i);
		  }
		// d = dan[2]
		  for(int j = 0; j < dan.length; j++) {
		  System.out.println("������" + dan[j] +"�� �Դϴ�");
		  
			  for(int i = 1; i < 10; i++) {
				  System.out.println(dan[j] + "*" + i + "=" + dan[j]*i);
				 }
			 
			  
		  }
		
	}}
