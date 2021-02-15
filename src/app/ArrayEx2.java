package app;

public class ArrayEx2 {
	public static void main(String[] args) {

		// 문제)
		// int [] score = { 83, 90, 87 };
		int scores[] = new int[3];
		scores[0] = 83;
		scores[1] = 90;
		scores[2] = 87;
		// 점수에 총합 출력

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("점수의 총합은 : " + sum + "점 입니다");

		int su1 = 83, su2 = 90, su3 = 87, sum1 = 0;
		sum1 = su1 + su2 + su3;
		System.out.println("점수의 총합은 : " + sum1 + "점 입니다");

		// 응용하다 생각난거 차례로 더해서 각 값을 도출
		// int result = 0;
		// for(int i = 0; i < scores.length; i++) {
		// result += scores[i];
		// System.out.println("점수의 총합은 : " + result+ "점 입니다");

		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);

		// 문제2)
		// int su[] = {3, 6, 4, 7, 10}; 짝수만 출력하시오.

		int su[] = { 3, 6, 4, 7, 10 };
		System.out.println("짝수 목록입니다");
		for (int i = 0; i < su.length; i++) {

			if (su[i] % 2 == 0) {
				System.out.println(su[i]);
			}
		}
		// 문제3) 구구단 중 3, 7 단의 합을 결과 배열에 저장하시오 (ex - int[] result)
		/*선생님 풀이코드
		 * int []result = new int[2]; 
		 * int dan1 = 0, dan2 = 0; 
		 * for(int i = 1; i < 10;i++) 
		 * { dan1 += 3 * i; } 
		 * for(int i = 1; i < 10; i++)   // 이 부분은 중복되기때문에 생략하여도 괜찮다 
		 * { dan2 += 7 * i; }
		 * result[0] = dan1; //1번식 2번식과 같이 쓸 수 없다 result[1] = dan2;
		 * System.out.println("결과1 : " + result[0]); System.out.println("결과2 : " +
		 * result[1]); System.out.println();
		 * 
		 * int[] dan = {3, 7}; //2번식 1번식과 같이 쓸 수 없다 for(int i = 0; i < result.length;
		 * i++) { for(int j = 1; j < 10 ; j++) { result[i] += dan[i] * j; } } for(int
		 * val :result) { System.out.println(val); }
		 * 아래는 내가 하다만거 
		//int sum11[] = {3, 7}; 
		//int result = 0;
		//for(int i = 0; i < sum11.length; i++)
		  for(int j = 1; j < 10; j++){
		  */

		int[] result = new int[2];
		int dan1 = 0, dan2 = 0;
		for (int i = 1; i < 10; i++) {
			dan1 += 3 * i;        
			dan2 += 7 * i;
		}
		int[] dan = { 3, 7 };
		for (int i = 0; i < result.length; i++) {
			for (int j = 1; j < 10; j++) {
				result[i] += dan[i] * j;
			}
		}
		for (int val : result) {
			System.out.println("답은 " + val + "입니다");
		}

	}
}