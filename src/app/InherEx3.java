package app;

// class name InherThree
// B 에 대한 superclass
class C{
	public C() { // 여기서 부터 시작임 run 누르면 결과값 c 부터 나옴
		System.out.println("Constructor c");
	}
	int num = 10; //은닉
	String msg = "msg...";
	public void method() {
		System.out.println("method " + num);
	}
	public void method_C() {
		System.out.println("method_C " + msg);
	}
} 
// C 에 대한 subclass B 
// A 에 대한 superclass
class B extends C{
	public B() {// 여기에도 super가 있어서 6항 c 로 올라간다 ~
		super();
		System.out.println("Constructor B");
	}
	int num = 50;
	
	public void method() {   //오버라이드로 속임수
		super.method_C();
		this.method_C();
		System.out.println("method " + num);
	}
	public void method_B() {
		System.out.println("method_B " + msg);
	}
}
class AAA extends B{
	public AAA() {
		super();  //상속이라 안써도 그만 지워도 잘 돌아감   super가 있기때문에 위로 올라간다 21항 class b로 ~
		//super().super(); 는 문법적 에러로 안된다는걸 알려주심
		System.out.println("Constructor A");
	}
	public void method() {
		//System.out.println("method " + super.super.num);
 	}
	public void method_A() {
		System.out.println("method_A " + msg);
	}
}

public class InherEx3 {
   public static void main(String args[]) {
	   AAA a = new AAA();
	   B b = a;
	   C c = b;
	   a.method();
	   a.method_A();
	   a.method_B();
	   a.method_C();
	   System.out.println(a.num);
    }
}
