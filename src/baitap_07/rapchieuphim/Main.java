package baitap_07.rapchieuphim;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<IStatus> statusList = new ArrayList<>();
		
		System.out.println("----------- Add 3 ticket counters ------------ ");
		for(int i=0; i<3; i++) {                                    // creating 3 objects of ticket counters
			TicketCounter ticketCounter = new TicketCounter();
			ticketCounter.input();
			
			statusList.add(ticketCounter);          // adding object of ticket counter into the list
		}
	
		System.out.println("------------- Add 2 canteens ----------------");
		for(int i=0; i<2; i++) {                  // creating 2 objects of canteens
			Canteen canteen = new Canteen();
			canteen.input();
			
			statusList.add(canteen);             // adding object of canteen into the list
		}
		
		System.out.println("-------------- Add 2 Parkings ----------------");
		for(int i=0; i<2; i++) {                 // creating 2 objects of Parking
			Parking parking = new Parking();
			parking.input();
			
			statusList.add(parking);
		}
		 
		
		System.out.println("--------------- Add 5 cinema's rooms --------------------");
		for(int i=0;i<5;i++) {                  // creating 5 cinema's room
			Room room = new Room();
			room.input();
			
			statusList.add(room);
		}
		
		System.out.println("================ Status of all places in the cinema ===============");
		followStatus(statusList);     // showing status 
	}
	
	static void followStatus(List<IStatus> statusList) {
		for(IStatus istatus : statusList) {
			istatus.onStatus();
		}
	}

}
