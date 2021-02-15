package app;
// 메소드 응용
public class MethodEx3x {
	public static void main(String[] args) {
		int array[] = {2, 5, 7, 3}; //문제 주어진 배열값 중 홀수단을 출력하시오
		method(array);
	  }
	public static void method(int[] array) {
		for(int dan : array) {
			if(dan % 2 !=0) {
				for(int j = 1; j < 10; j++){
					System.out.println(dan + "*" + j + "=" + (dan * j) + "\t");
				}
			}
	System.out.println();
		
	}
	}}