package baitap_05;
import java.util.Scanner;

public class Vehicle {
	String manufacturer;
	String numberplates;
	String year;               // year of manufacturing
	String idowner;
	int width;
	int height;
	
	public Vehicle() {
	}
	
	public Vehicle(String manufacturer, String numberplates, String year, String idowner, int width, int height) {
		this.manufacturer = manufacturer;
		this.numberplates = numberplates;
		this.year = year;        
		this.idowner = idowner;
		this.width = width;
		this.height = height;
	}
	
	
	public Vehicle(int width, int height) {
		this.width = width;
		this.height = height;
	}

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
		
		System.out.println("Width of vehicle: ");
		width = Integer.parseInt(input.nextLine());
		
		System.out.println("Height of vehicle: ");
		height = Integer.parseInt(input.nextLine());
	}
	public void showInfo() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Vehicle [manufacturer=" + manufacturer + ", numberplates=" + numberplates + ", year=" + year
				+ ", idowner=" + idowner + ", width=" + width + ", height=" + height + "]";
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getNumberplates() {
		return numberplates;
	}

	public void setNumberplates(String numberplates) {
		this.numberplates = numberplates;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getIdowner() {
		return idowner;
	}

	public void setIdowner(String idowner) {
		this.idowner = idowner;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	

}
