package baitap_11.quanlybeboi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choose;
		do {
			showMenu();
			choose = Integer.parseInt(input.nextLine());
			switch (choose) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("Goodbye!");
				break;
			default:
				System.err.println("Input failled!");
				break;
			}
			
		} while (choose !=6);
	
	}
	
	static void showMenu() {
		System.out.println("==================== MENU ====================");
		System.out.println("1. Add swimming pool");
		System.out.println("2. Add monthly ticket");
		System.out.println("3. Checking");
		System.out.println("4. Statistic profit of day for daily ticket");
		System.out.println("5. Statistic profit of month");
		System.out.println("6. Exit");
		System.out.println("Choose: ");
	}

}
