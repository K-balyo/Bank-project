package app;

public class ForEx {
	
	  //�ݺ���(for��)
	 /*  ǥ��)
	    for( ���� ����(�ʱ�ȭ); ���ǽ�; ���� Ȥ�� ���� ����){
	                ���� ����;
	                }
	           
	   
	  */
	public static void main(String[] args) {
	    for ( int i = 0; i < 10; i++) {
	    	System.out.println(i);
	    	
	    }
		
	
           //����1) 1~100������ ���� ���Ͻÿ�.
	  int sum = 0;
	  for (int i = 1; i <=100; i++) {
		  sum += i; //sum = sum + i;
	   }
	  System.out.println("��� : " + sum);
	  
}}




