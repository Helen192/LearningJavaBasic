package baitap_10.quanlytruonghoc;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choose;
		
		do {
			MenuController.getInstance().showMenu();    // hien thi menu lua chon
			choose = Integer.parseInt(input.nextLine());
			
			switch (choose) {
			case 1:
				MenuController.getInstance().inputTeacher();
				break;
			case 2:
				MenuController.getInstance().inputStudent();
				break;
			case 3:
				MenuController.getInstance().inputSubject();
				break;
			case 4:
				MenuController.getInstance().inputClassRoom();
				break;
			case 5:
				MenuController.getInstance().inputClassGroup();
				break;
			case 6:
				MenuController.getInstance().inputSchedule();
				break;
			case 7:
				MenuController.getInstance().inputAttendence();
				break;
			case 8:
				System.out.println("Goodbye!");
				break;
			default:
				System.err.println("Input failled!");
				break;
			}
			
		} while (choose !=8);
	}

}
