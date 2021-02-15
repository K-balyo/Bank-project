package app;

// class name InherThree
// B �� ���� superclass
class C{
	public C() { // ���⼭ ���� ������ run ������ ����� c ���� ����
		System.out.println("Constructor c");
	}
	int num = 10; //����
	String msg = "msg...";
	public void method() {
		System.out.println("method " + num);
	}
	public void method_C() {
		System.out.println("method_C " + msg);
	}
} 
// C �� ���� subclass B 
// A �� ���� superclass
class B extends C{
	public B() {// ���⿡�� super�� �־ 6�� c �� �ö󰣴� ~
		super();
		System.out.println("Constructor B");
	}
	int num = 50;
	
	public void method() {   //�������̵�� ���Ӽ�
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
		super();  //����̶� �Ƚᵵ �׸� ������ �� ���ư�   super�� �ֱ⶧���� ���� �ö󰣴� 21�� class b�� ~
		//super().super(); �� ������ ������ �ȵȴٴ°� �˷��ֽ�
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
