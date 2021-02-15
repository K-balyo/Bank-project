package app;
// n = 이름 s = 속도

public class ClassEx2 {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("speed : " + car.speed);
		System.out.println("wheel : " + car.wheel);
		System.out.println("name : " + car.name);
		car.speedUp();
		car.display();
		Car car2 = new Car("티코");
		System.out.println("speed : " + car2.speed);
		System.out.println("wheel : " + car2.wheel);
		System.out.println("name : " + car2.name);
		car2.speedUp();
		car2.display();
		Car car3 = new Car("우라노스",700);   //40번 줄과 연동 이름과 속도를 넣어놨기 때문에 700이 속도
		System.out.println("speed : " + car3.speed);
		System.out.println("wheel : " + car3.wheel);
		System.out.println("name : " + car3.name);
		
	}

}
 class Car{   //클래스 선언
	   int wheel;
	   int speed;
	   String name;
	   public Car() {
		   wheel = 4;
		   speed = 110;
		   name = "르망";
	   }
	   public Car(String n) {
		   name = n;
		   wheel = 4;
		   speed = 80;
		  
	   }
	   public Car(String n, int s) {    // 이름과 속도를 넣어놨기 때문에 
		   name = n;
		   speed = s;
	   }
	   public void speedUp() {
		   speed += 100;
	   }
	   public void display() {
		   System.out.println("차 이름 : " + name + " , 현재속도 : " 
	                  +  speed + ", 바퀴수 : " + wheel);
		
	   
	   
			  
		  }
}
