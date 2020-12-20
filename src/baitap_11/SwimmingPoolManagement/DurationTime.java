package baitap_11.SwimmingPoolManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DurationTime {
	String durationCode;
	int fromTime, toTime;
	int price;
	
	static List<String> durationTimes = new ArrayList<>(); // this is to manage all duration times which are generated automatically
	static List<Character> cList = new ArrayList<>();
	static List<Integer> indexList = new ArrayList<>();
	
	public DurationTime() {
		
	}
	
	public static void showDurationTimes() {              // show all duration time in the list
		String result ="";
		for(String str : durationTimes) {
			result += str +"; ";
		}
		System.out.println(result);
	}
	
	public static boolean checkDurationTime(String str) {
	// check, whether the duration code entered has already been in the durationTimes list is. 
		for(int i=0; i < DurationTime.durationTimes.size(); i++) {
			if(DurationTime.durationTimes.get(i).equalsIgnoreCase(str)) {
				return true;                 // str is in the durationTimes list
					
			}
		}
		return false;   // str is not in the durationTimes list		
	}
	
	public void input() {
		autoGenerateCode();
		System.out.println("Duration code: " + getDurationCode());   // show duration code which are generated automatically , so that users can follow easily
		Scanner input = new Scanner(System.in);
		System.out.println("start time: ");
		fromTime = Integer.parseInt(input.nextLine());
		System.out.println("End time: ");
		toTime = Integer.parseInt(input.nextLine());
		System.out.println("Price: ");
		price = Integer.parseInt(input.nextLine());
	}
	
	
	public void autoGenerateCode() {              // generate automatically a duration code with 2 signs from 0 -9
		autoGenerateCharacter();
		
		durationCode = "";
		for(int i=0; i<indexList.size();i++) {
			durationCode += String.valueOf(cList.get(indexList.get(i)));
		}
		
		durationTimes.add(durationCode);         // add the generated durationCode into the durationTimes list
		
		indexList.set(indexList.size()-1, indexList.get(indexList.size()-1) + 1);
		for(int i= indexList.size()-1; i>0; i--) {
			if(indexList.get(i) < cList.size()) {
				break;
			}
			indexList.set(i, 0);
			indexList.set(i-1, indexList.get(i-1) + 1);
		}
		
	}
	
	private static void autoGenerateCharacter() {
		if(cList.size() > 0 ) return;
		
		for(int i =(int) '0'; i<= (int)'9'; i++) {
			cList.add((char) i);
		}
		
		for(int i =0; i<2; i++) {
			indexList.add(0);
		}
		
	}

	public String getDurationCode() {
		return durationCode;
	}

	public void setDurationCode(String durationCode) {
		this.durationCode = durationCode;
	}

	public int getFromTime() {
		return fromTime;
	}

	public void setFromTime(int fromTime) {
		this.fromTime = fromTime;
	}

	public int getToTime() {
		return toTime;
	}

	public void setToTime(int toTime) {
		this.toTime = toTime;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
