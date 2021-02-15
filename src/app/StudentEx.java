package app;

public class StudentEx {
		public void menu() {
		    boolean run = true;
		    int studentNum = 5;
		    int[] scores = null;
		    java.util.Scanner scanner = new java.util.Scanner(System.in);
		    while(run) {
		    	System.out.println("-----------------------------------------------------");
		    	System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		    	System.out.println("-----------------------------------------------------");
		    	System.out.print("선택> ");
		    	int selectNo = scanner.nextInt();
		    	if(selectNo == 1) {
		    		System.out.print("학생수>");
		    		// 문제 1) 학생 수 입력 코드 작성
		    		studentNum = scanner.nextInt();
		    		scores = new int [studentNum];
		    		//System.out.println("총 인원은 : " + studentNum  + "명 입니다");
		    		
		    	}else if(selectNo == 2) {
		    		// 문제 2) 학생수 만큼 각 점수 입력 코드 작성
		    		for(int i = 0; i<scores.length; i++) {
		    		System.out.print("scores[" + i + "]");
		    			scores[i] = scanner.nextInt();
		    		}
		    	}else if(selectNo == 3) {
		    		// 문제 3) 학생 전체 점수목록 출력 코드작성
		    		 for(int i = 0; i < scores.length; i++) {
		    			 System.out.println("scores[" + i + "] : " + scores[i]);
		    		 }
		    	}else if(selectNo == 4) {
		    		// 문제 4) 분석
		    		/*
		    		 * System.out.println("최고 점수 : " + max);
		    		   System.out.println("평균 점수 : " + avg);
		    		 */
		    		int max = 0;
		    		int sum = 0;
		    		double avg = 0;
		    		for(int i = 0; i < scores.length; i++) {
		    			max = (max < scores[i]) ? scores[i] : max;
		    			sum +=	scores[i];	
		    			
		    		}
		    		avg =(double) sum / scores.length;
		    		System.out.println("최고 점수 : " + max);
		    	    System.out.println("평균 점수 : " + avg);
		    	}else if(selectNo == 5) {
		    		//종류
		    		run = false;
		    	}
		    }
		}
		public static void main(String[] args) {
			new StudentEx().menu();
			System.out.println("프로그램 종료");
		}

	}

