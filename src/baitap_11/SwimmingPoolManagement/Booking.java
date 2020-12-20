package baitap_11.SwimmingPoolManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Booking {
	String ticketCode, durationCode;
	Date checkinTime;
	
	
	public Booking() {
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Type of ticket: ");
		System.out.println("1. Monthly ticket");
		System.out.println("2. Daily ticket");
		System.out.println("Choose (1/2): ");
		int choose = Integer.parseInt(input.nextLine());
		switch (choose) {
		case 1:
			System.out.println("Ticket code: ");
			ticketCode = input.nextLine();
			break;
		default:
			DailyTicket dailyTicket = new DailyTicket();   // create an instance of DailyTicket
			dailyTicket.input();    // enter information of DailyTicket. Then this ticket will be saved into a DataMgr class 
			ticketCode = dailyTicket.getCode();   
			break;
		}
		
		// enter duration code
		boolean isFind = false;
		do {
			DurationTime.showDurationTimes();         // show all durationTimes
			System.out.println("Duration code: ");
			String str = input.nextLine();
			// check, whether the duration code entered has already been in the durationTimes list is. 
			if(DurationTime.checkDurationTime(str)) {
				durationCode = str;
				isFind = true;
			}
			else {
				System.err.println("duration code was not found. Please try again!");  // neu ko tim thay duration code trong List, thi yeu cau ho nhap lai
			}
		} while (isFind);
		
		checkinTime = new Date();
		
	}

	public String getTicketCode() {
		return ticketCode;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

	public String getDurationCode() {
		return durationCode;
	}

	public void setDurationCode(String durationCode) {
		this.durationCode = durationCode;
	}

	public Date getCheckinTime() {
		return checkinTime;
	}

	public void setCheckinTime(Date checkinTime) {
		this.checkinTime = checkinTime;
	}
	
	

}
