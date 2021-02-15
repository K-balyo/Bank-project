package app;

public class NumberFormatEx {

	public static void main(String[] args) {
		//디버깅 처리
		String data1 = "100"; //data1 의 값을 100에서 a 로바꿔도 에러는 안나지만 실행시 콘솔창에서 에러가 난다 
		String data2 = "100";
        int value1 = Integer.parseInt(data1);	
        int value2 = Integer.parseInt(data2);
        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);
	}
}
