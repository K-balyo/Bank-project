package app;

public class BoxingUnBoxingEx {
	public static void main(String[] args) {
		//Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(200);
		Integer obj3 = Integer.valueOf(300);
		
		
		
		//UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
		
	    //  ÀÚµ¿ ¹Ú½Ì
		Integer obj =100;  
		
		System.out.println(obj);
		
		
		
		//ÀÚµ¿ ¾ð¹Ú½Ì
	 	Integer obj11 = new Integer(200);       
		int value4 = obj11;
		int value5 = obj11 + 100;
		 
		System.out.println(value4);
		System.out.println(value5);
		
	}

}
