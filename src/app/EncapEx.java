package app;
/*
 접근 제어자(Access modifiers)
   - 객체의 사용을 제어하기 위한 제어자
   종류 )
   - private, default(friendly).protected,public    보안성 강한 순서 왼쪽에서 오른쪽으로 갈 수록 접근권한이 커짐 맨 오른쪽은 모든 접속가능 공유 파일 느낌
  형식 )
  - 클래스표현
  [접근지정자] class 클래스명
  
  - 메서드 표현
  [접근지정자][자료형] 메서드명(인자들){}
 
  - 변수 표현
  [접근지정자][자료형] 변수형 = 데이터;
  
  - 생성자 표현
  [접근지정자] 클래스명(인자들){}
    
    
  
    */
public class EncapEx {
	public static void main(String[] args) {
		Encap encap = new Encap();
		System.out.println(encap.a);
		System.out.println(encap.b);
		System.out.println(encap.c);
		encap.setD(50);
		System.out.println(encap.getD());
	}

}
  class Encap{
	  public int a = 10;
	  protected int b = 20;
	  int c = 30;
	  private int d = 40;             
	  Encap(){
		  System.out.println(d);
	  }
	  public void setD(int d) {           //아래 int와 세트 
		  this.d = d;
	  }
	  public int getD() {
		  return this.d;
	  }
  }
