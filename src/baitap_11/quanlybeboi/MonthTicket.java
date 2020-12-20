package baitap_11.quanlybeboi;

import java.util.Date;
import java.util.Scanner;


public class MonthTicket extends Ticket {
	String customerName, address, avatar;
	Date expiredDate;
	int price;
	
	public MonthTicket() {
	}
	
	@Override
	public void input() {
		Scanner input = new Scanner(System.in);
		autoGenerateCode();   // generate automatically a ticket's code
		System.out.println("Name of customer: ");
		customerName = input.nextLine();
		System.out.println("Address: ");
		address = input.nextLine();
		System.out.println("Avatar: ");
		avatar = input.nextLine();
		System.out.println("Price: ");
		price = Integer.parseInt(input.nextLine());
		
		System.out.println("Registered date (dd/mm/yyyy): ");
		String registeredDateStr = input.nextLine();
		//convert type String (registeredDateStr) into type of Date
		registeredDate = convertStringToDate(registeredDateStr);
		
		System.out.println("Expired date (dd/mm/yyyy): ");
		String expiredDateStr = input.nextLine();
		expiredDate = convertStringToDate(expiredDateStr);
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
