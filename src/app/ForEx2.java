package app;
/*
 * ǥ��)
  for( ���� ����(�ʱ�ȭ); ���ǽ�; ���� Ȥ�� ���� ����){
          ���� ���� 1 ;
      for ( ���� ���� (�ʱ�ȭ); ���ǽ�: ���� Ȥ�� ���� ����){
                   ���� ���� 2;
  
 */
public class ForEx2 {
	public static void main(String[]args) {
		for( int i = 0; i < 2; i++) {
			System.out.println("����1");
			for ( int j = 0; j < 5; j++) {
				System.out.println("���� ����");
			}
		}
		
	
	   for ( int a = 2; a < 10; a++) {
		   System.out.print("������ "  + a + "�� �Դϴ� " + "\t" );
		   for ( int b = 1; b <10; b++) {
			   System.out.print
			   (a + " * " + b + " = " + ( a * b ) + "\t");
		   }
		   System.out.println();
		   }
	   for ( int a = 2; a < 10; a++) {
		   System.out.println("������ "  + a + "�� �Դϴ� " );
		   for ( int b = 1; b <10; b++) {
			   System.out.println
			   (a + " * " + b + " = " + ( a * b ));
		   }
	   }
	  
	   String star = "*" ;
		  for ( int i = 0; i < 5; i++){
		for(int j= 0; j <= i; j++) {
				System.out.print(star);
			}
		System.out.println();
		}
	 
		  String star1 = "*";
		  for (int i = 5; i > 0; i--) {
			  for(int j = 1; j < i; j++) {
	           System.out.print(star1);
			  }
		  System.out.println();
		  }
		  
		 
	
	 
}}
