package baitap_11.quanlybeboi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwimmingPool {
	List<MonthTicket> monthTickets = new ArrayList<>();
	List<DailyTicket> dailyTickets = new ArrayList<>();
	List<DurationTime> durationTimes = new ArrayList<>();
	List<Checking> checking = new ArrayList<>();
	
	String code, address;
	
	public SwimmingPool() {
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter code of swimming pool: ");
		code = input.nextLine();
		System.out.println("Enter address: ");
		address = input.nextLine();
	}

	public List<MonthTicket> getMonthTickets() {
		return monthTickets;
	}

	public void setMonthTickets(List<MonthTicket> monthTickets) {
		this.monthTickets = monthTickets;
	}

	public List<DailyTicket> getDailyTickets() {
		return dailyTickets;
	}

	public void setDailyTickets(List<DailyTicket> dailyTickets) {
		this.dailyTickets = dailyTickets;
	}

	public List<DurationTime> getDurationTimes() {
		return durationTimes;
	}

	public void setDurationTimes(List<DurationTime> durationTimes) {
		this.durationTimes = durationTimes;
	}

	public List<Checking> getChecking() {
		return checking;
	}

	public void setChecking(List<Checking> checking) {
		this.checking = checking;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
