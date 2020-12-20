package baitap_05;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PeopleManager peopleManager = new PeopleManager();
		Zone zone = new Zone();
		int choose;
		Scanner input = new Scanner(System.in);
		
		do {
			showMenu();
			choose = input.nextInt();
			
			switch (choose) {
			case 1:
				peopleManager.input();
				break;
			case 2: 
				zone.input();
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				System.out.println("Goodbye!");
				break;

			default:
				System.err.println("Wrong input!");
				break;
			}
		} while (choose!=7);
		
	}
	
	static void showMenu() {
		System.out.println("1. Entering N people: ");
		System.out.println("2. Entering N areas to save in Zone: ");
		System.out.println("3. Entering N vehicles and find out automatically a suitable area to park: ");
		System.out.println("4. Showing all vehicles of one owner based on their name");
		System.out.println("5. Sorting the area(dien tich) of vehicle decreasingly in each zone(based on Quick Sort algorithmus");
		System.out.println("6. Showing information of vehicles in that zone");
		System.out.println("7. Exit");
		System.out.println("Choose: ");
	}

}
