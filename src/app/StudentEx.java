package app;

public class StudentEx {
		public void menu() {
		    boolean run = true;
		    int studentNum = 5;
		    int[] scores = null;
		    java.util.Scanner scanner = new java.util.Scanner(System.in);
		    while(run) {
		    	System.out.println("-----------------------------------------------------");
		    	System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
		    	System.out.println("-----------------------------------------------------");
		    	System.out.print("����> ");
		    	int selectNo = scanner.nextInt();
		    	if(selectNo == 1) {
		    		System.out.print("�л���>");
		    		// ���� 1) �л� �� �Է� �ڵ� �ۼ�
		    		studentNum = scanner.nextInt();
		    		scores = new int [studentNum];
		    		//System.out.println("�� �ο��� : " + studentNum  + "�� �Դϴ�");
		    		
		    	}else if(selectNo == 2) {
		    		// ���� 2) �л��� ��ŭ �� ���� �Է� �ڵ� �ۼ�
		    		for(int i = 0; i<scores.length; i++) {
		    		System.out.print("scores[" + i + "]");
		    			scores[i] = scanner.nextInt();
		    		}
		    	}else if(selectNo == 3) {
		    		// ���� 3) �л� ��ü ������� ��� �ڵ��ۼ�
		    		 for(int i = 0; i < scores.length; i++) {
		    			 System.out.println("scores[" + i + "] : " + scores[i]);
		    		 }
		    	}else if(selectNo == 4) {
		    		// ���� 4) �м�
		    		/*
		    		 * System.out.println("�ְ� ���� : " + max);
		    		   System.out.println("��� ���� : " + avg);
		    		 */
		    		int max = 0;
		    		int sum = 0;
		    		double avg = 0;
		    		for(int i = 0; i < scores.length; i++) {
		    			max = (max < scores[i]) ? scores[i] : max;
		    			sum +=	scores[i];	
		    			
		    		}
		    		avg =(double) sum / scores.length;
		    		System.out.println("�ְ� ���� : " + max);
		    	    System.out.println("��� ���� : " + avg);
		    	}else if(selectNo == 5) {
		    		//����
		    		run = false;
		    	}
		    }
		}
		public static void main(String[] args) {
			new StudentEx().menu();
			System.out.println("���α׷� ����");
		}

	}

