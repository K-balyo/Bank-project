package app;
// n = �̸� s = �ӵ�

public class ClassEx2 {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("speed : " + car.speed);
		System.out.println("wheel : " + car.wheel);
		System.out.println("name : " + car.name);
		car.speedUp();
		car.display();
		Car car2 = new Car("Ƽ��");
		System.out.println("speed : " + car2.speed);
		System.out.println("wheel : " + car2.wheel);
		System.out.println("name : " + car2.name);
		car2.speedUp();
		car2.display();
		Car car3 = new Car("���뽺",700);   //40�� �ٰ� ���� �̸��� �ӵ��� �־���� ������ 700�� �ӵ�
		System.out.println("speed : " + car3.speed);
		System.out.println("wheel : " + car3.wheel);
		System.out.println("name : " + car3.name);
		
	}

}
 class Car{   //Ŭ���� ����
	   int wheel;
	   int speed;
	   String name;
	   public Car() {
		   wheel = 4;
		   speed = 110;
		   name = "����";
	   }
	   public Car(String n) {
		   name = n;
		   wheel = 4;
		   speed = 80;
		  
	   }
	   public Car(String n, int s) {    // �̸��� �ӵ��� �־���� ������ 
		   name = n;
		   speed = s;
	   }
	   public void speedUp() {
		   speed += 100;
	   }
	   public void display() {
		   System.out.println("�� �̸� : " + name + " , ����ӵ� : " 
	                  +  speed + ", ������ : " + wheel);
		
	   
	   
			  
		  }
}
