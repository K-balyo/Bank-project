package app;
/*
 // switch ~ case 문
  /* 표현)
   * switch (값) {
     case 값 1:
                   실행 구문1;
                   break; (선택)
     case 값 2 :
                   실행 구문2;
                   break; (선택)
                   case 값 3:
                   실행 구문3;
                   break;  (선택)
                   
                   
                   
   */
public class SwitchEx {

	public static void main(String[] args) {
		int va1 = 2;
		switch (va1) {
		case 1:
			System.out.println("값1");
			break;
		case 2:
			System.out.println("값2"); 
			break;
		case 3:
			System.out.println("값3");
			break;
		default:
			System.out.println("기본실행");
		} 
	}//end method
}//end class



