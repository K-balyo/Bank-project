package app;
// this. 은 위치가 상관없으나 this() 는 구문 중 최상위로 와야함
public class ConstructorEx2 {
	/*int var;
	ConstructorEx2(){    // 이 구문이 있어야 아래 17항이 12번항을 자동적으로 적용가능
		             
		this(10);
	System.out.println("생성자 실행문" + this.var);   // this 는  멤버를 의미한다 4번항 앞에 int var
	
	}
	ConstructorEx2(int a){
		System.out.println("생성자 실행문2");
		
	}
	public static void main(String[] args) {
		
		new ConstructorEx2();          // 5번 항을 지운다면   int a 의 값을 지정해줘야함 ex) new ContructorEx2(10)
	}*/
	
	int var;
	ConstructorEx2(){       //35번에 맞춰 여기서 시작
            this(10);       // this 값을 불러줘서 25번으로
	        System.out.println("생성자 실행문1");   
	}
	ConstructorEx2(int a){ 
		    this(10, "A");  //다시 this 값을 불러줘서 29번으로
		    System.out.println("생성자 실행문2" + a);
	}
	ConstructorEx2(int a,String s){	    // 더 이상 this 
	        System.out.println("생성자 실행문3");
		
	}
	public static void main(String[] args) {
		
		new ConstructorEx2();   //생성자 불러서 맨위로      
}
}
	
