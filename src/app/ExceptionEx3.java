package app;

public class ExceptionEx3 {

	public static void main(String[] args){//throws Exception 추가해서 해결도 가능 
		
		//try {
		// 오류지점     findClass();
//	    }catch(ClassNotFoundException e){	
//		System.out.println("클래스가 존재하지 않습니다.")
//		}
	}
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
