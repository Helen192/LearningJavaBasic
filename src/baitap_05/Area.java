package baitap_05;
import java.util.Scanner;
import java.util.ArrayList;

public class Area {
	String position;          // position of area
	int width;
	int height;
	ArrayList<Vehicle> vehicleList = new ArrayList<>();  // contains all vehicles which are in one area
	
	public Area() {
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Position of area: ");
		position = input.nextLine();
		
		System.out.println("Width of area: ");
		width = Integer.parseInt(input.nextLine());
		
		System.out.println("Height of area: ");
		height = Integer.parseInt(input.nextLine());
	}

}
