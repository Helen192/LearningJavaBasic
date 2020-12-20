package baitap_11.quanlybeboi;

import java.util.Scanner;

public class DailyTicket extends Ticket {
	String durationCode;
	
	public DailyTicket() {
	}

	public String getDurationCode() {
		return durationCode;
	}

	public void setDurationCode(String durationCode) {
		this.durationCode = durationCode;
	}
	
	@Override
	public void input() {
		super.input();
		Scanner input = new Scanner(System.in);
		// lamf them chuc nang la show toan bo cac khung gio ra de cho nguoi dung chon.
		// va co the kiem tra xem khung gio nguoi dung nhap vao co dung khong
		System.out.println("Code of duration: ");
		durationCode = input.nextLine();
	}
	
	

}
