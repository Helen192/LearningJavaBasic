package baitap_06.Zoo;
import java.util.ArrayList;
public class Zoo {
	ArrayList<Room> zooList;
	
	public Zoo() {
		zooList = new ArrayList<>();
	}
	public void display() {
		for(Room room : zooList) {
			room.display();
		}
	}
	public void addRoom(Room room) {
		zooList.add(room);
	}
	
	public void removeRoom(int roomCode) {
		for(Room room : zooList) {
			if(room.getRoomCode() == roomCode) {
				zooList.remove(roomCode);
				break;   // because each room has a different roomCode. 
			}
		}
	}
	public ArrayList<Room> getZooList() {
		return zooList;
	}
	public void setZooList(ArrayList<Room> zooList) {
		this.zooList = zooList;
	}

}
