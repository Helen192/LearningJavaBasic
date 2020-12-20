package baitap12_CayATM;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	static Scanner input = new Scanner(System.in);
	static Account account = null;
	
	public static void main(String[] args) {
		loging();
		System.out.println("Next Step!!!");
		
		int choose;
		do {
			showMenu();
			choose = Integer.parseInt(input.nextLine());
			
			switch (choose) {
			case 1:
				account = new Account();
				account.input();
				break;
			case 2:
				if(account != null) {
					account.addReceiver();
					account.display();
				}else {
					System.err.println("Account doesn't exist!");
				}
				break;
			case 3: 
				if(account != null) {
					account.addTransfer();
					account.display();
				}else {
					System.err.println("Account doesn't exist!");
				}
				break;
			case 4:
				if(account !=null) {
					account.displayRechargeHistory();
				}else {
					System.err.println("Account doesn't exist!");
				}
				break;
			case 5:
				if(account !=null) {
					account.displayTransferHistory();
				}else {
					System.err.println("Account doesn't exist!");
				}
				break;
			case 6:
				saveFile();
				break;
			case 7:
				readFile();             // cai nay chua viet dc
				break;
			case 8:
				System.out.println("Goodbye!");
				break;
			default:
				System.err.println("Input failed!");
				break;
			}
			
		} while (choose !=8);
		
	}
	
	static void loging() {
		System.out.println("============= WELCOME =============");
		System.out.println("User name: ");
		String userName = input.nextLine();
		System.out.println("Password: ");
		String password = input.nextLine();
		
		if(userName.equalsIgnoreCase("Helenana") && password.equalsIgnoreCase("Gokisoft123")) {
			System.out.println("Loging success!");
		}
		else {
			System.err.println("Loging failed!");
			loging();                // goi lai hoi quy (rekusive)
		}
	}
	
	static void showMenu() {
		System.out.println("================== MENU =================");
		System.out.println("1. Initialize account");
		System.out.println("2. Money recharge");
		System.out.println("3. Money transfers");
		System.out.println("4. Recharge history");
		System.out.println("5. Transfer history");
		System.out.println("6. Save data as file.txt");
		System.out.println("7. Reading from file.txt");
		System.out.println("8. Exit");
		System.out.println("Choose: ");
	}
	
	static void saveFile() {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("account.txt");
			
			//I. Save account's information
			   //1. save Header
			String line = Account.getHeader()+ "\n";
			byte[] data = line.getBytes();    // ma hoa cai tu "Infor:" o trong Header ve dang byte
			try {
				fos.write(data);     // giai ma hoa (decode) cai data tren ve kieu String
			} catch (IOException e) {
				Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, e);
//				e.printStackTrace();
			}   
			
			   //2. save next inhalts
			line = account.getFileInfor() +"\n";
			try {
				fos.write(line.getBytes());
			} catch (IOException e) {
				Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, e);
//				e.printStackTrace();
			}
			
			//II. Save receiving history
			line = Receiver.getHeader() +"\n";
			try {
				fos.write(line.getBytes());
			} catch (IOException e) {
				Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, e);
//				e.printStackTrace();
			}
			for(Receiver receiver : account.getReceiverList()) {
				line = receiver.getFileInfor() +"\n";
				try {
					fos.write(line.getBytes());
				} catch (IOException e) {
					Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, e);
//					e.printStackTrace();
				}
			}
			
			//III. Save transfering history
			line = Transfer.getHeader() +"\n";
			try {
				fos.write(line.getBytes());
			} catch (IOException e) {
				Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, e);
//				e.printStackTrace();
			}
			for(Transfer transfer : account.getTransferList()) {
				line = transfer.getFileInfor() +"\n";
				try {
					fos.write(line.getBytes());
				} catch (IOException e) {
					Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, e);
//					e.printStackTrace();
				}
			}
			
			
			
		} catch (FileNotFoundException e) {
			Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, e);
//			e.printStackTrace();
		} finally {
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, e);
//					e.printStackTrace();
				}
			}
		}
	}
	
	static void readFile() {
		
	}

}
