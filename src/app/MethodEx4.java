package app;
// int[] 랑 int... 같은거임
public class MethodEx4 {
	public static void prn(int... num) {             // ...을 씀으로써 얼마든지 배열구조로 넘길 수 있다 num1 num2 늘어날 필요가 없다
	     for(int i = 0; i < num.length; i++) {
	    	 System.out.println(num[i]);
	}
}
	public static void main(String[] args) {
		//int[] arr = {1, 2, 3};   안에 경우가 3개 있지만 위에 ... 을 써서 int ... num 으로 퉁침 조금 더 편하게 쓸 수 있다
		prn(2, 3);
	}

}
