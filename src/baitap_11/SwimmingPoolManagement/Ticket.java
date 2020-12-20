package baitap_11.SwimmingPoolManagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ticket {
	String code;
	Date registeredDate;
	
	static List<Character> cList = new ArrayList<>();    // cList will contains all characters which can appear in a ticket code
	static List<Integer> indexList = new ArrayList<>();  // save index of characters und limit their size in 6 elememets as requirement of a ticket code

	
	public Ticket() {
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		autoGenerateCode();                        // create a ticket code
		System.out.println("Ticket code: " + getCode());   // show the created code to the screen
		System.out.println(" Register date (dd/mm/yyyy): ");
		registeredDate = converStringToDate(input.nextLine());
	}
	
	
	
	@Override
	public String toString() {
		return ": code=" + code + ", registeredDate=" + registeredDate ;
	}

	public String getCode() {
		return code;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

//	public void setRegisteredDate(Date registeredDate) {
//		this.registeredDate = registeredDate;
//	}
	
	public Date converStringToDate(String str) {    // after user enters a day which is String  type, we can convert it to a type of Date.           
		try {
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			return simpleFormat.parse(str);
		} catch (ParseException e) {
			Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, e);
//			e.printStackTrace();
		}
		return new Date();         // install registeredDate automatically at the time of access in case that the input String false
	}
	
	public void autoGenerateCode() {                // create a ticket's code automatically
		autoGenerateCharacter();                   // check and initialize a cList
		
		// generate a ticket code automatically as requirements
		code = "";
		for(int i=0; i< indexList.size();i++) {
			code += String.valueOf(cList.get(indexList.get(i)));       // initialize a code in form of aaaaaa
		}
		
		indexList.set(indexList.size()-1 , indexList.get(indexList.size()-1) +1);  // increase the value of the last element in indexList with 1 
		
		for(int i= indexList.size()-1; i>0; i--) {
			if(indexList.get(i) < cList.size()) {
				break;
			}else {
				indexList.set(i, 0);                         // because the value of element at position i in indexList  has already been equal with the size of cList. So we need to setup again the value of this element at zero
				indexList.set(i-1, indexList.get(i-1) + 1);  // and we also need to increase the value of element at position i-1 with 1 
			}
		}
	}
	
	private static void autoGenerateCharacter() {
		if(cList.size() >0) return;                   //  // if cList has already been generated, then we need only return cList, otherwise we do as below:
		
		for(int i = (int)'a'; i<= (int)'z'; i++) {    // add character a-z into the cList
			cList.add((char) i);
		}
		
		for(int i = (int) 'A'; i<= (int)'Z';i++) {    // add characters A-Z into the cList
			cList.add((char) i);
		}
		
		for(int i =(int)'0'; i<= (int)'9';i++) {      // add characters 0-9 into the cList
			cList.add((char) i);
		}
		
		for(int i=0; i<6;i++) {
			indexList.add(0);    // at the first time, we initialize value of all 6 elements in the indexList equal 0
		}
	}
	

}
