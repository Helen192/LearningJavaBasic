package baitap_09.covid19;

import java.util.List;
import java.util.Scanner;

import baitap_09.covid19.Citizen.STATUS;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choose;
		
		do {
			showMenu();
			choose = Integer.parseInt(input.nextLine());
			
			switch (choose) {
			case 1:
				input();
				break;
			case 2:
				searchByName();
				break;
			case 3:
				searchByID();
				break;
			case 4:
				setHealthStatus();
				break;
			case 5:
				updatePath();
				break;
			case 6:
				setupFollowStatus();
				break;
			case 7:
				showCitizenActive();
				break;
			case 8:
				showCitizenFollow();
				break;
			case 9:
				System.out.println("------------------- Goodbye! ------------------");
				break;
			default:
				System.err.println(">>>>>>> Input failed! <<<<<<<<");
				break;
			}
		} while (choose!=9);
		
	}


	static void showMenu() {
		System.out.println("================= MENU ==================");
		System.out.println("1. Creating a list of all citizens in Vietnam");
		System.out.println("2. Finding patient based on their name");
		System.out.println("3. Finding patient based on their ID (CMTND)");
		System.out.println("4. Updating health's status");
		System.out.println("5. Updating moving paths of a patient");
		System.out.println("6. Updating health status of all people having contacts with a infected person with coronavirus");
		System.out.println("7. Showing a list of all infected people with coronavirus");
		System.out.println("8. Showing a list of all people who are under surveillance");
		System.out.println("9. Exit");
		System.out.println("Choose: ");
	}
	
	private static void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of citizens: ");
		int number = Integer.parseInt(input.nextLine());
		
		for(int i = 0; i< number;i++) {
			Citizen citizen = new Citizen();
			citizen.input();
			
			DataMgr.getInstance().getCitizens().add(citizen);
			//Giai thich dong code tren nhu sau:
			 // DataMgr abc = DataMgr.getInstance();  // lay khai bao doi tuong ra. Vi DataMgr la Singleton pattern, nen tat ca chi la 1 object
			//  List<Citizen> citizens = DataMgr.getCitizen();  // lay ra cais Arraylist cua citizens ma DataMgr dang quan ly
			 // citizens.add(citizen);   // add cai citizen vua khoi tao vao cai ArrayList cua citizens
			 
		}
		
	}
	
	private static void searchByName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name to search: ");
		String  name = input.nextLine();
		
		for(Citizen citizen : DataMgr.getInstance().getCitizens()) {
			if(citizen.getName().equalsIgnoreCase(name)) {
				citizen.display();
			}
		}
	}
	
	private static void searchByID() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID (CMTND) to search: ");
		String cmtnd = input.nextLine();
		
		for(Citizen citizen : DataMgr.getInstance().getCitizens()) {  // chay danh sach List citizens
			if(citizen.getId().equalsIgnoreCase(cmtnd)) {
				citizen.display();
				break;   // vi moi nguoi chi co 1 CMTND, nen neu tim dc roi thi break.
			}
		}	
	}
	
	private static void setHealthStatus() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID (CMTND) to search: ");
		String cmtnd = input.nextLine();
		
		for(Citizen citizen : DataMgr.getInstance().getCitizens()) {  // chay danh sach List citizens
			if(citizen.getId().equalsIgnoreCase(cmtnd)) {
				citizen.inputStatus();
				break;   // vi moi nguoi chi co 1 CMTND, nen neu tim dc roi thi break.
			}
		}	
	}
	
	private static void updatePath() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID (CMTND) to search: ");
		String cmtnd = input.nextLine();
		
		for(Citizen citizen : DataMgr.getInstance().getCitizens()) {
			if(citizen.getId().equalsIgnoreCase(cmtnd)) {
				if(citizen.getStatus() != Citizen.STATUS.NORMAL) {
					citizen.inputPath();
				}
				break;
			}
		}
	}
	
	private static void setupFollowStatus() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID (CMTND) to search: ");
		String cmtnd = input.nextLine();
		
		Citizen citizenFind = null;   // day la citizen co so CMTND can tim
		for(Citizen citizen : DataMgr.getInstance().getCitizens()) {
			if(citizen.getId().equalsIgnoreCase(cmtnd)) {
				if(citizen.getStatus() != Citizen.STATUS.NORMAL) {  // neu ma citizen can tim dang bi FOLLOW OR ACTIVE thi moi dc xet tiet
					citizenFind = citizen;
				}
				break;
			}
		}
		
		if(citizenFind !=null) {       // neu tim dc 1 cong dan thoa man yeu cau
			for(Citizen citizen : DataMgr.getInstance().getCitizens()) {   // duyet toan bo cong dan trong List, de tim ra xem ai co tmpaddress nam trong List path cua citizenFind
				if(citizen.getStatus() == STATUS.NORMAL) {   // kiem tra xem tung cong dan co o trang thai NORMAL khong. neu co thi:
					if(citizenFind.getPath().contains(citizen.getTmpaddress())) {   // kiem tra tiep xem cong dan do co o dia chi, ma dia chi nay thuoc trong path cua citizenFind
						citizen.setStatus(STATUS.FOLLOW);       // thiet lap trang thai cua cong dan nay o FOLLOW
					}
				}
				
			}
		}
	}
	
	private static void showCitizenActive() {
		for(Citizen citizen : DataMgr.getInstance().getCitizens()) {
			if(citizen.getStatus() == STATUS.ACTIVE) {
				citizen.display();
			}
		}
	}
	
	private static void showCitizenFollow() {
		for(Citizen citizen : DataMgr.getInstance().getCitizens()) {
			if(citizen.getStatus() == STATUS.FOLLOW) {
				citizen.display();
			}
		}
	}
		
	
}

