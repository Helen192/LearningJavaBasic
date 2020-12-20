package baitap_07.rapchieuphim;

import java.util.Scanner;

public class Room extends Area {
	int totalSeats;   // total amount of seats in a room
	int usedSeats;     // the amount of used seats in a room
	public Room() {
		super("Cinema's room");
	}
	public Room(int totalSeats, int usedSeats) {
		super("Cinema's room");
		this.totalSeats = totalSeats;
		this.usedSeats = usedSeats;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getUsedSeats() {
		return usedSeats;
	}
	public void setUsedSeats(int usedSeats) {
		this.usedSeats = usedSeats;
	}
	
	@Override
	public void input() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Total amount of seats: ");
		totalSeats = Integer.parseInt(input.nextLine());
		
		System.out.println("Number of seats used: ");
		usedSeats = Integer.parseInt(input.nextLine());
		
		setupStatus();
	}
	
	public void setupStatus() {    // establish status of room ( empty, few, normal, full)
		if(usedSeats ==0) {
			status = Area.STATUS.EMPTY;
		}else {
			int percent = (usedSeats *100) / totalSeats;            // the rate of used seats in a room. phep nay tu dong lam tron ve phan tram kieu so nguyen
			/* Status of room:
			 * percent <=25% -> FEW
			 * 25%<= percent < 70%  -> NORMAL
			 * percent >= 70%  -> FULL
			 */
			if(percent >= 70) {
				status = Area.STATUS.FULL;
			}else if(percent >= 25 && percent < 70) {
				status = Area.STATUS.NORMAL;
			}else {
				status = Area.STATUS.FEW;
			}
		}
		autoCurrentTime();
	}
	

}
