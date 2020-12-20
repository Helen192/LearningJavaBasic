package baitap_08.phongtapgym;
import java.util.Scanner;

public class Drinks implements IInputOutput{
	String name;
	int price;
	
	public Drinks() {
		
	}

	@Override
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Name of drink: ");
		name = input.nextLine();
		
		System.out.println("Price of drink: ");
		price = Integer.parseInt(input.nextLine());
		
	}

	@Override
	public void display() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Drinks [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
