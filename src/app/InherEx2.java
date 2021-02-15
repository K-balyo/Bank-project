package app;

public class InherEx2 extends SuperClass2 {
		int a = 10;
		String c;
		public void method() {
			System.out.println("SuperClass Method");
		}
		public static void main(String[] args) {
		
		/*
		int a = 10;
		long b = a;
		int c = (int)b;
		*/
		InherEx2 obj = new InherEx2();
		SuperClass2 obj2 = obj;
		obj = (InherEx2)obj2;
		System.out.println(obj2.a);
		obj2.method();
		obj.method();
		
		
		// 1) 형 변환
		// 2) 캐스팅 
		// 3) Object 형 변환
		// 4) 오버라이트 사용
		// 5) 은닉변수 사용
	}
	}
class SuperClass2{
	int a;
	String b;
	public void method() {
		System.out.println("SuperClass Method");
	}
}
