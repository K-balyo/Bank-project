package app;

/* ���(���ǹ�)
     if, else�� ���ǽĿ� ���� ���α׷��� �帧�� �����Ѵ�
        ǥ��)
        if( ���ǽ� )(
                    ���� ����;
        )
        
        if( ���ǽ� )(
                    ���� ���� 1;
        )else(
                    ���� ���� 2;
        )
        
   
 */

public class IfEx {
	public  static void main(String[] args) {
		int num = 10;
//      ex1)
		if(num == 10) {
			System.out.println("��");
		}
		System.out.println("main ���౸��");
//		ex2)
		if (num < 10) {
		     System.out.println("��");
		}else {
			System.out.println("����");
		}
		
	}

}
