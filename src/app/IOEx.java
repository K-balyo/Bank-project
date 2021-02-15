package app;

import java.io.IOException;

/*
 * 용어
   - 스트림 : 일반적으로 데이타, 패킷 등의 일련의 연속성을 갖는 흐름을 의미한다.(흐르는 데이터~물의흐름)
   - 입 출력을 스트림 : 테이터를 읽고 쓰는 구조를 프로그램의 구조로 모델링 해 놓은 것
   - 버퍼 : 데이터를 임시적으로 담아두는 공간
   
 * 자바의 입출력 스트림 개념
   - 단 방향으로 흐름
   - 버퍼를 가질 수 있다
   - FIFO(First In First Out)의 구조    (first in first out system)
   - 문자(Charactor Stream), 바이트 ( byte Strea)로 분류 함
   
  * 문자(Charactor Stream) 문자 최상위 스트림
   - Reader class
           입력 스트림 : 문자 데이터를 읽어 들이는 스트림
   - Writer class
           출력 스트림 : 문자 데이터를 출력하기 위한 스트림 
           
  * 바이트(byte Stream) 바이트 최상위 스트림
   - InputStream class
           입력 스트림 : 바이트 데이터를 읽어 들이는 스트림
             (입력 최상위 스트림)
   - OutputStram class
           출력 스트림 : 바이트 데이터를 출력하기 위한 스트림
             (출력 최상위 스트림)
   ex) static PrintStream out(The "standard" output stream.)

 */
//    System.out.println   System class 에 outputstream 필터로 println 객체를 부른다
public class IOEx {
	public static void main(String[] args) {
		System.out.print("입력 : ");
		char c = ' ';
		try {
			c = (char)System.in.read();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력 : " + c);
	}

}
