package app;

/* ���(���� ���ǹ�)
       ǥ��)
    if( ���ǽ�1 ){
              ���� ���� 1;
    }else if( ���ǽ� 2 ){
                ���� ���� 2;
    } 
 
 */
public class Ifex2 {
	public static void main(String[] args) {
		int score = 30; ;
		if(score > 50 && score < 81) {
			System.out.println("A�����Դϴ�.");
		}else if(score < 91) {
			System.out.println("�հ�");
		}else {
			System.out.println("�⺻����");
		}
		
		/*
		 * ���� ����)
		 *  int score;
		 *  0 ~ 60 ���� -> ���ڿ� C ��� (C����)
		 *  61 ~ 80 ����	-> ���ڿ� B ��� (B����)
		 *  81 ~ 100 ����	 -> ���ڿ� A ��� (A����)
		 *  ��� �Ͻÿ�.
		 *  */
		  int score0 = 77; ;    // &,&& �� �� |,|| �Ẹ�� ���� �����̶�� �ڴ� ���ƺ�������
	        if(score0 >= 0 && score0 <= 60) { 
	        	System.out.println("C�����Դϴ�.");
	        }else if(score0 >= 61 && score0 <= 80) {
	        	System.out.println("B�����Դϴ�.");
	        }else if(score0 >= 81 && score0 <= 100) {
	            System.out.println("A�����Դϴ�.");
	        }
	       
	            
        int score1 = 100; ;    // &,&& �� �� |,|| �Ẹ�� ���� �����̶�� �ڴ� ���ƺ�������
        if(score1 >= 0 && score1 <= 60) {
        	System.out.println("C�����Դϴ�.");
        }else if(score1 >= 61 && score1 <= 80) {
        	System.out.println("B�����Դϴ�.");
        }else if(score1 >= 81 && score1 <= 99) {
            System.out.println("A�����Դϴ�.");
        }else if(score1 >= 100) {
            System.out.println("��~��");    // ���뿡 ���� 
        }
         int score2 =88 ; ;
         if(score2 > 0 && score2 <61 ) {
        	 System.out.println("C");
         }else if(score2 < 81) {
             System.out.println("B");
	     }else if(score2 <101) {
	    	 System.out.println("A");
	     }
	
         }
        
	

}
