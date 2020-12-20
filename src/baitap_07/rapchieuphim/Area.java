package baitap_07.rapchieuphim;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Area implements IStatus {

	static enum STATUS{                 // Create an enum class to manage all status at a place
		EMPTY, FEW, NORMAL, FULL
	}
	
	String currentTime;        // attribute of currentTime
	String name;               // name of each area
	STATUS status;      // attribute of status which have data type of enum
	
	public Area() {
		currentTime = "";   // at the beginning the time is leer
		status = STATUS.EMPTY;   //at the beginning the status is leer
	}
	public Area(String name) {
		this.name = name;
		currentTime = "";   // at the beginning the time is leer
		status = STATUS.EMPTY;   //at the beginning the status is leer
	}
	public Area(String currentTime,String name, STATUS status) {
		this.currentTime = currentTime;
		this.status = status;
		this.name = name;
	}
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose a status as below: ");
		System.out.println("0. Empty");
		System.out.println("1. Few");
		System.out.println("2. Normal");
		System.out.println("3. Full");
		System.out.println("Choose: ");
		
		int choose = Integer.parseInt(input.nextLine());
		
		switch (choose) {
		case 0:
			setStatus(STATUS.EMPTY);
			break;
		case 1:
			setStatus(STATUS.FEW);
			break;
		case 2:
			setStatus(STATUS.NORMAL);
			break;
		default:
			setStatus(STATUS.FULL);
			break;
		}
	}

	@Override
	public void onStatus() {      // showing the status of ticket counter place
		switch (status) {
		case EMPTY:
			System.out.println(name + " is empty");
			break;
		case FEW:
			System.out.println(name + " has a little bit of customs");
			break;
		case NORMAL:
			System.out.println(name + " has a good quantity of customs");
			break;
		case FULL:
			System.out.println(name + " has many customs");
			break;
		}
		
	}


	public String getCurrentTime() {
		return currentTime;
	}


	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}


	public STATUS getStatus() {
		return status;
	}


	public void setStatus(STATUS status) {
		autoCurrentTime();                   // when setting a status, currentTime is also installed automatically at the same time
		this.status = status;
	}
	
	public void autoCurrentTime() {   // setting currentTime automatically based on the international time at checking moment
		SimpleDateFormat dateformat = new SimpleDateFormat("H:m:s dd:mm:yyyy");
		Date time = new Date();
		currentTime = dateformat.format(time);
	}

}
