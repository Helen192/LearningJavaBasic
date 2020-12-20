package baitap03.manager.cat;
import java.util.Scanner;
public class UsingManagerCat {
	public static void main(String[] args) {
		ManagerCat managerCat = new ManagerCat();
		ColorManager colorManager = new ColorManager();
		int choose;
		Scanner input = new Scanner(System.in);
		
		do {
			showMenu();
			choose = Integer.parseInt(input.nextLine());
			
			switch (choose) {
			case 0:
				colorManager.input();
				break;
			case 1:
				managerCat.addCat(colorManager);
				break;
			case 2:
				managerCat.showAll();
				break;
			case 3:
				managerCat.sort();
				break;
			case 4:
				managerCat.find();
				break;
			case 5:
				managerCat.sortByColorTable();
				break;
			case 6:
				System.out.println("Goodbye!");
				break;
			default:
				System.err.println("Wrong input!");
				break;
			}
			
		} while (choose!=6);
		
		
	}
	
	static void showMenu() {
		System.out.println("0. Adding colors ID");
		System.out.println("1. Adding information of N cats");
		System.out.println("2. Showing information");
		System.out.println("3. Sorting cats based on their colors(from A-Z)");
		System.out.println("4. Searching cat following their type");
		System.out.println("5. Sorting cats based on their colors ID");
		System.out.println("6. Exit");
		System.out.println("Choose: ");
	}

}
