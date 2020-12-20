package baitap03.manager.cat;
import java.util.Scanner;
import java.util.ArrayList;
public class ColorManager {
	ArrayList<String> colorList = new ArrayList<>();
	
	public ColorManager() { // default constructor
	}
	
	public void input() {   // dung de luu mau vao colorList
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Adding color: ");
			String color = input.nextLine();
			colorList.add(color);
			
			System.out.println("Do you want to continue(yes/no)?: ");
			String option = input.nextLine();
			if(option.equalsIgnoreCase("no")) {
				break;
			}
		}
	}
	
	public void display() {
		System.out.println("-------------- List of colors -----------------");
		for(int i=0; i<colorList.size(); i++) {
			System.out.print(" " + colorList.get(i));
		}
		System.out.println("");
	}
	
	public int checkColor(String color) {
// check xem color co nam trong colorList khong. neu co thi tra ve vtri cua mau trong colorList. neu ko co thi return -1
		for(int i=0; i<colorList.size();i++) {
			if(colorList.get(i).equalsIgnoreCase(color)) {
				return i;
			}
		}
		return -1;
		
	}
	

}
