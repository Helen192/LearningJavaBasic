package baitap12_CayATM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account implements IFileInfor{
	String fullName, accountNumber, phoneNumber, address;
	int money;   // because we use money in VND
	
	List<Receiver> receiverList = new ArrayList<>();   // contains recharging history
	List<Transfer> transferList = new ArrayList<>();   // contains transfering history
	
	public Account() {
	}

	public Account(String fullName, String accountNumber, String phoneNumber, String address, int money) {
		this.fullName = fullName;
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.money = money;
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("------------ Bank Account -------------");
		System.out.println("Full name: ");
		fullName = input.nextLine();
		System.out.println("Account number: ");
		accountNumber = input.nextLine();
		System.out.println("Phone number: ");
		phoneNumber = input.nextLine();
		System.out.println("Address: ");
		address = input.nextLine();
		money = 0;                      // money ban dau khoi tao la = 0
	}
	
	public void addReceiver() {    // them nap tien
		Receiver receiver = new Receiver();
		receiver.input();
		
		receiverList.add(receiver);   // add receiver in to recharging history
		
		money += receiver.getMoney();   // increase the current amount of money
	}
	
	public void addTransfer() {
		Transfer transfer = new Transfer();
		transfer.input(money);
		
		transferList.add(transfer);   // add transfering action in to transfering history
		
		money -= transfer.getMoney();  // decrease the current amount of money
	}
	
	public void displayRechargeHistory() {
		System.out.println("************ Recharging history ***********");
		for(Receiver history : receiverList) {
			history.display();
		}
	}
	
	public void displayTransferHistory() {
		System.out.println("************ Transfering history ***********");
		for(Transfer history : transferList) {
			history.display();
		}
	}

	
	public void display() {
		System.out.println(toString());
		displayRechargeHistory();
		displayTransferHistory();
	}
	
	@Override
	public String toString() {
		return "Account [fullName=" + fullName + ", accountNumber=" + accountNumber + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", money=" + money + "]";
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public List<Receiver> getReceiverList() {
		return receiverList;
	}

	public List<Transfer> getTransferList() {
		return transferList;
	}
	
	public static String getHeader() {
		return "Infor:";
	}
	
	@Override
	public String getFileInfor() {       // save data as a file.txt form
		return fullName+"," + accountNumber+","+phoneNumber+","+address+","+money;
	}
	
	@Override
	public void putFileInfor(String file) {     // read/scan a file.txt form into data
		String[] param = file.split(",");
		fullName = param[0];
		accountNumber = param[1];
		phoneNumber = param[2];
		address = param[3];
		money = Integer.parseInt(param[4]);
		
	}
	
	

}
