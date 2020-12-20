package baitap_06.Zoo;
import java.util.Scanner;

public abstract class Animal {
	String name, description;
	int age;
	
	public Animal() {
	}
	
	public Animal(String name) {
		this.name = name;
	}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Animal(String name, int age, String description) {
		this.name = name;
		this.age = age;
		this.description = description;
	}
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Name: ");
		name = input.nextLine();
		
		System.out.println("Age: ");
		age = Integer.parseInt(input.nextLine());
		
		System.out.println("Description: ");
		description = input.nextLine();
	}
	
	public void display() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", description=" + description + ", age=" + age + "]";
	}
	
	public abstract void showSound();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
