package app;
// �޼ҵ� ����
public class MethodEx3x {
	public static void main(String[] args) {
		int array[] = {2, 5, 7, 3}; //���� �־��� �迭�� �� Ȧ������ ����Ͻÿ�
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