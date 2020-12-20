package baitap_11.SwimmingPoolManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwimmingPool {
	List<MonthTicket> monthTicket = new ArrayList<>();
	List<DailyTicket> dailyTicket = new ArrayList<>();
	List<DurationTime> durationTime = new ArrayList<>();
	List<Booking> booking = new ArrayList<>();
	
	String poolCode, poolAddress;
	
	public SwimmingPool() {	
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Code of swimming pool: ");
		poolCode = input.nextLine();
		
		System.out.println("Address of swimming pool: ");
		poolAddress = input.nextLine();
	}

	public List<MonthTicket> getMonthTicket() {
		return monthTicket;
	}

	public void setMonthTicket(List<MonthTicket> monthTicket) {
		this.monthTicket = monthTicket;
	}

	public List<DailyTicket> getDailyTicket() {
		return dailyTicket;
	}

	public void setDailyTicket(List<DailyTicket> dailyTicket) {
		this.dailyTicket = dailyTicket;
	}

	public List<DurationTime> getDurationTime() {
		return durationTime;
	}

	public void setDurationTime(List<DurationTime> durationTime) {
		this.durationTime = durationTime;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	public String getPoolCode() {
		return poolCode;
	}

	public void setPoolCode(String poolCode) {
		this.poolCode = poolCode;
	}

	public String getPoolAddress() {
		return poolAddress;
	}

	public void setPoolAddress(String poolAddress) {
		this.poolAddress = poolAddress;
	}
	
	
	

}
