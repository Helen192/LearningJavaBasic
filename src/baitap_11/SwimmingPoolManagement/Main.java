package baitap_11.SwimmingPoolManagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choose;
		
		do {
			MenuController.getInstance().showMenu();
			choose = Integer.parseInt(input.nextLine());
			
			switch (choose) {
			case 1:
				MenuController.getInstance().addSwimmingPool();   // add a new swimming pool
				break;
			case 2:
				MenuController.getInstance().addMonthTicket();   // add a new monthly ticket
				break;
			case 3:
				MenuController.getInstance().addBooking();
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				MenuController.getInstance().addDurationTime();
			case 7:
				System.out.println("Goodbye!");
				break;

			default:
				System.err.println("Input failled!");
				break;
			}
			
		} while (choose!=7);
	}

}
