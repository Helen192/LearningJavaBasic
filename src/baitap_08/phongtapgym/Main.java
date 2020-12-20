package baitap_08.phongtapgym;
import java.util.Random;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = input.nextInt();
		
		Random random = new Random();  // create a random number
		
		for(int i=0; i<n; i++) {
			int ran = random.nextInt(3);   // ran se bang 0, 1 or 2 ngau nhien
			
			IInputOutput io;   // create an object of IInputOutput
			switch (ran) {
			case 0:
				io = new Instruments();  
				break;
			case 1:
				io = new Drinks();
				break;
			default:
				io = new Tickets();
				break;
			}
			io.input();   // enter information for io
			
			DataManager.getInstance().getIoList().add(io);
		}
		
		for(IInputOutput display : DataManager.getInstance().getIoList()) {
			display.display();
		}
		
		// cau truc lambda cho vong for tren
//		DataManager.getInstance().getIoList().forEach((display) -> display.display());
		
	}

}
