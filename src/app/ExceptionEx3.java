package app;

public class ExceptionEx3 {

	public static void main(String[] args){//throws Exception �߰��ؼ� �ذᵵ ���� 
		
		//try {
		// ��������     findClass();
//	    }catch(ClassNotFoundException e){	
//		System.out.println("Ŭ������ �������� �ʽ��ϴ�.")
//		}
	}
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
