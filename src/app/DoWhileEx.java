package app;

//�ݺ���(do- while��)
/*
   ǥ��)
   do(
        ���� ����):
        )while( ���ǽ� );
        while �� do while�� ����
        1.while�� ǥ������ �ٸ��� do���  2. �ּ��� �ѹ��� �����ؾ��� (while�� 1���� ���� ���� �� ����)
 */
public class DoWhileEx {

	public static void main(String[] args) {
	
// ����) ������ 7 ���� ����Ͻÿ�
	
		int sum = 0, a =1;
		do { 
			sum = (7 * a++);
			System.out.println(sum);
		}while( a < 10);
		
		int cnt = 0; 
		int dan = 7;
			do {
				cnt++;
				System.out.println(dan + " * " + cnt + "=" + (dan * cnt));
			}while(cnt < 9);
	
		}
	}


