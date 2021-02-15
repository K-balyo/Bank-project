package app;

public class StringEx {
    public  static void main(String[] args) {
    	Object o = "abc";
    	String s = "abc";
    	String s2 = "abc";
    	String s3 = null;
    	if( o instanceof Object ) {
    		System.out.println("Object instance \n");
    	}
    	System.out.println( o.toString() );   //tostring 오버라이드 메소드
    	System.out.println( o.equals(s) );
    	System.out.println( o == s );
    	System.out.println( o == s2 );
    	String s4 = new String("abc");
    	System.out.println( o.equals(s4));
    	System.out.println( o == s4);
    	System.out.println( s == s4);
    	System.out.println( s.equals(s4));
    	System.out.println( s3 == s4);
    	String str1 = "ABCDEFG";
    	String str2 = "가나다라마바사";
    	char c = str1.charAt(3);
    	System.out.println( c );
    	String con = str1 .concat(str2); 
    	System.out.println( con );
    	boolean state = str1.equals(str2);
    	System.out.println( state );
    	int leng = str1.length();
    	System.out.println( leng );
    	String rep = str1.replace('F', 'Z');
    	System.out.println( rep );
    	String repall = str1.replaceAll("ABC", "XYZ");
    	System.out.println( repall );
    	String sub1 = str1.substring(2);
    	System.out.println( sub1 );
    	String empty = "   ab c   ";
    	System.out.println( empty );
    	String tr = empty.trim();
    	System.out.println( tr );
    	for(int i = 0; i < str1.length(); i++) {
    		if( str1.charAt(i) == (char)65
    			|| str1.charAt(i) == (char)69)
    			System.out.println(" >>> " + str1.charAt(i));
    	}
    }
	
}
