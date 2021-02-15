package app;
/*
  다차원 배열(array) 행과 열
  
  표현)
  -int[][] arr = new int[n][n];
  -int[][] arr = {{n, n},{n, n}, {n, n}};
  
 */
public class ArrayEx3 {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[2][0] = 5;
		arr[2][1] = 6;
		System.out.println("arr[0][0] = " + arr[0][0]);
		System.out.println("arr[0][1] = " + arr[0][1]);
		System.out.println("arr[1][0] = " + arr[1][0]);
		System.out.println("arr[1][1] = " + arr[1][1]);
		System.out.println("arr[2][0] = " + arr[2][0]);
		System.out.println("arr[2][1] = " + arr[2][1]);
		System.out.println();
	
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
				
			}
		}System.out.println("--------------------------------------");
		
		int[][] arr2 = {{10, 20}, {30, 40}, {50, 60}};
		System.out.println("arr2[0][0] = " + arr2[0][0]);
		System.out.println("arr2[0][1] = " + arr2[0][1]);
		System.out.println("arr2[1][0] = " + arr2[1][0]);
		System.out.println("arr2[1][1] = " + arr2[1][1]);
		System.out.println("arr2[2][0] = " + arr2[2][0]);
		System.out.println("arr2[2][1] = " + arr2[2][1]);
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.println("arr2[" + i + "][" + j + "] = " + arr2[i][j]);
			}
		}
		
		
		
		
		// 문자열의 2차원 배열을 출력하시오 ( 행3, 열3) 
	

		String[][] str = {{"A","B","C"},{"D","E","F"},{"G","H","I"}}; //char[][] str = {{'A','B','C'},{'D','E','F'},{'G','H','I'}} 이것(기본타입)도 가능 string 레퍼런스타입
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.println("str[" + i + "][" + j + "] = " + str[i][j]);
			}
			}
		System.out.println();
		
	//문제) 총합과 평균
		
		
		int[][] array = {                    
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int count = 0, sum = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
        double avg = (double) sum / count;
        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
		
				 
		/*int[][] array = {                    //내가하다가 넘어간거
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
				{int scores[] = new int[2];
		scores[0] = 95;
		scores[1] = 86;
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++)
		{sum += scores[i];}
	     double avg1 = (double) sum / 2;
	    System.out.println("평균 : " + avg1);}
		
		{ int scores[] = new int[3];
		scores[0] = 83;
		scores[1] = 92;
		scores[2] = 96;
		int sum = 0;
		for (int i = 0; i < scores.length; i++)
		{sum += scores[i];}
	     double avg2 = (double) sum / 3;
	    System.out.println("평균 : " + avg2);}
		
	    { int scores[] = new int[5];
		scores[0] = 78;
		scores[1] = 83;
		scores[2] = 93;
		scores[3] = 87;
		scores[4] = 88;
		int sum = 0;
		for (int i = 0; i < scores.length; i++)
		{sum += scores[i];}
	     double avg3 = (double) sum / 5;
	    System.out.println("평균 : " + avg3);}
	    int result = 0;
	    result = avg1 + avg2 + avg3
       */
     // 5개 숫자 중 최대 크기의 숫자 구하기
     		int max = 0;
     		int[] array2 = { 1, 5, 3, 8, 2 };
     		        
     		for(int i = 0; i < array2.length; i++) {
     		      if (max < array2[i]) {
                     	   max = array2[i];
                      }
     		        }
                        System.out.println("가장 큰 수 : " + max);
                        
	//최대값구하기 숙제
	int max1 = 0;
	int[] array3 = { 95, 86, 83, 92, 96, 78, 83, 93, 87, 88 };
	
	for(int i = 0; i < array2.length; i++) {
	      if (max1 < array3[i]) {
           	   max1 = array3[i];
            }
	        }
              System.out.println("가장 큰 수 : " + max1);
              }
	}
	
	
	
	
	
	
	
	
	
	