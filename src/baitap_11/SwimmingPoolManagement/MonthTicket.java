package baitap_11.SwimmingPoolManagement;

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
		super.input();
		System.out.println("Expire date (dd/mm/yyyy): ");
		expiredDate =  converStringToDate(input.nextLine());
		System.out.println("Customer's name: ");
		customerName = input.nextLine();
		
		System.out.println("Address: ");
		address = input.nextLine();
		
		System.out.println("Avatar: ");
		avatar = input.nextLine();
		
		System.out.println("Price: ");
		price = Integer.parseInt(input.nextLine());
		
	}
	
	

	@Override
	public String toString() {
		return MonthTicket.class.getName() + super.toString() + ", expiredDate=" + expiredDate + ", customerName=" + customerName + ", address=" + address + ", avatar=" + avatar
				+  ", price=" + price;
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
