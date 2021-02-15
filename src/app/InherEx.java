package app;

/*
  상속 (inheritance)
  상속이란 자식이 부모가 가지고 있는 재산이나 권력을 물려받는다는 의미/
  - 특정 (자식) 클래스는 다른(부모)클래스가 가지고 있는 모든 멤버 변수나 멤버 메소드를 사용할 수 있음
  - 상속 관계에서 자식 클래스의 객체를 생성하였을때 부모 클래스의 객체도 생성되어 짐.
  - 상속 관계 표션으로 extends, keyword를 사용함.
  - 상속 관계 용어로 super, 상위, 부모, class와 sub, 하위, 자식class로 사용함.
  - 상속의 개념에서 super 와 this 를 구분함.  supeer 는 부모를 this(내것처럼) 는 나를
  - 메서드를 재사용 할 수있음(method override).
  - 단일 상속(자바에서는 다중 상속 X).
  - extends 와 implements 를 함께 사용할 수 있음.
  
  형식)
  class A extends B{
  문장 구현;
  }
 */
public class InherEx extends SuperClass{
	int c = 20;
	public InherEx() {
		super();
		System.out.println("B");
		
	}
	public static void main(String[] args) {
	new InherEx();
	
	}
}
class SuperClass{
	public SuperClass() {
		System.out.println("A");
	}
	int a = 10;
	String b = "A";
}