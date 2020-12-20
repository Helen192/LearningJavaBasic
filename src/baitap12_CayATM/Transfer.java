package baitap12_CayATM;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transfer implements IFileInfor {
	String receiverAccount, content;
	int money;
	Date transferDate;
	
	public Transfer() {
	}
	
	public void input(int maxMoney) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter transfering information");
		
		System.out.println("Account of receiver: ");
		receiverAccount = input.nextLine();
		
		for(;;) {
			System.out.println("The amount of money: ");
			money = Integer.parseInt(input.nextLine());
			
			if(money <= maxMoney) {    // tuc so tien muon chuyen phai nho hon or = so tien hien co trong tai khoan
				break; 
			}
			System.err.println("The current amount of money is not enough to transfer.");
		}
		

		System.out.println("Transfering content: ");
		content = input.nextLine();
		
		transferDate = new Date();    // use date of automatic system
	}
	
	
	public void display() {
		System.out.println(toString());
	}
	 

	@Override
	public String toString() {
		return "Transfer [Receiver's account=" + receiverAccount+ ", money=" + money + ", content=" + content + ", transferDate=" + getTransferDateString() + "]";
	}
	
	public String getTransferDateString() {
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
		String str = format.format(transferDate);
		return str;
	}
	

	public String getReceiverAccount() {
		return receiverAccount;
	}

	public void setReceiverAccount(String receiverAccount) {
		this.receiverAccount = receiverAccount;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Date getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}
	
	public static String getHeader() {
		return "Transfer:";
	}

	@Override
	public String getFileInfor() {
		return receiverAccount+","+money+","+content+","+getTransferDateString();
	}

	@Override
	public void putFileInfor(String file) {
		String[] param = file.split(",");
		receiverAccount = param[0];
		money = Integer.parseInt(param[1]);
		content = param[2];
		
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
		try {
			transferDate = format.parse(param[3]);
		} catch (ParseException e) {
			Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, e);
//			e.printStackTrace();
		}
		
		
	}
	
	
	

}
