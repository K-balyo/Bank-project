package app;
//내부 클래스
public class ABC {
    public String msg = "A";
    public void print() {
       BC bc = new BC();
       bc.print();
    }
    public class BC{ //  ABC클래스에 종속되어지는 BC클래스가 만들어졌다
          public String msg ="B";
          public void print() {
        	  C c = new C();
        	  c.print();
          }
          public class C{
        	  public String msg = "C";
        	  public void print() {
        		  System.out.println(msg);
        		  System.out.println(this.msg);
        		  System.out.println(BC.this.msg);
        		  System.out.println(ABC.this.msg);
        	  }
          }//enc C
    	}// end BC
	public static void main(String[] args) {
		ABC abc = new ABC();
		abc.print();
	}
}//end ABC
