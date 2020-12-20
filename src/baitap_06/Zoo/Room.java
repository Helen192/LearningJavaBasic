package baitap_06.Zoo;
import java.util.ArrayList;
import java.util.Scanner;

public class Room {
	int roomCode;
	String roomName;
	ArrayList<Animal> animalList;
	
	public Room() {
		animalList = new ArrayList<>();  // khoi tao animalList trong constructur thay vi o ngay phia tren(attribute) de tiet kiem tai nguyen(tuc bo nho luu tru)
	}
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Room's code: ");
		roomCode = Integer.parseInt(input.nextLine());
		
		System.out.println("Room's name: ");
		roomName = input.nextLine();
	}
	public void display() {
		for(Animal animal : animalList) {
			animal.display();
			animal.showSound();
		}
	}
	
	public void addAnimal(Animal animal) {     // add an animal into the list
		animalList.add(animal);
	}
	
	public void removeAnimal(String name) {     // remove animals based on their name
		// cach 1: dung theo phuong phap add
		ArrayList<Animal> animalList2 = new ArrayList<>();     // create a new animalList2 to save unremoved animals
		for(Animal animal: animalList) {
			if(!animal.getName().equalsIgnoreCase(name)) {
				animalList2.add(animal);
			}
		}
		animalList = animalList2;   //save all animals in animalList2 in animalList.
		
		// cach 2: dung cau lenh remove. Nhung cach nay hay gap loi, vi khi remove 1 phan tu trong ArrayList, thi structur bi thay doi.
//		for(Animal animal: animalList) {
//			if(animal.getName().equalsIgnoreCase(name)) {
//				animalList.remove(animal);
//			}
//		}
	}

	public int getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(int roomCode) {
		this.roomCode = roomCode;
	}

	public ArrayList<Animal> getAnimalList() {
		return animalList;
	}

	public void setAnimalList(ArrayList<Animal> animalList) {
		this.animalList = animalList;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	

}
