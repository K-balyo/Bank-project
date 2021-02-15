package app;
/*
        증가, 감소 연산자  
        형식)
        --
        ++
        ex)
        int a = 0;
        ++a;   // => 결과 : 1
        --a;   // => 결과 : 0
        
        a++; 선행적 증가
        a--; 
        
        ++a; 후행적 증가
        --a;
 */
public class OperEx6 {
	public static void main(String[] args) {
		int i = 0;
	    System.out.println(++i);       //1
		System.out.println(++i);       //2
	   
		int i1 = 0;
	    System.out.println(i1++);      //0
		System.out.println(i1++);      //1
		
		int i2 = 0;
		System.out.println(--i2);    //-1
		System.out.println(--i2);    //-2
		
	    int i3 = 0;
	    System.out.println(i3--);    //0
	    System.out.println(i3--);    //-1
	    
	    
//		문제)
        int a = 0;
        System.out.println(a++ + a++);       //1
        System.out.println(a + --a + ++a); //5
        System.out.println(--a + a++);  //2
        System.out.println(a);   //2
        
	}

}
