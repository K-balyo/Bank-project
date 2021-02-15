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
      // 문제 ) dan1, dan2 args 로 만들어 사용 (method) 범위 사용
	
	public static void method(int dan1, int dan2) {   //반복문 활용 매개변수 응용
		for(int j = dan1; j <= dan2; j++) {
		for(int i = 1; i < 10; i++) {
			System.out.println( j + "*" + i + "=" + ( j * i));
		}
		  System.out.println();
	  }
	}
	/* public static void main(String[] args) {
		method(2, 7);
		//문제 ) dan1, dan2 args 로 만들어 사용(method) 범위사용
		int array[] = {2, 5, 7, 3};
		for (int i = 0; i < array.length; i++) {
			for(int j =1; j < 10; j++) {
				System.out.print(array[i] + "*" + j + "=" + (array[i] * j) + "\t" );
			}
			System.out.println();
		}
		// 메소드 응용
		public class MethodEx3x {
			public static void main(String[] args) {
				int array[] = {2, 5, 7, 3}; //문제 주어진 배열값 중 홀수단을 출력하시오
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
