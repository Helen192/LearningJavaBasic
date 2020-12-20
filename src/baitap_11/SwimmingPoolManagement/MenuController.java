package baitap_11.SwimmingPoolManagement;

import java.util.Scanner;

public class MenuController {
	private static MenuController instance = null;
	
	private MenuController() {
	}
	
	public synchronized static MenuController getInstance() {
		if(instance == null) {
			instance = new MenuController();
		}
		return instance;
	}
	
	public void showMenu() {
		System.out.println("===================== MENU =====================");
		System.out.println("1. Add swimming pool");
		System.out.println("2. Add monthly ticket");
		System.out.println("3. Booking");
		System.out.println("4. Summarize revenue of one duration time counted on daily tickets ");
		System.out.println("5. Summarize revenue of one month");
		System.out.println("6. Add duration times for a pool");
		System.out.println("7. Exit");
		System.out.println("Choose: ");
	}
	
	public void addSwimmingPool() {
		SwimmingPool swimmingPool = new SwimmingPool();   // create an instance of type SwimmingPool
		swimmingPool.input();            // fulfill code and address of the pool
		DataMgr.getInstance().getSwimmingPools().add(swimmingPool);          // add this pool into the swimmingPools List
	}
	
	public void addMonthTicket() {
		MonthTicket monthTicket = new MonthTicket();
		monthTicket.input();     // fulfill all information of a month ticket
		Scanner input = new Scanner(System.in);
		boolean isFind = false;
		do {
			System.out.println("Please enter pool's code: ");
			String poolcode = input.nextLine();
			
			// seek for poolCode in the swimmingpools list.
			for(int i=0; i< DataMgr.getInstance().getSwimmingPools().size(); i++) {
				if(DataMgr.getInstance().getSwimmingPools().get(i).getPoolCode().equalsIgnoreCase(poolcode)) {  // compare the entered poolcode with the poolCode at position i in the swimmingPools list
					DataMgr.getInstance().getSwimmingPools().get(i).getMonthTicket().add(monthTicket);      // add monthTicket into the monthTicket list of the pool which has the entered poolcode
					isFind = true;
					break;
				}else {
					isFind = false;
				}
			}
			if(isFind) {
				System.err.println("the pool code was not found. Please try again");
			}
		} while (isFind);   
	}
	
	public void addBooking() {
		Booking booking = new Booking();
		booking.input();
		
		Scanner input = new Scanner(System.in);
		boolean isFind = false;
		do {
			System.out.println("Please enter pool's code: ");
			String poolcode = input.nextLine();
			
			// seek for poolCode in the swimmingpools list.
			for(int i=0; i< DataMgr.getInstance().getSwimmingPools().size(); i++) {
				if(DataMgr.getInstance().getSwimmingPools().get(i).getPoolCode().equalsIgnoreCase(poolcode)) {  // compare the entered poolcode with the poolCode at position i in the swimmingPools list
					DataMgr.getInstance().getSwimmingPools().get(i).getBooking().add(booking);      // add booking into the booking list of the pool which has the entered poolcode
					isFind = true;
					break;
				}else {
					isFind = false;
				}
			}
			if(isFind) {
				System.err.println("the pool code was not found. Please try again");
			}
		} while (isFind);  
	}
	
	public void addDurationTime() {                     // seek for a pool as entered poolcode, then add duration time for that pool
		Scanner input = new Scanner(System.in);
		boolean isFind = false;
		do {
			System.out.println("Please enter pool's code: ");
			String poolcode = input.nextLine();
			
			// seek for poolCode in the swimmingpools list.
			for(int i=0; i< DataMgr.getInstance().getSwimmingPools().size(); i++) {
				if(DataMgr.getInstance().getSwimmingPools().get(i).getPoolCode().equalsIgnoreCase(poolcode)) {  // compare the entered poolcode with the poolCode at position i in the swimmingPools list
					DurationTime durationtime = new DurationTime();   
					
					boolean flag = false;
					do {
						durationtime.input();
						for(int j =0; j < DataMgr.getInstance().getSwimmingPools().get(i).getDurationTime().size(); j++) {
							if(DataMgr.getInstance().getSwimmingPools().get(i).getDurationTime().get(j).getFromTime() == durationtime.getFromTime() 
								&& DataMgr.getInstance().getSwimmingPools().get(i).getDurationTime().get(j).getToTime() == durationtime.getToTime() ) {
								System.out.println("This duration time has already existed. Please try again.");
								flag = true;
								break;
							}
						}
						if(flag==true) {       // tuc la tim thay 1 khung gio bi trung
							flag = false;   // gan lai cho flag = false de tiep tuc vong lap do-while
						} 
						else {             // khong tim thay khung gio nao trung
							flag = true;   // gan cho flag = true de thoat ra khoi vong lap do - while
						}
					} while (flag);
					
					DataMgr.getInstance().getSwimmingPools().get(i).getDurationTime().add(durationtime);      // add duration time into the durationTime list of the pool which has the entered poolcode
					isFind = true;
					break;
				}else {
					isFind = false;
				}
			}
			if(isFind) {
				System.err.println("the pool code was not found. Please try again");
			}
		} while (isFind);
		
	}

}
