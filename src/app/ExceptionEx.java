package app;
/*
 * Exception
 * 키보드 입력, 파일 처리, 네트웍 처리, DB 처리 등 외부와의 작업을 하는 경우
 * 예의치 못한 에러가 발생할 수 있으므로 자바에서는 반드시 예외처리를 하도록 하고있다
 */
public class ExceptionEx {
     
	public static void main(String[] args) throws Exception{
			try {
		 //   예외발생 지역
		 //   실행코드 1
		 //   int c = System.in.read();// 예외발생
		 //   실행코드 3
		}catch(Exception e) {//Exception 은 최상위클래스
		 //   예외처리  지역
		//}catch(Exception e) {//다중 캐치도 가능
		//   예외처리  지역
	//	}catch(Exception e) {
		//   예외처리  지역
	//	}catch(Exception e) {
		//   예외처리  지역
	//	}catch(Exception e) {
		}finally{
	     //   반드시 실행하는 지역
		}
	}
}
/*
 { 
	public static void main(String[] args) throws Exception{
		// 해결방법 2 번째 throws Exception 추가 해주기
		
		//int c = System.in.read();   에러 나는 이유 
		
		// 1. try catch
	//	try {
			int c = System.in.read(); 
		//}catch(Exception e) {
		//}
	}
}
*/