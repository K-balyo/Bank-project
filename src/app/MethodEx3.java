package app;

public class MethodEx3 {
	/*public static void method(int dan) {
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
	}
	public static void main(String[] args) {
		method(7);}
	*/
      // ���� ) dan1, dan2 args �� ����� ��� (method) ���� ���
	
	public static void method(int dan1, int dan2) {   //�ݺ��� Ȱ�� �Ű����� ����
		for(int j = dan1; j <= dan2; j++) {
		for(int i = 1; i < 10; i++) {
			System.out.println( j + "*" + i + "=" + ( j * i));
		}
		  System.out.println();
	  }
	}
	/* public static void main(String[] args) {
		method(2, 7);
		//���� ) dan1, dan2 args �� ����� ���(method) �������
		int array[] = {2, 5, 7, 3};
		for (int i = 0; i < array.length; i++) {
			for(int j =1; j < 10; j++) {
				System.out.print(array[i] + "*" + j + "=" + (array[i] * j) + "\t" );
			}
			System.out.println();
		}
		// �޼ҵ� ����
		public class MethodEx3x {
			public static void main(String[] args) {
				int array[] = {2, 5, 7, 3}; //���� �־��� �迭�� �� Ȧ������ ����Ͻÿ�
				method(array);
			  }
			public static void method(int[] array) {
				for(int i = 0; i < array.length; i++) {
					for(int j = 1; j < 10; j++) {
						System.out.print(array[i] + "*" + j + "=" + (array[i] * j) + "\t" );
					}
					System.out.println();
				}
			
		*/	
	}
