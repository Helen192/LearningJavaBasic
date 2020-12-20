package baitap_11.quanlybeboi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DurationTime {
	static List<Character> cList = new ArrayList<>();   // cList contains all Characters of 0-9
	static List<Integer> indexList = new ArrayList<>();  // this is to manage all index of a duration code ( 1 durationCode gom 2 ky tu)
	
	String durationCode;
	int fromTime, toTime;
	int price;
	
	public DurationTime() {
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		autoGenerateCode();
		
		System.out.println("Start time: ");
		fromTime = Integer.parseInt(input.nextLine());
		
		System.out.println("End time: ");
		toTime = Integer.parseInt(input.nextLine());
		
		System.out.println("Price: ");
		price = Integer.parseInt(input.nextLine());
	}
	
	private static void autoGenerateCharater() {
		if(cList.size() > 0) return;
		
		for(int i= (int) '0'; i<= (int) '9'; i++) {
			cList.add((char) i);
		}
		
		for(int i = 0; i<2; i++) {
			indexList.add(0);
		}
	}
	
	public void autoGenerateCode() {
		autoGenerateCharater();
		
		durationCode ="";
		for(int i =0; i<indexList.size();i++) {
			durationCode += String.valueOf(cList.get(indexList.get(i)));
		}
		
		int lastIndex = indexList.size()-1;
		indexList.set(lastIndex, indexList.get(lastIndex)+1);
		for(int i = indexList.size()-1; i > 0;i--) {
			if(indexList.get(i) < cList.size()) {
				break;
			}
			indexList.set(i,0);
			indexList.set(i-1, indexList.get(i-1) +1);
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
