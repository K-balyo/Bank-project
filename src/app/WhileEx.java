package app;

//�ݺ���(While��)
/*
      ǥ��)
   while( ���ǽ� ){
           ���� ����; 
      } 
 */
public class WhileEx {
	public static void main(String[] args){
		int count = 0;// input = 5; // 1~ 5���� ���� �� ��������� ������ ��� ���� ���౸�� 5�� 
		while(count < 5 ) {
			count++;
			System.out.println("���౸��");
		}
		
	  //����1 1~10 ���� ���ϱ�
		int sum = 0 , cnt = 0;
		while(cnt <= 10) {
//			cnt++;
			sum += cnt++;
		} 
		System.out.println(sum);
		//����2 1~100 ���� ¦���� ����Ͻÿ� (¦���ϰ� Ȧ��)
		/*
		  sum +=1;
		  sum +=2;
		  sum +=3;
		  sum +=4;
		  sum +=5; 
		  sum +=6;
		  sum +=7;
		  sum +=8;
		  sum +=9;
		  
		 
		 */
		
		int count0 = 0;
		  while(count0 < 99 ) {
			   count0 = count0 +2;
			   System.out.println("��� : " + count0 );
		  }
			   
		int count1 = -1;
		  while(count1 < 99 ) {
			   count1 = count1 +2 ;
			   System.out.println("��� : " + count1 );
		}
		
		  cnt = 0;
		  while (cnt < 100) {
			  cnt++;
			  if(cnt++ % 2 != 0 ) {
				  System.out.println(cnt);
			  }
		  }
		  
		  cnt = 1 ;
		  while (cnt < 100) {
			  cnt++;
			  if(cnt++ % 2 != 0 ) {
				  System.out.println(cnt);
			  }
		  }
		
		 
		  
	}}
	
	
		
	