package app;

public class ArrayEx2 {
	public static void main(String[] args) {

		// ����)
		// int [] score = { 83, 90, 87 };
		int scores[] = new int[3];
		scores[0] = 83;
		scores[1] = 90;
		scores[2] = 87;
		// ������ ���� ���

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("������ ������ : " + sum + "�� �Դϴ�");

		int su1 = 83, su2 = 90, su3 = 87, sum1 = 0;
		sum1 = su1 + su2 + su3;
		System.out.println("������ ������ : " + sum1 + "�� �Դϴ�");

		// �����ϴ� �������� ���ʷ� ���ؼ� �� ���� ����
		// int result = 0;
		// for(int i = 0; i < scores.length; i++) {
		// result += scores[i];
		// System.out.println("������ ������ : " + result+ "�� �Դϴ�");

		double avg = (double) sum / 3;
		System.out.println("��� : " + avg);

		// ����2)
		// int su[] = {3, 6, 4, 7, 10}; ¦���� ����Ͻÿ�.

		int su[] = { 3, 6, 4, 7, 10 };
		System.out.println("¦�� ����Դϴ�");
		for (int i = 0; i < su.length; i++) {

			if (su[i] % 2 == 0) {
				System.out.println(su[i]);
			}
		}
		// ����3) ������ �� 3, 7 ���� ���� ��� �迭�� �����Ͻÿ� (ex - int[] result)
		/*������ Ǯ���ڵ�
		 * int []result = new int[2]; 
		 * int dan1 = 0, dan2 = 0; 
		 * for(int i = 1; i < 10;i++) 
		 * { dan1 += 3 * i; } 
		 * for(int i = 1; i < 10; i++)   // �� �κ��� �ߺ��Ǳ⶧���� �����Ͽ��� ������ 
		 * { dan2 += 7 * i; }
		 * result[0] = dan1; //1���� 2���İ� ���� �� �� ���� result[1] = dan2;
		 * System.out.println("���1 : " + result[0]); System.out.println("���2 : " +
		 * result[1]); System.out.println();
		 * 
		 * int[] dan = {3, 7}; //2���� 1���İ� ���� �� �� ���� for(int i = 0; i < result.length;
		 * i++) { for(int j = 1; j < 10 ; j++) { result[i] += dan[i] * j; } } for(int
		 * val :result) { System.out.println(val); }
		 * �Ʒ��� ���� �ϴٸ��� 
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
			System.out.println("���� " + val + "�Դϴ�");
		}

	}
}