package app;
// 반환타입
public class MethodEx2 {
	
	public static void methodA() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i ;
			}
		System.out.println("결과1 : " + sum);
	}
	public static int methodB() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
		     sum += i;
	}
	return sum;
}
	public static void main(String[] args) {
		//문제) 1~10 범위의 합을 출력하시오 / (Method 사용)
		methodA();
		int sum = methodB();
		System.out.println("결과2 : " + sum );
	}

}
