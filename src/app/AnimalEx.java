package app;

public class AnimalEx {
	String name;
	int age;
	public AnimalEx() {
		name = "동물";
		age = 0;
		
	}
	public AnimalEx(String name, int age) {
		this.name = name;
		this.age = 0;
	}
	public void bark() {
		System.out.println("울부짖다");
	}
	
}
