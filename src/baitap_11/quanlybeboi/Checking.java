package baitap_11.quanlybeboi;

import java.util.Date;
import java.util.Scanner;

public class Checking {
	String ticketCode, durationCode;
	Date checkinTime;
	
	public Checking() {
	}

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Tye of ticket: ");
		System.out.println("1. Monthly ticket");
		System.out.println("2. Daily ticket");
		System.out.println("Choose (1/2): ");
		int choose = Integer.parseInt(input.nextLine());
		switch (choose) {
		case 1:
			System.out.println("Enter ticket code: ");
			ticketCode = input.nextLine();
			break;
		default:
			DailyTicket dailyTicket = new DailyTicket();   // create an instance of DailyTicket
			dailyTicket.input();                         // add information into this object
			// then save dailyTicket in DataMgr, before getting ticketCode
			ticketCode = dailyTicket.getCode();         
			break;
		}
		
		// nen viet them la hien thi ra toan bo cac khung gio de cho nguoi dung chon. 
		// Va kiem tra xem cai khung gio maf nguoi dung nhap vao cos nam trong cac khung gio co san khong
		System.out.println("Enter duration code: ");
		durationCode = input.nextLine();
		
		checkinTime = new Date();  // lay gio  cua he thong
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
