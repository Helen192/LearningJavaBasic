package baitap_05;
import java.util.Scanner;
import java.util.ArrayList;

public class Zone {
	ArrayList<Area> areaList = new ArrayList<>();   // each zone can include many areas
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the quantity of areas in Zone: ");
		int n = Integer.parseInt(input.nextLine());
		
		for(int i=0;i<n;i++) {
			Area area = new Area();  // create a new object of Area
			area.input();  // fulfill attributes of each object of Area
			areaList.add(area);  // add the object of Area into the list
		}
	}
	

}
