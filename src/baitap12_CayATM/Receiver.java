package baitap12_CayATM;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Receiver implements IFileInfor {                  // dung cho phan hien thi encharge history
	int money;        // recharge money
	String content;   // content of recharge
	Date rechargeDate;
	
	public Receiver() {
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter recharging information");
		
		System.out.println("The amount of money: ");
		money = Integer.parseInt(input.nextLine());
		
		System.out.println("recharging content: ");
		content = input.nextLine();
		
		rechargeDate = new Date();    // use date of automatic system
	}
	
	  
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Receiver [money=" + money + ", content=" + content + ", rechargeDate=" + getEnchargeDateString() + "]";
	}
	
	public String getEnchargeDateString() {
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
		String str = format.format(rechargeDate);
		return str;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRechargeDate() {
		return rechargeDate;
	}

	public void setRechargeDate(Date rechargeDate) {
		this.rechargeDate = rechargeDate;
	}
	
	public static String getHeader() {
		return "Receive:";
	}

	@Override
	public String getFileInfor() {
		return money+","+content+","+getEnchargeDateString();
	}

	@Override
	public void putFileInfor(String file) {
		String[] param = file.split(",");
		money = Integer.parseInt(param[0]);
		content = param[1];
		
		SimpleDateFormat format = new SimpleDateFormat("dd:mm:ss dd/MM/yyyy");
		try {
			rechargeDate = format.parse(param[2]);
		} catch (ParseException e) {
			Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, e);
//			e.printStackTrace();
		}
		
	}
	
	

}
