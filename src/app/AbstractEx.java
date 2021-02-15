package app;

/*
 * 추상(abstract)
 * 객체의 모호함을 class로 표현하기위함
   특징 
     - class에 사용시 추상 class 의 의미(ex : abstract class).
     - 일반 메서드의 추상 메서드 사용 가능 함
     - 객체를 생성 할 수 있음.
     - 상속 관계에서 재정의 함
     - 내부 익명 클래스(무명 annoymous class)로 객체생성 할 수는 있음
     - 추상 메서드는 구현하지 않는다
     -추상 메서드는 재정의(Override)하여 사용함
     - 상속시 extend keyword 를 사용함
         표현)
        abstract class A{
             int a;
             ex) abstract void setA();
                      void setB()();
                 }
         사용)
           class B extends A{
               super class의 추상 메서드 재정의
               }
 */
public class AbstractEx extends Abs {
	@Override
    public void methodB() {
		System.out.println("추상 메서드 재정의");
	}
        public static void main(String[] args) {
        	AbstractEx ae = new AbstractEx();
        	System.out.println(ae.a);
        	ae.methodA();
        	ae.methodB();
        	
    }
}
abstract class Abs{
	int a = 10;
	public void methodA() {
		System.out.println("일반적인 메서드 실행");
	}
	public abstract void methodB();
		
	
}
 
