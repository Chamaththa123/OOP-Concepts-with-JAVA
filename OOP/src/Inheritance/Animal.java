package Inheritance;

public class Animal {

	//define filed
	String name;
	int age;
	
	//constructor
	public Animal(String name ,int age) {
		this.name = name;
		this.age = age;
	}
	
	// methods
	public void makeSound() {
		System.out.println("Some generic animal sound");
	}
	
	
	public void displayInfor() {
		System.out.println("Name"+name);
		System.out.println("age"+age);
	}
	
}
