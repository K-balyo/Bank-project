package app;

public class ExceptionEx2 {
	String str = "";
	public void foo(int i) {
		try {
			if(i == 1) {
				throw new Exception();// 고의적 예외 발생
			}
			str += " 1 ";
		}catch (Exception e) {    
			str += " 2 ";
			return; // 강제 종료시키기 위한 코드 함정
		} finally {
			str += " 3 ";
		}
		str += " 4 ";
	}//foo
	
	public static void main(String[] args) {
		ExceptionEx2 ee = new ExceptionEx2();
		ee.foo(0);
		ee.foo(1);
		System.out.println(ee.str);
	}

}
