package baitap_05;
import java.util.Scanner;

public class Container extends Vehicle{
	public Container() {
		super(3,5);
	}

	@Override
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Manufacturer: ");
		manufacturer = input.nextLine();
		
		System.out.println("Number of plates: ");
		numberplates = input.nextLine();
		
		System.out.println("Year of manufacturing: ");
		year = input.nextLine();
		
		System.out.println("Owner's ID: ");
		idowner = input.nextLine();
	}
}
