package app;

/* 연산자
        산술 : +, -, /, %, *
        가감 : ++, --
        비교 : <, <=, >, >=, ==, !=, instanceof
        비트 : &,|
        논리 : &&,||
        삼항
        
        + => 더하기
        - => 빼기
        * => 곱하기
        / => 나누기
        % => 나머지

 */
public class OperEx {
	public static void main(String[] args) {
		int su1 = 10;
		int su2 = 20;
		int result = 0;
		result = su1 + su2;
		System.out.println("결과1 : " + result);
		result = su1 - su2;
		System.out.println("결과2 : " + result);
		result = su1 * su2;
		System.out.println("결과3 : " + result);
		result = su1 / su2;
		System.out.println("결과4 : " + result);
		result = su1 % su2;
		System.out.println("결과5 : " + result);
	}
}
