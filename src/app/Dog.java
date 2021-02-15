package app;

public class Dog extends Animal {
		private String name;
		//String name;
		//int age;
		public Dog() {
			name = "»ý°­ÀÌ";
		   // age = 5;
			
		}
		public Dog(String name, int age) {
			//this.name = name;
			//this.age = age;
		}
	    public void bark() {
			System.out.println("¸Û¸Û");}
//		}
		public static void main(String[] args) {
		   Dog dog = new Dog();
		   System.out.print(dog.name + "°¡ " );
		   dog.bark();
		}
		
	}
