package app;

public class Animal {
	String name;
	int age;
	public Animal() {
		name = "동물";
		age = 0;
		
	}
	public Animal(String name, int age) {
		this.name = name;
		this.age = 0;
	}
	public void bark() {
		System.out.println("울부짖다");
	}
	
}
