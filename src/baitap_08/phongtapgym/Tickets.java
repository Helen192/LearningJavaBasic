package baitap_08.phongtapgym;
import java.util.Scanner;

public class Tickets implements IInputOutput{
	String customerName , buyDate, expireDate;
	
	public Tickets() {
	}
	

	@Override
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Customer's name: ");
		customerName = input.nextLine();
		
		System.out.println("Buy date (dd/mm/yyyy): ");
		buyDate = input.nextLine();
		
		System.out.println("Expire date(dd/mm/yyyy): ");
		expireDate = input.nextLine();
		
	}

	@Override
	public void display() {
		System.out.println(this);
		
	}

	@Override
	public String toString() {
		return "Tickets [customerName=" + customerName + ", buyDate=" + buyDate + ", expireDate=" + expireDate + "]";
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getBuyDate() {
		return buyDate;
	}


	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}


	public String getExpireDate() {
		return expireDate;
	}


	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	
	

}
