package baitap_05;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * class nay la chua tap hop list cac People
 */

public class PeopleManager {
	ArrayList<People> peopleList = new ArrayList<>();
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of owners: ");
		int n = Integer.parseInt(input.nextLine());
		for(int i=0;i<n;i++) {
			People people = new People();    // create a new object of People
			people.input();                 // fulfill attributes of each object of People
			peopleList.add(people);        // add the object people into the list
		}
	}

}
