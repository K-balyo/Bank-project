package app;

public class ExceptionEx2 {
	String str = "";
	public void foo(int i) {
		try {
			if(i == 1) {
				throw new Exception();// ������ ���� �߻�
			}
			str += " 1 ";
		}catch (Exception e) {    
			str += " 2 ";
			return; // ���� �����Ű�� ���� �ڵ� ����
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
