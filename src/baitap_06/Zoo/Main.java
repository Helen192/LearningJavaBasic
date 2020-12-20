package baitap_06.Zoo;
/*
 * Khi nguoi dung chon 3 thi yeu cau nguoi dung nhap vao loai con vat muon them(Tiger, Dog, Cat) roi nhap cac thong tin cua con vat va them vao AnimalList.
 * Khi nguoi dung chon 5 thi hien thi thong tin cung tieng keu cua tung con vat trong so thu
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();        // cai object zoo nay la 1 zooList. ma 1 zooList bao gom cac Rooms. Moi room gom 1 roomCode va 1 animalList cua room do
		Scanner input = new Scanner(System.in);
		int choose;
		
		do {
			showMenu();
			choose = Integer.parseInt(input.nextLine());
			
			switch (choose) {
			case 1:
				System.out.println("Adding N rooms: ");
				int n = Integer.parseInt(input.nextLine());
				for(int i=0; i<n; i++) {
					Room room = new Room();  // create a new room
					room.input();   // enter room's code
					
					zoo.addRoom(room); // add room into zoo
				}
				break;
			case 2:
				System.out.println("Entering room's code you want to delete: ");
				int roomCode = Integer.parseInt(input.nextLine());
				zoo.removeRoom(roomCode);
				
				break;
			case 3:
				addAnimal(zoo);
				break;
			case 4:
				removeAnimal(zoo);
				break;
			case 5:
				 zoo.display();
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
		System.out.println("1. Add room");
		System.out.println("2. Remove room");
		System.out.println("3. Add animal");
		System.out.println("4. Remove animal");
		System.out.println("5. Show all animals");
		System.out.println("6. Exit");
		System.out.println("Choose: ");
	}
	static void addAnimal(Zoo zoo) {
		Scanner input = new Scanner(System.in);
		System.out.println("Adding N animals: ");
		int n = Integer.parseInt(input.nextLine());
		int choose;
		for(int i=0; i<n; i++) {
			System.out.println("1. Add Tiger");
			System.out.println("2. Add Dog");
			System.out.println("3. Add Cat");
			System.out.println("Choose: ");
			choose = Integer.parseInt(input.nextLine());
			
			Animal animal;   // ap dung tinh da hinh trong java. 
			switch (choose) {
			case 1:
				animal = new Tiger();
				break;
			case 2:
				animal = new Dog();
				break;
			default:
				animal = new Cat();
				break;
			}
			animal.input();   // enter animal's information
			
			// show room's information
			Room room = null;
			System.out.println("============= Room List =============");
			for(int j=0; j<zoo.getZooList().size(); j++) {
				room = zoo.getZooList().get(j);
				System.out.format("\n(%d) - %s", room.getRoomCode(), room.getRoomName());
			}
			
			System.out.println("\nChoose room's code: ");
			int roomCode = Integer.parseInt(input.nextLine()); 
			for(int j=0;j<zoo.getZooList().size();j++) {
				room = zoo.getZooList().get(j);
				if(room.getRoomCode() == roomCode) {
					break;
				}else {
					room = null;   // vi room dang = room o vi tri j. nen neu ko co lenh nay, thi khi ko tim thay cai room nao = roomCode, thi ket qua room = room cuoi cung trong zooList. ->> sai
				}
			}
			if(room!=null) {
				room.addAnimal(animal);
			}
		}
		
	}
	
	static void removeAnimal(Zoo zoo) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which animal's name you want to delete: ");
		String animalName = input.nextLine();
		for(Room room : zoo.getZooList()) {
			room.removeAnimal(animalName);
		}
		
	}

}
