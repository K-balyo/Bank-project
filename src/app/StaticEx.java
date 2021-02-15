package app;
/*
  기타 제어자(수정자)
  형식)
  -class : 상속이 안됨
  -method : 재사용이 안됨
  -variable : 상수화
  *static :
     - 객체 생성 없이 사용가능(정적 메모리에 생성)
  *abstract :
   - class : 추상 클래스
   - method : 추상 메소드
   
   [수정자][접근지정자] ...
 */

public class StaticEx {
   
	   public final int A = 10;
	   public static int b = 10;
	   public static void method() {
		   System.out.println("method");
	   }
   public static void main(String[] args) {
	StaticEx se = new StaticEx();
	System.out.println(se.A);
	System.out.println(StaticEx.b);
	StaticEx.method();
	
   }
   }
   

