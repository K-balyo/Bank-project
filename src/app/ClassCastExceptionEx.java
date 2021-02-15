package app;

public class ClassCastExceptionEx {
	public static void main(String[] args) {
		Dog3 dog = new Dog3();
		
	}
	public static void changeDog(Animal1 animal) {
		if(animal instanceof Dog3) {
			Dog3 dog = (Dog3) animal;
		}else if (animal instanceof Cat2) {
		Cat2 dog = (Cat2) animal;
		}
	}

}
class Animal1{}
class Dog3 extends Animal1{}
class Cat2 extends Animal1{}

