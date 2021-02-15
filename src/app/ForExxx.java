package app;

public class ForExxx {
	public static void main(String[] agrs) {
		
		 String star = "*" ;
		  for ( int i = 0; i < 5; i++){
		for(int j= 0; j <= i; j++) {
				System.out.print(star);
			}
		System.out.println();
		}
	 
		  String star1 = "*";
		  for (int i = 5; i > 0; i--) {
			  for(int j = 1; j < i; j++) {
	           System.out.print(star1);
			  }
		  System.out.println();
		  }
		
		
		
		for(int i = 0; i < 5; i++) {
			
		for(int k = 1; i + k < 5; k++) {
			System.out.print("  ");
		}
			for(int j = 0; j <= i; j++) {
			System.out.print("*");	
			}
		    for(int p = 1; p <= i; p++) {
			System.out.print("*");
	     }
	        System.out.println();
		}
		
		
		for(int i = 0; i < 4; i++) {
		for(int k = 0; k <= i; k++) {
				System.out.print("  ");
			}		
			for ( int j = 0; j + i < 4; j++) {
			System.out.print("*");
			
		}
		for(int p = 1; i + p < 4; p++) {
			System.out.print("*");
		}
     System.out.println();

}
		}}
